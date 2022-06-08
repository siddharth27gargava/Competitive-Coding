package Recursion;

import java.util.Scanner;

public class MappedStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        char[] inputarr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            inputarr[i] = str.charAt(i);
        }

        int m = (int)Math.pow(2,inputarr.length) - 1;
        char[] outputarr = new char[m];

        mapped(inputarr,outputarr,0,0);

    }

    public static void mapped(char[] inputarr, char[] outputarr, int i, int j){

        if (i>=inputarr.length){
            String str = new String(outputarr);
            System.out.println(str.substring(0,j));
            return;
        }

        //convert character '1' to integer
        int digit = inputarr[i] - '0';

        //bring character corresponding to the integer
        char ch = (char) (digit + (int)('A') - 1);
        //store corresponding char in output arr
        outputarr[j] = ch;

        mapped(inputarr,outputarr,i+1,j+1);

        if (i+1 < inputarr.length){
            int second_digit = inputarr[i+1] - '0';
            int number = digit*10 + second_digit;
            if (number<=26){
                ch = (char)(number + (int)('A') - 1);
                outputarr[j] = ch;

                mapped(inputarr,outputarr,i+2,j+1);
            }
        }

    }
}
