package com.workintech.employee;

public class MidDeveloper  extends Employee{
    public MidDeveloper(int id, String name, float salary) {
        super(id, name, salary);
    }
    public void work() {
        System.out.println("MidDeveloper is working now!");
        super.setSalary(35000);
    }
}
