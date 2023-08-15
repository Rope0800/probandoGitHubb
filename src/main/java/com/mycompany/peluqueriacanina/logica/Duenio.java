
package com.mycompany.peluqueriacanina.logica;


public class Duenio {
    
    private int idDuenio;
    
    private String nombre;
    
    private String celularDuenio;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String celularDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celularDuenio = celularDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }
    

    
    
}
