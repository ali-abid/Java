package com.arrayList.one;

import java.util.*;

public class testArrayList {
	public static void main(String [] args){
		java.util.ArrayList<Integer> numbers = new java.util.ArrayList<Integer>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		for(int i : numbers){
			System.out.println(i);
		}
		
	}
	
}
