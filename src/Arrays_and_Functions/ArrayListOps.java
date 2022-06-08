package Arrays_and_Functions;

import java.util.ArrayList;

public class ArrayListOps {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(10);
        System.out.println(list.get(0));
        list.remove(0);
    }
}
