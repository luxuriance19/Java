package com.car;

public class PickUp extends Car implements ITranHuman,ITranGood {
	private int seatCount;
	private int goodWeight;
	
	public PickUp(String name, int price, int seatCount, int goodWeight) {
		super(name,price);
		this.seatCount = seatCount;
		this.goodWeight = goodWeight;
	}
	
	@Override
	public String getCapacity() {
		return "‘ÿ»À£∫" + seatCount + "»À£¨‘ÿ÷ÿ£∫" + goodWeight + "∂÷";
	}
	
	@Override
	public int getSeatCount() {
		return seatCount;
	}
	
	@Override
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	@Override
	public int getGoodWeight() {
		return goodWeight;
	}
	
	@Override
	public void setGoodWeight(int goodWeight) {
		this.goodWeight = goodWeight;
	}

}
