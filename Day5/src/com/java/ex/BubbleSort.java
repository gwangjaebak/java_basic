package com.java.ex;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Func func = new Func();
		func.Test();
	}
class Func {
	public void bubbleSort() {
		int[] data = new int[100];
		
		for (int k=0; k<100; k++) {
			data[k] = (int)(Math.random()*100)+1;;
		}

		for(int i=1; i<data.length; i++) {
			for (int j=0; j<data.length-i; j++) {
				if(data[j] > data[j+1]){
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}	
		System.out.println(Arrays.toString(data));
	}
	
	public void insertionSort() {
		int[] data2 = new int[100];
		
		for (int k=0; k<100; k++) {
			data2[k] = (int)(Math.random()*100)+1;;
		}
		
		for (int end=1; end<data2.length; end++) {
			for (int i=end; i>0; i--) {
				if(data2[i-1]>data2[i]) {
					int tmp = data2[i-1];
					data2[i-1] = data2[i];
					data2[i] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(data2));
	}
	
	public void Test() {
		bubbleSort();
		insertionSort();
	}
}
}
