package com.codeclan.example.boookingLab.repositories.courseRepository;

import com.codeclan.example.boookingLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom  {

    List<Course> findCoursesByRating(int rating);

    List<Course> findCourseByCustomer(Long id);

}
