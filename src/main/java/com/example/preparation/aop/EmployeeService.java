package com.example.preparation.aop;

import org.springframework.stereotype.Service;

/**
 * @author kojusujan1111@gmail.com 25/12/21
 */
@Service
public class EmployeeService {

    public Employee createEmployee(String empId, String fname, String sname) {
        System.out.println("--- Create employee method started ---");
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(fname);
        emp.setSecondName(sname);
        return emp;
    }

    public void deleteEmployee(String empId) {
    }
}
