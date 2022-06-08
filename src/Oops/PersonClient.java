package Oops;

public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person();

        Person p2 = new Person(22);

        System.out.println(p2.getAge());

        Person p3 = new Person(22,"sid");
        System.out.println(p3.getAge());
        System.out.println(p3.getName());

    }
}
