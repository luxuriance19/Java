package com.ready;

public class Circle extends CalPeriAndArea {
	/*private double radius;
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	*/

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println(2*Math.PI*radius);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(Math.PI*Math.pow(radius, 2));
	}

}
