package day13_Constructor_Inheritance;

class AAA {
	public void aaa() {
		System.out.println("test");
	}

class Calc06 extends AAA {
	public Calc06(String s) {
		System.out.println(s + "부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}

class Computer06 extends Calc06 {
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss + " : 자식 생성자");
		test();
	}
	public void test() {
		System.out.println("");
	}
}

public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("전달");
	}
}
