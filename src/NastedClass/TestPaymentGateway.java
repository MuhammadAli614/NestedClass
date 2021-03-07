package NastedClass;

import java.util.Scanner;

public class TestPaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How would you like to pay");
        System.out.println("We have too many option debit, credit, EBT, GiftCard,..");
        String PaymentMethod = sc.nextLine();
        PaymentGateway paymentGateway = new PaymentGateway();
        PaymentGateway.processPayment = new PaymentGateway();
        sc.close();
    }
}
