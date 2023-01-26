package com.practice.IteratorPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list= new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(8);
		
		ListIterator<Integer> listItr= list.listIterator();
		
		while(listItr.hasNext())
		{
			Integer i=listItr.next();
			System.out.println(i);
			//System.out.println(listItr.next());
		}
		
		

	}

}
