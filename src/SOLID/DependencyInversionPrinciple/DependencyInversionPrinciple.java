package SOLID.DependencyInversionPrinciple;

public class DependencyInversionPrinciple {

    private Switchable device;

    public DependencyInversionPrinciple(Switchable device){
        this.device = device;
    }
    public void press(){
        device.switchOn();
    }
}
