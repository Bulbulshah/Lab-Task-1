class BankAccount{
    String Accountnumber;
    double balance = 0.0;
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(" Deposit Sucessful"+amount);
        }else{
            System.out.println("Deposit Not Sucessful");
        }
    }         

    public void displaybalance(){
        System.out.println(" Total Balance is " + balance);
    }
}
public class BankManagement {
    public static void main(String[] args) {
        BankAccount show = new BankAccount();
        show.Accountnumber = " HBL000045643";
        show.balance = 7000;

        show.displaybalance();
        show.deposit(700);
        System.out.println(" After Deposit ");
        show.displaybalance();
    }
}
