// class Pen{
//     String Colour;
//     String Type;

//     public void Write(){
//         System.out.println("To Write Somethimg");
//     }

//     public void PrintColour(){
//         System.out.println(this.Colour);
//     }

//     public void PrintType(){
//         System.out.println(this.Type);
//     }
// }

class StudentInfo{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    StudentInfo(String name, int age){
        this.name = name;
        this.age = age;
        
    }
}
public class Main {
    public static void main(String[] args){
        // Pen print = new Pen();
        // print.Colour = " Black";
        // print.Type = " Jel";

        // Pen Print1 = new Pen();
        // Print1.Colour = " Blue";
        // Print1.Type = " Balpoint";

        // print.PrintType();
        // Print1.PrintType();

        StudentInfo S1 = new StudentInfo("Bulbul" , 20);
       

        S1.printinfo();
    }
}
