package queueStuff;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		//first queue
		Queue<String> myFamily = new PriorityQueue<>();
		
		myFamily.add("Jack");
		myFamily.add("Barry");
		myFamily.add("Ben");
		myFamily.add("Dan");
		
		System.out.println(myFamily.toString());
		
		//poll, peek, remove, enqueue, dequeue
		
		while(!myFamily.isEmpty()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(myFamily.poll());	
		}
		System.out.println(myFamily.size());
	}
}
