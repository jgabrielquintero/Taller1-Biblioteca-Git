package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Aquí irá el menú (Fase 8)
    }
    
    public static void crearCliente() {
        
    System.out.print("Ingrese el id: ");
    String id = sc.nextLine();
    
    System.out.print("Ingrese el nombre: ");
    String nombre = sc.nextLine();
    
    System.out.print("Ingrese el telefono: ");
    String telefono = sc.nextLine();
       
    System.out.print("Ingrese el email: ");
    String email = sc.nextLine();
    
    Cliente c = new Cliente(id, nombre, telefono, email);
    clientes.add(c);
    
    System.out.println("cliente registrado con exito");    
}
    
    public static void listarClientes() {
    for (Cliente c : clientes) {
    System.out.println("ID: " + c.getId() + ", Nombre: " + c.getNombre()
            + ", Telefono: " + c.getTelefono() + ", Email: " + c.getEmail());
}
}
    
    public static void buscarCliente() {
        System.out.println("ingrese el id del usuario a buscar: ");
        String idBuscado = sc.nextLine();
        
        boolean encontrado=false;
        
        for (Cliente c : clientes) {
            if(c.getId().equals(idBuscado)){
            System.out.println("ID: " + c.getId() + ", Nombre: " + c.getNombre()
            + ", Telefono: " + c.getTelefono() + ", Email: " + c.getEmail());
            encontrado=true;
            }
    }
        if(!encontrado){
            System.out.println("usuario no encontrado");
        }
}
    
    
    public static void actualizarCliente() {
        System.out.println("ingrese el id del usuario a actualizar: ");
        String idBuscado = sc.nextLine();
        
        boolean encontrado=false;
        
        for (Cliente c : clientes) {
            if(c.getId().equals(idBuscado)){
            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();
    
            System.out.print("Ingrese el telefono: ");
            String telefono = sc.nextLine();
       
            System.out.print("Ingrese el email: ");
            String email = sc.nextLine();
            
            c.setNombre(nombre);
            c.setTelefono(telefono);
            c.setEmail(email);
            
            encontrado=true;
            }
    }
        if(!encontrado){
            System.out.println("usuario no encontrado");
        }    
}
    
    public static void eliminarCliente() {
        System.out.println("ingrese el id del usuario a actualizar: ");
        String idBuscado = sc.nextLine();

        clientes.removeIf(c->c.getId().equals(idBuscado));
        System.out.println("usuario eliminado");
}
    
    public static void crearLibro() {
    System.out.print("Ingrese el codigo: ");
    String codigo = sc.nextLine();

    System.out.print("Ingrese el titulo: ");
    String titulo = sc.nextLine();

    System.out.print("Ingrese el año de publicacion: ");
    String anioPublic = sc.nextLine();

    System.out.print("Ingrese el autor: ");
    String autor = sc.nextLine();

    Libro l = new Libro(codigo, titulo, anioPublic, autor);
    libros.add(l);

    System.out.println("Libro registrado");
}
    
public static void listarLibros() {
    for (Libro l : libros) {
        System.out.println("Codigo: " + l.getCodigo() + ", Titulo: " + l.getTitulo()
                + ", Año de publicacion: " + l.getAnioPublic() + ", Autor: " + l.getAutor()
                + ", Disponible: " + l.getDisponible());
    }
}
    
    
    
    
    
    
}