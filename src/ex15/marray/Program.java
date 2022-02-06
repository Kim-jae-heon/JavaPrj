package ex15.marray;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		// int kor1, kor2, kor3;
		int[] kors = new int[3 * 3]; // 연산은 cpu에 맡기고 개발자가 이해하기 쉽게 쓸 것.
		int total = 0;
		float avg = 0;
		int menu;

//		Scanner scan = new java.util.Scanner(System.in); //원래는 이렇게 써야함. 그러나 이제 이 명명을 맨 위에서 처리
		Scanner scan = new Scanner(System.in);

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;
		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 3; i++)
				kors[(3 * j) + i] = 0; // 1차원이지만 개념상으로는 2차원으로 생각하고 사용하는 것. 그러나 머리가 복잡해진다. 그렇기에 2차배열 및 다차배열이 나온 것.

		종료: while (true) {
			// -----------------------메인메뉴부분-------------------------

			System.out.print("┏────────────────────────┓\n");
			System.out.println("│      \\메인 메뉴\\       │");
			System.out.println("┗────────────────────────┛");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t>");
			menu = scan.nextInt();

			switch (menu) { // 분기를 만들 때 중괄호로 감싸기.

			case 1:
				// -----------------------성적입력부분-------------------------

				System.out.print("┏────────────────────────┓\n");
				System.out.println("│      \\성적 입력\\       │");
				System.out.println("┗────────────────────────┛");

//				do {
//					System.out.println("국어1:");
//					kor1 = scan.nextInt();
//					
//					if(kor1<0 || 100 < kor1) {
//						System.out.println("잘못된 입력입니다.");
//					}
//				} while (kor1 < 0 || 100 < kor1); //조건이 거짓으로 판별되면 위로 올라가는 특성을 지님.
//		//		0<=kor1<=100 ; 유효범위
//				
//				do {
//					System.out.println("국어2:");
//					kor2 = scan.nextInt();
//					
//					if(kor2<0 || 100 < kor2) {
//						System.out.println("잘못된 입력입니다.");
//					}
//				} while (kor2 < 0 || 100 < kor2);
//				
//				do {
//					System.out.println("국어3:");
//					kor3 = scan.nextInt();
//					
//					if(kor3<0 || 100 < kor3) {
//						System.out.println("잘못된 입력입니다.");
//					}
//				} while (kor3 < 0 || 100 < kor3);
				for (int j = 0; j < 3; j++)
					for (int i = 0; i < 3; i++)
						do {
							System.out.printf("%d학년 국어%d:", j + 1, i + 1);
							kors[(3 * j) + i] = scan.nextInt();

							if (kors[(3 * j) + i] < 0 || 100 < kors[(3 * j) + i]) {
								System.out.println("잘못된 입력입니다.");
							}
						} while (kors[(3 * j) + i] < 0 || 100 < kors[(3 * j) + i]);

				break;

			case 2:
				// -----------------------성적출력부분-------------------------

				System.out.print("┏────────────────────────┓\n");
				System.out.println("│      \\성적 출력\\       │");
				System.out.println("┗────────────────────────┛");
//				total = kor1 + kor2 + kor3;
				for (int j = 0; j < 3; j++) {
					System.out.printf("<%d학년 국어성적>\n", j + 1);
					for (int i = 0; i < 3; i++) {
						total += kors[(3 * j) + i];
						avg = total / 3.0f;

						System.out.printf("\t국어%d: %d\n", i + 1, kors[(3 * j) + i]);
					}
					System.out.printf("\t총점: %3d\n", total);
					System.out.printf("\t평균: %6.2f\n", avg);
					System.out.println("──────────────────────────");
					total = 0;
				}
				break;

			case 3:
				// -------------------시스템 종료-----------------------------

//				System.exit(0); //프로세스를 종료하는 녀석. 그러나 좋은 방법이 아니다. 강제로 종료시키는 것이기 때문에. 우리는 자연스럽게 종료시켜야 한다.
				System.out.println("good bye~");
				break 종료; // 여기서 break는 switch밖에 못 벗어남. while문을 벗어나려면?
			// 제어문 중첩시 중첩을 한 번에 벗어나는 제어구조가 c언어의 go to가 있었음. 그러나 잘못된 사용으로 코드가 너무 난해함으로 go to가
			// 갖고 있는 자유로움을 빼앗음.
			// 제임스 고슬링은 이를 이용하여 break label문을 만듦.

			// 하지만 우리가 원하는데로 동작했다고해서 프로그램이 잘 만들어진 것이 아니다.
			// 흐름이 잘못됬다. 베타적인 흐름을 만들어야 한다.
			// else를 안쓴 if는 독립적으로 만들어진다. 즉, else를 써야만 베타적으로 만들어진다는 것.
			// 위와 같은 경우 사용자가 1~3중 하나를 클릭했을 때 하나만 실행시키는 것. 흐름을 따질 줄 알아야 한다.
			// 흐름이 비효율적이라면 효율적으로 고칠줄 알아야 한다.
			default:
				System.out.println("입력오류. 1~3 사이의 숫자만 입력해주세요.");

			}
		}
	}
}