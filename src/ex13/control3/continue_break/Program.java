package ex13.control3.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 space로 구분하여 5개 이상 입력하세요:");
//		n = scan.nextInt(); // 3 Enter, 34 5 6 234 345 54 45 Enter
		//next를 쓰게되면 space를 구분자로 해놓았기 때문에 34만 하나 읽게된다.
//		n = scan.nextInt(); //한 번 더 쓰게되면 prompt는 어떻게 될 것인가? 아직 입력 버퍼에는 읽을 것이 있다. 
//		n = scan.nextInt(); 
//		n = scan.nextInt(); //즉 enter를 만날 때 까지 계속 반복해서 읽어오는 것.
		while(scan.hasNext()) {
			n = scan.nextInt();
			
			if(n<10)
				continue;
			
			if(n > 300)
				break;
			
			System.out.println(n);
		}
		scan.close();
	}
}