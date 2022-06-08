package Recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDIoddeven(n);
    }

    public static void printD(int num){
        if (num == 0){
            return;
        }
        System.out.println(num);
        printD(num-1);
    }

    public static void printI(int num){
        if (num == 0){
            return;
        }
        printI(num-1);
        System.out.println(num);
    }

    public static void printDI(int num){
        if (num == 0){
            return;
        }

        System.out.println(num);
        printDI(num-1);
        System.out.println(num);
    }

    public static void printDIoddeven(int num){
        if (num == 0){
            return;
        }

        if (num%2 != 0){
            System.out.println(num);
        }
        printDIoddeven(num-1);

        if (num%2 == 0){
            System.out.println(num);
        }
    }

}
