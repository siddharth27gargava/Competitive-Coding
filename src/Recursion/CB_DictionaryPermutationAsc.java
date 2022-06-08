package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class CB_DictionaryPermutationAsc {
    public static void main(String[] args) {
        String str = "cab";
        ArrayList<String> list = lexsortAscending(dictionaryPermutation(str));
        getLexicoStringsbiggerthanGiven(list,str);
    }

    public static ArrayList<String> dictionaryPermutation(String str){

        if (str.length() == 0){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr = dictionaryPermutation(ros);

        for (String elementinRR : rr){
            for (int i = 0; i <= elementinRR.length(); i++) {
                String permutation = elementinRR.substring(0,i) + cc + elementinRR.substring(i);
                mr.add(permutation);
            }
        }
        return mr;
    }

    public static ArrayList<String> lexsortAscending(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).compareToIgnoreCase(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
        return list;
    }

    public static void getLexicoStringsbiggerthanGiven(ArrayList<String> list, String str){

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)){
                for (int j = i+1; j < list.size(); j++) {
                    System.out.println(list.get(j));
                }
            }
        }
    }

}
