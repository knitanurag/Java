package com.anurag.programs;

import java.io.IOException;

public class LaunchExternalsApps {
	public static void main(String[] args) throws InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process processs = runtime.exec("notepad D:\\Anurag\\Sample.txt");
			// String[] s = new String[] { "C:\\Program Files\\Internet Explorer\\iexplore.exe", "http://javaconceptoftheday.com/" };
			// runtime.exec(s);
			Thread.sleep(5000);
			processs.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
