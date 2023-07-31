package com.workintech.employee;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, float salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println("SeniorDeveloper is working now!");
        super.setSalary(50000);
    }
}
