
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();
}


class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedAccount extends BankAccount {
    public FixedAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.06;
    }
}

class Main5 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount fixed = new FixedAccount(1000);

        System.out.println("Проценты по сберегательному счету: " + savings.calculateInterest());
        System.out.println("Проценты по фиксированному счету: " + fixed.calculateInterest());
    }
}
