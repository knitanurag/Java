package com.anurag.designpattern.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	private Volt convertVolt(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts() / i);
	}

	@Override
	public Volt get12Volt() {
		Volt volt = getVolt();
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = getVolt();
		return convertVolt(volt, 40);
	}

}
