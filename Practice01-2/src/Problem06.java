import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("결과값 : " + sum);
	}

}
