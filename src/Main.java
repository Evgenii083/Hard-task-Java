public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSumm = 1_000_000;
        double rate = 9.99;
        double monthRate = rate / 12 / 100;
        double monthTerm = 12;
        double monthTerm2 = 24;
        double monthTerm3 = 36;


        double annuity = service.calculate(creditSumm, rate, monthTerm, monthRate, monthTerm2, monthTerm3);
        //double annuity2 = service.calculate(creditSumm, rate, monthTerm, monthRate, monthTerm2, monthTerm3);
        //double annuity3 = service.calculate(creditSumm, rate, monthTerm2, monthRate, monthTerm, monthTerm3);


        System.out.printf("%.0f",annuity);


    }
}