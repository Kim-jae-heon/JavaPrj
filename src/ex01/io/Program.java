package ex01.io;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.write(3); //출력 버퍼에 3이라는 숫자를 채운 것. 다만 이것은 코드값.
		System.out.flush();
		
		System.out.write('3'); //출력 버퍼에 3이라는 기호를 채운 것. 즉 컴퓨터는 52라는 숫자를 인식하게된다. Unicode상 3이라는 기호는 52라는 숫자를 나타내기 때문에
		System.out.flush();
		
		System.out.write('A'+0);
		System.out.write('A'+1);
		System.out.write('A'+2);
		System.out.write('A'+3);
		System.out.write('A'+4);
		System.out.write('A'+'B'+'C');
		System.out.flush();
	}
}
