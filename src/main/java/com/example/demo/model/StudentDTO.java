package com.example.demo.model;


import com.example.demo.entities.Subjects;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class StudentDTO {
    private String name;
    private String address;
    private Set<Subjects> subjects;
}
