package com.callor.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.book.domain.BookVO;

public class JueService {

	// 변수, 인스턴스는 private 이나 protected으로 선언하는 것이 좋습니다
	private List<BookVO> bookList;
	private Scanner scan = new Scanner(System.in);
	private BookVO bookvo = new BookVO();

	public JueService() {
		bookList = new ArrayList<>();

	}

	public boolean inputBook() {

		System.out.println("도서코드를 입력하세요!");
		String code = scan.nextLine(); // 문자열 입력하기위해 string

		try {
			// code를 Integer로 바꾸고 다시 문자열로 만든 이유가 뭘까요?
			code = String.format("%05d", Integer.valueOf(code));
			// if (Integer.valueOf(code) > 5) {
			
			// 자릿수를 검사하려면
			if(code.length() > 5) {
				System.out.println("도서코드는 1~5자리만 유효합니다");
				System.out.println("다시 입력하세요");
				return false;
			}

		} catch (Exception e) {

		}
		bookvo.setCode(code);
		// bookList.add(bookvo);

		
		// while (1 == 1) {
		while(true) {
			System.out.println("도서명을 입력하세요");
			String name = scan.nextLine();
			// bookvo.setName(name);

			// String strName="";
			try {
				
				// 도서명을 입력하지 않았을 경우 체크할때는 문자열.isEmpty() 로 검사하세요 
				// if ("".equals(name)) {
				if(name.isEmpty()) {
					// return false;
					System.out.println("도서명은 반드시 입력해야 합니다");
					System.out.println("도서명을 다시 입력하세요!");
					continue;
				}

			} catch (Exception e) {
				// String strName=scan.nextLine();
				// bookvo.setName(strName);

			}
			bookvo.setName(name);

			System.out.println("도서가격을 입력하세요");
			String strPrice = scan.nextLine();

			int Price = 0;
			try {
				Price = Integer.valueOf(strPrice);

			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
			}
			bookvo.setPrice(Price);
			bookList.add(bookvo);

			return true;
		}
	}

}
