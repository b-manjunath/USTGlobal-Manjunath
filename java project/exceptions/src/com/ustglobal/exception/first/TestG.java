package com.ustglobal.exception.first;

public class TestG {
	public static void main(String[] args) {
		System.out.println("Main method strated");

		Paytm p = new Paytm();
		try {
			p.book();
		}catch(ArithmeticException ae) {
			System.out.println("Exception caught in main");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Main method ended");
	}
}
