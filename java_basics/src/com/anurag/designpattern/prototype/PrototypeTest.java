package com.anurag.designpattern.prototype;

import java.util.Arrays;
import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		emp.loadData();

		Employee empNew = new Employee();
		empNew = (Employee) emp.clone();
		List<String> list = empNew.getEmpList();
		list.add("Newly Added Employee");
		System.out.println(emp.getEmpList());
		System.out.println(empNew.getEmpList());
		//Arrays.asList(a);
	}

}
