class Calcu {
    public int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public int add(int a, int b, int c) {
        int res = a + b + c;
        return res;
    }
}

public class Calculate {
    public static void main(String[] args) {
        Calcu print = new Calcu();
        System.out.println(print.add(4, 7));
    }
}
