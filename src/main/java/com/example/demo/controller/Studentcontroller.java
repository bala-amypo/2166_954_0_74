package com.example.demo.controller;
import java.util.List;
import org.springframework.bean.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController
@RequestMapping("/student")
public class StudentController{
    @Autowired
    public class Studentservice {
        @Autowired
        private Studentservice service;
    }
}