package Queue;

public class ReverseQueue {
    public static void main(String[] args) throws Exception{
        CircularArrayQueue qu = new CircularArrayQueue();
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);

        qu.displayQueue();
        System.out.println();
        reverseQ(qu);
        qu.displayQueue();

    }

    public static void reverseQ(CircularArrayQueue q) throws Exception{

        if (q.isEmpty()){
            return;
        }

        int element = q.dequeue();
        reverseQ(q);
        q.enqueue(element);
    }
}
