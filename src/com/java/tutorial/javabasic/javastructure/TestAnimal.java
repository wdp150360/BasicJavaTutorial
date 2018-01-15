package com.java.tutorial.javabasic.javastructure;
/**
 * @author wdp
 *
 * 2018年1月2日 下午2:27:03
 */
public class TestAnimal {

	public static void main(String[] args){
		Cat cat = new Cat();
		boolean isAnimal = cat instanceof Animal;
		System.out.println(isAnimal);
		cat.say();
		
		Animal dog = new Dog();
		dog.say();
		
		Animal ant = new Ant();
		ant.say();
	}
}
