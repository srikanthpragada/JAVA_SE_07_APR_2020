package oop;

import java.util.Arrays;

class Point implements Comparable<Point>{
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override 
	public String toString() {
		return this.x + "," + this.y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
			return false;
		
		Point other = (Point) obj;  // Downcasting
		return this.x == other.x && this.y == other.y;
	}
	@Override 
	public int hashCode() {
		return 1;
	}
	@Override
	public int compareTo(Point other) {
        // this with other
		if (this.x != other.x)
			return this.x  - other.x;
		
		return this.y - other.y;
	}
}

public class TestPoint {

	public static void main(String[] args) {
		var p1 = new Point(10, 20);
		var p2 = new Point(10, 20);
		var p3 = new Point(1,2);
		System.out.println(p1.compareTo(p2));
		
		var points = new Point[] { new Point(1,2), new Point(10,20), new Point(5,5)};
		
		Arrays.sort(points);
		
		for(Point p : points)
			System.out.println(p);
		
		
		
		
		
		

//		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals(p3));
//		System.out.println(p1.toString());
//		System.out.println(p1.equals("Abc"));
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
	}

}
