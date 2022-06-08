package Recursion;

import java.util.Scanner;

public class CB_SubsetSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t>0){

            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = scn.nextInt();
            }

            isSubsetSumYN(arr,0,0,0);
            t--;
        }

    }

    public static boolean isSubsetSum(int[] arr, int idx, int sos, int tar){

        if(idx == arr.length){
            if(sos == tar){
                return true;
            }
            return false;
        }

        boolean ans;
        ans = isSubsetSum(arr,idx+1,sos+arr[idx],tar);
        ans = isSubsetSum(arr,idx+1,sos,tar);

        return ans;
    }

    public static void isSubsetSumYN(int[] arr, int idx, int sos, int tar){
        if(isSubsetSum(arr,idx,sos,tar)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
