package com.workintech.employee;

import java.util.Arrays;

public class HRManager extends Employee {

    private JuniorDeveloper juniorDevelopers[] = new JuniorDeveloper[0];
    private MidDeveloper midDevelopers[] = new MidDeveloper[0] ;
    private SeniorDeveloper seniorDevelopers[] = new SeniorDeveloper[0] ;


    public HRManager(int id, String name, float salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("HRManager is working now!");
        super.setSalary(30000);
    }

    public void addEmployee(JuniorDeveloper newDeveloper) {
        this.juniorDevelopers = Arrays.copyOf(juniorDevelopers, juniorDevelopers.length + 1);
        juniorDevelopers[juniorDevelopers.length - 1] = newDeveloper;
    }

    public void addEmployee(SeniorDeveloper newDeveloper) {
        this.seniorDevelopers = Arrays.copyOf(seniorDevelopers, seniorDevelopers.length + 1);
        seniorDevelopers[seniorDevelopers.length - 1] = newDeveloper;
    }

    public void addEmployee(MidDeveloper newDeveloper) {
        this.midDevelopers = Arrays.copyOf(midDevelopers, midDevelopers.length + 1);
        midDevelopers[midDevelopers.length - 1] = newDeveloper;
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }



}
