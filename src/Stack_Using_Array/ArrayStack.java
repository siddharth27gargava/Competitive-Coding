package Stack_Using_Array;

public class ArrayStack {
    protected int[] data;
    protected int top;

    public static final int DEFAULT_CAP = 5;
    public ArrayStack() throws Exception{
        this(DEFAULT_CAP);
    }

    public ArrayStack(int capacity) throws Exception{
        if (capacity < 1){
            throw new Exception("invalid capacity");
        }

        this.data = new int[capacity];
        this.top = -1;
    }

    public int size(){
        return this.top+1;
    }

    public void push(int val) throws Exception{

        if (this.top == data.length){
            throw new Exception("push can't be done");
        }

        this.top++;
        this.data[this.top] = val;
    }

    public int pop() throws Exception{

        if (this.top < 0){
            throw new Exception("pop can't be done");
        }

        int popval = this.data[this.top];
        this.data[this.top] = 0;
        this.top--;
        return popval;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void displayStack() throws Exception{

        if (this.top == -1){
            throw new Exception("stack empty");
        }
        for (int i = this.top; i >= 0 ; i--) {
            System.out.print(this.data[i] + " ");
        }
        System.out.print("END");
    }

    public int getTop(){
        return this.top;
    }
}
