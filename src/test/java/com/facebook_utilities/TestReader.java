package com.facebook_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestReader {

	Properties prop; //instance Variable
	
	public TestReader(){
		 prop = new Properties(); //Properties class Only able to read
		 
		String filePath="src/test/resources/Test.properties";
		
		FileInputStream fis;
		try {
			 fis =  new FileInputStream(filePath);
			prop.load(fis);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}


public String readBrowser() {
	return prop.getProperty("browser");
	 
	
}


public String readUrl() {
	return prop.getProperty("url");
	
}


public String readUsename() {
	return prop.getProperty("userName");
	
}


public String readPassword() {
	return prop.getProperty("password");
	
}

public String readFirstname() {
	return prop.getProperty("FirstName");
	
}




	public static void main(String[] args) {
		TestReader ar= new TestReader();
		System.out.println(ar.readBrowser());
		System.out.println(ar.readUrl());
		System.out.println(ar.readUsename());
		System.out.println(ar.readPassword());
		System.out.println(ar.readFirstname());
	}

}
