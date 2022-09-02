package com.company.workspaceit.task1;

public class PermamentEmployee extends Employee implements Applicable{
    @Override
    public int getBonus() {
        return this.getSalary()/2;
    }

    @Override
    public boolean isEligibleForProvidentFund() {

        return true;
    }

}
