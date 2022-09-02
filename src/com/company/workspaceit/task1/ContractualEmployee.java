package com.company.workspaceit.task1;

public class ContractualEmployee extends Employee implements Applicable{


    @Override
    public int getBonus() {
        return 0;
    }

    @Override
    public boolean isEligibleForProvidentFund() {
        return false;
    }
}
