package Oops;

public class Person {
    String name;
    int age;

    public int d1;
    protected int d2;
    int d3 = 10;
    private int d4;

    public Person(){
        System.out.println("I am default constructor");
    }

    public Person(int age){
        System.out.println("I am parameterised constructor");
        this.age = age;
    }

    public Person(int age, String name){
        System.out.println("2 parameters");
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
