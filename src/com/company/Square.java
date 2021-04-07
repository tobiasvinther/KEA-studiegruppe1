package com.company;

public class Square {

    private final String PROBLEM_DESCRIPTION = "Skriv en metode, der som parameter modtager et heltal. " +
            "Metoden skal udskrive et kvadrat på skærmen\n" +
            "svarende til heltallet. \nUdvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen";

    public void drawSquare (int size, char symbol) {
        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public void printProblemDescription() {
        System.out.println(PROBLEM_DESCRIPTION);
    }

}
