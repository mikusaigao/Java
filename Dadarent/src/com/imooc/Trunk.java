package com.imooc;

public class Trunk extends Car {
	public Trunk(String Cname,int Crent,int CcargoCapicty) {
		this.name=Cname;
		this.rent=Crent;
		this.cargoCapicty=CcargoCapicty;
	}
	public void show() {
		System.out.println("车名："+name+" 租金："+rent+"元/天 "+"可载货量为"+cargoCapicty+"吨");
	}


}
