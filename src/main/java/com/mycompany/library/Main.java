

package com.mycompany.library;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
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
        System.out.println(" ");
    }
    
    void listCustomers(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            System.out.println(" ");
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
                System.out.println(" ");
                return;
            }
        }
        System.out.println("Cliente no registrado");
        System.out.println(" ");
    }
    
    void updateCustomer(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            System.out.println(" ");
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
                System.out.println(" ");
                return;
            }
        }
        System.out.println("Cliente no registrado");
        System.out.println(" ");
    }
    
    void deleteCustomer(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            System.out.println(" ");
            return;
        }
        String id;
        System.out.print("Digite el id del cliente a eliminar: ");
        id = read.nextLine();
        
        for (Customer c : customers) {
            if(c.getId().equals(id)){
                customers.remove(c);
                System.out.println("Cliente eliminado correctamente");
                System.out.println(" ");
                return;
            }
        }
        System.out.println("Cliente no registrado");
        System.out.println(" ");
    }
    
    void createBook(){
        String code, title, yearPublic, author;
        System.out.print("Digite el codigo del libro: ");
        code = read.nextLine();
        System.out.print("Digite el titulo del libro: ");
        title = read.nextLine();
        System.out.print("Digite el anio de publicacion del libro: ");
        yearPublic = read.nextLine();
        System.out.print("Digite el autor del libro: ");
        author = read.nextLine();
        books.add(new Book(code, title, yearPublic, author, true));
        System.out.println("Libro creado correctamente");
        System.out.println(" ");
    }
    
    void listBooks(){
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
            System.out.println(" ");
            return;
        }
        int counter = 1;
        for (Book b : books) {
            System.out.println("Libro #"+counter);
            System.out.println("Codigo del libro: "+b.getCode());
            System.out.println("Titulo del libro: "+b.getTitle());
            System.out.println("Anio de publicacion del libro: "+b.getYearPublic());
            System.out.println("Autor del libro: "+b.getAuthor());
            if(b.isAvailable()){
                System.out.println("Disponible: Si");
            }else{
                System.out.println("Disponible: No");
            }
            System.out.println(" ");
            counter++;
        }
    }
    
    void searchBook(){
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
            System.out.println(" ");
            return;
        }
        String code;
        System.out.print("Digite el codigo del libro a buscar: ");
        code = read.nextLine();
       
        for (Book b : books) {
            if(b.getCode().equals(code)){
                System.out.println("Codigo del libro: "+b.getCode());
                System.out.println("Titulo del libro: "+b.getTitle());
                System.out.println("Anio de publicacion del libro: "+b.getYearPublic());
                System.out.println("Autor del libro: "+b.getAuthor());
                if(b.isAvailable()){
                System.out.println("Disponible: Si");
                }else{
                System.out.println("Disponible: No");
                }
                System.out.println(" ");
                return;
            }
        }
        System.out.println("Libro no registrado");
        System.out.println(" ");
    }
    
    void updateBook(){
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
            System.out.println(" ");
            return;
        }
        String code;
        System.out.print("Digite el codigo del libro a actualizar: ");
        code = read.nextLine();
        
        for (Book b : books) {
            if(b.getCode().equals(code)){
                System.out.print("Digite el nuevo titulo del libro: ");
                b.setTitle(read.nextLine());
                System.out.print("Digite la nueva fecha de publicacion del libro: ");
                b.setYearPublic(read.nextLine());
                System.out.print("Digite el nuevo autor del libro: ");
                b.setAuthor(read.nextLine());
                System.out.println("Libro actualizado correctamente");
                System.out.println(" ");
                return;
            }
        }
        System.out.println("Libro no registrado");
        System.out.println(" ");
    }
    
    void deleteBook(){
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
            System.out.println(" ");
            return;
        }
        String code;
        System.out.print("Digite el codigo del libro a eliminar: ");
        code = read.nextLine();
        
        for (Book b : books) {
            if(b.getCode().equals(code)){
                books.remove(b);
                System.out.println("Libro eliminado correctamente");
                System.out.println(" ");
                return;
            }
        }
        System.out.println("Libro no registrado");
        System.out.println(" ");
    }
    
    void createLoan(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            System.out.println(" ");
            return;
        }
        
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
            System.out.println(" ");
            return;
        }
        
        String loanId, customerId, bookCode;
        System.out.print("Digite el id del prestamo: ");
        loanId = read.nextLine();
        System.out.print("Digite el id del cliente al que se va a prestar: ");
        customerId = read.nextLine();
        Customer customer = null;
        for (Customer c : customers) {
            if(c.getId().equals(customerId)){
                customer = c;
                break;
            }
        }
        if(customer == null){
            System.out.println("Cliente no registrado");
            System.out.println(" ");
            return;
        }
        System.out.print("Digite el codigo del libro a prestar: ");
        bookCode = read.nextLine();
        Book book = null;
        for (Book b : books) {
            if(b.getCode().equals(bookCode)){
                book = b;
                break;
            }
        }
        if(book == null){
            System.out.println("Libro no registrado");
            System.out.println(" ");
            return;
        }
        if(!book.isAvailable()){
            System.out.println("El libro no se encuentra disponible");
            System.out.println(" ");
            return;
        }
        loans.add(new Loan(loanId, customer, book));
        book.setAvailable(false);
        System.out.println("Prestamo registrado correctamente");
        System.out.println(" ");
    }
    
    void returnLoan(){
        if(loans.isEmpty()){
            System.out.println("No hay ningun prestamo registrado");
            System.out.println(" ");
            return;
        }
        String loanId;
        System.out.print("Digite el id del prestamo a devolver: ");
        loanId = read.nextLine();
        for (Loan l : loans) {
            if(l.getLoanId().equals(loanId)){
                if(l.getState().equals("Activo")){
                    l.getBook().setAvailable(true);
                    l.setState("Devuelto");
                    System.out.println("El prestamo ha sido devuelto correctamente");
                    System.out.println(" ");
                    return;
                }else{
                    System.out.println("El prestamo ya ha sido devuelto");
                    System.out.println(" ");
                    return;
                }
            }
        }
        System.out.println("Prestamo no registrado");
        System.out.println(" ");
    }
    
    void listLoans(){
    if(loans.isEmpty()){
        System.out.println("No hay prestamos registrados");
        System.out.println(" ");
        return;
    }

    int counter = 1;

    for (Loan l : loans) {
        System.out.println("Prestamo #" + counter);
        System.out.println("Id del prestamo: " + l.getLoanId());
        System.out.println("Nombre del cliente: " + l.getCustomer().getName());
        System.out.println("Titulo del libro: " + l.getBook().getTitle());
        System.out.println("Fecha del prestamo: " + l.getDate());
        System.out.println("Estado: " + l.getState());
        System.out.println(" ");
        counter++;
    }
}
    
    public static void main(String[] args) {
        Main m = new Main();
        int option;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                 ===== SISTEMA DE GESTION DE BIBLIOTECA =====
                                                 1. Gestionar clientes
                                                 2. Gestionar libros
                                                 3. Gestionar prestamos
                                                 4. Salir
                                                 
                                                 Digite una opcion: """));
            switch(option){
                case 1 -> {
                    int customerOption;
                    do{
                        customerOption = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                              ===== GESTION DE CLIENTES =====
                                                                                                              1. Crear cliente
                                                                                                              2. Listar clientes
                                                                                                              3. Buscar cliente
                                                                                                              4. Actualizar cliente
                                                                                                              5. Eliminar cliente
                                                                                                              6. Volver al menu principal
                                                                                      
                                                                                                              Digite una opcion: """));
                        switch(customerOption){
                            case 1 -> m.createCustomer();
                            case 2 -> m.listCustomers();
                            case 3 -> m.searchCustomer();
                            case 4 -> m.updateCustomer();
                            case 5 -> m.deleteCustomer();
                            case 6 -> {
                            }
                            default -> JOptionPane.showMessageDialog(null, "ERROR: Opcion no valida", "ERROR", JOptionPane.ERROR_MESSAGE);
                            
                        }
                    }while(customerOption != 6);
                }
                    
                case 2 -> {
                    int bookOption;
                    do{
                        bookOption = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                          ===== GESTION DE LIBROS =====
                                                                                                          1. Crear libro
                                                                                                          2. Listar libros
                                                                                                          3. Buscar libro
                                                                                                          4. Actualizar libro
                                                                                                          5. Eliminar libro
                                                                                                          6. Volver al menu principal
                                                                                  
                                                                                                          Digite una opcion: """));
                        switch(bookOption){
                            case 1 -> m.createBook();
                            case 2 -> m.listBooks();
                            case 3 -> m.searchBook();
                            case 4 -> m.updateBook();
                            case 5 -> m.deleteBook();
                            case 6 -> {
                            }
                            default -> JOptionPane.showMessageDialog(null, "ERROR: Opcion no valida", "ERROR", JOptionPane.ERROR_MESSAGE);
                            
                        }
                    }while(bookOption != 6);
                }
                    
                case 3 -> {
                    int loanOption;
                    do{
                        loanOption = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                          ===== GESTION DE PRESTAMOS =====
                                                                                                          1. Registrar prestamo
                                                                                                          2. Registrar devolucion
                                                                                                          3. Listar prestamos
                                                                                                          4. Volver al menu principal
                                                                                  
                                                                                                          Digite una opcion: """));
                        switch(loanOption){
                            case 1 -> m.createLoan();
                            case 2 -> m.returnLoan();
                            case 3 -> m.listLoans();
                            case 4 -> {
                            }
                            default -> JOptionPane.showMessageDialog(null, "ERROR: Opcion no valida", "ERROR", JOptionPane.ERROR_MESSAGE);
                            
                        }
                    }while(loanOption != 4);
                }
                case 4 -> JOptionPane.showMessageDialog(null, """
                                                        GRACIAS POR USAR NUESTROS SERVICIOS
                                                        SALIENDO...""");
                default -> JOptionPane.showMessageDialog(null, "ERROR: Opcion no valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while(option != 4);
    }
}
