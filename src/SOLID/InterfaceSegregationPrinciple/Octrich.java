package SOLID.InterfaceSegregationPrinciple;

import static java.lang.System.out;

public class Octrich implements NonFlyable{
    @Override
    public void eat() {
        out.println("Ostrich is eating");
    }

    @Override
    public void walk() {
        out.println("Ostrich is walking");
    }
}
