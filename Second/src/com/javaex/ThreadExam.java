package com.javaex;

public class ThreadExam implements Runnable{//extends Thread{		//	추상메서드만 있기 때문에 정의해줘야 함
	
	private int []arr;
	public ThreadExam() {
		arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i;
		}
	
	}
	
	public void run() {		//	직접 만들어줘야 함
		
		for (int i=0;i<arr.length;i++) {
			try{
				Thread.sleep(100);		//	에러 발생, 인터럽스익셉션 발생할 환경임, 따라서 예외처리 해줘야댐(try~catch), //인터페이스라 이렇게 호출해줘야댐
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread()+""+arr[i]);			//인터페이스라 이렇게 호출해줘야댐
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam te = new ThreadExam();	//	상속받았으니 쓰레드 생성한 것임
//		te.start();		//	runable 상태
		Thread th = new Thread(te);
		th.start();	// 아까와 똑같이 동작
	}

}
