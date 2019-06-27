package com.codeclan.example.boookingLab.components;

import com.codeclan.example.boookingLab.models.Booking;
import com.codeclan.example.boookingLab.models.Course;
import com.codeclan.example.boookingLab.models.Customer;
import com.codeclan.example.boookingLab.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.boookingLab.repositories.courseRepository.CourseRepository;
import com.codeclan.example.boookingLab.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;



    public void run(ApplicationArguments args) {
        Course java = new Course("Java", "Edinburgh", 2);
        courseRepository.save(java);

        Course javaScript = new Course("JavaScript", "Edinburgh", 5);
        courseRepository.save(javaScript);

        Course ruby = new Course("Ruby", "Glasgow", 4);
        courseRepository.save(ruby);

        Customer alex = new Customer("Alex", "Edinburgh", 32);
        customerRepository.save(alex);

        Customer katie = new Customer("Katie", "Edinburgh", 26);
        customerRepository.save(katie);

        Customer john = new Customer("John", "Glasgow", 30);
        customerRepository.save(john);

        Booking booking1 = new Booking("2019-05-23", java, john);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("2019-07-12", javaScript, alex);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("2019-11-10", ruby, katie);
        bookingRepository.save(booking3);
    }

}
