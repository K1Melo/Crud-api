package com.projetocrud.crud.models;

public class People {
	
	private String name;
	private int age;
	private double weight;
	private String email;
	
	public People() {

	}

	public People(String name, int age, double weight, String email) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.email = email;
	}

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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
