package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

//	큐도 인터페이스임
public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();	//	큐를 사용하는데 실제 사용하는건 링크드리스트
		
		//	First Input First Output(FIFO : 선입선출)
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);								//	enqueue
			System.out.println("QUEUE : " + queue);
		}
		
		//	queue의 첫번째 데이터 확인
		System.out.println("PEEK : " + queue.peek());
		System.out.println("QUEUE : " + queue);			//	삭제하진 않음
		while(!queue.isEmpty()) {						//	비어있지 않을 때
			System.out.println("POLL : " + queue.poll());	//	dequeue
			System.out.println("QUEUE : " + queue);
		}
	}
}
