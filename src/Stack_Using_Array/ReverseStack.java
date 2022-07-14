package Stack_Using_Array;

public class ReverseStack {
    public static void main(String[] args) throws Exception{
        ArrayStack st = new ArrayStack(3);
        st.push(10);
        st.push(20);
        st.push(30);

        ArrayStack helper = new ArrayStack(3);

        reverseStack(st,helper,0);
        st.displayStack();
    }

    public static void reverseStack(ArrayStack stack, ArrayStack helper, int idx) throws Exception{

        if (stack.isEmpty()){
            return;
        }

        int item = stack.pop();

        reverseStack(stack,helper,idx+1);

        helper.push(item);

        if (idx == 0){
            while (!helper.isEmpty()){
                stack.push(helper.pop());
            }
        }
    }

}
