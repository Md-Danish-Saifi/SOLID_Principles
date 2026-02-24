package SOLID.LiskonSubtitutionPrinciple;

public class SavingsAccount implements WithdrawbleAccount{

    private double amount;
    @Override
    public void withDraw(int amount) {
        this.amount -=amount;
    }

    @Override
    public double getBalance() {
        return amount;
    }
}
