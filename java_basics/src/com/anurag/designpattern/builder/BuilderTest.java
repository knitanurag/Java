package com.anurag.designpattern.builder;

public class BuilderTest {
	public static void main(String[] args) {
		HPLaptop hl = new HPLaptop.BuilderClass("500 GB", "8 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
	}
}
