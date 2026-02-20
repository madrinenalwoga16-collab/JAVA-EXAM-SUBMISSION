import java.util.*;

interface PaymentMethod {
    void verify();
    void process(double amount);
}

class BankPayment implements PaymentMethod {
    public void verify() {
        System.out.println("Bank confirmation verified.");
    }
    public void process(double amount) {
        System.out.println("Bank processed UGX " + amount);
    }
}

class MobileMoneyPayment implements PaymentMethod {
    public void verify() {
        System.out.println("Mobile Money transaction verified.");
    }
    public void process(double amount) {
        System.out.println("Mobile Money processed UGX " + amount);
    }
}

class Payment {

    private List<PaymentMethod> methods = new ArrayList<>();

    public void addMethod(PaymentMethod method) {
        methods.add(method);
    }

    public void processPayment(double totalAmount) {
        for (PaymentMethod m : methods) {
            m.verify();
            m.process(totalAmount);
        }
        System.out.println("Receipt Generated. Total Paid: UGX " + totalAmount);
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment payment = new Payment();

        PaymentMethod bank = new BankPayment();
        PaymentMethod mobile = new MobileMoneyPayment();

        payment.addMethod(bank);
        payment.addMethod(mobile);

        payment.processPayment(120000);
    }
}