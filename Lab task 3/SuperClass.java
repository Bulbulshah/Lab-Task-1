
class Class {
    String name = "Bulbul" ;
    int age = 20;
    public void introduce(){
        System.out.println(" Hello My Name is " + name + " and i am " + age);
    };

}

class StudentInfo extends Class{
  
}

public class SuperClass{
    public static void main(String[] args) {
        StudentInfo info = new StudentInfo();

        info.introduce();
    }

}
