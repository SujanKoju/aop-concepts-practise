package com.example.preparation.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kojusujan1111@gmail.com 25/12/21
 */
@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Employee addEmployee(@RequestParam("empId") String empId,
                                @RequestParam("firstName") String firstName,
                                @RequestParam("secondName") String secondName) {
        return employeeService.createEmployee(empId, firstName, secondName);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String removeEmployee(@RequestParam("empId") String empId) {
        employeeService.deleteEmployee(empId);
        return "Employee removed";
    }
}
