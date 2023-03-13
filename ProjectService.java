package projects.service;


import java.util.List;
import java.util.Optional;

import projects.dao.ProjectDao;
import projects.entity.Project;



public class ProjectService {
	
	
	
	private static final Integer ProjectId = null;
	private ProjectDao projectDao = new ProjectDao();

	public static Project insertProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}



public Project addProject(Project project) {
	return projectDao.insertProject(project);
	
	
}

public List<Project> fetchAllProjects() {
return projectDao.fetchAllProjects();

}
/**
 * This method calls the project DAO to get all project details, including materials, steps, and categories.
 * 
 * @param projectId The Project ID.
 * @return A project object if successful.
 * @throws NoSuchElementExpectation Thrown if the project with the given ID does not exist.
 * 
 */

Optional<Project> op = projectDao.fetchProjectById(ProjectId);


public Project fetchProjectById(Integer projectId) {
	return projectDao.fetchProjectById(projectId).orElseThrow();
}



public Project fetchAllProjectsById(Integer projectId) {
	// TODO Auto-generated method stub
	return null;
}

			
}



