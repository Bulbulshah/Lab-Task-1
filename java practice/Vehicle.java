class Car{
    String brand;
    public void StartEngine(){
        System.out.println(" The Vehical engine Starts");
    }
}

class Moter extends Car{
    public void honk(){
        System.out.println("The Car Honks ");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Moter moter1 = new Moter();

        moter1.StartEngine();
        moter1.honk();
    }
}
