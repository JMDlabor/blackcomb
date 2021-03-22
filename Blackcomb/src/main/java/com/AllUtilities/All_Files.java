package com.AllUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.Framework.Intitiate;

public class All_Files extends Intitiate {

	public static String pConfigproperties = "/src/main/java/com/gw/qa/config/Config.properties";
	public static String pUserdir = System.getProperty("user.dir");

	private static Properties oProperties;
	private static FileInputStream oFIS;

	public String getValue_PropertiesFile(String pPropertiesFilePath, String strItem) {
		String strValue = null;
		pPropertiesFilePath = pUserdir + pConfigproperties;
		strItem = "sample";

		try {
			File oFile = new File(pPropertiesFilePath);
			oFIS = new FileInputStream(oFile);
			oProperties = new Properties();
			oProperties.load(oFIS);
			strValue = oProperties.getProperty(strItem);
			if (strValue != null)
				return strValue;
			else
				throw new RuntimeException(strItem + " not specified in " + pPropertiesFilePath);

		} catch (Exception e) {
			System.out.println("Exception is ==" + e.getMessage());
		}

		System.out.println("File Path = " + pPropertiesFilePath);
		System.out.println(strItem + " = " + strValue);

		return strValue;
	}

	public String getValue_xmlFile(String pXMLFilePath, String strItem) {
		String strValue = null;

		System.out.println("File Path = " + pXMLFilePath);
		System.out.println(strItem + " = " + strValue);
		return strValue;

	}

	public String getValue_jsonFile(String pJSONFilePath, String strItem) {
		String strValue = null;

		System.out.println("File Path = " + pJSONFilePath);
		System.out.println(strItem + " = " + strValue);
		return strValue;

	}

	public String getValue_NotepadFile(String pNotepadFilePath, String strItem) {
		String strValue = null;

		System.out.println("File Path = " + pNotepadFilePath);
		System.out.println(strItem + " = " + strValue);
		return strValue;

	}

}
