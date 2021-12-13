package com.javaex;

//익명 스레드 예제
class ATM implements Runnable {
	private long depositeMoney = 10000;
	
	public void run() {
		synchronized (this) { // 동기화 => 공정하게, 기아 상태X, 잘못하면 좀비 프로세서
			for (int i =0; i<10;i++) {
				notify();
				try {
					Thread.sleep(1000);
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (getDepositeMoney()<=0)
					break;
				withDraw(1000);
			}
		}
		
	}


	public void withDraw(long howMuch) {
		System.out.println(Thread.currentThread().getName() + ", ");
		if (getDepositeMoney() > 0) {
			depositeMoney -=howMuch;
			System.out.printf("잔액: %d원 %n", getDepositeMoney());
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread trd_mom = new Thread(atm, "mom");
		Thread trd_son = new Thread(atm, "son");
		trd_mom.start();
		trd_son.start();	

	}

}