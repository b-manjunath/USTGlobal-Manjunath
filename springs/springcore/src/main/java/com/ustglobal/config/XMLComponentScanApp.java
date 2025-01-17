package com.ustglobal.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.di.Hello;
import com.ustglobal.di.Pet;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I Love Java");
		System.out.println(hello.getMsg());

		Pet pet = context.getBean(Pet.class);
				pet.setName("tommy");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}

}
