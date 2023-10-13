package com.ceub.computercience.paradigms.peoplecreatevalue;

import java.awt.Window.Type;
import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;

public class Project {

	private String name;
	private Manager manager;
	private ArrayList<Person> members;
	private Organization organization;
	private ProjectStatus status;
	private ProjectType type;

	public Project(String name, Manager manager, Person firstMember, Organization organization, ProjectType type) {
		super();
		this.name = name;
		this.manager = manager;
		this.members.add(firstMember);
		this.organization = organization;
		this.status = ProjectStatus.ONGOING;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public ArrayList<Person> getMembers() {
		return members;
	}

	public void addMember(Person person) {
		this.members.add(person);
	}

	public void setMembers(ArrayList<Person> members) {
		this.members = members;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public ProjectStatus getStatus() {
		return status;
	}

	public void setStatus(ProjectStatus status) {
		this.status = status;
	}

	public ProjectType getType() {
		return type;
	}

	public void setType(ProjectType type) {
		this.type = type;
	}

}
