package com.jdojo.intro.chapter1.binding;

import javafx.beans.property.*;

public class Book {

    private StringProperty title = new SimpleStringProperty(this, "title", "Unknown");
    private DoubleProperty price = new SimpleDoubleProperty(this, "price", 0.0);
    private ReadOnlyStringWrapper ISBN = new ReadOnlyStringWrapper(this, "ISBN", "Unknown");

    public Book() {}

    public Book(String title, double price, String ISBN) {
        this.title.set(title);
        this.price.set(price);
        this.ISBN.set(ISBN);
    }

    public final String getTitle() {
        return title.get();
    }

    public final StringProperty titleProperty() {
        return title;
    }

    public final void setTitle(String title) {
        this.title.set(title);
    }

    public final double getPrice() {
        return price.get();
    }

    public final DoubleProperty priceProperty() {
        return price;
    }

    public final void setPrice(double price) {
        this.price.set(price);
    }

    public final String getISBN() {
        return ISBN.get();
    }

    public final ReadOnlyStringWrapper ISBNProperty() {
        return ISBN;
    }

    public final void setISBN(String ISBN) {
        this.ISBN.set(ISBN);
    }
}
