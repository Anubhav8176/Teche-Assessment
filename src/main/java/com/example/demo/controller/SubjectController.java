package com.example.demo.controller;


import com.example.demo.services.SubjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {

    @Autowired
    private SubjectServices subServices;

    @RequestMapping("/getAllSub")
    public ResponseEntity getAllSubjects(){
        return new ResponseEntity<>(subServices.getAllSubjects(), HttpStatus.OK);
    }
}
