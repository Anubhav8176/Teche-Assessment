package com.example.demo.services.imple;

import com.example.demo.entities.Subjects;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.services.SubjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServicesImple implements SubjectServices {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subjects> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
