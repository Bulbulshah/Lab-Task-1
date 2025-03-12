class Vehicle {
    String brand;


    public Vehicle(String brand) {
        this.brand = brand;
    }

    
    public void startEngine() {
        System.out.println("The vehicle engine starts.");
    }
}

// Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    
    public Car(String brand) {
        super(brand);
    }

    
    public void honk() {
        System.out.println("The car honks.");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota");

        
        myCar.startEngine(); 
        myCar.honk();        
    }
}
