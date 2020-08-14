package com.callor.book;

import java.util.Scanner;

/*
 * 
 * 키보드를 사용하여 도서코드와 도서정보를 입력받아 Console에 표시하시오
 * 
 * 요구조건
 * 	1. 도서코드는 1 ~ 5 이내의 숫자로 입력
 *  2. 입력된 도서코드는 5자리의 숫자형 문자열로 변환
 *  	1 => 00001, 101=> 00101
 *  3. 조건에 맞지 않은 도서코드를 입력하면 
 *  	안내 메시지를 보여주고 도서코드를다시 입력받아야 함
 *  4. 도서명은 반드시 입력해야 함
 *  5. 도서명을 입력하지 않고 Enter를 누르면 도서명을 다시 입력받아야 함
 *   
 */
public class BookEx_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String strBCode = "";
		String strBName = "";
		
		while(true) {
			System.out.print("도서코드(QUIT:종료) >> ");
			strBCode = scan.nextLine();
			
			int intBCodeLength = strBCode.length();
			if(intBCodeLength < 0 || intBCodeLength > 5) {
				System.out.println("도서코드는 13자리 이내의 숫자로 입력하세요");
				continue;
			}
			
			int intBCode = 0;
			try {
				intBCode = Integer.valueOf(strBCode);
			} catch (Exception e) {
				System.out.println("도서코드는 숫자로만 입력해야 합니다");
				continue;
			}
			
			// 도서 코드는 5자리 숫자형 문자열로 변환한다
			// 00001
			strBCode = String.format("%05d", intBCode);
			break;
		}
		
		
		while(true) {
			System.out.print("도서명(QUIT:종료) >> ");
			strBName = scan.nextLine();
			
			if(strBName.isEmpty()) {
				System.out.println("도서명은 반드시 입력해야 합니다");
				continue;
			}
			break;
		}
		
		System.out.println("================================");
		System.out.println("입력한 도서정보");
		System.out.println("--------------------------------");
		System.out.printf("도서코드 : %s\n",strBCode);
		System.out.printf("도서명 : %s\n",strBName);
		System.out.println("================================");
		
		scan.close();
	}

}
