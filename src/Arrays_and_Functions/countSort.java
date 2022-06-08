package Arrays_and_Functions;

public class countSort {
    public static void main(String[] args) {

    }

    public static int[] countSort(int[] arr, int min, int max){
        int range = max - min + 1;
        int[] farr = new int[range];

        //frequency array fill
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
            farr[idx]++;
        }

        //sum prefix array
        for (int i = 1; i < farr.length; i++) {
            farr[i] = farr[i] + farr[i-1];
        }

        int[] ans = new int[arr.length];


        for (int i = arr.length-1; i >= 0 ; i--) {
            int val = arr[i];
            int pos = farr[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            
            farr[val-min]--;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }

        return ans;
    }
}
