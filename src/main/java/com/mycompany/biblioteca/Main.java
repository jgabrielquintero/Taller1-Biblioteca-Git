package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
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
        System.out.println("ingrese el id del usuario a eliminar: ");
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
    
    public static void buscarLibro() {
        System.out.println("ingrese el codigo del libro a buscar: ");
        String codigoBuscado = sc.nextLine();
        
        boolean encontrado=false;
        
        for (Libro l : libros) {
            if(l.getCodigo().equals(codigoBuscado)){
            System.out.println("Codigo: " + l.getCodigo() + ", Titulo: " + l.getTitulo()
                + ", Año de publicacion: " + l.getAnioPublic() + ", Autor: " + l.getAutor()
                + ", Disponible: " + l.getDisponible());
            encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("libro no encontrado");
        }
    }
    
    public static void actualizarLibro() {
        System.out.println("ingrese el codigo del libro a actualizar: ");
        String codigoBuscado = sc.nextLine();
        
        boolean encontrado=false;
        
        for (Libro l : libros) {
            if(l.getCodigo().equals(codigoBuscado)){
            System.out.print("Ingrese el titulo: ");
            String titulo = sc.nextLine();

            System.out.print("Ingrese el año de publicacion: ");
            String anioPublic = sc.nextLine();

            System.out.print("Ingrese el autor: ");
            String autor = sc.nextLine();
            
            System.out.print("sigue disponible?(true/false) : ");
            String disponibleTexto = sc.nextLine();
            boolean disponible = Boolean.parseBoolean(disponibleTexto);
            
            l.setTitulo(titulo);
            l.setAnioPublic(anioPublic);
            l.setAutor(autor);
            l.setDisponible(disponible);
            
            encontrado=true;
            }
        }
        if(!encontrado){
            System.out.println("usuario no encontrado");
        }    
    }
    
    public static void eliminarLibro() {
        System.out.println("ingrese el codigo del libro a eliminar: ");
        String codigoBuscado = sc.nextLine();

        libros.removeIf(l->l.getCodigo().equals(codigoBuscado));
        System.out.println("libro eliminado");
    }
    
    public static Cliente buscarClientePorId(String id) {
        for (Cliente c : clientes) {
        if (c.getId().equals(id)) {
            return c;
        }
        }
        return null;
    }
    
    public static Libro buscarLibroPorCodigo(String codigo){
        for (Libro l : libros){
        if (l.getCodigo().equals(codigo)){
            return l;
        }
        }
        return null;
    }
    
    public static void crearPrestamo() {
        System.out.print("ingrese el id: ");
        String idCliente = sc.nextLine();
        Cliente cliente = buscarClientePorId(idCliente);

        if (cliente == null) {
        System.out.println("no encontrado");
        return;
        }
        System.out.println("ingrese el codigo del libro: ");
        String codigoLibro = sc.nextLine();
        Libro libro = buscarLibroPorCodigo(codigoLibro);
        
        if(libro==null){
        System.out.println("no encontrado");
        return;
        }
        
        if (!libro.getDisponible()) {
        System.out.println("El libro no esta disponible");
        return;
        }
            
        System.out.print("Ingrese el id del prestamo: ");
        String idPrestamo = sc.nextLine();
        
        Prestamo p = new Prestamo(idPrestamo, cliente, libro, "activo");
        prestamos.add(p);
        libro.setDisponible(false);
        
        System.out.println("Prestamo exitoso");
    }
    
     public static void devolucionPrestamo() {
    System.out.print("Ingrese el id del prestamo a devolver: ");
    String idBuscado = sc.nextLine();

    boolean encontrado = false;

    for (Prestamo p : prestamos) {
        if (p.getIdPrestamo().equals(idBuscado)) {
            p.setEstado("devuelto");
            p.getLibro().setDisponible(true);
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("Prestamo no encontrado");
    } else {
        System.out.println("Devolucion registrada con exito");
    }
    }
    
    public static void listarPrestamos() {
    if (prestamos.isEmpty()) {
        System.out.println("No hay prestamos registrados");
        return;
    }

    for (Prestamo p : prestamos) {
        System.out.println("Id prestamo: " + p.getIdPrestamo() + ", Cliente: " 
        + p.getCliente().getNombre() + ", Libro: " + p.getLibro().getTitulo()
        + ", Fecha: " + p.getFecha() + ", Estado: " + p.getEstado());
    }
}
    
    
    
}