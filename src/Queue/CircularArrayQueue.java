package Queue;

public class CircularArrayQueue {
    public int[] data;
    public int front;
    public int rear;
    public int csize;
    public int msize;

    public static final int DEFAULT_CAPACITY = 6;

    CircularArrayQueue() throws Exception{
        this(DEFAULT_CAPACITY);
    }

    CircularArrayQueue(int capacity) throws Exception{

        if (capacity<1){
            throw new Exception("Invalid Capacity");
        }
        data = new int[capacity];
        front = 0;
        rear = capacity-1;
        csize = 0;
        msize = capacity;
    }

    public boolean isEmpty(){
        return this.csize == 0;
    }

    public boolean isFull(){
        return this.csize == this.msize;
    }

    public void enqueue(int item) throws Exception{

        if (!this.isFull()) {
            this.rear = (this.rear + 1) % this.msize;
            this.data[this.rear] = item;
            this.csize = this.csize+1;
        }
    }

    public int dequeue() throws Exception{

        int rv = this.data[this.front];
        if (!this.isEmpty()) {
            this.front = (this.front + 1) % this.data.length;
            this.csize = this.csize - 1;
        }
        return rv;
    }

    public int getFront(){
        return this.data[this.front];
    }

    public int getRear(){
        return this.data[this.rear];
    }

    public void displayQueue() throws Exception{

        while (!this.isEmpty()){
            System.out.print(this.getFront()+"=>");
            this.dequeue();
        }
        System.out.print("END");
    }

}
