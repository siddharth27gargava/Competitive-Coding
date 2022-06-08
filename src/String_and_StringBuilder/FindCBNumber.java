package String_and_StringBuilder;

import java.util.Scanner;

public class FindCBNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        StringBuilder sb = new StringBuilder(n);
        while (sb.length() < n){
            sb.append(scn.next());
        }

        System.out.println(sb.toString());
    }

}
