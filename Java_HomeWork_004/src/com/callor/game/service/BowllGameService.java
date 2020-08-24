package com.callor.game.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BowllGameService {

	private List<Integer> frames;
	int currentStage;

	// 인스턴스가 생성되면 새로 게임이 시작된 것이다.
	public BowllGameService() {
		frames = new ArrayList<Integer>();
		currentStage = 0;
	}

	// 볼을 던진 횟수만큼 호출이 되며
	// 매개변수로 받은 핀 갯수를 frames 리스트에 추가한다.
	public void rolling(int pins) {
		frames.add(pins);
	}

	public int getScore() {

		int totalScore = 0;

		System.out.println(frames.toString());
		
		int size = frames.size();
		for (int thisFrame = 0 ; thisFrame < size - 2; thisFrame ++) {
			Integer score = frames.get(thisFrame);
			// 현재 frame 점수가 10점이면 strike
			// 현재 frame strike 이면 이후 2번의 frame 점수를 합산한다.
			// 예)1 frame 이 strike 이면  2, 3 frame 점수 모두 합산
			if (score == 10) {
				totalScore += 10; // 현재 frame 10
				totalScore += frames.get(thisFrame + 1); // next 점수합산
				totalScore += frames.get(thisFrame + 2); // next 점수합산
				
				// 현재 frame 점수와 다음 frame 점수합이 10이면
				// spare 처리가 되었으면
			} else if(score + frames.get(thisFrame + 1) == 10) {
				totalScore += 10; // 현재 frame + next frame = 10
				totalScore += frames.get(thisFrame + 2); 
				thisFrame += 1;
			} else {
				totalScore += score;
				totalScore += frames.get(thisFrame+1);
				thisFrame += 1;
			}
		}
		return totalScore;
	}

}
