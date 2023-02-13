package com.Plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory=new GetPlanFactory();

        System.out.println("Enter the name of plan for which will bill be generated");
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));

        String planName=bfr.readLine();
        System.out.println("Enter the Number of units will be calculated: ");
        int units=Integer.parseInt(bfr.readLine());

        Plan p =planFactory.getPlan(planName);

        System.out.println("Bill amount  for " + planName + " of " + units + "units is : "  );
  p.getRate();
  p.calculateBill(units);

    }
}
