package Arrays_and_Functions;

import java.util.Scanner;

public class Sortlexigraphically {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String[] wordarray = new String[num];
        for(int i = 0; i < wordarray.length; i++){
            wordarray[i] = scn.nextLine();
        }

        sortLex(wordarray);
        displayStringarr(wordarray);
    }

    public static void displayStringarr(String[] wordarr){
        for (int i = 0; i < wordarr.length; i++) {
            System.out.println(wordarr[i]);
        }
    }

    public static String[] sortLex(String[] words){
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j])>0){
                    //swap
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
}
