package GetRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {

        String str = "ab";
        System.out.println(getSSWascii(str));
    }

    public static ArrayList<String> getSS(String str){
        if (str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getSS(ros);
        for (int i = 0; i < recResult.size(); i++) {
            myResult.add(recResult.get(i));
            myResult.add(cc + recResult.get(i));
        }

        return myResult;
    }

    public static ArrayList<String> getSSWascii(String str){
        if (str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getSSWascii(ros);
        for (int i = 0; i < recResult.size(); i++) {
            myResult.add(recResult.get(i));
            myResult.add(cc + recResult.get(i));
            int ascii = (int)cc;
            myResult.add(ascii+recResult.get(i));
        }

        return myResult;
    }
}
