package Arrays_and_Functions;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestnumberinArray { public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while(t>0){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(largestNumber(arr));

        t--;
    }

}

    public static String largestNumber(int[] nums){
        String[] arr = new String[nums.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = nums[i] + "";
        }

        Arrays.sort(arr,(a, b) -> {
            long n1 = Long.parseLong(a+b);
            long n2 = Long.parseLong(b+a);
            if(n1>n2){
                return 1;
            } else if(n1<n2){
                return -1;
            } else{
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1; i >= 0; i--){
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
