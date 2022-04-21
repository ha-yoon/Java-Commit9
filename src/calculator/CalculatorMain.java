package calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력 : ");
		double x = scan.nextDouble();

		System.out.print("두번째 수를 입력 : ");
		double y = scan.nextDouble();

		Calculator myCalc = new Calculator(x, y);
		
		while(true) {
			
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.전원끄기");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1 :
				myCalc.add();
				break;
			case 2 :
				myCalc.subtract();
				break;
			case 3 :
				myCalc.multiply();
				break;
			case 4 :
				myCalc.divide();
				break;
			case 5 :
				myCalc.powerOff();
				break;
				default:
					System.out.println("잘못 입력 하였습니다.");
			}
		scan.close();
			
		}
		
	}

}
