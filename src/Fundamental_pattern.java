import java.util.Scanner;

public class Fundamental_pattern {
    public static void main(String[] args) {
       // Even-Odd pattern
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
