package com.java.tutorial.javabasic.loop;
/**
 * @author wdp
 *
 * 2018年1月2日 上午10:35:58
 */
public class ForLoopExample {

	public static void main(String[] args){
	    int	step = 1;
	    int sum = 0;
	    
	    for(int value = 0;value < 10;value = value + 3){
	    	System.out.println("step = " + step + " value = " + value);
	    	step++;
	    }
	    
	    for(int i = 0; i < 100;i++){
	    	sum = sum + i;
	    }
	    
	    System.out.println(sum);
	}
}
