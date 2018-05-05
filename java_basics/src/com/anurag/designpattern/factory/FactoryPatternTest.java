package com.anurag.designpattern.factory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "1 GB", "INTEL", "250 GB");
		Computer server = ComputerFactory.getComputer("Server", "8 GB", "INTEL", "1 TB");
		System.err.println("PC : " + pc);
		System.out.println("Server : " + server);
	}
}
