package com.imooc;

public class PassengerCar extends Car {
	public PassengerCar(String Cname,int Crent,int CpassengerCapicty) {
		this.name=Cname;
		this.rent=Crent;
		this.passengerCapicty=CpassengerCapicty;
	}
	public void show() {
		System.out.println("������"+name+" ���"+rent+"Ԫ/��"+" ��������Ϊ��"+passengerCapicty+"��");
	}


}
