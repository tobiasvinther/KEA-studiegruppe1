package com.company;

public class Main {

    public static void main(String[] args) {

        //tobias - just testing stuff
        Search search = new Search();
        Square square = new Square();
        String[] myStringArray = {"Picard", "Riker", "Geordi", "Data"};
        System.out.println(search.checkForString(myStringArray, "Picard"));
        search.printProblemDescription();
        square.drawSquare(6, '*');
        //tobias - end of tests


    }
}
