package day13_Constructor_Inheritance;

class Singleton01 {
	public int num;
}
//하나의 공간을 공유하여 쓰겠다 = 싱글턴
public class Ex03_Singleton {
	public static void main(String[] args) {
		Singleton01 si = new Singleton01();
		Singleton01 si02 = new Singleton01();
		si.num = 12345;
		si02.num = 4444;
		
		System.out.println("si.num : "+si.num);
		System.out.println("si02.num : "+si02.num);
	
		System.out.println("si : "+si);
		System.out.println("si : "+si02);
	}
}
