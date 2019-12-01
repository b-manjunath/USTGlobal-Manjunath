package com.ustglobal.miniproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

import com.ustglobal.miniproject.di.Author;
import com.ustglobal.miniproject.di.Book;

public class Author_Book {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClassPostProcessor.class);
		Book book = context.getBean(Book.class);
		System.out.println(book);
		System.out.println("***********************");
		Author author = context.getBean(Author.class);
		System.out.println(author.getName());
		System.out.println("*****************");

	}
}
