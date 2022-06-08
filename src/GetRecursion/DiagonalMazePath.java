package GetRecursion;

import java.util.ArrayList;

public class DiagonalMazePath {
    public static void main(String[] args) {
        System.out.println(getDiagMP(0,0,2,2));
    }
    public static ArrayList<String> getDiagMP(int cr, int cc, int er, int ec){
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
        ArrayList<String> rrh = getDiagMP(cr,cc+1,er,ec);
        for (String elementsInrrh : rrh){
            mr.add("H"+elementsInrrh);
        }
        ArrayList<String> rrv = getDiagMP(cr+1,cc,er,ec);
        for (String elementsInrrv : rrv){
            mr.add("V"+elementsInrrv);
        }
        ArrayList<String> rrd = getDiagMP(cr+1,cc+1,er,ec);
        for (String elementsInrrd : rrd){
            mr.add("D"+elementsInrrd);
        }
        return mr;
    }
}
