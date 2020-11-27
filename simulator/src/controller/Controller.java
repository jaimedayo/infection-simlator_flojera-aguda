package controller;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.LinkedList;
import model.Healthy;
import model.Infected;
import model.Recovered;
import model.Score;
import model.Logic;


public class Controller {
	Logic logic;
	private PApplet app ;

	public Controller(PApplet app) {
		this.app=app;
	
		
		logic = new Logic(app);
		
	}

	public void clock() {
		logic.clockCheck();
	}
	
	public ArrayList<Healthy> getPersonH() {
		return logic.getPeopleH();
		
	}
	public ArrayList<Infected> getPersonI() {
		return logic.getPeopleI();
		
	}
	public ArrayList<Recovered> getPersonR() {
		return logic.getPeopleR();
		
	}

	public void contac() {
		logic.contact();
		
	}

	public ArrayList<Score> getScore() {
		return logic.getScore();
		 
	}

	public void sortScore(int s){
		logic.sortScore(s);
		
	}

	public void genrate() {
		logic.read();
		logic.createScore();
		
	}
}