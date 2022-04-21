package clazz.constructor;

class Student {
	

	String school = "IT학교";
	int studentID;
	String name;
	int age;
	
	public Student() {
		System.out.println("Student 생성자를 호출했습니다.");
		System.out.println("생성자는 객체 생성시 호출되어 초기화 역할!!");
	}


	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}

	public void studentProfile() {
		System.out.println("학교: " + school);
		System.out.println("학번: " + studentID);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		Student stu = new Student(); 
	
		
		stu.studentProfile();
		System.out.println();
		
		Student stu2 = new Student(202201, "홍길동", 20);
		
		stu2.studentProfile();
	}

}
