package model;

import processing.core.PApplet;

public abstract class Person implements Runnable  {

	protected float posX,posY,dirX,dirY;

	protected PApplet app;
	
public Person (float posX,float posY,float dirX,float dirY,PApplet app ) {
	this.app= app;
	this.dirX=dirX;
	this.dirY=dirY;
	this.posX=posX;
	this.posY=posY;
}
public void move() {
	dirX=  app.random(-5, 5);
		if(dirX==0) {
			dirX=1;
		}
		dirY=  app.random(-5, 5);
		if(dirY==0) {
			dirY=1;
		}
		posX=posX+2*dirX;
		posY=posX+2*dirY;
}

}
