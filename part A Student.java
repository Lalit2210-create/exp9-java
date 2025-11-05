package com.example.springdi;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;

    @Autowired
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        course.displayCourse();
    }
}
