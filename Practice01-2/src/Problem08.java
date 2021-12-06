import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 예금, 2. 출금, 3. 잔고, 4. 종료");
		System.out.print("선택>");
		
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		int n = 1500;
		
		if(ch == 1) {
			System.out.println("예금액>"+n);		
		}else if (ch == 2) {
			System.out.println("출금액>"+ (n-800));
		}else if (ch == 3) {
				System.out.println("잔고액>" + n);
			
		}else if (ch == 4) {
			System.out.println("프로그램 종료");
		}else {
			System.out.println("다시 입력해주세요.");
		}
		
	}

}
