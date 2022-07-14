package Stack_Using_Array;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) throws Exception{
        int[] arr = {30,35,40,38,35};
        stockSpan(arr);
    }

    public static void stockSpan(int[] arr) throws Exception{
        Stack<Integer> stack = new Stack<>();

        int[] span = new int[arr.length];

        stack.push(0);

        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[stack.peek()]){
                while (!stack.isEmpty()){
                    stack.pop();
                }
            }

            stack.push(i);
            span[i] = stack.size();
        }
        System.out.print("END");
    }
}
