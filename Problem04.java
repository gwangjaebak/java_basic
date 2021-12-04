import java.util.Arrays;
import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		for (int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random()*45)+1;	
			System.out.print(arr[i] + "	");
		}
		//	이런식으로 중복 체크 !! 정렬 > 하나씩 비교
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("중복 발생");
				
		//	주의 임의의 숫자는 정렬되면 안되니 그대로 출력해주고
		//	마지막에 중복 여부만 추가로 출력해주기
	
}
}
}	
}