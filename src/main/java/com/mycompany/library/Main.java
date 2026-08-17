

package com.mycompany.library;

import java.util.ArrayList;
import java.util.Scanner;

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
    
    void createBook(){
        String code, title, yearPublic, author;
        boolean available;
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
    }
    
    void listBooks(){
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
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
                return;
            }
        }
        System.out.println("Libro no registrado");
    }
    
    void updateBook(){
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
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
                return;
            }
        }
        System.out.println("Libro no registrado");
    }
    
    void deleteBook(){
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }
        String code;
        System.out.print("Digite el codigo del libro a eliminar: ");
        code = read.nextLine();
        
        for (Book b : books) {
            if(b.getCode().equals(code)){
                books.remove(b);
                System.out.println("Libro eliminado correctamente");
                return;
            }
        }
        System.out.println("Libro no registrado");
    }
    
    void createLoan(){
        if(customers.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        
        if(books.isEmpty()){
            System.out.println("No hay libros registrados");
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
            return;
        }
        if(!book.isAvailable()){
            System.out.println("El libro no se encuentra disponible");
            return;
        }
        loans.add(new Loan(loanId, customer, book));
        book.setAvailable(false);
        System.out.println("Prestamo registrado correctamente");
    }
    
    void returnLoan(){
        if(loans.isEmpty()){
            System.out.println("No hay ningun prestamo registrado");
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
                    return;
                }else{
                    System.out.println("El prestamo ya ha sido devuelto");
                    return;
                }
            }
        }
        System.out.println("Prestamo no registrado");
    }
    
    public static void main(String[] args) {
        
    }
}
