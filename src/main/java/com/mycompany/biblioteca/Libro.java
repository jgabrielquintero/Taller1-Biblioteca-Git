package com.mycompany.biblioteca;

public class Libro extends Material {
    protected String autor;
    protected boolean disponible;

    public Libro(String codigo, String titulo, String anioPublic, String autor) {
        super(codigo, titulo, anioPublic);
        this.autor = autor;
        this.disponible = true;
    }

    public String getAutor() {
        return autor;
    }
    public boolean getDisponible() {
        return disponible;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}