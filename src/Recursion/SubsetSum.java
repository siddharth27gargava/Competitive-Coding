package Recursion;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,3,2,-3};
        int sum = 0;
        System.out.println(isSubsetSum(arr,0,0,sum));
    }

    public static boolean isSubsetSum(int[] arr, int idx, int sos, int target){

        if (idx == arr.length){
            if (sos == target){
                return true;
            }
            return false;
        }

        boolean ans;
        ans = isSubsetSum(arr,idx+1,sos+arr[idx],target);
        ans = isSubsetSum(arr,idx+1,sos,target);

        return ans;

    }


}
