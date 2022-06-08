import java.util.Scanner;

public class Finanocci_pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int a = 0;
        int b = 1;
        int sum;
        int total = 0;

        for (int i = 0; i < num+1; i++) {
            if (num == 0){
             a = 0;
             total = 0;
             System.out.print(a+" ");
            } else {
                total = total + a;
                System.out.print(a+" ");
                sum = a + b;
                a = b;
                b = sum;
            }
        }
        System.out.print('\n');
        System.out.println("total is " + total);
    }
}
