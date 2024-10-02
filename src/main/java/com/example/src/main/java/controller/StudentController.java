package com.example.src.main.java.controller;

import com.example.src.main.java.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.src.main.java.service.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    public String saveStudent(Student student){
        studentService.saveStudent(student);
        return "students";
    }
    @GetMapping("/")
    public String showStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/new")
    public String addNewStudent(Model model){
        model.addAttribute("student",new Student());
        return "addStudent";
    }

}
