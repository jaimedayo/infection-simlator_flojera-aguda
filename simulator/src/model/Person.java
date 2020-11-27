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
		if(posX<=10) {
			posX=480;
		}
		if(posX>=490) {
			posX=20;
		}
		if(posY<=210) {
			posY= 690;
		}
		if(posY>=700) {
			posY= 220;
		}
		posX=posX+2*dirX;
		posY=posX+2*dirY;
} 
public PApplet getApp() {
	return app;
}public float getDirX() {
	return dirX;
}public float getDirY() {
	return dirY;
}public float getPosX() {
	return posX;
}public float getPosY() {
	return posY;
}
}
