package model;

import java.util.Comparator;

public class CompareSizeScore implements Comparator<Score> {

	@Override
	public int compare(Score o1, Score o2) {
		return (int) (o1.getSize()- o2.getSize());
	}

}
