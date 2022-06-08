package Arrays_and_Functions;

import java.util.Scanner;

public class ArrayOps {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] arr = takeInput();
//        display(arr);

        int[] arr = {55,44,11,33,22};
//        int result = lowerBound(arr,22);
//        System.out.println(result);
//        int ubres = upperBound(arr,33);
        recbubblesort(arr,0,arr.length-1);
        display(arr);

    }

    public static int[] takeInput(){
        System.out.println("Size? ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for "+i+" index");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void display(int[] array){
        for (int val : array){
            System.out.print(val+", ");
        }
    }

    public static int maxValue(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }


    public static int linearSearch(int[] arr, int item){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==item){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int item){
        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low + high)/2;
            if (arr[mid]>item){
                high = mid - 1;
            } else if (arr[mid]<item){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int[] bubbleSort(int[] arr){
        for (int counter = 0; counter < arr.length-1; counter++) {
            for (int j = 0; j < arr.length-1-counter; j++) {
                if (arr[j]>arr[j+1]){
                    ArrayFundamental.swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static int[] recbubblesort(int[] arr, int si, int li){

        if (li == 0){
            return arr;
        }
        if (si == li){
            recbubblesort(arr,0,li-1);
            return arr;
        }
        if (arr[si]>arr[si+1]){
            ArrayFundamental.swap(arr,si,si+1);
        }
        recbubblesort(arr,si+1,li);

        return arr;
    }

    public static int[] selectionSort(int[] arr){
        for (int counter = 0; counter < arr.length-1; counter++) {
            int min = counter;
            for (int i = counter+1; i < arr.length; i++) {
                if (arr[i]<arr[min]){
                    min = i;
                }
            }
            ArrayFundamental.swap(arr,counter,min);
        }

        return arr;
    }

    public static int[] insertionSort(int[] arr){
        for (int counter = 1; counter < arr.length; counter++) {
            int val = arr[counter];
            //reverse loop
            int j = counter - 1;
            while (j>=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        return arr;
    }

    public static int lowerBound(int[] arr, int item){
        int hi = arr.length-1;
        int lo = 0;
        int ans = -1;
        while (hi>=lo){
            int mid = (hi+lo)/2;

            if (arr[mid] == item){
                ans = mid;
                hi = mid-1;
            } else if (arr[mid]<item){
                lo = mid+1;
            } else if (arr[mid]>item){
                hi = mid-1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int item){
        int hi = arr.length-1;
        int lo = 0;
        int ans = -1;

        while (hi>=lo){
            int mid = (hi+lo)/2;

            if (arr[mid]==item){
                ans = mid;
                lo = mid + 1;
            } else if (arr[mid]>item){
                hi = mid-1;
            } else if (arr[mid]<item){
                lo = mid+1;
            }
        }
        return ans;
    }

}
