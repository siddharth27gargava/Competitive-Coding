package GetRecursion;

import java.util.Scanner;

public class ConvStringtoInt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int last = str.length();

        int ans = convCharArraytoInt(stringtoCharArray(str),last-1);
        System.out.println(ans);
    }

    public static char[] stringtoCharArray(String str){
        char[] charr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charr[i] = str.charAt(i);
        }

        return charr;
    }

    public static int convCharArraytoInt(char[] charray, int ei){

        //base case
        if (ei == 0){
            return charray[ei] - '0';
        }

        //recursive call
        int rAns = convCharArraytoInt(charray,ei-1);

        //small work
        int a = charray[ei] - '0';
        return rAns*10 + a;
    }
}
