import java.util.Scanner;

public class Self_fundamentalpattern {
    public static void main(String[] args) {
        // Prime number pattern
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("composite");
        } else {
            System.out.println("prime");
        }
    }
}
