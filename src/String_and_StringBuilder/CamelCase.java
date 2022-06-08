package String_and_StringBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        printCamelCase(str);
    }

    public static void printCamelCase(String str){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                list.add(i);
            }
        }

        for (int j = 0; j < list.size()-1; j++) {
            System.out.println(str.substring(list.get(j), list.get(j+1)));
        }
        System.out.println(str.substring(list.get(list.size()-1)));

    }
}
