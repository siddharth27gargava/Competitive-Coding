package String_and_StringBuilder;

import java.util.Scanner;

public class Compress {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        System.out.println(compressStringnoHM(str));
    }

    public static String compressStringnoHM(String str){
        int counter = 1;
        String ans = "";
        ans = ans + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if (prev == curr){
                counter++;
            } else {
                if (counter > 1){
                    ans = ans + counter;
                    counter = 1;
                }
                ans = ans + curr;
            }
        }

        if (counter>1){
            ans = ans + counter;
            counter = 1;
        }

        return ans;
    }
}
