package com.callor.arrays;

public class SortEx_02 {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[] {10,9,20,6,7,30,22,78};

		// 원본 배열 
		System.out.println("정렬 되기 전 리스트");
		for(int arr : intArr) {
			System.out.printf("%d\t",arr);
		}
		System.out.println();

		int count = 0;
		for(int i = 0 ; i < intArr.length - 1 ; i++) {
		
			for(int j = 0 ; j < intArr.length - 1 ; j++) {
				count ++;
				if(intArr[j] > intArr[j + 1]) {
					int temp = intArr[j + 1];
					intArr[j + 1] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬된 후 배열 리스트");
		for(int arr : intArr) {
			System.out.printf("%d\t",arr);
		}
		System.out.println();
		System.out.printf("총 수행횟수 : %d",count);
		System.out.println("버블 정렬 총 수행 횟수는 O(n*n)로 총 배열 개수의 2배만큼 수행이 된다.");
		
	}
}
