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

        //Creating ArrayList.
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(BuildingJavaEditionOne);
        bookList.add(BuildingJavaEditionTwo);
        bookList.add(BuildingJavaEditionThree);
        bookList.add(BuildingJavaEditionFour);
        System.out.println(bogSameISBN(BuildingJavaEditionTwo,bookList));


    }

    //Creating Method
    public static boolean bogSameISBN(Book sameBook, ArrayList<Book> list) {
        for (Book book : list) {

            if (book.equals(sameBook)) {
                System.out.println("Libbbrary contains \"" + sameBook.getTitle() + "\" with the given ISBN: " + sameBook.getISBN());
                return true;
            }
        }
            System.out.println("com.company.Library do not contain \"" + sameBook.getTitle() + "\" with the given ISBN: " + sameBook.getISBN());
            return false;
        }
    }



