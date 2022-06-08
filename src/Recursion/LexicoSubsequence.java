package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LexicoSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t>0){

            String str = scn.next();
            ArrayList<String> list = getlexsubsequence(str);
            String[] res = getLexArray(list);
            display(res);

            t--;
        }
    }

    public static ArrayList<String> getlexsubsequence(String str){

        if (str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getlexsubsequence(ros);
        ArrayList<String> mr = new ArrayList<>();

        for (String elementinrr : rr){
            mr.add(elementinrr);
            mr.add(cc+elementinrr);
        }

        return mr;
    }

    public static String[] getLexArray(ArrayList<String> arrlist){
        String[] ans = new String[arrlist.size()];
        ans = arrlist.toArray(ans);
        Arrays.sort(ans,String.CASE_INSENSITIVE_ORDER);

        return ans;
    }

    public static void display(String[] arr){
        for (String val : arr){
            System.out.println(val);
        }
    }

}
