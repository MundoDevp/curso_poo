package com.poo.arreglo;

public class Estudiante {
    private long matricula;
    private String nombre;
    private float promedio;

    public Estudiante(long matricula, String nombre, float promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.promedio = promedio;
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

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula + " Nombre: " + this.nombre + " Promedio: " + this.promedio;
    }
}
