package com.java.tutorial.javabasic.javastructure;
/**
 * @author wdp
 *
 * 2018年1月2日 下午1:43:50
 */
public class TestFieldSample {

	public static void main(String[] args){
		FieldSample obj1 = new FieldSample("value1");
		System.out.println("obj1.myValue:" + obj1.myValue);
		System.out.println("obj1.MY_STATIC_FIELD:" + obj1.MY_STATIC_FIELD);
		System.out.println("FieldSample.MY_STATIC_FIELD:" + FieldSample.MY_STATIC_FIELD);
		
		FieldSample obj2 = new FieldSample("value2");
		System.out.println("obj2.myValue:" + obj2.myValue);
		System.out.println("obj2.MY_STATIC_FIELD:" + obj2.MY_STATIC_FIELD);
		System.out.println("------------------");
		obj2.MY_STATIC_FIELD = 200;
		System.out.println("obj2.MY_STATIC_FIELD:" + obj2.MY_STATIC_FIELD);
	}
}
