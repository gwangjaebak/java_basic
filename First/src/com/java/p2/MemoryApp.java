package com.java.p2;

import java.util.Scanner;

public class MemoryApp{

	public static void main(String[] args) {
		//	
		Scanner sc = new Scanner(System.in);
		
		myStack mystack = new myStack();
		myQueue myqueue = new myQueue();
		Memory memory = null;	//	객체가 없을때 널 넣어주기!!
		
		int num;
		
		while(true) {
			System.out.println("1. Stack, 2. Queue, 3. Exit");
			num = sc.nextInt();
			
			if(num == 1) {
				memory = mystack;
			
			} else if(num == 2) {
				memory = myqueue;
			
			} else {
				System.exit(0);
			}
			
			while(true) {
				System.out.print("1. push 2. pop 3. Return");
				num = sc.nextInt();
				
				if(num == 1) {
					if(memory.isFull()==true) {
						System.out.println("메모리가 꽉 찼습니다.");
					}else {
						System.out.print("push 값 : ");
						memory.push(sc.nextInt());
					}		
				
				} else if(num == 2) {
					if (memory.isEmpty()==true) {
						System.out.println("메모리가 비었습니다.");
						continue;
					
					}else {
						System.out.print("pop 값 : ");
						System.out.println(memory.pop());	
					}
				
				} else {
					break;
				}
			}
		}
	}
}
