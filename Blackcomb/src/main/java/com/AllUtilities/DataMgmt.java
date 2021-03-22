package com.AllUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.Framework.Intitiate;

public class DataMgmt extends Intitiate {

		
	public static String getDate(String strDateFromat) {
		SimpleDateFormat format = new SimpleDateFormat(strDateFromat);
		Date date = new Date();
		String actualDate = format.format(date);
		return actualDate;
	}
}
