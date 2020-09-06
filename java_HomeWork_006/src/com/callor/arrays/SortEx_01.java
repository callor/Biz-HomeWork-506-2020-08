package com.callor.arrays;

public class SortEx_01 {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[] {10,9,20,6,7,7,30,22,78,88};

		// 원본 배열 
		System.out.println("정렬 되기 전 리스트");
		for(int arr : intArr) {
			System.out.printf("%d\t",arr);
		}
		System.out.println();

		int count = 0 ;
		for(int i = 0 ; i < intArr.length ; i++) {
		
			for(int j = i + 1 ; j < intArr.length - 1 ; j++) { // 5,4,3,2,1
				count++;
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
		System.out.printf("총 수행 횟수 : %d\n",count);
	
		System.out.println();
		int length = intArr.length;
		System.out.println(length*3);
		System.out.printf("배열개수 %d, Big O 값 : %d",length,(length*3));
		System.out.println("버블 정렬을 응용한\n이 정렬알고리즘의 총 수행 횟수는 O(3n)로 \n버블 정렬보다 빠르다.");
		
		
		
	}

}
