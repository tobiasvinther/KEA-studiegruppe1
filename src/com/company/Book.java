package com.company;

public class Book {

    //Attributes
    public int ISBN;
    public String title;
    public int releaseyear;
    //Constructor
    public Book(int ISBN, String title, int releaseyear) {
        this.ISBN = ISBN;
        this.title = title;
        this.releaseyear = releaseyear;

    }
    //Getterr
    public int getISBN() {
        return ISBN;
    }
    //Getter
    public String getTitle() {
        return title;
    }
    //Getter
    public int getReleaseyear() {
        return releaseyear;
    }
    @Override
    public String toString() {
        return "BookDate: " + "ISBN" + ISBN + "ReleaseYear" + releaseyear + "Title" + title;
    }
}
