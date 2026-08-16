

package com.mycompany.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    Scanner read = new Scanner(System.in);
    
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
    
    public static void main(String[] args) {
        
    }
}
