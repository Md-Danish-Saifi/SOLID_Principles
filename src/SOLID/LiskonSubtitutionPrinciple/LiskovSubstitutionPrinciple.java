package SOLID.LiskonSubtitutionPrinciple;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        FixDipositAccount fd = new FixDipositAccount();
        SavingsAccount sa = new SavingsAccount();

        fd.getBalance();
    }
}
