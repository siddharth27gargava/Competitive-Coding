package Inheritance;

public class Client {
    public static void main(String[] args) {

        System.out.println("--case1--");
        P_arent obj = new P_arent();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        obj.fun();
        obj.fun1();

        System.out.println();

        System.out.println("--case2--");
        P_arent obj2 = new C_hild();
        System.out.println(obj2.d);
        System.out.println(obj2.d1);
        System.out.println(((C_hild)obj2).d2);
        obj2.fun1();
        ((C_hild)(obj2)).fun();

        System.out.println();

        System.out.println("--case3--");
        //C_hild obj3 = new P_arent();
    }
}
