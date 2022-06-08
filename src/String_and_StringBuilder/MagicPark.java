package String_and_StringBuilder;

import java.util.Scanner;

public class MagicPark {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int k = scn.nextInt();
        int strength = scn.nextInt();

//        int k = 5;
//        int strength = 20;
        Character[][] arr = new Character[n][m];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.next().charAt(0);
            }
        }

        escape(arr,k,strength);
//        display(arr);
    }

    public static void display(Character[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void escape(Character[][] arr, int k, int strength){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == '.' && j != arr[i].length-1){
                    strength = strength-2;
                    strength--;
                } else if(arr[i][j] == '*' && j != arr[i].length-1){
                    strength = strength + 5;
                    strength--;
                } else if(arr[i][j] == '.' && j == arr[i].length-1){
                    strength = strength-2;
                } else if(arr[i][j] == '*' && j == arr[i].length-1){
                    strength = strength+5;
                } else if (arr[i][j] == '#'){
                    break;
                }

            }
        }

        if (strength>k){
            System.out.println("Yes");
            System.out.println(strength);
        } else {
            System.out.println("No");
        }
    }
}
