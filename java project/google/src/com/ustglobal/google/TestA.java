package com.ustglobal.google;

public class TestA {
	public static void main(String[] args) {
		Browser b = new Browser();
		Gmail g = new Gmail();
		b.open(g);
		Google gd = new GoogleDrive();
		b.open(gd);
	}
}
