package Arrays_and_Functions;

import java.util.Scanner;

public class rotateArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] result = rotateAnticlock(arr);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] reverse(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            int li = 0;
            int ri = arr[i].length-1;

            while(ri>li){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
        return arr;
    }

    public static int[][] transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    public static int[][] rotateAnticlock(int[][] arr){
        reverse(arr);
        transpose(arr);

        return arr;
    }

}
