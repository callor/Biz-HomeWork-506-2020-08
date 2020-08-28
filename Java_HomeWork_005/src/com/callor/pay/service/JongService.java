package com.callor.pay.service;

public class JongService {

	public void solution(int pay) {
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int ans = 0;
		int temp = 0;

		System.out.println(pay);
		pay = (int) (pay / 10) * 10;
		System.out.println(pay);
		
		for (int i = 0; i < money.length; i++) {
			pay = pay - temp;
			ans = pay % money[i];
			temp = pay - ans;
			System.out.println(money[i] + "원권 개수 : " + ans);
		}
	}

}
