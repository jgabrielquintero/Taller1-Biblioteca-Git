package com.mycompany.biblioteca;

public class Book extends Material {
    protected String author;
    protected boolean available;

    public Book(String code, String title, String publicationYear, String author) {
        super(code, title, publicationYear);
        this.author = author;
        this.available = true;
    }

    public String getAuthor() {
        return author;
    }
    public boolean getAvailable() {
        return available;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}