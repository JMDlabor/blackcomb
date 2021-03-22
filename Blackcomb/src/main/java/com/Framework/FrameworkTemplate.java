package com.Framework;

public interface FrameworkTemplate {

	final static String gUserName = System.getProperty("user.name");
	final static String gOS = System.getProperty("OS");
	final static String gIPAdress = "asd";
	final static String gUserDir = System.getProperty("user.dir");
	final static String ghostname = System.getProperty("hostname");
	final static String gpackageclass = System.getProperty("sun.java.command");
	final static String gProjectName = "asd";

	default void abc() {

	}
}