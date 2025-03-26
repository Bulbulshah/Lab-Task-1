class Employee{
    void calculateSalary(){
        System.out.println("Basic Salary is : 3000 $");
    }
}

class Manager extends Employee{
    void calculateSalary(){
        System.out.println(" Manager Salry is 5000 + bonus");
    }
}
class Deveploper extends Employee{
    void calculateSalary(){
        System.out.println(" Developer Salry is 4000 + Allowance");
    }
}
public class MethodOverridinginanEmployeeSystem {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.calculateSalary();
    }
}
