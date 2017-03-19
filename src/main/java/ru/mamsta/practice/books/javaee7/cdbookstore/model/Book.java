package ru.mamsta.practice.books.javaee7.cdbookstore.model;

public class Book {
    
    private String title;
    
    private Float price;
    
    private String description;
    
    private String number;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", price=" + price + ", description=" + description + ", number=" + number + "]";
    }
}
