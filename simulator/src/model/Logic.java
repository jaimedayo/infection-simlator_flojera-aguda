package model;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;




public class Logic {
	
	private PApplet app ;
	private String [] arrayStrings;
	private ArrayList<Score> score;
	private ArrayList<Infected> peopleI;
	private ArrayList<Healthy> peopleH;
	private ArrayList<Recovered> peopleR;
	private CompareSizeScore size;
	private CompareColorScore color;
	private CompareNameScore name;
	public Logic(PApplet app) {
		this.app=app;
		this.size= new CompareSizeScore();
		this.color= new CompareColorScore();
		this.name= new CompareNameScore();
		score = new ArrayList<Score>();
		peopleI = new ArrayList<Infected>();
		peopleH = new ArrayList<Healthy>();
		peopleR = new ArrayList<Recovered>();
	}
		public void read() {
		arrayStrings = app.loadStrings("../data/instructions.txt");
		
		for (int i = 0; i < arrayStrings.length; i++) {
			String lineString = arrayStrings[i];
			String [] arrayWord = lineString.split(":");
			Person obj = null;
			
			for (int j = 0; j < arrayWord.length; j++) {
				String state = arrayWord[0];
				int amount  = Integer.parseInt(arrayWord[1]);
				
				switch (state) {
				case "infectadas":
					for (int k = 0; k < amount; k++) {
						addHeathy(Random(10,490), Random(210,700), 1, 1);
					}
					break;
				case "sanas":
					for (int p = 0; p < amount; p++) {
						addInfected(Random(10,490), Random(210,700), 1, 1);
					}
					break;
				case "recuperadas":
					for (int r = 0; r < amount; r++) {
					addRecovered(Random(10,490), Random(210,700), 1, 1);	
					}
					break;
				}
						 
			}
		}
		//crear el score
	}
private float Random(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}
private void addRecovered(float posX,float posY,float dirX,float dirY) {
	Person obj;
	obj= new Recovered(posX, posY, dirX, dirY, app);
	peopleR.add((Recovered) obj);
	}
public void addHeathy(float posX,float posY,float dirX,float dirY) {
	Person obj;
	obj= new Healthy(posX, posY, dirX, dirY, app);
peopleH.add((Healthy) obj);
	}


public void addInfected(float posX,float posY,float dirX,float dirY) {
	Person obj;
	obj= new Infected(posX, posY, dirX, dirY, app);
peopleI.add((Infected) obj);
	}
public void removeHElemt(int i) {
	peopleH.remove(i);
}

public void removeIElemt(int i) {
	peopleI.remove(i);
}

public void contact() {
	for (int i = 0; i < peopleI.size(); i++) {
		for (int l = 0; l < peopleH.size(); l++) {
			float p;
			p = app.dist(peopleI.get(i).getPosX(), peopleI.get(i).getPosY(), peopleH.get(l).getPosX(), peopleH.get(l).getPosY());
			if(p<=14) {
				addInfected( peopleH.get(l).getPosX(),peopleH.get(l).getPosY(), 1, 1);
				removeHElemt(l);
				//añadir el mensaje de emergencia
			}
		}
	}
}
public void removeInfected() {
	for (int i = 0; i < peopleI.size(); i++) {
		if(peopleI.get(i).getTimer()>=14) {
			addRecovered(peopleI.get(i).getPosX(),peopleI.get(i).getPosY(), 1, 1);
			removeIElemt(i);
		}
	}
}
public void clockCheck() {
	for (int i = 0; i < peopleI.size(); i++) {
		peopleI.get(i).getTimer();
	  }
}
public void highInfectedPorcent(){
	if(peopleI.size()>=30) {
		//segundo mensaje de esepcion
	}
}
public void createScore() {
	Score s1 = new Score("sanos","verde", 1, app);
	Score s2 = new Score("enfectados","rojo", 1, app);
	Score s3 = new Score("recuperados","azul", 1, app);
	score.add(s1);
	score.add(s2);
	score.add(s3);
}
public void updateScore() {
	for (int i = 0; i < score.size(); i++) {
		switch (score.get(i).getName()) {
		case "sanos":
			score.get(i).setSize(peopleH.size());
			break;
		case "infectados":
			score.get(i).setSize(peopleI.size());
			break;
		case "recuperados":
			score.get(i).setSize(peopleR.size());
			break;
		}
	}
}

public void sortScore(int s) {
	switch(s) {
	case 0:
		Collections.sort(score);
	break;
	case 1:
		Collections.sort(score,color);
	break;
	case 2:
		Collections.sort(score,name);
	break;
	}
}


public ArrayList<Healthy> getPeopleH() {
	return peopleH;
}public ArrayList<Infected> getPeopleI() {
	return peopleI;
}public ArrayList<Recovered> getPeopleR() {
	return peopleR;
}public ArrayList<Score> getScore() {
	return score;
}
	
}