package com.company;

    public class ProperCase {
        public static void main(String[] args) {
            //Skriv en metode, der tager imod en sætning af ord med mellemrum imellem.
            //Sætningen ændres efter følgende regler:
            //Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
            //Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
            //Ord på max. 3 bogstaver skal skrives med småt.
            String sentence = "We are in April now which means it IS Spring, ALRIGHT!";
            changeString(sentence);
        }
        public static String changeString(String stringToChange) {
            String[] wordArray = stringToChange.split(" ");
            String finishedSentence = "";

            for (int i = 0; i < wordArray.length; i++) {
                String word = wordArray[i];
                boolean isUpperCase = true;
                for (int j = 0; j < word.length(); j++) {
                    char a = word.charAt(j);
                    if (Character.isLowerCase(a)) {
                        isUpperCase = false;
                        break;
                    }
                }
                if (!isUpperCase) {
                    if (wordArray[i].length() > 3) {
                        wordArray[i] = wordArray[i].substring(0, 1).toUpperCase() + wordArray[i].substring(1).toLowerCase();
                        finishedSentence = finishedSentence + " " + wordArray[i];

                    } else if (wordArray[i].length() <= 3) {
                        wordArray[i] = wordArray[i].toLowerCase();
                        finishedSentence = finishedSentence + " " + wordArray[i];
                    }
                } else {
                    finishedSentence = finishedSentence + " " + word;
                }
            }
            System.out.println(finishedSentence);
            return finishedSentence;
        }
    }

