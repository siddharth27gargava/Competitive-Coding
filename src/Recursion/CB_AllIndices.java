package Recursion;

import java.util.Scanner;

public class CB_AllIndices {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int size = scn.nextInt();
//
//        int[] arr = new int[size];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        int data = scn.nextInt();

        int[] arr = {3,2,1,2,3};
        int data = 2;

        display(getAllIndice(arr,data,0,0));
    }

    public static int[] getAllIndice(int[] arr, int data, int si, int count){

        if (si == arr.length){
            int[] base = new int[count];
            return base;
        }

        int[] indices = null;

        if (arr[si] == data){
            indices = getAllIndice(arr,data,si+1,count+1);
        } else {
            indices = getAllIndice(arr,data,si+1,count);
        }

        if (arr[si] == data){
            indices[count] = si;
        }

        return indices;
    }

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
