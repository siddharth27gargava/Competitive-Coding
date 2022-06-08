package String_and_StringBuilder;

import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        //printChar(str);
        printSubstring(str);
    }

    public static void printChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    
    public static void printSubstring(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
