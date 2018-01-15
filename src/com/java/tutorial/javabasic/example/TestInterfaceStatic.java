package com.java.tutorial.javabasic.example;
/**
 * @author wdp
 *
 * 2018年1月5日 上午10:32:14
 */

	interface Drawable {
	    void draw();

	    static int cube(int x) {
	        return x * x * x;
	    }
	}

	class Rectangle implements Drawable {
	    public void draw() {
	        System.out.println("drawing rectangle");
	    }
	}

	class TestInterfaceStatic {
	    public static void main(String args[]) {
	        Drawable d = new Rectangle();
	        d.draw();
	        System.out.println(Drawable.cube(3));
	    }
	}

