package com.ustglobal.objectclass;

public class TestC {
	public static void main(String[] args) {
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println(s);
		System.out.println(h);
		System.out.println("=================");
        Marker p = new Marker();
        System.out.println(p);
	}
}
