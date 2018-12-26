package com.imooc;

public abstract class Car {
	public String name;
	public int rent;
	public int cargoCapicty;
	public int passengerCapicty;
	public  abstract void show();//子类对show函数进行重写
	/*public Car() {}
	public Car(String Cname,int Crent,int CpassengerCapicty) {
		this.name=Cname;
		this.rent=Crent;
		this.passengerCapicty=CpassengerCapicty;
	}
	public Car(String Cname, int Crent, int CpassengerCapicty, int CcargoCapicty) {
		this.name = Cname;
		this.rent = Crent;
		this.passengerCapicty = CpassengerCapicty;
		this.cargoCapicty = CcargoCapicty;
	}*/
/*
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCargoCapicty() {
		return cargoCapicty;
	}
	public void setCargoCapicty(int cargoCapicty) {
		this.cargoCapicty = cargoCapicty;
	}
	public int getPassengerCapicty() {
		return passengerCapicty;
	}
	public void setPassengerCapicty(int passengerCapicty) {
		this.passengerCapicty = passengerCapicty;
	}
}get,set函数本项目并未用到
*/
}