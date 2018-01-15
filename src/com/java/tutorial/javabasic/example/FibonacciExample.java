package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月2日 下午4:18:52
 */
public class FibonacciExample {

	public static void main(String[] args){
		int n1 = 0,n2 = 1,n3,i,count = 10;
		
		System.out.print(n1 + " " + n2);
		
		for(i = 2;i<=count;++i){
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
	}
}
