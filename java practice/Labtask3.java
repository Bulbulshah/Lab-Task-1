class Person{
    String name = " Bulbul Shah";
    int age = 19;

    public void introduce(){
        System.out.println(" Hello , My Name is " + name +" And i am " + age  + " years old");
    }
}

class Student1 extends Person{
    String school;
}
public class Labtask3 {
    public static void main(String[] args) {
        Student1 myinfo = new Student1();
        myinfo.introduce();
    }
}
