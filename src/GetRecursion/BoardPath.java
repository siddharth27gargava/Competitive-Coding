package GetRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardPath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int end = scn.nextInt();

        System.out.println(getBoardPath(0,end));
    }

    public static ArrayList<String> getBoardPath(int curr, int end){

        if (curr == end){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }

        if (curr>end){
            ArrayList<String> baseres = new ArrayList<>();
            return baseres;
        }

        ArrayList<String> mr = new ArrayList<>();
        for (int dice = 1; dice <= 6 ; dice++) {
            ArrayList<String> rr = getBoardPath(curr+dice,end);

            for (String elementsInrr : rr){
                mr.add(dice+elementsInrr);
            }
        }
        return mr;
    }
}
