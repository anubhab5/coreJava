package Collections.queueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		// Does not gurantee order
		Queue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.peek());
		// 	System.out.println(q.element());
		
		for(int i= 20; i< 30;i++) {
			q.offer(i);
		}
		System.out.println(q);
		
		// poll removes the first element from the queue
		// if queue is empty then it would return null and not throw error
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.remove());
		
		
	}

}
