package Recursion;

public class Factorial {
    public static void main(String[] args) {

    }

    public static int Fact(int n){

        if (n == 1){
            return 1;
        }

        int fnm1 = Fact(n-1);
        int fn = n * fnm1;

        return fn;
    }
}
