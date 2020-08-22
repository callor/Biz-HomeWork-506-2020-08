package com.callor.book.conf;

public class Lines {

	
	public static String dLines() {
		return dLines(50);
	}
	public static String dLines(int length) {
		return lines(length,"=");
	}
	public static String sLines() {
		return sLines(50);
	}
	public static String sLines(int length) {
		return lines(length,"-");
	}
	
	public static String lines(int length, String line) {
		line = String.format("%0" + length + "d", 0).replace("0",line);
		return line;
	}
	
	
	
	
	
}
