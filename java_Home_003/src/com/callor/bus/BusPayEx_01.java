package com.callor.bus;

import java.util.Scanner;

public class BusPayEx_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("승객의 나이 >> ");
		String strAge = scan.nextLine();
		
		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);
		} catch (Exception e) {
			System.out.println("나이는 숫자로만 입력해야 합니다");
			return;
		}
		
		int busPay = 0;
		if(intAge <= 6) {
			busPay = 0;
		} else if(intAge <= 12) {
			busPay = 800;
		} else if(intAge <= 18) {
			busPay = 1200;
		} else if(intAge < 65) {
			busPay = 1500;
		} else if(intAge >= 65) {
			busPay = 0;
		} 
		System.out.printf("승객의 나이 %d : 버스요금 : %d\n", intAge, busPay);
		scan.close();
		
		
	}
	

}
