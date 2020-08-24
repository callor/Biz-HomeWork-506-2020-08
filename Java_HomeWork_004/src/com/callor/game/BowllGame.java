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
				"X X X X X X X X X XXX", 
				"X 5/ 3/ 5/ 52 5- 5- 5- 9- XXX", 
				"X 5/ 3/ 5/ 52 5/ 5/ 5/ 9/ XXX",
				"X X X 8/ 7/ 9/ 72 3- 72 63-", 
				"-1 X X 8/ 7/ 9/ 72 3- 72 63-" 
			};
		
		for(String game : games) {
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
			System.out.println(bg.getScore());
		}

		

	}
}
