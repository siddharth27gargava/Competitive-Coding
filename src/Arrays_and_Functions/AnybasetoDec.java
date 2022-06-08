package Arrays_and_Functions;

import java.util.Scanner;

public class AnybasetoDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the converting number ");
        int num = scn.nextInt();
        System.out.println("Enter the base ");
        int base = scn.nextInt();
        int result = toDec(num,base);
        System.out.println(result);

    }

    public static int toDec(int number, int base){
        int decnum = 0;
        int count = 0;

        while (number > 0){
            int rem = number % 10;
            decnum = (rem * (int)(Math.pow(base,count))) + decnum;
            count++;
            number = number/10;
        }

        return decnum;
    }
}
