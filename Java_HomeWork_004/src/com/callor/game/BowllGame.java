package com.callor.game;

import com.callor.game.service.BowllGameService;

public class BowllGame {
	public static void main(String[] args) {
		/*
		 * 
		 * 게임패턴 각 프레임은 공백으로 분리 각 프레임은 2번의 투구, 
		 * 		단 10번 프레임은 최대 3번의 투구 
		 * 
		 * 핀구분
		 * X : 프레임 첫 투구에서 스트라이크
		 * 5/ : 프레임 첫 투구에서 5핀, 두번째 투구에서 스페어 
		 * 3- : 프레임 첫 투구에서 3핀, 두번째 투구에서 거터(Gutter, 0핀)
		 * 52 : 프레임 첫 투구에서 5핀, 두번째 투구에서 2핀 
		 * -3 : 프레임 첫 투구에서 거터, 두번째 투구에서 3핀
		 * 
		 */
		String[] games = { 
				"X X X X X X X X X XXX", // 300
				"3- 3/ X X X X X -- -- ---", // 143
				"X 5/ 3/ 5/ 52 5/ 32 54 22 X5", // 116, 101
				"X 5/ 3/ 5/ 52 5- 3- 3- 2- X--", // 93	
				"X5/3/ 5/ 52 5- -- -- -- ---", // 75
				"X X X 5/ 52 5- 6/ 3- 4/ X--", // 148
				"9/ 9/ 9/ 5/ 52 5- 6/ 3- 4/ X--", // 126
				"9/ 9/ 9/ 5/ 52 5- 6/ 3- 4/ ---", // 106
				"9/ 9/ 9/ 5/ 52 5- 6/ 3- 4 2--" // 102  
		};
		
		int gameCount = 0;
		for(String game : games) {
		
			System.out.printf("%d 번째 게임 : ",++gameCount);
			BowllGameService bg = new BowllGameService();
			String[] rolls = game.replace(" ", "").split("");
			int preGame = 10;
			for (String roll : rolls) {
				int thisGame = 0;
				if (roll.equalsIgnoreCase("X")) {
					thisGame = 10;
				} else if (roll.equals("/")) {
					thisGame = 10 - preGame;

				} else if (roll.equals("-")) {
					thisGame = 0;
				} else {
					thisGame = Integer.valueOf(roll);
				}
				bg.rolling(thisGame);
				preGame = thisGame;
			}
			System.out.printf(" ==> 게임 점수 : %d \n",bg.getScore());
		}
	}
}
