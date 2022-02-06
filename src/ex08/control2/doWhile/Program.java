package ex08.control2.doWhile;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
//		Scanner scan = new java.util.Scanner(System.in); //원래는 이렇게 써야함. 그러나 이제 이 명명을 맨 위에서 처리
		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		//-----------------------성적입력부분-------------------------
		while(true) {
		
		
		System.out.print("┏────────────────────────┓\n"); 
		System.out.println("│      \\성적 입력\\       │");
		System.out.println("┗────────────────────────┛");
		
		do {
			System.out.println("국어1:");
			kor1 = scan.nextInt();
			
			if(kor1<0 || 100 < kor1) {
				System.out.println("잘못된 입력입니다.");
			}
		} while (kor1 < 0 || 100 < kor1); //조건이 거짓으로 판별되면 위로 올라가는 특성을 지님.
//		0<=kor1<=100 ; 유효범위
		
		do {
			System.out.println("국어2:");
			kor2 = scan.nextInt();
			
			if(kor2<0 || 100 < kor2) {
				System.out.println("잘못된 입력입니다.");
			}
		} while (kor2 < 0 || 100 < kor2);
		
		do {
			System.out.println("국어3:");
			kor3 = scan.nextInt();
			
			if(kor3<0 || 100 < kor3) {
				System.out.println("잘못된 입력입니다.");
			}
		} while (kor3 < 0 || 100 < kor3);
		
//		-----------------------성적출력부분-------------------------
		total = kor1 + kor2 + kor3;
		avg = total/3.0f;
		
		System.out.print("┏────────────────────────┓\n"); //명령어로 인식시키기 위한 역슬레쉬
		System.out.println("│      \\성적 출력\\       │"); //역슬레쉬는 특수한 의미. 뒤따르는 명령어가 있어야한다. 홀로 쓰일 수 없다.
		System.out.println("┗────────────────────────┛"); //\n을 계속 쓰는 것은 불편함을 초래. 개행함수를 따로 만들 수 있다.
		
//		System.out.printf("%2$d %3$d %1$d\n", 1,2,3); //인덱스를 사용하면 지정자의 수에 맞게 값도 반드시 있어야할 필요가 없어진다. 
		
		System.out.printf("\t국어1: %d\n", kor1);
		System.out.printf("\t국어2: %d\n", kor2);
		System.out.printf("\t국어3: %d\n", kor3);
		System.out.printf("\t총점: %3d\n", total);
		System.out.printf("\t평균: %6.2f\n", avg);
		System.out.println("──────────────────────────");
		}
	}
}