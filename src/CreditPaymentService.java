public class CreditPaymentService {
    public double calculate(double creditSumm, double rate, double monthTerm, double monthRate) {
        double paymentIndex = monthRate * (Math.pow((1 + monthRate), monthTerm) / ((Math.pow((1 + monthRate), monthTerm) - 1)));

        double annuity = creditSumm * paymentIndex;


        return annuity;
    }

}