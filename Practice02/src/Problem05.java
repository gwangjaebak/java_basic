
public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scoreboard[][] = {
								{80,75,90,95,78},
								{80,75,90,95,78},
								{80,75,90,95,78},
								{80,75,90,95,78},
								{80,75,90,95,78},
							 };
		
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < scoreboard.length; i++) {
			for (int j = 0; j < scoreboard[0].length; j++) {
				if (scoreboard[i][j] >= 85) {
					count += 1;
					sum += scoreboard[i][j];
				}
			}
		}
		//	결과값도 float 형태로 만들고 float 자료형 result에 넣어준다
		double result = ((double)sum/count);
		
		System.out.println("총 합은 " + sum + "입니다.");
		System.out.printf("평균값은 %.1f입니다.", result);
		//	주의 : doouble, float 등 출력할때, 모두 %f를 사용함!!
		//		  그러나 char은 %c, string은 %s임
		//		  그리고 잊지말자 printf!!
	}
}
