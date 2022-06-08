package Arrays_and_Functions;

import java.util.Scanner;

public class PrimeVisits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] farr = create2dPrimearr(n);
        findPrimevisit(farr);

    }

    public static int[][] create2dPrimearr(int n){
        Scanner scn = new Scanner(System.in);
        int[][] parr = new int[n][2];
        for (int r = 0; r < n; r++) {
            for (int i = 0; i < 2; i++) {
                parr[r][i] = scn.nextInt();
            }
        }
        return parr;
    }

    public static void displayParr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findPrimevisit(int[][] arr){
        for (int r = 0; r < arr.length; r++) {
            int counter = 0;
            int startnum = arr[r][0];
            int endnum = arr[r][arr[r].length-1];
            for (int dividend = startnum; dividend <= endnum; dividend++) {
                if (dividend == 1) {
                    counter = 0;
                } else if (dividend == 2) {
                    counter = 1;
                } else {
                    boolean flag = true;
                    for (int divisor = 2; divisor < dividend; divisor++) {
                        if (dividend % divisor == 0) {
                            flag = false;
                        }
                    }
                    if (flag == true){
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }


}
