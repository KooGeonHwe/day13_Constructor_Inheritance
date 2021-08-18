package day13_Constructor_Inheritance;

import java.io.IOException;

import java.util.Scanner;

class Login_tap {

	public int login() {
		return 0;
	}
}

public class Quiz01 {

        public static void main(String[] args) throws InterruptedException {
                Login_tap log =new Login_tap();
                
                int b=log.login();
                if(b==1) {
                        Scanner input =new Scanner(System.in);
                        System.out.print("명령어 입력해주세요 : ");
                        String s =input.next();
                        
                        long time =System.currentTimeMillis();
                        try {        
                                Thread.sleep(1000);
                        }catch(InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }
        public void times() {
                
        }
}
