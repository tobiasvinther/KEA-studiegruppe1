package com.company;

public class Main {

    public static void main(String[] args) {

        //tobias - just testing stuff
        Search search = new Search();
        String[] myStringArray = {"Picard", "Riker", "Geordi", "Data"};
        System.out.println(search.checkForString(myStringArray, "Picard"));
        search.printProblemDescription();
        //tobias - end of tests


    }
}
