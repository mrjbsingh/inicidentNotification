package services;

import repository.Employee;
import repository.EmployeeRepo;

import java.util.UUID;

public class EmployeeService {

    EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public Employee createEmployee(String empName, String empEmail, Integer empLevel){
        UUID uuid = UUID.randomUUID();

        Employee employee = new Employee(uuid.toString(), empName, empEmail, empLevel);
        employeeRepo.saveEmployee(employee);

        return employee;
    }
}
