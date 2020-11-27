package controller;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.LinkedList;

import model.Logic;


public class Controller {
	Logic logic;
	private PApplet app ;

	public Controller(PApplet app) {
		this.app=app;
	
		
		logic = new Logic(app);
		
	}
}