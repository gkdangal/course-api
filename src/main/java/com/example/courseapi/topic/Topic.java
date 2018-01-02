package com.example.courseapi.topic;

public class Topic {
	private String id;
	private String name;
	private String description;
	private String department;
	
	public Topic() {
		
	}
	public Topic(String id, String name, String description, String department) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
