package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	public static void main(String[] args) {
		String path = "C:\\Users\\HOME\\Desktop\\text.txt.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main() closed
}//class closed
