package Queue;

public class ClientCircularQueue {
    public static void main(String[] args) throws Exception{
        CircularArrayQueue queue = new CircularArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.enqueue(60);

        queue.displayQueue();
        //System.out.println();
//
//        queue.enqueue(10);
//        queue.displayQueue();
//        System.out.println();
//
//        System.out.println(queue.getRear());
//        System.out.println();
//
//        queue.dequeue();
//        queue.displayQueue();
//        System.out.println();
//
//        System.out.println(queue.getFront());
//        System.out.println();
//
//        System.out.println(queue.isFull());
//        System.out.println();
    }
}
