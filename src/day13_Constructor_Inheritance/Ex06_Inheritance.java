package day13_Constructor_Inheritance;

class AAA {
	public void aaa() {
		System.out.println("test");
	}

class Calc06 extends AAA {
	public Calc06(String s) {
		System.out.println(s + "�θ� ������");
	}
	public void test() {
		System.out.println("�θ� test ����");
	}
}

class Computer06 extends Calc06 {
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss + " : �ڽ� ������");
		test();
	}
	public void test() {
		System.out.println("");
	}
}

public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("����");
	}
}