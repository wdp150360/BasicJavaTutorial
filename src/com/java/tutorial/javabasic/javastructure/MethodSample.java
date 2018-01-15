package com.java.tutorial.javabasic.javastructure;
/**
 * @author wdp
 *
 * 2018年1月2日 下午1:59:47
 */
public class MethodSample {

	public String myText = "my text!";
	
	public MethodSample(){
		
	}
	
	public String getText(){
		return this.myText;
	}
	
	public void setText(String text){
		this.myText = text;
	}
	
	public static int sum(int a,int b,int c){
		int d= a + b + c;
		return d ;
	}
}
