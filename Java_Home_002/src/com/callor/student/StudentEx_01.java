package com.callor.student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * @since 2020-08-15
 * 키보드로 학생정보를 입력받아 student.txt파일에 저장하시오
 */
public class StudentEx_01 {

	private static final int ST_NUM = 0;
	private static final int ST_NAME = 1;
	private static final int ST_DEPT = 2;
	private static final int ST_GRADE = 3;
	private static final int ST_TEL = 4;

	public static void main(String[] args) {
		
		String saveFile = "src/com/callor/student/student.txt";
		Scanner scan = new Scanner(System.in);
		String[] arrStudent = new String[5];
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		System.out.print("학번(QUIT:종료) >> ");
		arrStudent[ST_NUM] = scan.nextLine();
		
		System.out.print("이름(QUIT:종료) >> ");
		arrStudent[ST_NAME] = scan.nextLine();
		
		System.out.print("학과(QUIT:종료) >> ");
		arrStudent[ST_DEPT] = scan.nextLine();
		
		System.out.print("학년(QUIT:종료) >> ");
		arrStudent[ST_GRADE] = scan.nextLine();
		
		System.out.print("전화번호(QUIT:종료) >> ");
		arrStudent[ST_TEL] = scan.nextLine();
		
		String strStudent = "";
		for(String s : arrStudent) {
			strStudent += s + ":";
		}
		strStudent = strStudent.substring(0,strStudent.length() - 1);

		try {
			fileWriter = new FileWriter(saveFile,true); // append mode
			out = new PrintWriter(fileWriter);
			
			out.println(strStudent);
			
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(saveFile + " 파일을 생성할 수 없음.");
		}
		
		
		System.out.println(strStudent);
		scan.close();
		
		
		
		
		
	}
}
