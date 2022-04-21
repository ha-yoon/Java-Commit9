package calculator;

public class Calculator {

	// double x; double y; double result; 필드를 만든 후 
	// 필드를 외부접근 금지가 되게 한다.
	// 생성자에서 x와 y필드를 초기화 할 수 있게 매개 값을 받아 초기화 한다.
	// 전원을 켜는 powerOn 메소드와 전원을 끄는 powerOff 메소드(프로그램 종료하기) 만들기
	// 각 x, y의 필드를 사용해서 사칙연산 계산해주는 메소드 만들기
	// (add, subtract, multiply, divide)
	
	

	private double x; 
	private double y;
	private double result;
	

	public Calculator(double x, double y){
		this.x = x;
		this.y = y;		
	}
	

	public void powerOn() {
		System.out.println("계산기 전원 On");
	}
	
	public void powerOff() {
		System.out.println("계산기 전원 Off");
		System.exit(0); // 프로그램 강제종료
	}
	

	public void add() {
		result = x + y;
		System.out.println("x + y : " + result);
	}
	
	public void subtract() {
		result = x - y;
		System.out.println("x - y : " + result);
	}
	
	public void multiply() {
		result = x * y;
		System.out.println("x * y : " + result);
	}
	
	public void divide() {
		result = x / y;
		System.out.println("x / y : " + result);
	}
	
	
	
}
