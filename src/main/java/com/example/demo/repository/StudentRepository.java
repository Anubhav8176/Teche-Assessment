package com.example.demo.repository;

import com.example.demo.entities.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @EntityGraph(attributePaths = {"subjects"})
    Optional<Student> findByName(String name);
}
