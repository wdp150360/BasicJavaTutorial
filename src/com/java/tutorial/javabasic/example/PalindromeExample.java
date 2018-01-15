package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月2日 下午4:45:29
 */
public class PalindromeExample {

	public static void main(String[] args){
		int r,sum = 0,temp;
		int n = 454;
		temp = n;
		while(temp > 0){
			r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp/10;
		}
		if(n == sum){
			System.out.println("palindrome number ");
		}else{
			System.out.println("not palindrome number ");
		}
	}
}
