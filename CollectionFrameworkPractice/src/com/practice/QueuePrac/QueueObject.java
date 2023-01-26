package com.practice.QueuePrac;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Queue<Student> obQue= new PriorityQueue<>(new StudentMarksComp());
		
		obQue.offer(new Student(1,"Ajuba", 120));
		obQue.offer(new Student(1,"Ajuba", 120));
		obQue.offer(new Student(2,"Ajubi", 123));
		obQue.offer(new Student(3,"Dolly", 120));
		obQue.offer(new Student(4,"Simran", 140));
		obQue.offer(new Student(5,"Raj", 320));
//		Student s;
//		while((s=obQue.poll())!=null)
//		{
//			System.out.println(s);
//		}
		Iterator<Student> st= obQue.iterator();
		while(st.hasNext())
		{
			System.out.println(st.next());
		}
	}

}
