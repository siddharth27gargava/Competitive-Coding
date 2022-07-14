package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxElementinWindowK {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,5,2,3,6};
        int k = 3;
        maxElement(arr,k);
    }

    public static void maxElement(int[] arr, int k){
        Deque<Integer> q = new LinkedList<>();
        int i;
        for (i = 0; i < k; i++) {

            //remove element that comes before i and is smaller
            while (!q.isEmpty() && arr[i]>arr[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }

        for (;i < arr.length; i++){
            //print previous window largest element
            System.out.print(arr[q.getFirst()] + " , ");

            //condition for looking out for elements only in k
            while (!q.isEmpty() && q.getFirst()<=i-k){
                q.removeFirst();
            }

            //remove element that comes before i and is smaller
            while (!q.isEmpty() && arr[i]>arr[q.getLast()]){
                q.removeLast();
            }

            q.addLast(i);
        }

        System.out.print(arr[q.getFirst()] + " END");
    }
}
