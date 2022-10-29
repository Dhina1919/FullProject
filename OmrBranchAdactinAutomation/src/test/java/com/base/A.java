package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class A {

public static void main(String[] args) throws IOException {
		
		//1.Mention the path of fileInputStream
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\keerthana\\eclipse-workspace\\OmrBranchAdactinAutomation\\Config\\config.properities");
		
		//2.Create a object for properties
		
		Properties properties= new Properties();
		
		//3.pass the property file location to fetch
		
		properties.load(fileInputStream);
		
		Object object = properties.get("username");
		String value = (String)object;
		System.out.println(value);
}

}
