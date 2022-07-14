package Queue;

import java.util.HashMap;
import java.util.Scanner;

public class BalanceParenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        isBalancedParenthesis(str);
    }

    public static void isBalancedParenthesis(String str){

        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of+1;
            } else {
                hm.put(ch,1);
            }
        }

        if (hm.get('(') == hm.get(')') && hm.get('{') == hm.get('}') && hm.get('[') == hm.get(']')){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
