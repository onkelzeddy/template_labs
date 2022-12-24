package org.example;

import java.util.ArrayList;
import java.util.List;

public class Company implements companyObservable{
    List<employeeObserver> Employees = new ArrayList<>();
    private String notification;

    public void companyNotification(String newNotification){
        this.notification = newNotification;
        newNotification();
    }
    public void hireEmployee(employeeObserver Employee){Employees.add(Employee);}

    public void   dismissAnEmployee(employeeObserver Employee) {Employees.remove(Employee);};
    public void   newNotification(){Employees.forEach (Employee->Employee.getNotification(this.notification));};
}
