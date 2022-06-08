import java.util.Scanner;

public class Reversenum_pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum = 0;

        while (num%10 != 0){
            int rem = num % 10;
            sum = (sum*10) + rem;
            num = num/10;
        }
        System.out.println("reversed number = " + sum);
    }
}
