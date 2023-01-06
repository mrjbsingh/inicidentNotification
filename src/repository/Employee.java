package repository;

public class Employee {
    String empId;
    String empName;
    String emailId;
    Integer level;

    Project project;



    public Employee(String empId, String empName, String emailId, Integer level) {
        this.empId = empId;
        this.empName = empName;
        this.emailId = emailId;
        this.level = level;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
