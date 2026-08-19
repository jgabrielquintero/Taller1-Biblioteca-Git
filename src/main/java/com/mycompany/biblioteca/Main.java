package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clientes = new ArrayList<>();
    static ArrayList<Book> libros = new ArrayList<>();
    static ArrayList<Loan> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    int opcion;
    do {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Gestion de Clientes");
        System.out.println("2. Gestion de Libros");
        System.out.println("3. Gestion de Prestamos");
        System.out.println("0. Salir");
        System.out.print("Elija una opcion: ");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                menuClientes();
                break;
            case 2:
                menuLibros();
                break;
            case 3:
                menuPrestamos();
                break;
            case 0:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    } while (opcion != 0);
    }
    
    public static void menuClientes() {
    int opcion;
    do {
        System.out.println("\n--- GESTION DE CLIENTES ---");
        System.out.println("1. Crear cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Actualizar cliente");
        System.out.println("5. Eliminar cliente");
        System.out.println("0. Volver al menu principal");
        System.out.print("Elija una opcion: ");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                crearCliente();
                break;
            case 2:
                listarClientes();
                break;
            case 3:
                buscarCliente();
                break;
            case 4:
                actualizarCliente();
                break;
            case 5:
                eliminarCliente();
                break;
            case 0:
                System.out.println("Volviendo al menu principal...");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    } while (opcion != 0);
    }
    
    public static void menuLibros() {
    int opcion;
    do {
        System.out.println("\n--- GESTION DE LIBROS ---");
        System.out.println("1. Crear libro");
        System.out.println("2. Listar libros");
        System.out.println("3. Buscar libro");
        System.out.println("4. Actualizar libro");
        System.out.println("5. Eliminar libro");
        System.out.println("0. Volver al menu principal");
        System.out.print("Elija una opcion: ");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                crearLibro();
                break;
            case 2:
                listarLibros();
                break;
            case 3:
                buscarLibro();
                break;
            case 4:
                actualizarLibro();
                break;
            case 5:
                eliminarLibro();
                break;
            case 0:
                System.out.println("Volviendo al menu principal...");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    } while (opcion != 0);
}
    
    public static void menuPrestamos() {
    int opcion;
    do {
        System.out.println("\n--- GESTION DE PRESTAMOS ---");
        System.out.println("1. Registrar prestamo");
        System.out.println("2. Registrar devolucion");
        System.out.println("3. Listar prestamos");
        System.out.println("0. Volver al menu principal");
        System.out.print("Elija una opcion: ");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                crearPrestamo();
                break;
            case 2:
                devolucionPrestamo();
                break;
            case 3:
                listarPrestamos();
                break;
            case 0:
                System.out.println("Volviendo al menu principal...");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    } while (opcion != 0);
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
    
    Client c = new Client(id, nombre, telefono, email);
    clientes.add(c);
    
    System.out.println("cliente registrado con exito");    
    }
    
    public static void listarClientes() {
    for (Client c : clientes) {
    System.out.println("ID: " + c.getId() + ", Nombre: " + c.getNombre()
        + ", Telefono: " + c.getTelefono() + ", Email: " + c.getEmail());
    }
    }
    
    public static void buscarCliente() {
        System.out.println("ingrese el id del usuario a buscar: ");
        String idBuscado = sc.nextLine();
        
        boolean encontrado=false;
        
        for (Client c : clientes) {
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
        
        for (Client c : clientes) {
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

    Book l = new Book(codigo, titulo, anioPublic, autor);
    libros.add(l);

    System.out.println("Libro registrado");
    }
    
    public static void listarLibros() {
        for (Book l : libros) {
        System.out.println("Codigo: " + l.getCodigo() + ", Titulo: " + l.getTitulo()
            + ", Año de publicacion: " + l.getAnioPublic() + ", Autor: " + l.getAutor()
            + ", Disponible: " + l.getDisponible());
        }
    }
    
    public static void buscarLibro() {
        System.out.println("ingrese el codigo del libro a buscar: ");
        String codigoBuscado = sc.nextLine();
        
        boolean encontrado=false;
        
        for (Book l : libros) {
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
        
        for (Book l : libros) {
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
    
    public static Client buscarClientePorId(String id) {
        for (Client c : clientes) {
        if (c.getId().equals(id)) {
            return c;
        }
        }
        return null;
    }
    
    public static Book buscarLibroPorCodigo(String codigo){
        for (Book l : libros){
        if (l.getCodigo().equals(codigo)){
            return l;
        }
        }
        return null;
    }
    
    public static void crearPrestamo() {
        System.out.print("ingrese el id: ");
        String idCliente = sc.nextLine();
        Client cliente = buscarClientePorId(idCliente);

        if (cliente == null) {
        System.out.println("no encontrado");
        return;
        }
        System.out.println("ingrese el codigo del libro: ");
        String codigoLibro = sc.nextLine();
        Book libro = buscarLibroPorCodigo(codigoLibro);
        
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
        
        Loan p = new Loan(idPrestamo, cliente, libro, "activo");
        prestamos.add(p);
        libro.setDisponible(false);
        
        System.out.println("Prestamo exitoso");
    }
    
     public static void devolucionPrestamo() {
    System.out.print("Ingrese el id del prestamo a devolver: ");
    String idBuscado = sc.nextLine();

    boolean encontrado = false;

    for (Loan p : prestamos) {
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

    for (Loan p : prestamos) {
        System.out.println("Id prestamo: " + p.getIdPrestamo() + ", Cliente: " 
        + p.getCliente().getNombre() + ", Libro: " + p.getLibro().getTitulo()
        + ", Fecha: " + p.getFecha() + ", Estado: " + p.getEstado());
    }
}  
}