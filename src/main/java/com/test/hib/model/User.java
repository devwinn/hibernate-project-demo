package com.test.hib.model;

import jakarta.persistence.*;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "USER")
public class User {

    @Column(name = "USER_ID")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NonNull
    String fullname;
    @NonNull
    String email;
    @NonNull
    String password;
    @NonNull
    int age;
    @NonNull
    double salary;
    @NonNull
    String city;



}





