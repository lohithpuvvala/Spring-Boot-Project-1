package com.firstSpringBootProject.springboot.learn_spring_boot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class CurrencyConfigurationController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses()
    {
        return Arrays.asList(
                new Course(1, "Learn AWS", "lohithpuvvala"),
                new Course(2, "Learn SpringBoot", "lohithpuvvala"),
                new Course(3, "Learn Angular", "lohithpuvvala"),
                new Course(4, "Learn Azure", "lohithpuvvala"),
                new Course(4, "Do React JS, Angular and Tailwind CSS Projects", "lohithpuvvala")
        );
    }
}
