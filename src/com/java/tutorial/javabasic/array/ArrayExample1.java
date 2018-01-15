package com.java.tutorial.javabasic.array;
/**
 * @author wdp
 *
 * 2018年1月2日 上午11:01:38
 */
public class ArrayExample1 {

	public static void main(String[] args){
		int[] myArray = new int[5];
		System.out.println("myArray length = " + myArray.length);
		for(int i = 0;i < myArray.length;i++){
			myArray[i] = 100*i*i + 3;
		}
		System.out.println(myArray[3]);
	}
}
