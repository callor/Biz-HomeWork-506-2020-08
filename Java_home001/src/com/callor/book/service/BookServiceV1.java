package com.callor.home.service;

import java.util.Scanner;

public class BookServiceV1 {

	/*
	 * 
	 * 클래스가 있는 객체 지향 프로그래밍에서 인스턴스 변수(instance variable)는 클래스(예: 멤버 변수)에 정의된 변수로, 
 	 * 이를 위해 각각의 인스턴스화된 클래스의 객체가 별도의 사본이나 인스턴스를 가지고 있다. 
 	 * 
 	 * 클래스를 객체로 생성하면 클래스에서 정의된 필드(맴버)변수들은 인스턴스 변수가 된다.
 	 * 
 	 * 인스턴스 변수는 클래스 변수와 비슷하다.
	 * 인스턴스 변수는 클래스 변수가 아니지만 유사점이 있다. 
	 * 클래스 속성(클래스 프로퍼티, 필드, 데이터 멤버)의 일종이다. 
	 * 인스턴스와 클래스 멤버 간에 동일한 이분법이 메소드(멤버 함수)에도 적용되며, 
	 * 클래스는 인스턴스 메소드와 클래스 메소드를 둘 다 소유할 수 있다.
	 * 
	 * 각 인스턴스 변수는 오브젝트의 소유 기간 동안 메모리에 상주한다.
	 * 
	 * 변수는 오브젝트가 자기 자신을 알고 있는 속성이다. 
	 * 오브젝트의 모든 인스턴스들은 자신만의 인스턴스 변수의 사본을 가지고 있으며, 
	 * 값이 객체마다 동일하다고 하더라도 그러하다. 
	 * 하나의 객체 인스턴스는 다른 모든 인스턴스에 영향을 미치지 않고서도 
	 * 인스턴스 변수들의 값을 바꿀 수있다. 
	 * 인스턴스 변수들은 메소드가 정적으로 선언되어 있지 않은 경우 모든 클래스 메소드들에 의해 사용될 수 있다.
	 * 
	 */
	private Scanner scan;
	private String strBCode;
	private String strBName;

	public BookServiceV1() {
		scan = new Scanner(System.in);
		strBCode = "";
		strBName = "";
	}

	public void inputMain() {

		while(true) {
			break;
		}
		return;
		
	}

	public String inputBCode() {

		/*
		 * 필드변수와 별도로 입력을 위해 생성한 지역변수
		 */
		String strBCode = scan.nextLine();
		while (true) {
			System.out.print("도서코드(QUIT:종료) >> ");

			int intBCodeLength = strBCode.length();
			if (intBCodeLength < 0 || intBCodeLength > 5) {
				System.out.println("도서코드는 13자리 이내의 숫자로 입력하세요");
				continue;
			}
			break;
		}
		return strBCode;
	}

}
