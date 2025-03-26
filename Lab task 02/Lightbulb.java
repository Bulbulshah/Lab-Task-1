import java.util.*;
class bulb{
    boolean checkBulb = false;
    void turnOn(){
        checkBulb = true;
    }
    void turnOff(){
        checkBulb = false;
    }
    void check(){
        if(checkBulb){
        System.out.println("The Bulb is Turn On");}
        else{
            System.out.println("The Bulb is Turn Off");}
    }
}public class LightBulb {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bulb b = new bulb();
        int choice;
        System.out.println("1. Light On");
        System.out.println("2. Light Off1");
        choice = scan.nextInt();
        if(choice == 1){
            b.turnOn();
        }else if (choice == 2){
            b.turnOff();
        }
        else if(choice == 3){
            b.check();
        }else{
            System.out.println("Invalid");
        }


    }
}