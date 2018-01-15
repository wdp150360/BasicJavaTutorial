package com.java.tutorial.javabasic.controlflow;
/**
 * @author wdp
 *
 * 2018年1月2日 上午10:06:44
 */
public class ElseIfExample {

	public static void main(String[] args){
		int score = 90;
		
		if(score < 50){
			System.out.println("you are not pass!");
		}
		else if(score >= 50 && score < 80){
			System.out.println("you are pass!");
		}
		else{
			System.out.println("You are pass, good student!");
		}
	}
}
