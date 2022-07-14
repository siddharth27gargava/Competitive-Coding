package Queue;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        char[] charray = {'c','b','a','b','c','a','d','b','d','x'};
        firstNonRepChar(charray);
    }

    public static void firstNonRepChar(char[] arr){
        HashMap<Character,Integer> map = new HashMap<>();
        Deque<Character> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (map.containsKey(ch)){
                int of = map.get(ch);
                int nf = of+1;
                map.put(ch,nf);
            } else {
                map.put(ch,1);
            }

            q.addLast(ch);

            while (!q.isEmpty() && map.get(q.getFirst()) > 1){
                q.removeFirst();
            }


            if (q.isEmpty()){
                System.out.print(" -1 ");
            } else {
                System.out.print(q.getFirst() + " ");
            }
        }


    }
}
