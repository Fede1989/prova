package com.prove.Project1;

public class Person implements Wearing{
	
	Object shirt;
	Object trousers;
	
	
	
	public Person() {
		super();
		this.shirt = "white t-shirt";
		this.trousers = "jeans";
	}
	public Object getShirt() {
		return shirt;
	}
	public void setShirt(Object shirt) {
		this.shirt = shirt;
	}
	public Object getTrousers() {
		return trousers;
	}
	public void setTrousers(Object trousers) {
		this.trousers = trousers;
	}
	
	
	public void wearingShirt() {
		Object shirt="yellow t-shirt";
		setShirt(shirt);
		System.out.println("oh , you're wearing a new t-shirt");
		
	}
	public void wearingTrouseser() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
