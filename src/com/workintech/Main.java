package com.workintech;

import com.workintech.circle.Circle;
import com.workintech.circle.Cylinder;
import com.workintech.employee.HRManager;
import com.workintech.employee.JuniorDeveloper;
import com.workintech.employee.MidDeveloper;
import com.workintech.employee.SeniorDeveloper;
import com.workintech.rectangle.Cuboid;
import com.workintech.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("------com.workintech.circle.Circle & com.workintech.circle.Cylinder ------");


        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("------Rectangle & Cuboid ------");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("------ Employee ------");

        System.out.println("cuboid.width= " + cuboid.getWidth());

        JuniorDeveloper junior = new JuniorDeveloper(1,"Baha Saraçoğlu",10000);
        MidDeveloper mid = new MidDeveloper(2,"2nd Dude",20000);
        SeniorDeveloper senior = new SeniorDeveloper(3,"3rd Dude",30000);
        HRManager hrmanager = new HRManager(4,"HR Dude",25000);


        junior.work();
        System.out.println("junior.name= " + junior.getName() );
        System.out.println("junior.id= " + junior.getId() );
        System.out.println("junior.salary= " + junior.getSalary() );

        mid.work();
        System.out.println("mid.name= " + mid.getName() );
        System.out.println("mid.id= " + mid.getId() );
        System.out.println("mid.salary= " + mid.getSalary() );

        senior.work();
        System.out.println("senior.name= " + senior.getName() );
        System.out.println("senior.id= " + senior.getId() );
        System.out.println("senior.salary= " + senior.getSalary() );

        System.out.println("hr.name= " + hrmanager.getName() );
        System.out.println("hr.id= " + hrmanager.getId() );
        System.out.println("hr.salary= " + hrmanager.getSalary() );

        hrmanager.addEmployee(junior);
        hrmanager.addEmployee(mid);
        hrmanager.addEmployee(senior);

        System.out.println("juniorDevs" + hrmanager.getJuniorDevelopers());
        System.out.println("midDevs" + hrmanager.getMidDevelopers());
        System.out.println("seniorDevs" + hrmanager.getSeniorDevelopers());

    }
}