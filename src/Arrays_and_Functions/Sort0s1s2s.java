package Arrays_and_Functions;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {1,1,2,0,2,1};
        sort0s_1s_2s(arr,0,arr.length-1);
        for (int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void sort0s_1s_2s(int[] arr, int lo, int hi){
        int mid = 0;
        while (mid<=hi){
            if (arr[mid] == 0){
                swap(arr,lo,mid);
                mid++;
                lo++;
            } else if (arr[mid] == 1){
                mid++;
            } else {
                swap(arr,hi,mid);
                mid++;
                hi--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
