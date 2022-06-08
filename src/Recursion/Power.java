package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x,n));
    }
    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }

        int powernm1 = power(x,n-1);
        int powernm = x*powernm1;

        return powernm;
    }
}
