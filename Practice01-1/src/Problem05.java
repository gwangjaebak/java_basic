import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				arr[i+1] = arr[i];
			}
		}
		System.out.println("최대값은 " + arr[4] + "입니다.");
		
		
	}

}
