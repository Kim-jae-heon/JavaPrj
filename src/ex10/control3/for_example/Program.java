package ex10.control3.for_example;

public class Program {
	public static void main(String[] args) {
		int total = 0; 
		for(int i = 0; i < 10; i++) {
			total += i+1;
		}
		System.out.printf("total is %d\n", total);
		
		int tot = 0;
		for(int i = 0; i < 5; i++) { //for 안의 조건문은 회전을 얼마나 하는지를 중요시해야함.
			tot += i+3;
		}
		System.out.printf("total is %d\n", tot);
		//프로그래머는 절차를 생각해야 하는 사람. 위의 식은 적어도 4번의 연산이 반복해서 사용되고 있다.
		//굳이 for문을 사용하지 않더라도 공식이 있다. 공식을 사용하면 짧고 빠르게 절차없이 사용할 수 있다.
	}
}