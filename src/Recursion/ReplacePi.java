package Recursion;

import java.util.Scanner;

public class ReplacePi {
    public static void main(String[] args) {
        System.out.println(replacePi("pixpix"));
    }

    public static String replacePi(String s){
        if (s.length() <= 1) {
            return s;
        }

        if (s.substring(0, 2).equals("pi")) {
            String ros = replacePi(s.substring(2));
            return "3.14" + ros;
        } else {
            String ros = replacePi(s.substring(1));
            return s.charAt(0) + ros;
        }
    }
}
