package String_and_StringBuilder;

import java.util.Scanner;

public class One_zero_Stringcheck {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t>0){
            String num1 = scn.next();
            String num2 = scn.next();
            String ans = stringOps(num1, num2);
            System.out.println(ans);

            t--;
        }
    }

    public static String stringOps(String str1, String str2){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                sb.append("0");
            } else {
                sb.append("1");
            }
        }

        return sb.toString();
    }
}
