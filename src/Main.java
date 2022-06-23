public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000; //Сумма кредита в рублях;
        int creditPeriod = 3; //Срок кредита в годах;
        double creditRate = 9.99; //Годовая ставка кредита в %;
        double sumPerMonth = service.calculate(creditSum, creditPeriod, creditRate);
        String paymentPerMonth = String.format("Ежемесячный аннуитетный платеж по Вашему кредиту на сумму " + creditSum + " руб. на " + creditPeriod + " год(а) по ставке " + creditRate + " процентов годовых составит: %.0f руб.", sumPerMonth);
        System.out.println(paymentPerMonth);
    }
}
