package com.java.ex;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		Function3 func = new Function3();
		func.Test();
	}
}

class Function3 {
	public void binarySearch(int key, int[] data2) {
		int mid;
		int left = 0;
		int right = data2.length - 1;
		int cnt = 0;
		
		while(right >= left) {
			cnt++;
			mid = (right + left) / 2;
			
			if(key == data2[mid]) {
				System.out.println("값 " + key + "을 " + cnt + "번만에 찾았습니다.");
				break;
				
			} if(key < data2[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
	}
	
	public void Test() {
		int[] data = new int[100];
		
		for (int k=0; k<100; k++) {
			data[k] = (int)(Math.random()*100)+1;;
		}
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		binarySearch(data[24], data);
	}
}
