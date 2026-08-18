package com.mycompany.biblioteca;

public class Material {
    protected String codigo;
    protected String titulo;
    protected String anioPublic;
    
    public Material(String Codigo, String Titulo, String AnioPublic){
    this.codigo=Codigo;
    this.titulo=Titulo;
    this.anioPublic=AnioPublic;
}
    public String getCodigo(){
    return codigo;}
    public String getTitulo(){
    return titulo;}
    public String getAnioPublic(){
    return anioPublic;}
    
    public void setCodigo(String codigo){
    this.codigo= codigo;}
    public void setTitulo(String titulo){
    this.titulo=titulo;}
    public void setAnioPublic(String anioPublic){
    this.anioPublic=anioPublic;}
}
