package com.codeclan.example.boookingLab.repositories.courseRepository;

import com.codeclan.example.boookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCoursesByRating(int rating);

    List<Course> findCourseByCustomer(Long id);
}
