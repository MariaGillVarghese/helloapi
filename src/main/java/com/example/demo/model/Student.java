package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details") // Ensure this matches your database table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;
    private String student_name;
    private int student_mtotalmark;

    // Getters and Setters
    public Long getStudent_id() { return student_id; }
    public void setStudent_id(Long student_id) { this.student_id = student_id; }

    public String getStudent_name() { return student_name; }
    public void setStudent_name(String student_name) { this.student_name = student_name; }

    public int getStudent_mtotalmark() { return student_mtotalmark; }
    public void setStudent_mtotalmark(int student_mtotalmark) { this.student_mtotalmark = student_mtotalmark; }
}
