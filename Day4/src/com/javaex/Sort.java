package com.javaex;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		Function test = new Function();
		test.Test();
	}
}
class Function {
	
	public void quickSort(int[] data3, int l, int r){
		
        int left = l;
        int right = r;
        int pivot = data3[(l+r)/2];
        
        do{
            while(data3[left] < pivot) left++;
            while(data3[right] > pivot) right--;
            if(left <= right){    
                int temp = data3[left];
                data3[left] = data3[right];
                data3[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) quickSort(data3, l, right);
        if(r > left) quickSort(data3, left, r);
        
    }
	
	public void Test() {
		
		int[] data4 = new int[100];
		
		for (int k=0; k<100; k++) {
			data4[k] = (int)(Math.random()*100)+1;;
		}
		
		quickSort(data4, 0, data4.length-1);
		for(int i=0; i<data4.length; i++){
            System.out.print(data4[i] + ", ");
        }
	}
	
}
