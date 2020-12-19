package com.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDemo demo =new QueueDemo();
		Queue qu= demo.createQueueForDemo();
		demo.printQueueDemo(qu);

	}

	
	private Queue createQueueForDemo() {
		
		PriorityQueue<Integer> queueInteger =new PriorityQueue<>();
		queueInteger.add(100);
		queueInteger.add(200);
		queueInteger.add(50);
		
		return queueInteger;
			
		}
		
		private void printQueueDemo(Queue queue) {
			System.out.println(queue.peek());
			System.out.println(queue.poll());
			System.out.println(queue.poll());
		}
	
	
}
