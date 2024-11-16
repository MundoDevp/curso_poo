package com.appges.model;

public class Empleado {

    private long dni;
    private String nombre;
    private String telefono;
    private String correo;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(long dni, String nombre, String telefono, Puesto puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
    }

    public Empleado(long dni, String nombre, String telefono, String correo, Puesto puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.puesto = puesto;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        String informacion = "***Informacion de Empleado***\n";
        informacion+="DNI: " + dni + "\n";
        informacion+="Nombre: " + nombre + "\n";
        informacion+="Telefono: " + telefono + "\n";
        informacion+="Correo: " + correo + "\n";
        informacion+="Cargo: " + puesto + "\n";

        return informacion;
    }
}
