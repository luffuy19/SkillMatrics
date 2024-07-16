package com.chainsys.programingFundamental;

public abstract class Demo {
	int id;
	int name;
	public Demo(int id, int name) {
		super();
		this.id = id;
		this.name = name;
	}
	abstract void message();
	public int getId() {
		return id;
	}
	public int getName() {
		return name;
	}
}
