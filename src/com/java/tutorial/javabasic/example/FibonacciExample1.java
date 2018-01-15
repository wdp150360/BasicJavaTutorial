package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月2日 下午4:26:51
 */
public class FibonacciExample1 {

	static int n1=0;
	static int n2=1;
	static int n3=0;
	
	public static void printFibonacci(int count){
		if(count > 0){
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}
	
	public static void main(String[] args){
		int count = 10;
		printFibonacci(count - 2);
	}
}
