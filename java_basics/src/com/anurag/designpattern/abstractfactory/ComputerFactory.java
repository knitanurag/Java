package com.anurag.designpattern.abstractfactory;

import com.anurag.designpattern.factory.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
		return computerAbstractFactory.createComputer();
	}
}
