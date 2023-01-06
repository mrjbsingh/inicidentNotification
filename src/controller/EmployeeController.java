package controller;

import repository.Employee;
import repository.Project;
import services.EmployeeService;

public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String addEmployee(String empName, String empEmail, Integer empLevel){

        Employee employee = employeeService.createEmployee(empName, empEmail, empLevel);

        if(employee!=null){
            return "{“status”:”success”}";
        }
        else{
            return "{“status”:”failure”}";
        }
    }
}
