package com.mycompany.biblioteca;

public class Person {
    protected String id;
    protected String nombre;
    protected String telefono;
    
    public Person(String id, String nombre, String telefono) {
    this.id = id;
    this.nombre = nombre;
    this.telefono = telefono;
}
    public String getNombre() {
    return nombre;}
    public String getTelefono() {
    return telefono;}
    public String getId() {
    return id;
}

public void setNombre(String nombre) {
    this.nombre = nombre;}
public void setTelefono(String telefono) {
    this.telefono = telefono;  }  
public void setId(String id) {
    this.id = id;    
}
}