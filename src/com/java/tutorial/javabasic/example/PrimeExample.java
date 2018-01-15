package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月2日 下午4:34:55
 */
public class PrimeExample {

	public static void main(String[] args){
		int i,m = 0,flag = 0;
		int n = 17;
		m = n/2;
		System.out.println(m);
		
		for(i = 2;i <= m;i++){
			if(n % i == 0){
				System.out.println("Number is not prime");
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println(n + " is prime");
		}
	}
}
