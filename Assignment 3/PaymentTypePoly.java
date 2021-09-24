package org.Assignment3.net;

public class PaymentTypePoly {

    public static void main(String[] args) {
        CashPayment c = new CashPayment();
        c.pay();

        Payment p = new CashPayment();
        p.pay(); // Pay by cash

        p = new CreditPayment();
        p.pay(); // Pay by creditcard
    }

}

interface Payment {
    public void pay();
}

class CashPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }

}

class CreditPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }

}