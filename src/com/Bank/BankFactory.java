package com.Bank;

public class BankFactory extends AbstractFactory{

    @Override
    public Bank getBank(String Bank) {
        if (Bank == null) {
            return null;
        }
        if (Bank.equalsIgnoreCase("HDFCC")) {
            return new HDFCC();
        } else if (Bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        } else if (Bank.equalsIgnoreCase("ICICI")) {
            return new ICICI();
        }
        return null;
    }

    @Override
    public loan getLoan(String loan) {
        return null;
    }
}
