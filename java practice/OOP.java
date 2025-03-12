class Student{
    String  name;
    int age;

    public void Studentinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    };

}

public class OOP{
    public static void main(String[] args) {

        Student S1 = new Student();

        S1.name = " Bulbul Shah";
        S1.age = 19;

        S1.Studentinfo();

    }
}