package day13_Constructor_Inheritance;

class Singleton04 {
	public Singleton04() {
		System.out.println("기본 생성자 실행");
	}
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		Singleton04 si = new Singleton04();
		Singleton04 si1 = new Singleton04();
		Singleton04 si2 = new Singleton04();
		Singleton04 si3 = new Singleton04();
		Singleton04 si4 = new Singleton04();
		Singleton04 si5 = new Singleton04();
		
		System.out.println(si);
		System.out.println(si1);
		System.out.println(si2);
		System.out.println(si3);
		System.out.println(si4);
		System.out.println(si5);
	}
}
