package GetRecursion;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(getMazepath(0,0,2,2));
    }

    public static ArrayList<String> getMazepath(int cr, int cc, int er, int ec){

        if (cr == er && cc == ec){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }

        if (cr>er || cc>ec){
            ArrayList<String> baseres = new ArrayList<>();
            return baseres;
        }

        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrh = getMazepath(cr,cc+1,er,ec);
        for (String elementsInrrh : rrh){
            mr.add("H"+elementsInrrh);
        }
        ArrayList<String> rrv = getMazepath(cr+1,cc,er,ec);
        for (String elementsInrrv : rrv){
            mr.add("V"+elementsInrrv);
        }

        return mr;
    }
}
