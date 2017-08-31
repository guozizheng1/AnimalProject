package com.imooc.test;

import com.imooc.animal.Animal;

public class TestThree {

	public static void main(String[] args) {
		//创建两个实例
		Animal one = new Animal("花花", 2);
		Animal two = new Animal("花花", 2);
		//equals：继承object类中的equals方法时，比较的是两个引用是否指向同一个对象
		boolean flag = one.equals(two);
		System.out.println("one 和 two 的引用比较" + flag);
		System.out.println("one 和 two 的引用比较" + (one == two));
		System.out.println("===================================");
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		flag = str1.equals(str2);
		System.out.println("str1 和 str2 的引用比较" + flag);
		System.out.println("str1 和 str2 的引用比较" + (str1 == str2));
	}

}
