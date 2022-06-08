package Arrays_and_Functions;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {50,5,20,10,30,25};
        quickSort(arr,0,arr.length-1);

        for (int val: arr){
            System.out.print(val + " ");
        }
    }

    public static void quickSort(int[] arr, int lo, int hi){

        //basecase
        if (lo>=hi){
            return;
        }

        //1. partitioning
        int mid = (lo+hi)/2;
        int pivot = arr[mid];

        int left = lo;
        int right = hi;

        while (left <= right){

            while (arr[left] < pivot){
                left++;
            }

            while (arr[right]>pivot){
                right--;
            }

            if (left<=right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        //2. recursive call
        quickSort(arr,lo,right);
        quickSort(arr,left,hi);

    }
}
