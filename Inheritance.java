package com.bridgelabz.review1;

class Employee {
    String name;
    double salary;
    Employee(String n, double s) {
        name = n;
        salary = s;
    }
    String getName() {return name;}
    void setName(String n){name = n;}
    double getSalary() {return salary;}
    void setSalary(double s) {salary = s;}
    void raiseSalary(double percent) {
        salary += salary*percent/100;
    }
}
public class Inheritance {
    public static void main(String[] args) {
      Employee e1 = new Employee("Ram",35000);
      e1.raiseSalary(10);
      System.out.println(e1.getSalary());
    }
}
