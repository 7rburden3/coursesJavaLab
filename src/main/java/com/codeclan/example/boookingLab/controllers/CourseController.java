package com.codeclan.example.boookingLab.controllers;

import com.codeclan.example.boookingLab.models.Course;
import com.codeclan.example.boookingLab.models.Customer;
import com.codeclan.example.boookingLab.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursesByRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping(value = "/customers/id/{id}")
    public List<Course> findCourseByCustomer(@PathVariable Long id){
        return courseRepository.findCourseByCustomer(id);
    }

}
