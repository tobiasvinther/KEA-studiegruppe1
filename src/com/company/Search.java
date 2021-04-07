package com.company;

public class Search {

    private final String problemDescription = "Skriv en metode, der som parametre modtager et array af typen String samt en String.\n" +
            "Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen, hvis\n" +
            "strengen findes i arrayet og –1 hvis strengen ikke findes i arrayet.\n" +
            "Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du i stedet kaster en exception.";

    public void printProblemDescription() {
        System.out.println(problemDescription);
    }

    public int checkForString(String[] array, String stringToLookFor) {
        //check if string exists in array
        //if yes: return index number
        //if no: return -1
        //cast exception (look more into this)

        int stringIndex = -1;

        for (int i=0; i < array.length; i++) {
            if(array[i].equals(stringToLookFor)) {
                stringIndex = i;
                break;
            }
        }

        return stringIndex;
    }

}
