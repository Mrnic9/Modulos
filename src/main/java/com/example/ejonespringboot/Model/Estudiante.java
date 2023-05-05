package com.example.ejonespringboot.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    private String semestre;
    private String facultad;
    private String fullName;
    private  double codigo;
    private double edad;
    private String user;
    private String password;

    public Estudiante(Long id, String semestre, String facultad, String fullName, double codigo, double edad, String user, String password) {
        this.id = id;
        this.semestre = semestre;
        this.facultad = facultad;
        this.fullName = fullName;
        this.codigo = codigo;
        this.edad = edad;
        this.user = user;
        this.password = password;
    }

    public Estudiante() {}
}
