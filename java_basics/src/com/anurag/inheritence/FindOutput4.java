package com.anurag.inheritence;

public class FindOutput4 {
	public static void main(String[] args) {
		ClassTwo two = new ClassTwo();
		System.out.println("Value of i " + two.i + " value of j " + two.j);
	}

}

class ClassOne1 {
	static int i = 111;

	int j = 222;

	{
		i = i++ - ++j;
	}
}

class ClassTwo extends ClassOne1 {
	{
		j = i-- + --j;
	}
}
