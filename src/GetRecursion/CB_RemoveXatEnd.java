package GetRecursion;

import java.util.Scanner;

public class CB_RemoveXatEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        //abexexdexed
        int l = str.length();
        moveXatEnd(str,0,l);
    }

    public static void moveXatEnd(String str, int si, int ei){

        if (si>=ei){
            return;
        }
        char cc = str.charAt(si);

        if (cc != 'x'){
            System.out.print(cc);
        }

        moveXatEnd(str,si+1,ei);

        if (cc == 'x'){
            System.out.print(cc);
        }


    }
}
