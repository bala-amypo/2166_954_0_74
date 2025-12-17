package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Studententity;
public interface Studententity{
    Studententity addStudent(Studententity student);
    List<Studententity>getAllStudent();
    Studententity getStudentById(Long id);
    Studententity updateStudent(Long id,Studententity student);
}