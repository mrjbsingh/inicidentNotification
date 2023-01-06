package controller;

import repository.Project;
import services.ProjectServices;

public class ProjectController {

    ProjectServices projectServices;

    public ProjectController(ProjectServices projectServices) {
        this.projectServices = projectServices;
    }

    public String addProject(String name){

        Project project = projectServices.createProject(name);

        if(project!=null){
            return "{“status”:”success”}";
        }
        else{
            return "{“status”:”failure”}";
        }
    }

    public String assignEmployeeProject(String projectName, String empEmail){

        String msg = projectServices.assignEmpoloyee(projectName, empEmail);

        return msg;
    }
}
