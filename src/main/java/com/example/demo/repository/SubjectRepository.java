package com.example.demo.repository;

import com.example.demo.entities.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subjects, Integer> {
    Optional<Subjects> findByName(String subject);
}
