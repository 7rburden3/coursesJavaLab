package com.codeclan.example.boookingLab.repositories.courseRepository;

import com.codeclan.example.boookingLab.models.Course;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Course> findCoursesByRating(int rating){
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Course.class);
        cr.add(Restrictions.eq("rating", rating));
        result = cr.list();

        return result;
    }

    @Override
    @Transactional
    public List<Course> findCourseByCustomer(Long id){
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Course.class);
        cr.createAlias("bookings", "bookingAlias");
        cr.add(Restrictions.eq("bookingAlias.customer.id", id));
        result = cr.list();

        return result;
    }

}
