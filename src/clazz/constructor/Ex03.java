package clazz.constructor;

// MyCar 클래스를 만든다.
// 필드는 String color; int speed; 로 하고 외부접근 금지가 되게 한다.
// 생성자에서 매개변수로 매개 값을 받아 필드를 초기화 한다.
// 속도(speed)가 0 미만이거나 200을 초과할 경우 속도를 50으로 셋팅한다.
// getter 메소드를 만들어서 color필드와 speed필드를 사용할 수 있게 한다. 

class MyCar {
	
	private String color;
	private int speed;
	
	public MyCar(String color, int speed) {
		this.color = color;
		
		if(speed < 0 || speed > 200) {
			System.out.println("속도는 0 ~ 200 사이만 가능합니다.");
			System.out.println("속도를 50으로 셋팅합니다.");
			this.speed = 50;
		}else {
			this.speed = speed;
		}
	}

	public String getColor() {
			return color;
		}
		
	public int getSpeed() {
			return speed;
		}



public static class Ex03 {

	public static void main(String[] args) {
	
		MyCar myCar = new MyCar("빨강", 150);
		
		System.out.println("내 자동차 색상은: " + myCar.getColor());
		System.out.println("내 자동차 속도는: " + myCar.getSpeed());
	}

}

}