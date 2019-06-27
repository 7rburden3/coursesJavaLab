package com.codeclan.example.boookingLab.repositories.courseRepository;

import com.codeclan.example.boookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
