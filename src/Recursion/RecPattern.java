package Recursion;

import java.util.Scanner;

public class RecPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        pattern(n,1,1);
    }

    public static void pattern(int N, int row, int col){

        if (row>N){
            return;
        }

        if (col>row){
            System.out.println();
            pattern(N,row+1,1);
            return;
        }

        System.out.print("*");
        pattern(N, row, col+1);
    }
}
