package javajichu_7;

import java.util.Scanner;

public class Demo3_1 {
//	����һ�������࣬�����������ԣ����ȺͿ�ȣ�����������������ȡ������ܳ���Ҫ���д����
//	����������һ�� Test �࣬�� Test �� main �����в���ʹ�þ�����ȥ�������󣬲����Ե������������ܳ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�����볤�ȣ�");
		double chang=sc.nextDouble();
		System.out.println("�������ȣ�");
		double kuan=sc.nextDouble();
		Rec jx = new Rec(chang, kuan);
		double zc=jx.getZhouChang();
		System.out.println("�ܳ�Ϊ"+zc);
		double mj=jx.getMianJi();
		System.out.println("���Ϊ"+mj);
	}
}
class Rec{
	double length;
	double width;
	double getZhouChang() {
		return 2*(length+width);
	}
	double getMianJi() {
		return length*width;
	}
	//���췽�� 1��û�з���ֵ���ͣ�2�����ƺ�������ͬ
	Rec(double l,double w){
		this.length=l;
		this.width=w;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "���Ρ�����"+length+"����"+width+"��";
	}
}

