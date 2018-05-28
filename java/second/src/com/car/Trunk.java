package com.car;

public class Trunk extends Car implements ITranGood{
	private int goodWeight;
	
	public Trunk(String name, int price, int goodWeight) {
		super(name,price);
		this.goodWeight = goodWeight;
	}
	@Override
	public String getCapacity() {
		return "‘ÿ÷ÿ£∫"+goodWeight+"∂÷";
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
