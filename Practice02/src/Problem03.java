
public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'T', 'h', 'i', 's',' ', 'i', 's', ' ',
				'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';	//	할당연산자 사용
			}
			System.out.print(c[i]);
			//	굳이 string으로 안바꿔도 됨
			//	선입견을 버리자
		}
		}
	}


