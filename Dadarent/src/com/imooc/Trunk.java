package com.imooc;

public class Trunk extends Car {
	public Trunk(String Cname,int Crent,int CcargoCapicty) {
		this.name=Cname;
		this.rent=Crent;
		this.cargoCapicty=CcargoCapicty;
	}
	public void show() {
		System.out.println("������"+name+" ���"+rent+"Ԫ/�� "+"���ػ���Ϊ"+cargoCapicty+"��");
	}


}
