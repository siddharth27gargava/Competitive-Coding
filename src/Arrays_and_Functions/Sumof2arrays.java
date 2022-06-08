package Arrays_and_Functions;

import java.util.Scanner;

public class Sumof2arrays {
    public static void main (String args[]) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] iarr1 = new int[n];
        for(int i = 0; i < iarr1.length; i++){
            iarr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] iarr2 = new int[m];
        for(int i = 0; i < iarr2.length; i++){
            iarr2[i] = scn.nextInt();
        }

        int convnum1 = arraytoNum(iarr1);
        int convnum2 = arraytoNum(iarr2);

        int addednum = convnum1 + convnum2;

        int[] arr = convnumtoArr(addednum);

        for (int val : arr) {
            System.out.print(val + " , ");
        }
        System.out.print("END");
    }

    public static int arraytoNum(int[] arr){
        int sum = 0;
        int prod = 1;
        for(int counter = arr.length-1; counter >= 0; counter--){
            sum = sum + (arr[counter]*prod);
            prod = prod*10;
        }
        return sum;
    }

    public static int countDigit(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    public static int[] convnumtoArr(int num){
        int arrsiz = countDigit(num);
        int[] arr = new int[arrsiz];
        for (int i = arr.length-1; i >= 0 ; i--) {
            arr[i] = num%10;
            num = num/10;
        }

        return arr;
    }

}
