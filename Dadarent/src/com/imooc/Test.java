package com.imooc;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = { new PassengerCar("法拉利", 500, 2), new PassengerCar("迈凯伦", 1000, 2), new PickUp("大福特", 50, 4, 10),
				new Trunk("大货车", 200, 50) };// 对象数组存储所有租车信息
		System.out.println("欢迎使用达达租车系统！");
		System.out.println("需要租车请按1，退出请按0");
		Scanner input = new Scanner(System.in);// 通过scanner类获取输入
		String op = input.next();
		if (op.equals("0")) {// String的比较要用equals不能用==
			input.close();
			System.exit(0);// 退出输入
		}
		if (op.equals("1")) {
			System.out.println("可租赁车辆信息如下：");
			System.out.println("车名 租金 载量");
			for (int i = 0; i < cars.length; i++) {
				System.out.println(i + " ");
				cars[i].show();
			} // 输出可租赁车的所有信息
			System.out.println("请输入您要租赁车的数量");
			int number = input.nextInt();// 获取车的数量
			Car[] numbers = new Car[number];// numbers数组用来存储客户选择的车辆
			for (int i = 0; i < number; i++) {
				System.out.println("请输入您的第" + (i+1) + "辆车的序号");
				int no = input.nextInt();
				numbers[i] = cars[no];
			}
			System.out.println("请输入您要租赁的天数");
			int days = input.nextInt();
			System.out.println("您的订单：");
			new Test().bill(numbers, days);//new一个对象调用bill函数
		}
	}

	public void bill(Car[] numbers, int days) {
		int people = 0;
		int weights = 0;
		int total = 0;
		for (Car curren : numbers) {//foreach,相当于把右边数组的每个对象都赋给左边的对象
			if (curren instanceof PassengerCar || curren instanceof PickUp) {
				people = people + curren.passengerCapicty;
			}
			if (curren instanceof Trunk || curren instanceof PickUp) {
				weights = weights + curren.cargoCapicty;
			}
			total = total + curren.rent;
		} // 计算总人数和总载货数
		System.out.println("总载人数为：" + people);
		System.out.println("总载货量为：" + weights);
		System.out.println("总金额为：" + total * days);

	}
}
