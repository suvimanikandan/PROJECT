package com.Plan;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if(planType==null){
            return null;
        }
        if(planType.equals("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        else if(planType.equals("COMMERICIALPLAN")){
            return new CommercialPlan();
        } else if (planType.equals("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();

        }
        return null;
    }
}
