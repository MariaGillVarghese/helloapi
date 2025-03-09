package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController // Marks this class as a REST API controller
@RequestMapping("/api") // Base URL for all endpoints in this class
public class HelloController {

    @GetMapping("/hello") // Handles GET requests to "/api/hello"
    public String sayHello() {
        return "Hello, Welcome to your first API!";
    }

    @PutMapping("/hello") // Handles PUT requests to "/api/hello"
    public String updateMessage(@RequestBody String newMessage) {
        return "Updated message: " + newMessage;
    }
}*/

@RestController
@RequestMapping("/database")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired // Ensure dependency injection
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}
