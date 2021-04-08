package com.company;

import com.company.Book;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        //Creating objects.
        Book BuildingJavaEditionOne = new Book(123456, "Building Java Edition One", 2019);
        Book BuildingJavaEditionTwo = new Book(1234567, "Building Java Edition Two", 2020);
        Book BuildingJavaEditionThree = new Book(12345678, "Building Java Edition Three", 2021);
        Book BuildingJavaEditionFour = new Book(123456, "Building Java Edition Four", 2022);

        //Creating ArrayList. Reminder!: We haft to out comment fx line 16 and 20 to get Library do not contain:
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(BuildingJavaEditionOne);
        bookList.add(BuildingJavaEditionTwo);
        bookList.add(BuildingJavaEditionThree);
        bookList.add(BuildingJavaEditionFour);
        System.out.println(bogSameISBN(BuildingJavaEditionOne,bookList));


    }

    //Creating Method, accesmodifier, type, name, parameter: Book object and ArrayList named list
    public static boolean bogSameISBN(Book sameISBN, ArrayList<Book> list) {
        //Using a For each loop: it goes through each book in the list.
        for (Book book : list) {
            //If statement: two book has the same ISBN-nr. system print out "Tekst and book title and ISBN-nr.
            if (book.getISBN() == sameISBN.getISBN()) {
                System.out.println("Library contains: " + sameISBN.getTitle() + ": " + "ISBN-nr.: " + sameISBN.getISBN());
                return true;
            }
        }   /*If we out comment line 16 and 20 then the list do not contain same ISBN-nr.
            then system print out that the Library do not contain this book: tekst, book title, and ISBN-nr.*/
            System.out.println("Library do not contain: " + sameISBN.getTitle() + "ISBN-nr.: " + sameISBN.getISBN());
            return false;
        }
    }



