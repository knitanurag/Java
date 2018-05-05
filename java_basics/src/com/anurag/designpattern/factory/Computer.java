package com.anurag.designpattern.factory;

public abstract class Computer {

	public abstract String getRam();

	public abstract String getHdd();

	public abstract String getCpu();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RAM= " + this.getRam() + ", HDD=" + this.getHdd() + ", CPU=" + this.getCpu();
	}

}
