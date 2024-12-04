package com.appestudiantes.model;

public class Estudiante {
    private long matricula;
    private String nombre;

    public Estudiante(long matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
