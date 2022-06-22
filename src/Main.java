public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
            int creditSum = 1_000_000; //Укажите сумму кредита;
            int creditPeriod = 3; //Укажите срок кредита в годах;
            double creditRate = 9.99; //Укажите годовую ставку кредита в %;
            double sumPerMonth = service.calculate(creditSum, creditPeriod, creditRate);
        String str = String.format("Ежемесячный аннуитетный платеж по Вашему кредиту на сумму " + creditSum + " на " + creditPeriod + " год(а) составит: %.0f руб.", sumPerMonth);
        System.out.println(str);
    }
}
