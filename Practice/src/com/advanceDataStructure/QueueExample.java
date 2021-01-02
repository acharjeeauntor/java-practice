package com.advanceDataStructure;

import java.util.LinkedList;
import java.util.Queue;

// Resource
//http://tutorials.jenkov.com/java-collections/queue.html#:~:text=To%20take%20an%20element%20from,if%20the%20Queue%20is%20empty.

public class QueueExample {
	
	public static void main(String[] args) {
		
		// Create and add data on queue
		
		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		queue.add("F");
		queue.add("G");
		queue.add("H");
		System.out.println(queue);
		
		// Get queue Data
		// Two way to get data both are almost same .poll() or .remove()
		System.out.println("Queue Size: "+queue.size());
		String firstElement= queue.poll();
		System.out.println("First Element: "+firstElement);
		System.out.println(queue);
		String secondElement= queue.remove();
		System.out.println("Second Element: "+secondElement);
		System.out.println(queue);
		System.out.println("After remove/Poll Queue Size: "+queue.size());
		
		// Clear Queue
		queue.clear();
		System.out.println("After Clear: "+queue);
		System.out.println("After Clear queue Size: "+queue.size());
		
	}

}
