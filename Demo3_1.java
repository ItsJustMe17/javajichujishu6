package javajichu_7;

import java.util.Scanner;

public class Demo3_1 {
//	定义一个矩形类，它有两个属性：长度和宽度，还有两个方法：获取面积和周长，要求编写构造
//	方法。创建一个 Test 类，在 Test 的 main 方法中测试使用矩形类去创建对象，并测试调用输出面积和周长。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入长度：");
		double chang=sc.nextDouble();
		System.out.println("请输入宽度：");
		double kuan=sc.nextDouble();
		Rec jx = new Rec(chang, kuan);
		double zc=jx.getZhouChang();
		System.out.println("周长为"+zc);
		double mj=jx.getMianJi();
		System.out.println("面积为"+mj);
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
	//构造方法 1、没有返回值类型；2、名称和类名相同
	Rec(double l,double w){
		this.length=l;
		this.width=w;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "矩形【长："+length+"，宽："+width+"】";
	}
}

