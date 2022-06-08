package String_and_StringBuilder;

import java.util.Scanner;

public class DifferenceinASCII {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println(diffinASCII(str));
    }

    public static String diffinASCII(String str){
       String ans = "";
        for (int i = 0; i < str.length()-1; i++) {
            ans = ans + str.charAt(i);
            int dif = str.charAt(i+1) - str.charAt(i);
            ans = ans + dif;
        }
        ans = ans + str.charAt(str.length()-1);
        return ans;
    }
}
