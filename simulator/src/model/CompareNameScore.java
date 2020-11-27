package model;

import java.util.Comparator;

public class CompareNameScore implements Comparator<Score> {

	
	public int compare(Score o1, Score o2) {
		return o1.getName().compareTo(o2.getName());
		}


}
