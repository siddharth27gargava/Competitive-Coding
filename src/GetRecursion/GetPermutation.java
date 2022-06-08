package GetRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(getPermutation(str));
    }

    public static ArrayList<String> getPermutation(String str){
        if (str.length() == 0){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr = getPermutation(ros);

        for (String elementsinrr : rr) {
            for (int i = 0; i <= elementsinrr.length(); i++) {
                String val = elementsinrr.substring(0,i) + cc + elementsinrr.substring(i);
                mr.add(val);
            }
        }

        return mr;
    }
}
