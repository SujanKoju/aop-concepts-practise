package com.example.preparation.aop;

/**
 * @author kojusujan1111@gmail.com 25/12/21
 */

public class Employee {
    private String empId;
    private String firstName;
    private String secondName;

    public Employee() {
    }

    public Employee(String empId, String firstName, String secondName) {
        this.empId = empId;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
