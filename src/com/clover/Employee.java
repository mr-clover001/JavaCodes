package com.clover;

public class Employee extends Manager {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = 500000;
        System.out.println("Salary of employee is " + emp.salary);

        Manager man = new Manager();
        man.salary = 6000000;
        System.out.println("salary of manager "+man.salary);
    }
}
