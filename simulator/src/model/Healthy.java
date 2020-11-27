package model;

import processing.core.PApplet;

public class Healthy extends Person {

	public Healthy(float posX, float posY, float dirX, float dirY, PApplet app) {
		super(posX, posY, dirX, dirY, app);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
			draw();
			move();	
	}
	public void draw() {
		app.fill(0,200,0);
		app.ellipse(posX, posY, 7, 7);
	}

}
