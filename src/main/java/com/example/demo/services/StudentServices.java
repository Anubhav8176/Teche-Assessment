package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.entities.Subjects;
import com.example.demo.model.StudentDTO;

import java.util.List;
import java.util.Set;

public interface StudentServices {
    List<Student> getAllStudents();
    Student addStudent(StudentDTO studentDTO);
    Set<Subjects> getAllSubjectsByName(String studentName);
}
