package com.imooc;

public class PickUp extends Car {
	//public int cargoCapicty=0;不能赋初值

	public PickUp(String Cname, int Crent, int CpassengerCapicty, int CcargoCapicty) {
		this.name = Cname;
		this.rent = Crent;
		this.passengerCapicty = CpassengerCapicty;
		this.cargoCapicty = CcargoCapicty;
	}
	public void show() {
		System.out.println("车名："+name+" 租金："+rent+"元/天"+" 可载人数为："+passengerCapicty+"人"+" 可载货量为"+cargoCapicty+"吨");
	}

}
