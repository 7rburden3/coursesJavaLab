package com.codeclan.example.boookingLab;

import com.codeclan.example.boookingLab.models.Booking;
import com.codeclan.example.boookingLab.models.Course;
import com.codeclan.example.boookingLab.models.Customer;
import com.codeclan.example.boookingLab.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.boookingLab.repositories.courseRepository.CourseRepository;
import com.codeclan.example.boookingLab.repositories.customerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoookingLabApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findCoursesByRating(){
		List<Course> found = courseRepository.findCoursesByRating(5);
		assertEquals("JavaScript", found.get(0).getName());
	}

	@Test
	public void findCustomerByCourse(){
		List<Customer> found = customerRepository.findCustomerByCourse(1L);
		assertEquals("John", found.get(0).getName());
	}

	@Test
	public void findCourseByCustomer(){
		List<Course> found = courseRepository.findCourseByCustomer(1L);
		assertEquals("JavaScript", found.get(0).getName());
	}

	@Test
	public void findBookingByDate(){
		List<Booking> found = bookingRepository.findBookingByDate("2019-11-10");
		assertEquals(3L, found.get(0).getId());
	}

}
