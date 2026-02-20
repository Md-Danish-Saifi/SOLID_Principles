package SOLID.DependencyInversionPrinciple;

public class Fan implements Switchable{
    @Override
    public void switchOn() {
        System.out.println("Turning on fan");
    }

    @Override
    public void switchOff() {
        System.out.println("Turning off fan");
    }
}
