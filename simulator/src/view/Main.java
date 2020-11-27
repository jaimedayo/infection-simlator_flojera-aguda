package view;

import controller.Controller;
import model.Healthy;
import model.Infected;
import model.Recovered;
import model.Score;
import processing.core.PApplet;

public class Main extends PApplet{
int sec;
int	time;
private Controller control;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	

	
	public void settings() {
		size(500, 710);
	}
	public void setup() {
	control = new Controller(this);
	control.genrate();
	System.out.println(control.getPersonH().size());
	System.out.println(control.getPersonI().size());
	System.out.println(control.getPersonR().size());
	
	}
	public void draw() {
		sec= second();
		background(250);
		
		
		 if(sec > time) {
			  time=sec;
			 control.clock();
		  }
		 
		 for (int i = 0; i < control.getPersonI().size(); i++) {
			 	Infected in= control.getPersonI().get(i);
			 	in.draw();
		}
		 for (int i = 0; i < control.getPersonH().size(); i++) {
				Healthy h= control.getPersonH().get(i);
				h.draw();
			}
		 for (int i = 0; i < control.getPersonR().size(); i++) {
				Recovered r= control.getPersonR().get(i);
				r.draw();
			}
		 for (int i = 0; i < control.getScore().size(); i++) {
				Score s= control.getScore().get(i);
				s.draw(20,(60*i)+10);
			}
		 
control.contac();
	}
	public void mouseClicked() {
		int s=0;
		
		control.sortScore(s);
		
	}
}
