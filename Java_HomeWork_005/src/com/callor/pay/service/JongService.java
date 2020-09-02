package com.callor.pay.service;

/**
 * 
 * @author 정**종
 * @since 2020-08-28
 * 
 */
public class JongService {

	public void solution(int pay) {
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int ans = 0;

		System.out.println(pay);
		pay = (int) (pay / 10) * 10;
		System.out.println(pay);
		
		for (int i = 0; i < money.length; i++) {
			ans = pay / money[i];
			pay = pay - (ans * money[i]);
			System.out.println(money[i] + "원권 개수 : " + ans);
		}
	}

}
