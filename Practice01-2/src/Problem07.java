import java.util.*;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1; // 1~100까지 난수 생성
		
		
		
		boolean n = true;
		
		while (n) {
			int tr = sc.nextInt();
			
			if (num<tr) {
				System.out.println("더 낮게");
			} else if (num>tr) {
				System.out.println("더 높게");
			} else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				String retry = sc.next();
				if (retry.equals("y")) {
					System.out.println("숫자맞추기게임 종료");
					break;
				}
				else {
					continue;
				}
				
			}
		}
	}

}
