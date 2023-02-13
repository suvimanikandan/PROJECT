package com.Bank;

public abstract class loan {
    protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanamt, int years) {


        double EMI;
        int n;

        n = years * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamt;

        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamt+" you have borrowed");


    }
}
