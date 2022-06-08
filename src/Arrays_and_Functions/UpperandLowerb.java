package Arrays_and_Functions;

import java.util.Scanner;

public class UpperandLowerb {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        //Creating array
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        //Creating query array
        int query = scn.nextInt();
        int[] qarray = new int[query];
        for(int q = 0; q < qarray.length; q++){
            qarray[q] = scn.nextInt();
        }

        lowerandupperbound(arr,qarray);
    }

    public static int lowerBound(int[] arr, int item){
        int hi = arr.length-1;
        int lo = 0;
        int ans = -1;
        while(hi>=lo){
            int mid = (hi+lo)/2;
            if(arr[mid] == item){
                ans = mid;
                hi = mid - 1;
            } else if(arr[mid]>item){
                hi = mid-1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int item){
        int hi = arr.length-1;
        int lo = 0;
        int ans = -1;
        while(hi>=lo){
            int mid = (hi+lo)/2;
            if(arr[mid] == item){
                ans = mid;
                lo = mid + 1;
            } else if(arr[mid]>item){
                hi = mid-1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static void lowerandupperbound(int[] arr, int[] qarr){
        for(int i = 0; i < qarr.length; i++){
            System.out.print(lowerBound(arr,qarr[i]) + " ");
            System.out.print(upperBound(arr,qarr[i]));
            System.out.println();
        }
    }
}
