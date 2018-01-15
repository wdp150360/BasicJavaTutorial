package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月2日 下午5:55:22
 */
public class FactorialExample2 {

	public static int factorial(int num){
		if(num == 0){
			return 1;
		}else{
			int b = num * factorial(num - 1);
			return b;
		}
	}
	
	public static void main(String[] args){
		int c = factorial(6);
		
		System.out.println(c);
	}
}
