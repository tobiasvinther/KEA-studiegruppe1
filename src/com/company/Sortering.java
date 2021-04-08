package com.company;

import java.util.Scanner;

public class Sortering {

    String desricption = "Skrive en metode, der indlæser tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetisk" +
            " faldene orden på skærmen n/" +
            "Hvis der indlæses: " +
            "abekat\n" +
            "musefælde\n" +
            "ananas\n" +
            "slut\n" +
            "solskin\n\n" +
            "skal der udskrives følgende program på skærmen: " +
            "solskin \n" +
            "slut \n" +
            "musefælde \n" +
            "ananas \n" +
            "abekat \n";

    public void printDescription() {
        System.out.println(desricption);
    }

    public static void main(String[] args) {

        int numberOfStrings;
        String temp;

        Scanner scanner = new Scanner(System.in);

        //The user chooses how many strings they want
        System.out.println("Choose the number of strings that you want to type in: ");
        numberOfStrings = scanner.nextInt();

        //Create an array called str so the Strings can be stored later on
        String str[] = new String[numberOfStrings];

        //Create a new scanner object so it can be used in a for loop and so it wont be mixed with the other scanner.
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Enter the strings one after one: ");
        //Stores the strings in an array
        for (int i = 0; i < numberOfStrings; i++) {
            str[i] = stringScanner.nextLine();
        }

        //Sorting the strings
        for (int i = 0; i < numberOfStrings; i++) {
            for (int j = i + 1; j < numberOfStrings; j++)
            if (str[i].compareTo(str[j])<0) {
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
        for (int i = 0; i <= numberOfStrings - 1; i++) {
            System.out.print(str[i] + " ");
        }
    }

    }






