package com.imooc.animal;

public class Cat extends Animal {
	
	private double weight; //体重
	//public int temp = 300;
	
	public static int st3 = 44;
	
	//静态代码块
	static {
		System.out.println("我是子类的静态代码块");
	}
	
	//构造代码块
	{
		System.out.println("我是子类的构造代码块");
	}
	
	public Cat(){
		//this.month = 23;
		System.out.println("我是子类的无参构造方法");
	}
	
	public Cat(String name, int month) {
		/*子类构造默认调用的是父类的无参构造方法，
		 * 可以通过super()调用父类允许被访问的其他构造方法
		 * super()必须放在子类构造方法有效代码的第一行
		*/
		super(name, month);//调用父类的双参构造
		System.out.println("我是子类的带参构造方法");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//跑动的方法
	public void run(){
		System.out.println(this.getName() + "是一只" + this.getSpecies() + ",它在快乐的奔跑");
	}

}
