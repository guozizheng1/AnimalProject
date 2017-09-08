package com.imooc.toString;

public class Test {
	public static void main(String[] args) {
	       //实例化对象，传入属性值（李明, 男,18）
		   Person p1 = new Person("李明", 18, "男");
		   Person p2 = new Person("李明", 18, "男");
	       //打印输出对象信息
	       System.out.println(p1);
	       System.out.println(p2.toString());
		}
}
