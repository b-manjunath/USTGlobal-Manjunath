package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		int pHashCode = p.hashCode();
		System.out.println("HashCode of p " +pHashCode);
		System.out.println("===================");
		Pen q = new Pen();
		int qHashCode = q.hashCode();
		System.out.println("HashCode of q " +qHashCode);
	}
}
