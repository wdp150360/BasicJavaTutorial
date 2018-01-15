package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月2日 下午5:52:35
 */
public class FactorialExample {

	public static void main(String[] args){
		int num = 5;
		int fact = 1;
		for(int i = 1;i <= num;i++){
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
