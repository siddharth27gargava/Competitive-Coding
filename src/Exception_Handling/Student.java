package Exception_Handling;

public class Student {
    String name;
    int age;

    public void setAge(int age) throws Exception{
        if (age < 0){
            throw new Exception("age can't be negative");
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


}
