package org.example;

public class concreteEmployee implements employeeObserver{
    private String name = "1";

    public concreteEmployee(String name, Company c){
        this.name = name;
        c.hireEmployee(this);
    }

    public void getNotification(String notification){
        System.out.println(name + " узнал кое-что интересное про компанию: " + notification);
    }
}