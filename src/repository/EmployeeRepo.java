package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepo {
    Map<String, Employee> employeeEmailMap;
    

    public EmployeeRepo() {
        this.employeeEmailMap = new HashMap<>();
    }

    public Map<String, Employee> getemployeeEmailMap() {
        return employeeEmailMap;
    }

    public void saveEmployee(Employee employee) {
        this.employeeEmailMap.put(employee.emailId, employee);
    }

    public Employee getEmployeeByEmailID(String empEmail){
        if(employeeEmailMap.containsKey(empEmail)){
            return employeeEmailMap.get(empEmail);
        }else {
            return  null;
        }
    }
}
