package com.happybuy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		long createDate = 1548489600000l;
		Date date = new Date (createDate);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String datefm = df.format(date);
		System.out.println(datefm);

	}

}
