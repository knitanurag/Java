package com.anurag.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> empList;

	public Employee() {
		this.empList = new ArrayList<String>();
	}

	Employee(List<String> list) {
		this.empList = list;
	}

	public List<String> getEmpList() {
		return empList;
	}

	public void loadData() {
		empList.add("Anurag");
		empList.add("Abhinav");
		empList.add("Gaurava");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String name : this.empList) {
			temp.add(name);
		}
		return new Employee(temp);
	}

}
