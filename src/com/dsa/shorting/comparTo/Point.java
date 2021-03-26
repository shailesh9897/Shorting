package com.dsa.shorting.comparTo;

public class Point implements Comparable<Point> {
	int x;
	int y;
	Point(int x,int y)
		{
			this.x=x;
			this.y=y;
		}

	@Override
	public int compareTo(Point o) {
		
		return this.x-o.x;
	}

}
