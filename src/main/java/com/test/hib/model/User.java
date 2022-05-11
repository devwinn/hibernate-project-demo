package com.test.hib.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "USER")
public class User {

    @Column(name = "USER_ID")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String fullname;
    String email;
    String password;
    int age;
    double salary;
    String city;

    public User() {

    }
    public User(String fullname, String email, String password, int age, double salary, String city) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.salary = salary;
        this.city = city;

    }
}





