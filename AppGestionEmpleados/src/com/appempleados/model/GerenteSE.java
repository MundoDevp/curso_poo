package com.appempleados.model;

public class GerenteSE {
    private long id;
    private String nombre;
    private String correo;
    private char genero;
    private String direccion;
    private String telefono;
    private String departamento;
    private float sueldoBase;

    public GerenteSE() {
    }

    public GerenteSE(long id, String nombre, String correo, char genero, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero;
        this.direccion = direccion;
    }

    public GerenteSE(long id, String nombre, String correo, char genero, String direccion, String departamento, float sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero;
        this.direccion = direccion;
        this.departamento = departamento;
        this.sueldoBase = sueldoBase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
