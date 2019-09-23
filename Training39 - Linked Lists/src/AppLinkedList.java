import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppLinkedList {

	public static void main(String[] args) {

		
		/*
		 * ArrayLists manage arrays internally
		 * [0][1][2][3][4]......
		 */	
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedList consists of element where each element
		 * has a reference to the previous and next element
		 * [0]->[1]->[2]
		 *    <-   <-
		 */					
		List<Integer> linkedList = new LinkedList<Integer>();
		// ^instanced

		
		
		// arrayList add or remove items at the end of the list
		// linkedList add or remove items from anywhere else at the list , beginning or
		// middle etc

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}

	public static void doTimings(String type, List<Integer> list) {

		long start = System.currentTimeMillis();

		//Add items at end of list
//		for (int i = 0; i < 1E5; i++) {
//
//			list.add(i);
//		}

		
		
		// Add items elsewhere in list
		for (int i = 0; i < 1E5; i++) {

			list.add(0,i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);

	}

}
