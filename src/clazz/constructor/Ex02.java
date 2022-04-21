package clazz.constructor;

class Car {
	
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	
	
	public Car() {
		
		carProfile();
	}
		

		public Car(String model) {
			this.model = model; 
			carProfile(); 
		}
		
		public Car(String model, String color) {
			this.model = model;
			this.color = color;
			carProfile();
		}
		
		public Car(String model, String color, int speed) {
			this.model = model;
			this.color = color;
			this.speed = speed;
			carProfile();
		}
		
		public void carProfile() {
			System.out.println("제조회사: " + company);
			System.out.println("모델: " + model);
			System.out.println("색상: " + color);
			System.out.println("속도: " + speed);
		}
	}




public class Ex02 {

	public static void main(String[] args) {
	
		Car Car1 = new Car();
		
		Car Car2 = new Car("그랜져");
		
		Car Car3 = new Car("그랜져", "검정");
		
		Car Car4 = new Car("그랜져", "검정", 200);
	}

}
