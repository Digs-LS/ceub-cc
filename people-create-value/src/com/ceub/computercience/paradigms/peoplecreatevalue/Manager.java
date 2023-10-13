package com.ceub.computercience.paradigms.peoplecreatevalue;

public class Manager extends Position {

	public Manager(String title, Organization organization, Person person) {
		super(title, organization, person);
		// TODO Auto-generated constructor stub
	}

	public Project startProject(Person firstMember, String projectName, ProjectType type) {
		Project newProject = new Project(projectName, this, firstMember, this.getOrganization(), type);
		return newProject;
	}

	public void addMemberToProject(Project project, Person newMember) {
		project.addMember(newMember);
	}

	public void removeMembeFromProject(Project project, Person person) {

	}

	public void finishProject(Project project) {
		project.setStatus(ProjectStatus.FINISHED);
	}
}
