package ch01.ex02;

import java.util.Scanner;

public class ScannnerExample {

	public static void main(String[] args) {
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int str = Integer.parseInt(sc.nextLine());
		
		str = str + 10;
		
		System.out.println("입력된 값 : " + str);

	}

}
