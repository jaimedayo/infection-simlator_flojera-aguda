package model;

import processing.core.PApplet;

public class Infected extends Person {

	public Infected(float posX, float posY, float dirX, float dirY, PApplet app) {
		super(posX, posY, dirX, dirY, app);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
			draw();
			move();
	}
	public void draw() {
		app.fill(200,0,0);
		app.ellipse(posX, posY, 7, 7);
	}
}
