interface CardPayment {
    void payWithCard(double amount);
}

interface BankTransferPayment {
    void payWithBankTransfer(double amount);
}


class PaypalPayment implements CardPayment {
    @Override
    public void payWithCard(double amount) {
        System.out.println("Paying with PayPal card: $" + amount);
    }
}

class BankTransferOnlyPayment implements BankTransferPayment {
    @Override
    public void payWithBankTransfer(double amount) {
        System.out.println("Paying with bank transfer: $" + amount);
    }
}


class ShoppingCart {
    private CardPayment cardPayment;
    private BankTransferPayment bankTransferPayment;

    public ShoppingCart(CardPayment cardPayment, BankTransferPayment bankTransferPayment) {
        this.cardPayment = cardPayment;
        this.bankTransferPayment = bankTransferPayment;
    }

    public void checkoutWithCard(double amount) {
        cardPayment.payWithCard(amount);
    }

    public void checkoutWithBankTransfer(double amount) {
        bankTransferPayment.payWithBankTransfer(amount);
    }
}
