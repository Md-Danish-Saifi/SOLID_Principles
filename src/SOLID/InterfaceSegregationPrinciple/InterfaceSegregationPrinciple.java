package SOLID.InterfaceSegregationPrinciple;
import static java.lang.System.out;

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        Octrich o = new Octrich();
        o.eat();
        o.walk();
        Eagle e = new Eagle();
        e.eat();
        e.fly();
    }
}
