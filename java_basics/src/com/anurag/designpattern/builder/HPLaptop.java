package com.anurag.designpattern.builder;

public class HPLaptop {

	private String hdd;

	private String ram;

	private boolean isGraphisCardEnabled;

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphisCardEnabled() {
		return isGraphisCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private boolean isBluetoothEnabled;

	private HPLaptop(BuilderClass bc) {
		this.hdd = hdd;
		this.ram = ram;
		this.isBluetoothEnabled = bc.isBluetoothEnabled;
		this.isGraphisCardEnabled = bc.isGraphisCardEnabled;
	}

	public static class BuilderClass {
		private String hdd;

		private String ram;

		private boolean isGraphisCardEnabled;

		private boolean isBluetoothEnabled;

		public BuilderClass(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}

		public BuilderClass setGraphicsCardEnabled(boolean isGraphisCardEnabled) {

			this.isGraphisCardEnabled = isGraphisCardEnabled;
			return this;

		}

		public BuilderClass setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public HPLaptop build() {
			return new HPLaptop(this);

		}

	}

}
