package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class myArrayList {
    public static void main(String[] args) {
        /*Skriv en metodemed navnet doesArraylistContainString, dermodtager 2parametrer: enarraylisteog enstreng.
         Metoden returnerer en boolean:•Hvis strengen ikke findes i arraylistenindsættes strengen i listen og metoden returnerer
         false•Hvis strengen findes i arraylisten returnerer metodentrue og printer ”The String has been found”*/

        //Creating arrayList
        ArrayList<String> contain = new ArrayList<String>();
        contain.add("coffee");
        contain.add("cake");
        contain.add("Rugbrød");
        contain.add("Flødeboller");

        //Creating a Scanner to get the user to inset a word.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a word: ");
        String text = sc.nextLine();

        //Calling the method from line 30.
        doesArraylistContainString(contain,text);

        System.out.println(contain);

    }
    //Creating a method with to parameters(type and name, type and name)
    public static boolean doesArraylistContainString(ArrayList list, String text) {
        //Creating a forloop to check out arrayList.
        for (int i = 0; i < list.size(); i++) {
            //Using If statement to get the userinput and se if the input has been found.
            if (text.equals(list.get(i))) {
                System.out.println("The String has been found");
                return true;
            }
        }
        /*If the new text is not on the list it will be added to the list and line 41 will be printet out and the new
        list wil be updatet with the input from user.*/
        list.add(text);
        System.out.println("The String has not been found in the original list but will be added.");
        return false;
    }
}
