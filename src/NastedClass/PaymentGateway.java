package NastedClass;

public class PaymentGateway extends PayByCreditCard{
    public static Object processPayment;
    PaymentGateway credit = new PaymentGateway();

    public void PaymentProcess(String paymentMethod){
        if (paymentMethod.equalsIgnoreCase("creditCard")){
           ;
        }
    }
    /*
    private static class PayByCreditCard {
            private static void paywithCreditCard(){
                System.out.println("I have to pay to by credit card");
        }

     */
    }


