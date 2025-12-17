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

        @PostMapping("/add")
        public Studententity addStudent(@RequestBody Studententity student){
            return service.addStudent(student);
        }

        @GetMapping("/all")
        public List<Studententity>getAllStudent(){
            return service.getStudent();
        }

        @PostMapping("/update/{id}")
        public Studententity updateStudent(
            @PathVariable Long id,
            @RequestBody Studententity student
        ){
            return service.updateStudent(id,student);
        }
    }
}