package com.callor.pay.exec;

import com.callor.pay.service.JongService;

/**
 * 
 * @author 정**종
 * @since 2020-08-28
 * 
 */

public class JongEx_01 {

	public static void main(String[] args) {

		JongService jong = new JongService();
		int pay =  3_785_760;
		jong.solution(pay);
		
	}

}
