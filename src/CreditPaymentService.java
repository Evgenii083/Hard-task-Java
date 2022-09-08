public class CreditPaymentService {
    public double calculate(double creditSumm, double rate, double monthTerm, double monthRate, double monthTerm2, double monthTerm3) {
        double paymentIndex = monthRate * (Math.pow((1 + monthRate), monthTerm) / ((Math.pow((1 + monthRate), monthTerm) - 1)));
        double paymentIndex2 = monthRate * (Math.pow((1 + monthRate), monthTerm2) / ((Math.pow((1 + monthRate), monthTerm2) - 1)));
        double paymentIndex3 = monthRate * (Math.pow((1 + monthRate), monthTerm3) / ((Math.pow((1 + monthRate), monthTerm3) - 1)));
        double annuity = creditSumm * paymentIndex;
        //double annuity2 = creditSumm * paymentIndex2;
        //double annuity3 = creditSumm * paymentIndex3;


        return annuity;
        // невозможно вызвать return несколько раз , а как обойти это я не знаю. Была идея использовать массив или список...но не смог реализовать.
    }

}