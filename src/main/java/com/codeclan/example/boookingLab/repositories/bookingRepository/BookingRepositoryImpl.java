package com.codeclan.example.boookingLab.repositories.bookingRepository;


import com.codeclan.example.boookingLab.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Booking> findBookingByDate(String date){
        List<Booking> result = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Booking.class);
        cr.add(Restrictions.eq("date", date));
        result = cr.list();
        return result;

    }
}
