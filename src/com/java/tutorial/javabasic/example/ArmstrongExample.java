package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月2日 下午6:03:16
 */
public class ArmstrongExample {

	public static void main(String[] args){
		int c = 0,a,temp;
		int n = 153;
		temp = n;
		while(temp > 0){
			a = temp % 10;
			temp = temp/10;
			c = c + (a * a * a);
		}
		if(n == c)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
	}
}
