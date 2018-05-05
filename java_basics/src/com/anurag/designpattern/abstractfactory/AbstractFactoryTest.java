package com.anurag.designpattern.abstractfactory;

import com.anurag.designpattern.factory.Computer;
import com.anurag.designpattern.factory.PC;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		PC pc = new PC("1 GB", "INTEL", "1 TB");
		Computer comp = ComputerFactory.getComputer(new PCFactory("1 GB", "INTEL", "1 TB"));
		System.out.println(comp);
	}
}
