package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeIndexWindowK {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        firstNegativeWindowK(arr,k);
    }

    public static void firstNegativeWindowK(int[] arr, int k){
        Deque<Integer> q = new LinkedList<>();
        int i;
        for (i = 0; i < k; i++) {
            q.addLast(i);
            if (!q.isEmpty() && arr[i]>=0){
                q.removeLast();
            }
        }

        for (;i< arr.length;i++){
            if (!q.isEmpty()){
                System.out.print(arr[q.getFirst()] + " ");
            } else {
                System.out.print(" 0 ");
            }

            if (!q.isEmpty() && q.getFirst()<=i-k){
                q.removeFirst();
            }

            q.addLast(i);
            if (!q.isEmpty() && arr[i]>=0){
                q.removeLast();
            }
        }

        if (!q.isEmpty()){
            System.out.print(arr[q.getFirst()] + " END");
        } else {
            System.out.print(" 0 END");
        }
    }
}
