

package com.mycompany.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner read = new Scanner(System.in);
    
    void createCustomer(){
        String id, name, phone, email;
        System.out.print("Digite la identificacion del cliente: ");
        id = read.nextLine();
        System.out.print("Digite el nombre del cliente: ");
        name = read.nextLine();
        System.out.print("Digite el telefono del cliente: ");
        phone = read.nextLine();
        System.out.print("Digite el email del cliente: ");
        email = read.nextLine();
        customers.add(new Customer(id, name, phone, email));
        System.out.println("Cliente creado correctamente");
    }
    
    void listCustomers(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        int counter = 1;
        for (Customer c : customers) {
            System.out.println("Cliente #"+counter);
            System.out.println("Id del cliente: "+c.getId());
            System.out.println("Nombre del cliente: "+c.getName());
            System.out.println("Telefono del cliente: "+c.getPhone());
            System.out.println("Email del cliente: "+c.getEmail());
            System.out.println(" ");
            counter++;
        }
    }
    
    void searchCustomer(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        String id;
        System.out.print("Digite el id del cliente a buscar: ");
        id = read.nextLine();
       
        for (Customer c : customers) {
            if(c.getId().equals(id)){
                System.out.println("Id del cliente: "+c.getId());
                System.out.println("Nombre del cliente: "+c.getName());
                System.out.println("Telefono del cliente: "+c.getPhone());
                System.out.println("Email del cliente: "+c.getEmail());
                return;
            }
        }
        System.out.println("Cliente no registrado");
    }
    
    void updateCustomer(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        String id;
        System.out.print("Digite el id del cliente a actualizar: ");
        id = read.nextLine();
        
        for (Customer c : customers) {
            if(c.getId().equals(id)){
                System.out.print("Digite el nuevo nombre del cliente: ");
                c.setName(read.nextLine());
                System.out.print("Digite el nuevo telefono del cliente: ");
                c.setPhone(read.nextLine());
                System.out.print("Digite el nuevo email del cliente: ");
                c.setEmail(read.nextLine());
                System.out.println("Cliente actualizado correctamente");
                return;
            }
        }
        System.out.println("Cliente no registrado");
    }
    
    void deleteCustomer(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        String id;
        System.out.print("Digite el id del cliente a eliminar: ");
        id = read.nextLine();
        
        for (Customer c : customers) {
            if(c.getId().equals(id)){
                customers.remove(c);
                System.out.println("Cliente eliminado correctamente");
                return;
            }
        }
        System.out.println("Cliente no registrado");
    }
    
    public static void main(String[] args) {
        
    }
}
