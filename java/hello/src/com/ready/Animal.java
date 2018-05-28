package com.ready;

public class Animal {
	public int age=10; // private修饰符的化就不具备有继承的功能
	public String name;
	public void eat() {
		System.out.println("动物有吃东西的能力");
	}
	public Animal() {//构造方法
		System.out.println("Animal类执行了");
		age=20;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
