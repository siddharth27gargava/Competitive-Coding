package Arrays_and_Functions;

public class ArrayFundamental {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*10;
        }
        for (int val : arr){
            System.out.print(val+", ");
        }

        swap(arr,0,3);
        System.out.println();
        for (int val : arr){
            System.out.print(val+", ");
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
