package clazz.array;



class Book {
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + " : " + author);
	}
}


public class Ex01 {

	public static void main(String[] args) {
		
		int[] array = new int[3];
		
		array[0] = 100;
		
		System.out.println(array[0]);
		
		Book[] book = new Book[5]; // 클래스 배열 생성
		
		book[0] = new Book("자바", "홍길동");
		// 객체를 생성해서 배열의 각 요소에 저장 
		book[1] = new Book("jsp", "성춘향");
		book[2] = new Book("IT가 제일 쉬웠어요", "이몽룡");
		book[3] = new Book("데이터베이스", "인순신");
		book[4] = new Book("spring", "장보고");
		
		for(int i = 0; i < book.length; i++) {
			book[i].showInfo();
			System.out.println();
		}
		
		System.out.println(book[0].title);

	}

}
