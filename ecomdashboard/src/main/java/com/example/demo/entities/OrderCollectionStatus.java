package com.example.demo.entities;

public class OrderCollectionStatus {

	private int newOrders;
	private double revenues;
	private int shipped;
	public int getNewOrders() {
		return newOrders;
	}
	public void setNewOrders(int newOrders) {
		this.newOrders = newOrders;
	}
	public double getRevenues() {
		return revenues;
	}
	public void setRevenues(double revenues) {
		this.revenues = revenues;
	}
	public int getShipped() {
		return shipped;
	}
	public void setShipped(int shipped) {
		this.shipped = shipped;
	}
	public int getReturned() {
		return returned;
	}
	public void setReturned(int returned) {
		this.returned = returned;
	}
	private int returned;
	
}
