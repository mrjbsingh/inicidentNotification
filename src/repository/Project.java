package repository;

import java.util.ArrayList;
import java.util.List;

public class Project {
    String projectId;
    String projectName;
    String projectDescription;



    List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee employee) {
        this.employees.add(employee);
    }

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }


    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
}
