package model;
import processing.core.PApplet;
public class Score implements Comparable<Score>{
	protected PApplet app;
	private int size;
	private String name, color;
	public Score(String name, String color, int size, PApplet app) {
		this.app=app;
		this.color=color;
		this.name=name;
		this.size=size;
	}
	public int compareTo(Score o) {
		return this.getSize() - o.getSize();
		
	}
	public PApplet getApp() {
		return app;
	}public String getColor() {
		return color;
	}public String getName() {
		return name;
	}public int getSize() {
		return size;
	}
}
