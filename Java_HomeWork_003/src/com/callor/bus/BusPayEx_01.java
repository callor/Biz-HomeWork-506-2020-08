package com.callor.bus;

import java.util.Scanner;

/*
 * 광주광역시의 버스 요금체계(가상시나리오)
 * 만 6세이하는 0원
 * 만 12세이하는 800원
 * 만 18세 이하는 1200원
 * 만 65세 이상은 0원
 * 일반 요금은 1500원
 * 
 * 어떤 승객의 나이를 입력했을때 승객의 버스 요금이 얼마인지 출력하시오
 * 최소한의 if 문을 사용하여 계산하시오
 * 
 * 
 */
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
