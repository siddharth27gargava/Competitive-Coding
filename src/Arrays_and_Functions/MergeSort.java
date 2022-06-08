package Arrays_and_Functions;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,15,50,40,20,10};
        int[] ans = mergeSort(arr,0,arr.length-1);
        ArrayOps.display(ans);
    }

    public static int[] mergeSort(int[] arr, int lo, int hi){

        if (hi == lo){
            int[] basearr = new int[1];
            basearr[0] = arr[lo];
            return basearr;
        }

        int mid = (hi+lo)/2;

        int[] fh = mergeSort(arr,lo,mid);
        int[] sh = mergeSort(arr,mid+1,hi);

        int[] mergeArray = MergeArrays.getMergedArray(fh,sh);

        return mergeArray;

    }
}
