package ex03.io.escape;
public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total/3;
//		-----------------------성적출력부분-------------------------
		System.out.print("┏────────────────────────┓\n"); //명령어로 인식시키기 위한 역슬레쉬
		System.out.println("│      \\성적 출력\\       │"); //역슬레쉬는 특수한 의미. 뒤따르는 명령어가 있어야한다. 홀로 쓰일 수 없다.
		System.out.println("┗────────────────────────┛"); //\n을 계속 쓰는 것은 불편함을 초래. 개행함수를 따로 만들 수 있다.
		
		System.out.print("\t국어1: 0\n");
		System.out.print("\t국어2: 0\n");
		System.out.print("\t국어3: 0\n");
		System.out.print("\t총점: 0\n");
		System.out.print("\t평균: 0.00\n");
		System.out.print("──────────────────────────");
	}
}