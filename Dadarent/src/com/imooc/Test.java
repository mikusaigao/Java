package com.imooc;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = { new PassengerCar("������", 500, 2), new PassengerCar("������", 1000, 2), new PickUp("����", 50, 4, 10),
				new Trunk("�����", 200, 50) };// ��������洢�����⳵��Ϣ
		System.out.println("��ӭʹ�ô���⳵ϵͳ��");
		System.out.println("��Ҫ�⳵�밴1���˳��밴0");
		Scanner input = new Scanner(System.in);// ͨ��scanner���ȡ����
		String op = input.next();
		if (op.equals("0")) {// String�ıȽ�Ҫ��equals������==
			input.close();
			System.exit(0);// �˳�����
		}
		if (op.equals("1")) {
			System.out.println("�����޳�����Ϣ���£�");
			System.out.println("���� ��� ����");
			for (int i = 0; i < cars.length; i++) {
				System.out.println(i + " ");
				cars[i].show();
			} // ��������޳���������Ϣ
			System.out.println("��������Ҫ���޳�������");
			int number = input.nextInt();// ��ȡ��������
			Car[] numbers = new Car[number];// numbers���������洢�ͻ�ѡ��ĳ���
			for (int i = 0; i < number; i++) {
				System.out.println("���������ĵ�" + (i+1) + "���������");
				int no = input.nextInt();
				numbers[i] = cars[no];
			}
			System.out.println("��������Ҫ���޵�����");
			int days = input.nextInt();
			System.out.println("���Ķ�����");
			new Test().bill(numbers, days);//newһ���������bill����
		}
	}

	public void bill(Car[] numbers, int days) {
		int people = 0;
		int weights = 0;
		int total = 0;
		for (Car curren : numbers) {//foreach,�൱�ڰ��ұ������ÿ�����󶼸�����ߵĶ���
			if (curren instanceof PassengerCar || curren instanceof PickUp) {
				people = people + curren.passengerCapicty;
			}
			if (curren instanceof Trunk || curren instanceof PickUp) {
				weights = weights + curren.cargoCapicty;
			}
			total = total + curren.rent;
		} // ���������������ػ���
		System.out.println("��������Ϊ��" + people);
		System.out.println("���ػ���Ϊ��" + weights);
		System.out.println("�ܽ��Ϊ��" + total * days);

	}
}
