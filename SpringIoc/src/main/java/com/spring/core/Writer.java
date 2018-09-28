package com.spring.core;

public class Writer {
	private Pen pen;
	
	Writer(Pen pen){
		this.pen = pen;
	}
	public void write() {
		pen.write();
	}

}
