package com.spring.core;

public class FountainPen implements Pen{
	
	private Ink ink; 
	
	FountainPen(Ink ink){
		this.ink = ink;
	}
	public void write() {
		System.out.println("Writing with "+ink.getBrandName()+" of color "+ink.getColor());		
	}

}
