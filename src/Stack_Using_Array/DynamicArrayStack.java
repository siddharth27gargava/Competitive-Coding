package Stack_Using_Array;

public class DynamicArrayStack extends ArrayStack{


    public DynamicArrayStack() throws Exception{
        this(DEFAULT_CAP);
    }

    public DynamicArrayStack(int capacity) throws Exception{
        super(capacity);
    }

    @Override
    public void push(int item) throws Exception{
        if (this.size() == data.length){
            int[] arr = new int[2*this.data.length];
            for (int i = 0; i < this.size(); i++) {
                arr[i] = this.data[i];
            }
            this.data = arr;
        }

        super.push(item);
    }

    public int peek() throws Exception{
        if (this.isEmpty()){
            throw new Exception("no top available");
        }
        return this.data[this.top];
    }

}
