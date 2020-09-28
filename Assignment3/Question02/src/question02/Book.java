/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author ellie
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    
    
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return String.format(
                          "Title:     %s%n"
                        + "Price:     %s%n"
                        + "In Stock:  %s%n%n"
                        + "Author: %s%n"
                        + "        Age:   %s%n"
                        + "        Email: %s", 
                this.getName(), this.getPrice(), this.getQtyInStock(), 
                this.author.getName(), this.author.getAge(), 
                this.author.getEmail());
    }
    

    
}
