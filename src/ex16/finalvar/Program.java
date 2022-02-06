package ex16.finalvar;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		//int kor1, kor2, kor3;
		final int SIZE = 3;
		int[] kors = new int[SIZE]; //정수배열은 객체 생성시 기본 값이 0으로 setting되어있다.
		int total;
		float avg;
		int menu;
		final int MENU_INPUT = 1;
		final int MENU_OUTPUT = 2;
		final int SYSTEM_QUIT = 3;
		
//		Scanner scan = new java.util.Scanner(System.in); //원래는 이렇게 써야함. 그러나 이제 이 명명을 맨 위에서 처리
		Scanner scan = new Scanner(System.in);
		
//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		
		for(int i = 0; i < SIZE; i++)
			kors[i] = 0;
		
		종료:
			while(true) {
			//-----------------------메인메뉴부분-------------------------

			System.out.print("┏────────────────────────┓\n"); 
			System.out.println("│      \\메인 메뉴\\       │");
			System.out.println("┗────────────────────────┛");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t>");
			menu = scan.nextInt();
		
			switch(menu) { //분기를 만들 때 중괄호로 감싸기. 
			
			case MENU_INPUT:
			//-----------------------성적입력부분-------------------------
			
				System.out.print("┏────────────────────────┓\n"); 
				System.out.println("│      \\성적 입력\\       │");
				System.out.println("┗────────────────────────┛");
			
				
				for(int i = 0; i < SIZE; i++)
					do {
						System.out.printf("국어%d:", i+1);
						kors[i] = scan.nextInt();
						
						if(kors[i]<0 || 100 < kors[i]) {
							System.out.println("잘못된 입력입니다.");
						}
					} while (kors[i] < 0 || 100 < kors[i]);
				
				break;
			
			case MENU_OUTPUT:
	//		-----------------------성적출력부분-------------------------
			
				total = kors[0] + kors[1] + kors[2];
				avg = total/3.0f;
				
				System.out.print("┏────────────────────────┓\n"); //명령어로 인식시키기 위한 역슬레쉬
				System.out.println("│      \\성적 출력\\       │"); //역슬레쉬는 특수한 의미. 뒤따르는 명령어가 있어야한다. 홀로 쓰일 수 없다.
				System.out.println("┗────────────────────────┛"); //\n을 계속 쓰는 것은 불편함을 초래. 개행함수를 따로 만들 수 있다.
				
				//n을 사용하느냐, i를 사용하느냐에 따라 암묵적인 약속이 다르다. 
				for(int i = 0; i < SIZE; i++) { //조건문은 손 대는 것이 아니다. 계산은 캡슐 안에서! 
					System.out.printf("\t국어%d: %d\n", i+1, kors[i]);
				}
				System.out.printf("\t총점: %3d\n", total);
				System.out.printf("\t평균: %6.2f\n", avg);
				System.out.println("──────────────────────────");
				
				break;
			
			case SYSTEM_QUIT:
			//-------------------시스템 종료-----------------------------
			
				System.out.println("good bye~");
				break 종료; //여기서 break는 switch밖에 못 벗어남. while문을 벗어나려면?
				//제어문 중첩시 중첩을 한 번에 벗어나는 제어구조가 c언어의 go to가 있었음. 그러나 잘못된 사용으로 코드가 너무 난해함으로 go to가 갖고 있는 자유로움을 빼앗음. 
				//제임스 고슬링은 이를 이용하여 break label문을 만듦.
			
			default : 
				System.out.println("입력오류. 1~3 사이의 숫자만 입력해주세요.");
			
			}
		}
	}
}