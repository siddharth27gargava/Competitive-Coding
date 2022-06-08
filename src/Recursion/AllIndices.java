package Recursion;

import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        int[] arr = {3,8,1,8,8,4};
        int data = 8;
        int[] ans = allIndex(arr,data,0,0);
        display(ans);
    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] allIndex(int[] arr, int data, int si, int count){

        if (si == arr.length){
            int[] base = new int[count];
            return base;
        }

        int[] indices = null;
        if (arr[si] == data){
            indices = allIndex(arr,data,si+1,count+1);
        } else {
            indices = allIndex(arr,data,si+1,count);
        }

        if (arr[si] == data){
            indices[count] = si;
        }
        return indices;
    }

}
