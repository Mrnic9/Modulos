package com.example.ejonespringboot.DTO;


import com.example.ejonespringboot.Model.Estudiante;

import java.util.List;

public class EstudianteDTO {
    private String semestre;
    private String facultad;
    private String fullName;

long id;
private List<Estudiante>estudiantes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public EstudianteDTO(String semestre, String facultad, String fullName, long id) {
        this.semestre = semestre;
        this.facultad = facultad;
        this.fullName = fullName;
        this.id = id;
    }

    public EstudianteDTO(Long id, String semestre, String facultad, String fullName) {

    }
}
