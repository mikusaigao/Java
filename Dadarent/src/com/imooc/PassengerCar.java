package com.imooc;

public class PassengerCar extends Car {
	public PassengerCar(String Cname,int Crent,int CpassengerCapicty) {
		this.name=Cname;
		this.rent=Crent;
		this.passengerCapicty=CpassengerCapicty;
	}
	public void show() {
		System.out.println("车名："+name+" 租金："+rent+"元/天"+" 可载人数为："+passengerCapicty+"人");
	}


}
