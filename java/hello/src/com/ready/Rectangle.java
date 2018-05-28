package com.ready;

public class Rectangle extends CalPeriAndArea {
	/*private double length;
	private double width;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	*/

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2*(this.length+this.width);
		System.out.println(perimeter);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area = length*width;
		System.out.println(area);
	}

}
