class Animal{
    public final void Makesound(){
        System.out.println(" Animals make Sounds ");
    }
}
class Dog extends Animal{
    @Override
    public void Makesound(){
        System.out.println("Dog Barks");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.Makesound();
    }
}
         