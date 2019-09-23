import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AppQueues {

	public static void main(String[] args) {
		
		// (head) <-- ooooooooooooo <-- (tail) FIFO (First In, First Out)
		
		
		//ArrayBlockingQueue has a fixed size to it
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		System.out.println("Queue 1");
//		Throws NoSuchElement exception -- no items in queue yet
//		System.out.println("Head of queue is: " + q1.element());
		
		
		q1.add(10);
		q1.add(30);
		q1.add(40);
		
		
		System.out.println("Head of queue is: " + q1.element());
		
		
		
		
		try {
			q1.add(50);
		} 
		
		catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue.");
		}
		
		for(Integer value: q1) {
			
			System.out.println("Queue value: "+ value);
		}
		
//		Integer value;
		
		//remove the head of the queue
//		value = q1.remove();
//		System.out.println("Remove from queue: " + value);
//		System.out.println("Queue :" + q1);
		
		
		System.out.println("Remove from queue: " + q1.remove());
		System.out.println("Remove from queue: " + q1.remove());
		System.out.println("Remove from queue: " + q1.remove());

		
		try {
			System.out.println("Remove from queue: " + q1.remove());
			
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from queue.");
			System.out.println("There is no such thing to remove");
		}
		
		
		System.out.println("Queue :" + q1);
		
		System.out.println();
		
		/////////////////////////// Queue 2///////////////////////////////////////
		
		System.out.println("Queue 2");
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue 2 peek: " + q2.peek() );
		
		q2.offer(10);
		q2.offer(30);
		
		System.out.println(" After adding ");
		System.out.println("Queue 2 peek: " + q2.peek() );
		
		
		System.out.println();
		if(q2.offer(40) == false) {
	
			System.out.println("Offer failed to add third item");
		}
		
		for(Integer value: q2) {
			System.out.println("Queue 2 value: "+ value);
		}
		
		System.out.println("Queue 2 poll: " + q2.poll());
//		System.out.println("Queue 2 poll: " + q2.poll());
//		System.out.println("Queue 2 poll: " + q2.poll());
		
		
		
		
		System.out.println(q2.peek());
		
		if(q2.isEmpty()) {
			
			System.out.println("Queue 2 is empty");
		}
		
		
		
		
		
	}
	
	
	

}
