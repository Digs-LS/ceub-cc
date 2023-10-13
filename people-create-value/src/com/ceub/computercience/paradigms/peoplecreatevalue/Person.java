package com.ceub.computercience.paradigms.peoplecreatevalue;

public class Person {

	private String name;
	private Profession profession;
	private Organization organization;

	public Person(String name, Profession profession, Organization organization) {
		super();
		this.name = name;
		this.profession = profession;
		this.organization = organization;
	}

	public void createValue() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
