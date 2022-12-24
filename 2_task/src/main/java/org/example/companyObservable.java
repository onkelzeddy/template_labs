package org.example;

public interface companyObservable {

    void hireEmployee(employeeObserver Employee);
    void  dismissAnEmployee(employeeObserver Employee);
    void  newNotification();

}
