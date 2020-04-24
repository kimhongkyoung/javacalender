package hongs.calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {

		int a, b;// 변수
		Scanner sc = new Scanner(System.in);
		// ctrl+ shirt+m 임포트 단축키
		System.out.println("두 수를 입력해 주세요.");
		String s1, s2;// 임의로 문자열 s1,s2를 지정한다.
		s1 = sc.next(); // 1번째 입력받은걸 s1에 집어넣는다
		s2 = sc.next(); // 2번째 입력받은걸 s2에 집어넣는다
		System.out.println(s1 + "," + s2);
		// 10 100 을 치면 그대로 나타나고 abc 안녕하세요 등등 나타남.
		a = Integer.parseInt(s1);// s1을 정수형으로 변환해서 a에 대입하겟다.
		b = Integer.parseInt(s2);// s2를 정수형으로 변환해서 b에 대입하겟다.
        //int c = a + b;
		System.out.printf("%d와 %d의합은%d입니다", a, b, a + b);
        //System.out.println(a+","+b);
        sc.close();// 파일닫기, 다사용함 ,워닝 노란색을 없애자위해서 
        
        
	}
}
