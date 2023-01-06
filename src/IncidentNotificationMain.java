import controller.EmployeeController;
import controller.ProjectController;
import repository.EmployeeRepo;
import repository.ProjectsRepo;
import services.EmployeeService;
import services.ProjectServices;

public class IncidentNotificationMain {
    public static void main(String[] args) {

        EmployeeRepo employeeRepo = new EmployeeRepo();

        ProjectsRepo projectsRepo = new ProjectsRepo();
        EmployeeService employeeService = new EmployeeService(employeeRepo);

        EmployeeController employeeController = new EmployeeController(employeeService);

        ProjectServices projectServices = new ProjectServices(projectsRepo, employeeRepo);

        ProjectController projectController = new ProjectController(projectServices);

        projectController.addProject("project1");

        employeeController.addEmployee("abc", "abc@gmail.com", 1);
        employeeController.addEmployee("xc", "absdassc@gmail.com", 2);
        employeeController.addEmployee("cfdsd", "abadsdsc@gmail.com", 3);
        employeeController.addEmployee("dassad", "acdcacbc@gmail.com", 1);

        projectController.assignEmployeeProject("project1", "abc@gmail.com");
        projectController.assignEmployeeProject("project1", "absdassc@gmail.com");
        projectController.assignEmployeeProject("project1", "abadsdsc@gmail.com");
        String msg = projectController.assignEmployeeProject("project1", "acdcacbc@gmail.com");

        System.out.println(msg);


    }
}
