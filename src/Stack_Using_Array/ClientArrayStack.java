package Stack_Using_Array;

public class ClientArrayStack {
    public static void main(String[] args) throws Exception {
        ArrayStack arr = new ArrayStack();
        arr.push(1);
        System.out.println(arr.getTop());
        System.out.println();
        System.out.println(arr.isEmpty());
        System.out.println();
        System.out.println(arr.size());
        System.out.println();
        arr.push(12);
        arr.displayStack();
        System.out.println();
        arr.pop();
        arr.displayStack();
    }
}
