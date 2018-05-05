package com.anurag.designpattern.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	private static SerializedSingleton instance=new SerializedSingleton();
	
	private SerializedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
