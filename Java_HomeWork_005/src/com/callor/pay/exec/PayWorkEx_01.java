package com.callor.pay.exec;

public class PayWorkEx_01 {

	
	public static void main(String[] args) {
		
		int pay = 3_785_760;
		int paper = 0;
		
		int checkup = 0;
		
		
		// 제시된 금액을 5만원으로 나누고 정수부분만 취하면 
		// 필요한 5만원권의 매수가 계산된다.
		paper = (int)(pay / 50000);
		
		// 원금(pay)에서 5만원권 금액을 빼주면 
		// 5만원권 매수만큼 제외한 금액을 계산할 수 있다
		pay -= (paper * 50000);
		System.out.printf("5만원권 %d 매\n",paper);
		checkup += paper * 50000;
		
		paper = (int)(pay / 10000);
		pay -= (paper * 10000);
		System.out.printf("1만원권 %d 매\n",paper);
		checkup += paper * 10000;
		
		paper = (int)(pay / 5000);
		pay -= (paper * 5000);
		System.out.printf("5천원권 %d 매\n",paper);
		checkup += paper * 5000;

		paper = (int)(pay / 1000);
		pay -= (paper * 1000);
		System.out.printf("1천원권 %d 매\n",paper);
		checkup += paper * 1000;

		paper = (int)(pay / 500);
		pay -= (paper * 500);
		System.out.printf("5백원권 %d 매\n",paper);
		checkup += paper * 500;

		paper = (int)(pay / 100);
		pay -= (paper * 100);
		System.out.printf("1백원권 %d 매\n",paper);
		checkup += paper * 100;

		paper = (int)(pay / 50);
		pay -= (paper * 50);
		System.out.printf("50원권 %d 매\n",paper);
		checkup += paper * 50;

		paper = (int)(pay / 10);
		pay -= (paper * 10);
		System.out.printf("10원권 %d 매\n",paper);
		checkup += paper * 10;

		System.out.println("================================");
		System.out.printf("검산 결과 : %d\n",checkup);
		System.out.println("================================");
		
		
		
	}
}
