package com.imooc;

public class PickUp extends Car {
	//public int cargoCapicty=0;���ܸ���ֵ

	public PickUp(String Cname, int Crent, int CpassengerCapicty, int CcargoCapicty) {
		this.name = Cname;
		this.rent = Crent;
		this.passengerCapicty = CpassengerCapicty;
		this.cargoCapicty = CcargoCapicty;
	}
	public void show() {
		System.out.println("������"+name+" ���"+rent+"Ԫ/��"+" ��������Ϊ��"+passengerCapicty+"��"+" ���ػ���Ϊ"+cargoCapicty+"��");
	}

}
