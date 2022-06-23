public class CreditPaymentService {
    public double calculate(int creditSum, int creditPeriod, double creditRate) {
        double ratePerMonth = creditRate / 12 / 100;
        double countRoot = Math.pow((1 + ratePerMonth), (creditPeriod * 12));
        double annIndex = (ratePerMonth * countRoot / (countRoot - 1));
        return annIndex * creditSum;
    }
}
