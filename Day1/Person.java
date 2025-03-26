class Person1{
    String name;
    int age;

    public void displayinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Person {
    public static void main(String[] args) {
        Person1 info = new Person1();
        info.name = " Asif";
        info.age = 20;

        info.displayinfo();
    }
}
