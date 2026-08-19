package com.mycompany.biblioteca;
import java.time.LocalDate;

public class Loan {
    protected String loanId;
    protected Client client;
    protected Book book;
    protected String status;
    protected LocalDate date;
    
    public Loan(String loanId, Client client, Book book, String status){
    this.loanId=loanId;
    this.client=client;
    this.book=book;
    this.status=status;
    this.date = LocalDate.now();
    }
    
    public String getLoanId(){
    return loanId;}
    public Client getClient(){
    return client;}
    public Book getBook(){
    return book;}
    public String getStatus(){
    return status;}    
    public LocalDate getDate() {
    return date;}
    
    public void setLoanId(String loanId){
    this.loanId=loanId;}
    public void setClient(Client client){
    this.client=client;}
    public void setBook(Book book){
    this.book=book;}
    public void setStatus(String status){
    this.status=status;}
    public void setDate(LocalDate date) {
    this.date = date;}
}
