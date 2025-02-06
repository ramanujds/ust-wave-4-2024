package com.ust.webapp.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "todos")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 100, unique = true)
    private String title;
    private boolean completed;
    private LocalDate dueDate;
    private int priority;

}
