import java.util.Scanner;
class Employee{
    public double calculateBonus(int basicsalary){
        return basicsalary*0.05;
    }
    public double calculateBonus(double basicsalary , int rate){
        double bonus = 0;
        if(rate == 5){
            bonus =(basicsalary*0.20);

        }else if(rate == 4){
            bonus = (basicsalary*0.15);

        }else if(rate==3){
            bonus = (basicsalary*0.1);
        }else if(rate==2){
            bonus =(basicsalary*0.05);
        }else if(rate==1){
            bonus = (basicsalary*0);
        }else{
            System.out.println(" Invalid input ");
        }
        return bonus;
    }
        
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sal;
        sal = scan.nextInt();
        Employee Emp = new Employee();
        Emp.calculateBonus(500, 3);
        System.out.println(Emp.calculateBonus(500, 3));
    }
}
