package com.car;

public class PassengerCar extends Car implements ITranHuman{
	private int seatCount;
	public PassengerCar(String name, int price, int seatCount) {
		super(name,price);
		this.seatCount = seatCount;
	}
	
	@Override 
	public String getCapacity() {
		return "ÔØÈË£º"+seatCount+"ÈË";
	}
	
	@Override
	public int getSeatCount() {
		return seatCount;
	}
	
	@Override
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
}
