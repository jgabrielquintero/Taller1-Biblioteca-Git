package com.mycompany.biblioteca;
import java.time.LocalDate;

public class Loan {
    protected String idPrestamo;
    protected Client cliente;
    protected Book libro;
    protected String estado;
    protected LocalDate fecha;
    
    public Loan(String idPrestamo, Client cliente, Book libro, String estado){
    this.idPrestamo=idPrestamo;
    this.cliente=cliente;
    this.libro=libro;
    this.estado=estado;
    this.fecha = LocalDate.now();
    }
    
    public String getIdPrestamo(){
    return idPrestamo;}
    public Client getCliente(){
    return cliente;}
    public Book getLibro(){
    return libro;}
    public String getEstado(){
    return estado;}    
    public LocalDate getFecha() {
    return fecha;}
    
    public void setIdPrestamo(String idPrestamo){
    this.idPrestamo=idPrestamo;}
    public void setCliente(Client cliente){
    this.cliente=cliente;}
    public void setLibro(Book libro){
    this.libro=libro;}
    public void setEstado(String estado){
    this.estado=estado;}
    public void setFecha(LocalDate fecha) {
    this.fecha = fecha;}
}
