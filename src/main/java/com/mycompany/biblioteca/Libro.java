package com.mycompany.biblioteca;

public class Libro extends Material {
    protected String autor;
    protected boolean disponible;

    public Libro(String codigo, String titulo, String anioPublic, String autor, Boolean disponible) {
        super(codigo, titulo, anioPublic);
        this.autor = autor;
    }

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;}
}
