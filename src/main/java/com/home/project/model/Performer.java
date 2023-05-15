package com.home.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Performer")
public class Performer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "surname")
    private String surname;
}
