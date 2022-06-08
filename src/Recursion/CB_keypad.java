package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CB_keypad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        displayAns(getKeypadCombo(str));
    }

    static String[] table = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

    public static ArrayList<String> getKeypadCombo(String str){

        if (str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr = getKeypadCombo(ros);

        String codesforch = table[cc - '0'];
        for (int i = 0; i < codesforch.length(); i++) {
            char eachcharincodeforch = codesforch.charAt(i);
            for (String elementinrr : rr){
                mr.add(eachcharincodeforch + elementinrr);
            }
        }

        return mr;
    }

    public static void displayAns(ArrayList<String> strlist){
        for (String elementinstrlist : strlist){
            System.out.print(elementinstrlist + " ");
        }
        System.out.println();
        System.out.println(strlist.size());
    }
}
