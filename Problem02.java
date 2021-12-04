import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] arr = new int[5];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		float result = sum / n;
		
		System.out.printf("평균은 %.1f 입니다.", result);
	}
}
