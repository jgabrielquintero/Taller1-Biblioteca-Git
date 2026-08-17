package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
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
    
    System.out.print("cliente registrado con exito");    
}
    
    public static void listarClientes() {
    for (Cliente c : clientes) {
    System.out.println("ID: " + c.getId() + ", Nombre: " + c.getNombre()
            + ", Telefono: " + c.getTelefono() + ", Email: " + c.getEmail());
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}