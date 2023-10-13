package com.ceub.computercience.paradigms.peoplecreatevalue;

import java.util.ArrayList;

public class Organization {

	private String name;
	private ArrayList<Person> employees;

	public void hireEmployee(Person person, Position position) {
		this.employees.add(person);
		position.setEmployee(person);
		person.setOrganization(this);
	}

	public void firEmployee(Person person) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Person> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Person> employees) {
		this.employees = employees;
	}

	public Position createPosition(Profession profession, String title) {
		Position newPosition = new Position(title, this, null);
		return newPosition;
	}
}
