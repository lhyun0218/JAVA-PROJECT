package hello;

import java.util.Scanner;

public class CircleArea2 {
	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner scanner = new Scanner(System.in);
		int radius;
		double circleArea;
		
		System.out.print("반지름 입력 : ");
		radius = scanner.nextInt();
		circleArea = PI * radius * radius;
		
		System.out.println("반지름이 "+radius+"인 원의 면적은"+circleArea+"입니다.");
		scanner.close();
	}
}
