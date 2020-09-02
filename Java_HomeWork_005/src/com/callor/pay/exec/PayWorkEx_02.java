package com.callor.pay.exec;

public class PayWorkEx_02 {
	public static void main(String[] args) {

		int pay =  3_785_760;
		int paper = 50000; // 대한민국 화폐단위 최고액면가
		
		int sw = 1;
		while(pay > 0) {
			int mCount = pay / paper;
			System.out.printf("%d 원권 \t%d 매\n",paper,mCount);
			pay -= mCount * paper;
			if(sw > 0) {
				paper /= 5;
			} else {
				paper /= 2;
			}
			sw *= -1;
		}
	}
}
