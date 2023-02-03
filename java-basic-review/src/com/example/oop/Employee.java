package com.example.oop;

import java.time.LocalDate;
import java.util.Arrays;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // 加薪
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("zhangsan", 10000.00, 2022, 8, 2);
        staff[1] = new Employee("lisi", 8500.00, 2021, 11, 23);
        staff[2] = new Employee("wangwu", 20000.00, 2021, 8, 3);

        for (Employee employee : staff) {
            System.out.println(employee.getName()+"员工涨薪前的工资为："+employee.getSalary());
        }
        System.out.println();
        // 给每个员工加薪百分之五
        Arrays.stream(staff).forEach(x->x.raiseSalary(5));
        for (Employee employee : staff) {
            System.out.println(employee.getName()+"员工涨薪后的工资为："+employee.getSalary());
        }
    }
}