package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月3日 上午9:43:09
 */
public class BubbleSortExample {

	public static void bubbleSort(int[] arr){
		int n = arr.length;
		int temp = 0;
		for(int i = 0;i < n;i++){
			for(int j = 1; j <(n - i);j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr = {3, 60, 35, 2, 45, 320, 5 };
		
		System.out.println("Array Before Bubble Sort");
		for(int i:arr){
			System.out.print(i + " ");
		}
		
		System.out.println("Array After Bubble Sort");
		bubbleSort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}
