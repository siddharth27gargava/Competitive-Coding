package Stack_Using_Array;

public class NextGreaterElement {
    public static void main(String[] args) throws Exception{
        int[] arr = {2,1,3,8,6,7,5};
        nextGreaterElem(arr);
    }

    public static void nextGreaterElem(int[] arr) throws Exception{
        DynamicArrayStack stack = new DynamicArrayStack();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i]>stack.peek()){
                int rv = stack.pop();
                System.out.println(rv + " --> " + arr[i]);
            }
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()){
            int val = stack.pop();
            System.out.println(val + " --> " + -1);
        }
    }
}
