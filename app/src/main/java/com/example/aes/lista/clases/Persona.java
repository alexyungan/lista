package com.example.aes.lista.clases;

/**
 * Created by Aes on 6/7/2016.
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private Boolean estado;

    public Persona(Boolean estado, String apellido, String nombre) {
        this.estado = estado;
        Apellido = apellido;
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
