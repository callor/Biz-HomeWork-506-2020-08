package com.callor.arrays;

public class SortEx_01 {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[] {10,9,20,6,7,30,22,78};

		// 원본 배열 
		System.out.println("정렬 되기 전 리스트");
		for(int arr : intArr) {
			System.out.printf("%d\t",arr);
		}
		System.out.println();

		
		for(int i = 0 ; i < intArr.length ; i++) {
		
			for(int j = i + 1 ; j < intArr.length ; j++) {
				if(intArr[i] > intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬된 후 배열 리스트");
		for(int arr : intArr) {
			System.out.printf("%d\t",arr);
		}
		System.out.println();
		
		
	}

}
