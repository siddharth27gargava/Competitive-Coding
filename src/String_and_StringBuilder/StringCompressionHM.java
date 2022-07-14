package String_and_StringBuilder;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class StringCompressionHM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println(compressString(str));
    }

    public static String compressString(String str){
        HashMap<Character,Integer> hm = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of+1;
                hm.put(ch,nf);
            } else {
                hm.put(ch,1);
            }
        }

        String ans = "";
        for (Character key: hm.keySet()) {
            ans = ans + key;
            if (hm.get(key) != 1) {
                ans = ans + Integer.toString(hm.get(key));
            }
        }

        return ans;
    }
}
