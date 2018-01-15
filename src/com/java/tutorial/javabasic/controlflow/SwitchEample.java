package com.java.tutorial.javabasic.controlflow;
/**
 * @author wdp
 *
 * 2018年1月2日 上午10:27:09
 */
public class SwitchEample {

	public static void main(String[] args){
		int age = 40;
		
		switch(age){
		case 18:
			System.out.println("You are 18 year old");
			break;
		case 20:
			System.out.println("You are 20 year old");
            break;
        default:
        	System.out.println("You are not 18 or 20 year old");
		}
		
		switch(age){
		case 18:
			System.out.println("You are 18 year old");
			break;
		case 20:
		case 30:
		case 40:
			System.out.println("You are year old" + age);
			break;
		default:
			System.out.println("Other age");
		}
	}
}
