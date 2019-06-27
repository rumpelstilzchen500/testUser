package com.api.TestUser.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity(name = "User")
//@Table(name = "users")
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String name;

    @Column (nullable = false)
    String surname;

    public User(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
