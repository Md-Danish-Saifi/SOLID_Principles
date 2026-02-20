package SOLID.InterfaceSegregationPrinciple;

public class Eagle implements Flyable{
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void eat() {
        System.out.println("eagle is eating");
    }
}
