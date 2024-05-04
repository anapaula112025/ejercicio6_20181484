package com.example.demo6.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;
    @Column(nullable = false)
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String phone_number;
    private String hire_date;
    private double salary;
}