package Arrays_and_Functions;

import java.util.Scanner;

public class matixSearch {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int numr = scn.nextInt();
        int numc = scn.nextInt();

        int[][] arr = new int[numr][numc];

        for(int i = 0; i < numr; i++){
            for(int j = 0; j < numc; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int data = scn.nextInt();

        int result = matrixSearch(arr,data);
        System.out.println(result);

    }

    public static int matrixSearch(int[][] arr, int target){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    ans = 1;
                }
            }
        }
        return ans;
    }
}
