package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;


@Entity
@Table(name="user")
@Data
public class User{
    @Id
    Long id;

    String UserName;
    String password;

}
