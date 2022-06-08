import java.util.Scanner;

public class HCF_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int rem;

        while (n1 % n2 != 0){
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        System.out.println("HCF is " + n2);
    }
}
