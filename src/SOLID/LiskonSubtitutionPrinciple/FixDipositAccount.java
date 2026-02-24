package SOLID.LiskonSubtitutionPrinciple;

import java.awt.image.PackedColorModel;

public class FixDipositAccount implements Account{
    private double balance;
    @Override
    public double getBalance() {
        return balance;
    }
}
