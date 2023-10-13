package com.ceub.computercience.paradigms.peoplecreatevalue;

public class Profession {

	private String title;

	public Profession(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
