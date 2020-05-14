package collections;

import java.util.TreeSet;

public class ListOfPoints {

	public static void main(String[] args) {
		var points = new TreeSet<Point>();

		points.add(new Point(10, 20));
		points.add(new Point(11, 11));
		points.add(new Point(7, 5));
		points.add(new Point(2, 3));

		for (Point p : points)
			System.out.println(p);

	}

}
