package Arrays_and_Functions;

public class Globalscope {
    public static int val = 10;

    public static void main(String[] args) {
        //int val = 20;
        System.out.println(val);
        System.out.println(Globalscope.val);
        System.out.println(scope(40));
    }

    public static int scope(int num){

        int sum = num + val;

        return sum;
    }
}
