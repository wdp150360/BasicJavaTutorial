package com.java.tutorial.javabasic.javastructure;
/**
 * @author wdp
 *
 * 2018年1月2日 下午1:30:05
 */
public class TestPersion {

	public static void main(String[] args){
		Persion edison = new Persion("edison");
		String name = edison.getName();
		System.out.println("persion1:" + name);
		
		Persion bill = new Persion("bill gate");
		String name1 = bill.getName();
		System.out.println("persion2:" + name1);
	}
}
