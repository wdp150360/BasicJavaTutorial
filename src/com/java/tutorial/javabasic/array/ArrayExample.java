package com.java.tutorial.javabasic.array;
/**
 * @author wdp
 *
 * 2018年1月2日 上午10:55:04
 */
public class ArrayExample {

	public static void main(String[] args){
		int[] myArray = new int[5];
		
		myArray[0] = 10;
		myArray[1] = 11;
		myArray[2] = 12;
		myArray[3] = 13;
		myArray[4] = 14;
		
		System.out.println("Array length = " + myArray.length);
		
		System.out.println("myArray[3] = " + myArray[3]);
		
		for(int i = 0;i < 5;i++){
			System.out.println("myArray[" + i +"] = " + myArray[i]);
		}
	}
}
