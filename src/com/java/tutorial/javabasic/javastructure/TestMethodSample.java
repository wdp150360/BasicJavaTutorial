package com.java.tutorial.javabasic.javastructure;
/**
 * @author wdp
 *
 * 2018年1月2日 下午2:06:08
 */
public class TestMethodSample {

	public static void main(String[] args){
		MethodSample obj1 = new MethodSample();
		System.out.println("obj1.myText:" + obj1.myText);
		String text = obj1.getText();
		System.out.println("text:" + text);
		
		obj1.setText("new text");
		System.out.println("obj1.getText()" + obj1.getText());
		
		int sum1 = obj1.sum(10, 20, 30);
		System.out.println("sum1:"+ sum1);
		
		int sum2 = MethodSample.sum(10, 20, 30);
		System.out.println("sum2" + sum2);
	}
}
