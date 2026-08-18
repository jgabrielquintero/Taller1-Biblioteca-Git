package com.mycompany.biblioteca;
import java.time.LocalDate;

public class Prestamo {
    protected String idPrestamo;
    protected Cliente cliente;
    protected Libro libro;
    protected String estado;
    protected LocalDate fecha;
    
    public Prestamo(String idPrestamo, Cliente cliente, Libro libro, String estado){
    this.idPrestamo=idPrestamo;
    this.cliente=cliente;
    this.libro=libro;
    this.estado=estado;
    this.fecha = LocalDate.now();
    }
    
    public String getIdPrestamo(){
    return idPrestamo;}
    public Cliente getCliente(){
    return cliente;}
    public Libro getLibro(){
    return libro;}
    public String getEstado(){
    return estado;}    
    public LocalDate getFecha() {
    return fecha;}
    
    public void setIdPrestamo(String idPrestamo){
    this.idPrestamo=idPrestamo;}
    public void setCliente(Cliente cliente){
    this.cliente=cliente;}
    public void setLibro(Libro libro){
    this.libro=libro;}
    public void setEstado(String estado){
    this.estado=estado;}
    public void setFecha(LocalDate fecha) {
    this.fecha = fecha;}
}
