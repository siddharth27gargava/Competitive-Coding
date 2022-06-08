package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPad {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String str = scn.next();
        ArrayList<String> alist = keyPadCombo("12");
        display(alist);
    }

    static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

    public static ArrayList<String> keyPadCombo(String str){
        if (str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = keyPadCombo(ros);
        ArrayList<String> mr = new ArrayList<>();

        String codeforch = table[cc - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char valofcode = codeforch.charAt(i);
            for (String elementinrr: rr){
                mr.add(valofcode + elementinrr);
            }
        }

        return mr;
    }

    public static void display(ArrayList<String> list){
        for (String val: list){
            System.out.println(val);
        }
    }
}
