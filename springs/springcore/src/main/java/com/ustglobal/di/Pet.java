package com.ustglobal.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("pet")
public class Pet {
	
	//without using parameters
	public  Pet() {
		
	}
	//using parameters
	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
	private String name;
	//@Autowired                       //--------------> Auto wired
	//@Qualifier("Cat")
	private Animal animal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
