package com.workintech.employee;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, float salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("JuniorDeveloper is working now!");
        super.setSalary(20000);
    }
}
