
package com.mycompany.library;

import java.time.LocalDate;


public class Loan {
    private String loanId;
    private Customer customer;
    private Book book;
    private LocalDate date;
    private String state;

    public Loan() {
    }

    public Loan(String loanId, Customer customer, Book book, String state) {
        this.loanId = loanId;
        this.customer = customer;
        this.book = book;
        this.date = LocalDate.now();
        this.state = state;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
}
