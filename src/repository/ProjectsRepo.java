package repository;

import java.util.ArrayList;
import java.util.List;

public class ProjectsRepo {
    List<Project> projectList;

    public ProjectsRepo() {
        this.projectList = new ArrayList<>();
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void saveProject(Project project) {
        this.projectList.add(project);
    }
}
