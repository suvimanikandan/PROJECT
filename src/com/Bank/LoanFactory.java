package com.Bank;

public class LoanFactory extends AbstractFactory{


    @Override
    public Bank getBank(String Bank) {
        return null;
    }

    @Override
    public loan getLoan(String loan) {
        if(loan==null) {
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        }
        else if(loan.equalsIgnoreCase("Gold")){
            return new GoldLoan();
        }
        else if(loan.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        }
        else if (loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }
        return  null;

    }
}
