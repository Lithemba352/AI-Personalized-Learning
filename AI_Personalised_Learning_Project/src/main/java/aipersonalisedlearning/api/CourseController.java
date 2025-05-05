package aipersonalisedlearning.api;

import aipersonalisedlearning.creational_patterns.factorymethod.Course;
import aipersonalisedlearning.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course publishCourse(@RequestBody Course course) {

        return courseService.publishCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable String id, @RequestBody Course updatedCourse) {
        return courseService.updateCourse(id, updatedCourse);
    }

}
