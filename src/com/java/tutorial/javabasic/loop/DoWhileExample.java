package com.java.tutorial.javabasic.loop;
/**
 * @author wdp
 *
 * 2018年1月2日 上午10:44:09
 */
public class DoWhileExample {

	public static void main(String[] args){
		int value = 2;
		do{
			System.out.println("value =" + value);
			value = value +3;
		}while(value < 10);
	}
}
