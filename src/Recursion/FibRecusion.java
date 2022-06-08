package Recursion;

import java.util.Scanner;

public class FibRecusion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println(fibprint(n));
    }

    public static int fibprint(int num){

        if (num == 1){
            return num;
        }

        if (num == 0){
            return num;
        }

        int fibnm1 = fibprint(num-1);
        int fibnm2 = fibprint(num - 2);

        int fib = fibnm1 + fibnm2;
        return fib;
    }
}
