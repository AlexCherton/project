package com.home.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Project")
public class Project {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "name")
        private String name;
        @Column(name = "status")
        private String status;
        @Column(name = "date_start")
        private String date_start;
        @Column(name = "date_end")
        private String date_end;

}
