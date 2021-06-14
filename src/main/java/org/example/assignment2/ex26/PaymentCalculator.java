package org.example.assignment2.ex26;

public class PaymentCalculator {
    private double balance;
    private double APR;
    private double dailyRate;
    private double monthlyPayment;
    private double aprLittle;


   /* public PaymentCalculator() {
        this.balance = balance;
        this.APR = APR;
        this.monthlyPayment = monthlyPayment;
        this.dailyRate = dailyRate;

    }*/

    public double calculateMonthsUntilPaidOff(double aprLittle=0, double balance, double monthlyPayment) {
      /*  DecimalFormat df = new DecimalFormat("#.00");
        //df.format(APR);
        dailyRate = APR / 365;
        df.format(dailyRate);
        double power = Math.pow((1 + dailyRate), 30);
        double inLog = (1 + (balance / monthlyPayment));
        double result = -(1.0 / 30.0) * (Math.log(inLog));
        double result2 = result * (1 - power);
        double result3 = result2 / (Math.log(1 + dailyRate));
        double months = Math.round(result3); */
        double months;
        dailyRate = APR / 100;
        aprLittle = dailyRate / 365;
        months = -(1/30.0) * Math.log(1 + balance/monthlyPayment * (1 - (Math.pow(1 + aprLittle, 30)))) / (Math.log(1 + aprLittle));

        Math.round(months);
        return (int) months;


    }
}
