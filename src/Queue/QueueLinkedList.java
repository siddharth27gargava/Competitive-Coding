package Queue;

import java.util.LinkedList;

public class QueueLinkedList {
    LinkedList<Integer> queue;

    public QueueLinkedList(){
        queue = new LinkedList<>();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void enqueue(int item){
        queue.addLast(item);
    }

    public void dequeue(){
        queue.removeFirst();
    }

    public int getFront(){
        return queue.getFirst();
    }
}
