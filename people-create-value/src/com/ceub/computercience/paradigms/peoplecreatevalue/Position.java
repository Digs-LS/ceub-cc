package com.ceub.computercience.paradigms.peoplecreatevalue;

public class Position {

	private String title;
	private Organization organization;
	private Person employee;

	public Position(String title, Organization organization, Person employee) {
		super();
		this.title = title;
		this.organization = organization;
		this.employee = employee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Person getEmployee() {
		return employee;
	}

	public void setEmployee(Person employee) {
		this.employee = employee;
	}

}
