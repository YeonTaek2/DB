package jyt0419;

import java.util.Scanner;

public class Switch_0419 {

	public static void main(String[] args) {
//		입력모드 삽입/수정모드 : insert 키
		// 두 수를 입력받아
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자1 입력하세요.");
		float 숫자1 = sc.nextFloat();

		System.out.print("숫자2 입력하세요.");
		float 숫자2 = sc.nextFloat();
		
		System.out.print("+, -, *, / 중 하나를 입력해주세요!");
		String 연산자 = sc.next();
		
		switch(연산자) {
		case "+":
			System.out.println(숫자1 + 숫자2);
			break;
		case "-":
			System.out.println(숫자1 - 숫자2);
			break;
		case "*":
			System.out.println(숫자1 * 숫자2);
			break;
		case "/":
			System.out.println(숫자1 / 숫자2);
			break;
		default:
			System.out.println("+,-,*,/ 중에 하나만 입력해야지~");
		}		
	}

}
