package com.tts;

public class Pet {

	private String name;
	private Integer age;
	private String location;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Pet() {
		this.name = "Spot";
		this.age = 0;
		this.location = "Somewhere";
		this.type = "Pet";
	}
	
	public Pet(String name,Integer age,String location,String type) {
		setName(name);
		setAge(age);
		setLocation(location);
		setType(type);
		this.name = getName();
		this.age = getAge();
		this.location = getLocation();
		this.type = getType();
		
		
	}

	private String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	private void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;
		
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", location=" + location + ", type=" + type + "]";
	}

}
