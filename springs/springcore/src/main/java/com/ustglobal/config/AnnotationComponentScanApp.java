package com.ustglobal.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.di.Hello;
import com.ustglobal.di.Pet;

public class AnnotationComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I Love JDBC");
		System.out.println(hello.getMsg());

		Pet pet = context.getBean(Pet.class);
		pet.setName("Google");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
