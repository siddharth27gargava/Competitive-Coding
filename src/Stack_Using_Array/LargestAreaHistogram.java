package Stack_Using_Array;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(largestArea(arr));
    }

    public static int largestArea(int[] arr){

        //get right boundary array
        int[] rb = new int[arr.length];

        //process for getting next smallest element towards right
        Stack<Integer> st = new Stack<>();
        //Step-1 (pre-requisites)
        st.push(arr.length-1);
        rb[arr.length-1] = arr.length;

        for (int i = arr.length-2; i >= 0 ; i--) {
            //Step-2 : agar chhota element aata hai toh bade element on top of stack is popped
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }

            //Step-3 : insert in o/p array
            if (st.isEmpty()){
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }

            //Step-4 : push element
            st.push(i);
        }

        //get left boundary array
        int[] lb = new int[arr.length];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }

            if (st.isEmpty()){
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }

            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if (area>maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
