package com.practice.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(7);
		
     //System.out.println(list);
		Iterator<Integer>itr= list.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.println(i);
			//printing in one time
			//System.out.println(itr.next());
			
		}
     
	}

}
