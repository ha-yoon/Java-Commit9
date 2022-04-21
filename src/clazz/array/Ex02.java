package clazz.array;

class Name {
	
	String name;
	
	public Name(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}


public class Ex02 {

	public static void main(String[] args) {
		
		Name[] name = new Name[3]; 
		
		name[0] = new Name("홍길동"); 
		name[1] = new Name("성춘향");
		name[2] = new Name("이몽룡");
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i].name);
		
		}
		System.out.println();
		
		name[1].name = "이순신"; 
		name[2].setName("장보고"); 
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i].getName());
		}
	}

}
