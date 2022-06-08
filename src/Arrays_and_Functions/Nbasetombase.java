package Arrays_and_Functions;

import java.util.Scanner;

public class Nbasetombase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int convertingnum = scn.nextInt();
        int nbase = scn.nextInt();
        int mbase = scn.nextInt();
        int result = convertntom(convertingnum,nbase,mbase);
        System.out.println(result);

    }

    public static int convertntom(int convertingnum, int nbase, int mbase){
        int decimalnumber = AnybasetoDec.toDec(convertingnum,nbase);
        int finalnumber = AnydectoMbase(decimalnumber,mbase);

        return finalnumber;
    }

    public static int AnydectoMbase(int decnum, int mbase){
        int conversion_num = 0;
        int count = 0;

        while (decnum > 0){
            int rem = decnum % mbase;
            conversion_num = (rem * (int) (Math.pow(10,count))) + conversion_num;
            count++;
            decnum = decnum / mbase;
        }

        return conversion_num;
    }
}
