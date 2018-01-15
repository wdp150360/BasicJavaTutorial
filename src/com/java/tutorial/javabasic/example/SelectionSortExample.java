package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月3日 上午10:50:16
 */
public class SelectionSortExample {

	public static void selectionSort(int[] arr){
		for(int i = 0;i < arr.length - 1;i++){
			int index = i;
			for(int j = i + 1;j < arr.length;j++){
				if(arr[j] < arr[index]){
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber; 
		}
	}
	
	public static void main(String[] args){
		int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};
		System.out.println("Before Selection Sort");
		for(int i :arr){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After Selection Sort");
		selectionSort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}
