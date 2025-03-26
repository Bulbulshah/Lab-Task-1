class Calculator{
    int a;
    int b;
    public int add(){
        return a+b;
    }

    public int multiply(){
        return a*b;
    }
}
public class Maths {
    public static void main(String[] args) {
        Calculator sum1 = new Calculator();
        sum1.a = 2;
        sum1.b = 5;

        System.out.println(sum1.add());
        System.out.println(sum1.multiply());
    }
}
