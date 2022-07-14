package Exception_Handling;

public class Client {
    public static void main(String[] args){
        Student s1 = new Student();

        try {
            s1.setAge(-10);
        } catch (Exception e){
            System.out.println("in catch block");
        }

        System.out.println(s1.getAge());
    }
}
