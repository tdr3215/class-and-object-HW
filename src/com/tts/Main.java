package com.tts;

public class Main {
	public static void main(String[] args) {
		Pet test = new Pet("Bob",2,"home","dog");
		System.out.println(test.toString());
		
		Holiday unknown = new Holiday();
		Holiday national = new Holiday("New National Holiday",5);
		Holiday family = new Holiday("Christmas",12,true);
		
		System.out.println(unknown.toString());
		System.out.println(national.toString());
		System.out.println(family.toString());
		
		System.out.println(family.isSoon(12));
		System.out.println(family.celebrate());
	}
}
