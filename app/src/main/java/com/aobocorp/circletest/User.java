package com.aobocorp.circletest;

/**
 * Created by shutoukin on 2017/05/16.
 */

public class User {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean male) {
		isMale = male;
	}

	private boolean isMale;

	public boolean isAdult() {
		if (this.age > 17) {
			return true;
		} else {
			return false;
		}
	}
}
