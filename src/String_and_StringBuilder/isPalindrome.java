package String_and_StringBuilder;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(isPalidrome(str));
    }

    public static boolean isPalidrome(String str){
        if(str.length() == 0 || str.length() == 1){
            return true;
        }
        int li = 0;
        int ri = str.length()-1;
        while (ri>li){
            if (str.charAt(li) != str.charAt(ri)){
                return false;
            }
            li++;
            ri--;
        }
        return true;
    }
}
