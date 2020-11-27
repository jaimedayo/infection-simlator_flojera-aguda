package model;

import processing.core.PApplet;

import java.util.LinkedList;




public class Logic {
	
	private PApplet app ;
	private String [] arrayStrings;
	private LinkedList<Person> people;
	private CompareSizeScore size;
	private CompareColorScore color;
	private CompareNameScore name;
	
	
	public Logic(PApplet app) {
		this.app=app;
		this.size= new CompareSizeScore();
		this.color= new CompareColorScore();
		this.name= new CompareNameScore();
		
		people = new LinkedList<Person>();
		
		arrayStrings = app.loadStrings("../data/instructions.txt");
		

		for (int i = 0; i < arrayStrings.length; i++) {
			String lineString = arrayStrings[i];
			String [] arrayWord = lineString.split(":");
			Person obj = null;
			
			for (int j = 0; j < arrayWord.length; j++) {
				String state = arrayWord[0];
				int amount  = Integer.parseInt(arrayWord[1]);
				
				switch (state) {
				case "sanas":
					for (int k = 0; k < amount; k++) {
						
					}
					break;
				case "infectadas":
					for (int k = 0; k < amount; k++) {
						
					}
					break;
				case "recuperadas":
					for (int k = 0; k < amount; k++) {
						
					}
					break;
				}
						 
			}
		}
	}
	
}