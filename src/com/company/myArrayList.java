package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class myArrayList {
    public static void main(String[] args) {
        /*Skriv en metodemed navnet doesArraylistContainString, dermodtager 2parametrer: enarraylisteog enstreng.
         Metoden returnerer en boolean:•Hvis strengen ikke findes i arraylistenindsættes strengen i listen og metoden returnerer
         false•Hvis strengen findes i arraylisten returnerer metodentrue og printer ”The String has been found”*/

        ArrayList<String> contain = new ArrayList<String>();
        contain.add("coffee");
        contain.add("cake");
        contain.add("Rugbrød");
        contain.add("Flødeboller");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a word: ");
        String text = sc.nextLine();

        doesArraylistContainString(contain,text);

        System.out.println(contain);

    }

    public static boolean doesArraylistContainString(ArrayList list, String text) {
        for (int i = 0; i < list.size(); i++) {

            if (text.equals(list.get(i))) {
                System.out.println("The String has been found");
                return true;
            }
        }

        list.add(text);
        System.out.println("The String has not been found in the original list but wil be added.");
        return false;
    }
}
