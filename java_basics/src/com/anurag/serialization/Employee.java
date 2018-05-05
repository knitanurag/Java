package com.anurag.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -13856305092566636L;

	private int id;

	private String name;

	private transient int salary;

	private static String lastName = "Chaturvedi";

	@Override
	public String toString() {
		return new StringBuilder().append("Employee Name :").append(name).append(" ID: ").append(id).append(" Salary :").append(salary)
				.append("   ").append(lastName).toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
