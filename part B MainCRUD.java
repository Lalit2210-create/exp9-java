package com.example.hibernatecrud;

import java.util.List;

public class MainCRUD {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student("Ravi", "Java");
        dao.saveStudent(s1);

        List<Student> students = dao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }

        s1.setCourse("Spring Boot");
        dao.updateStudent(s1);

        dao.deleteStudent(s1.getId());
    }
}
