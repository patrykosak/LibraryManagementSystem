/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.util.Date;

/**
 *
 * @author xxx
 */
public class Book {
 
    private String ISBN;
    private String name;
    private Integer authorId;
    private Integer genreId;
    private Integer quantity;
    private String publisher;
    private double price;
    private Date dateRecived;
    private String description;
    private byte[] cover;
 
    
    public Book(){}

    public Book(String ISBN, String name, Integer authorId, Integer genreId, Integer quantity, String publisher, double price, Date dateRecived, String description, byte[] cover) {
        this.ISBN = ISBN;
        this.name = name;
        this.authorId = authorId;
        this.genreId = genreId;
        this.quantity = quantity;
        this.publisher = publisher;
        this.price = price;
        this.dateRecived = dateRecived;
        this.description = description;
        this.cover = cover;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateRecived() {
        return dateRecived;
    }

    public void setDateRecived(Date dateRecived) {
        this.dateRecived = dateRecived;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }
    
    
    
}
