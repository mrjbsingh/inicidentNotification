package services;

import repository.Employee;
import repository.EmployeeRepo;
import repository.Project;
import repository.ProjectsRepo;

import java.util.List;
import java.util.UUID;

public class ProjectServices {

    ProjectsRepo projectsRepo;

    EmployeeRepo employeeRepo;

    public ProjectServices(ProjectsRepo projectsRepo, EmployeeRepo employeeRepo) {
        this.projectsRepo = projectsRepo;
        this.employeeRepo = employeeRepo;
    }

    public Project createProject(String name){

        UUID uuid = UUID.randomUUID();
        Project project = new Project( uuid.toString(), name);
        projectsRepo.saveProject(project);
        return project;
    }

    public String assignEmpoloyee(String projectName, String empEmail){

        List<Project> projects = projectsRepo.getProjectList();

        Employee employee = employeeRepo.getEmployeeByEmailID(empEmail);

        for(Project project: projects){
            if( project.getProjectName() == projectName){
                boolean alreadyOccupied = isLevelAlreadyOccupied(project, employee);

                if(employee!=null && !alreadyOccupied){
                    project.addEmployees(employee);
                    employee.setProject(project);
                    return "{“status”:”success”}";

                } else if (alreadyOccupied) {
                    return "{“status”:”failure”,\"error\": \"Level "+ employee.getLevel() +" already asssigned to "+ employee.getEmailId() + "}\n";
                } else{
                    return "{“status”:”fail”}";
                }
            }
        }
        return "{“status”:”fail”}";
    }

    private boolean isLevelAlreadyOccupied(Project project, Employee employee){
        List<Employee> employees =  project.getEmployees();
         for(Employee employee1: employees){
             if(employee1.getLevel()==employee.getLevel()){
                 return true;
             }

         }
         return false;
    }
}
