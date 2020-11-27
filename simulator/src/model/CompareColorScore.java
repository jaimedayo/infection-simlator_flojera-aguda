package model;

import java.util.Comparator;

public class CompareColorScore implements Comparator<Score> {

	@Override
	public int compare(Score o1, Score o2) {
		return o1.getColor().compareTo(o2.getColor());
		}

}
