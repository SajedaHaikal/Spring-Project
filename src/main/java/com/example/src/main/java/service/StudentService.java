package com.example.src.main.java.service;

import com.example.src.main.java.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.src.main.java.reposetory.StudentRepoImpl;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepoImpl studentRepo;

    public void saveStudent(Student student){
        studentRepo.saveStudent(student);
    }

    public List<Student> getAllStudents(){

        return studentRepo.getAllStudents();
    }
}
