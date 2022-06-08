package Arrays_and_Functions;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        displaySpiral2d(array);

    }

    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] takeInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int rows = scn.nextInt();
        int[][] arr = new int[rows][];
        for (int row = 0; row < rows; row++) {
            System.out.println("Enter the column for "+row);
            int cols = scn.nextInt();
            arr[row] = new int[cols];
            for (int col = 0; col < cols; col++) {
                System.out.println("Enter value for row " + row + " and col " + col);
                arr[row][col] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void display2Darr(int[][] array){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println(array[row][col]);
            }
        }
    }

    public static void displayWave2d(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                for (int j = arr[i].length-1; j >= 0 ; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
    }

    public static void displaySpiral2d(int[][] arr){
        int top = 0;
        int bottom = arr.length-1;
        int left = 0;
        int right = arr[top].length-1;
        int count = (bottom+1)*(right+1);
        int dir = 1;

        while (left<=right && top<=bottom){
            while (count > 0){
                if (dir == 1){
                    for (int i = left; i <= right ; i++) {
                        System.out.print(arr[top][i]+" ");
                        count--;
                    }
                    top++;
                    dir = 2;
                } else if (dir == 2){
                    for (int i = top; i <= bottom ; i++) {
                        System.out.print(arr[i][right]+" ");
                        count--;
                    }
                    right--;
                    dir = 3;
                } else if (dir == 3){
                    for (int i = right; i >= left ; i--) {
                        System.out.print(arr[bottom][i]+" ");
                        count--;
                    }
                    bottom--;
                    dir = 4;
                } else if (dir == 4){
                    for (int i = bottom; i >= top ; i--) {
                        System.out.print(arr[i][left]+" ");
                        count--;
                    }
                    left++;
                    dir = 1;
                }

            }
        }
    }
}
