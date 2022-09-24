public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSumm = 1_000_000;
        double rate = 9.99;
        double monthRate = rate / 12 / 100;
        double monthTerm = 12;
        // double monthTerm = 24; данные для 2х лет кредита
        //double monthTerm = 32; данные для 3х лет кредита
        double annuity = service.calculate(creditSumm, rate, monthTerm, monthRate);


        System.out.printf("%.0f", annuity);


    }
}