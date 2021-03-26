package com.dsa.shorting.compator;

import java.util.Arrays;

public class ArrayObjectShorting {

	public static void main(String[] args) {
		Point arr[]= {new Point(10, 20),new Point(3, 12),new Point(5, 7)}; 
		Arrays.sort(arr,new MyComparator());
		for (Point point : arr) {
			System.out.println(point.x+"-- "+point.y );
		}

	}

}
