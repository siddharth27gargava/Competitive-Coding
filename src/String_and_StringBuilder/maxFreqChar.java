package String_and_StringBuilder;

import java.util.HashMap;
import java.util.Scanner;

public class maxFreqChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println(getMaxfreqchar(str));
    }

    public static char getMaxfreqchar(String str){
        HashMap<Character, Integer> hm = new HashMap<>();

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
        char mfc = str.charAt(0);
        for (Character key: hm.keySet()) {
            if (hm.get(key) > hm.get(mfc)){
                mfc = key;
            }
        }

        return mfc;
    }
}
