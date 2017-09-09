package com.imooc.animal;

public class Dog extends Animal {
	
	private String sex;//性别
	
	public Dog(){
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//睡觉
	public void sleep(){
		super.eat();//调用的是父类的方法
		super.species = "犬科";
		System.out.println(this.getName() + "现在" + this.getMonth() + "个月大，它在睡觉~~~");
	}
	
	/*
	 *方法的重载： 
	 *1.同一类中
	 *2.方法名相同，参数列表不同（参数顺序、个数、类型）
	 *3.方法的返回值、访问修饰符任意
	 *4.于方法的参数名无关
	 *
	 *方法的重写：
	 * 1.有继承关系的子类中（子类重写父类的方法)
	 * 2.方法名相同，参数列表完全同（参数顺序、个数、类型）,方法的返回值可以允许是子类类型
	 * 3.访问修饰符，访问范围需要大于等于父类的访问范围
	 * 4.于方法的参数名无关
	 */
//	private String sleep(String name){
//		return "";
//		
//	}
	//子类重写父类的方法
	public void eat(){
		System.out.println(this.getName() + "最近没有食欲~~~");
	}
	
	public void eat(String month){
		System.out.println(month + "最近没有食欲~~~");
	}
	
	@Override
	public Dog create() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
