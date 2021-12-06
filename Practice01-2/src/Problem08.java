import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		boolean sw = true;
		
		while (sw) {
			System.out.println("1.예금, 2.출금, 3.잔고, 4.종료");
			
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					System.out.println("예금액 > ");
					int in_money = sc.nextInt();
					sum += in_money;
					continue;
				case 2:
					System.out.println("출금액 > ");
					int out_money = sc.nextInt();
					sum -= out_money;
					continue;
				case 3:
					System.out.println("잔고액 > " + sum);
					continue;
				case 4:
					System.out.println("프로그램 종료");
					sw = false;	//	강제종료, 스위치 끄기
					break;	//	주의, 여기까지 해줘야 다음꺼 출력 안됨
				default:
					System.out.println("다시 입력해주세요.");
					continue;
			}
		} 
		sc.close();	//	이거 꼭해줘야 함, 외부 리소스는 열어서 사용했으면 닫아야 다른 곳에서 사용 가능
	}
}
