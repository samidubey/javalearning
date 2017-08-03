package com.practice;

import java.util.Scanner;

public class RectangleDemo {

	public static int B;
	public static int H;
	public static boolean flag = true;

	static {
		Scanner scan = new Scanner(System.in);

		B = scan.nextInt();
		H = scan.nextInt();

		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		// r1.setLength(4);
		// r1.setWidth(3);
		// r1.setColor("Red");

		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			System.out.println(B * H);
		}
	}
}
