package com.practice.QueuePrac;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {

   Queue<Integer>que= new PriorityQueue<>();
   que.offer(1);
   que.offer(2);
   que.offer(3);
   que.offer(6);
   que.offer(8);
   que.offer(7);
   //que.add(null);//will cause null pointer Exception
   que.offer(9);
   que.offer(1);
   
   //System.out.println(que);
   Integer i1;
	
	while((i1=que.poll())!=null) {
		//System.out.println(que.peek());
		System.out.println(i1);
	}
	
	
	System.out.println(que);
	

	}

}
