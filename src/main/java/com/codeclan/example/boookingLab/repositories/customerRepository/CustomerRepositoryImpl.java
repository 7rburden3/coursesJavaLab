package com.codeclan.example.boookingLab.repositories.customerRepository;

import com.codeclan.example.boookingLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Customer> findCustomerByCourse(Long id){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.add(Restrictions.eq("bookingAlias.course.id", id ));

        results = cr.list();

        return results;
    }
}
