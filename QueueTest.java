/**
 * Test class for the queue class and its methods
 * 
 * @author hnilsson
 * @version 1.0
 * CS215
 */
public class QueueTest {

	public static void main(String[] args) {
		
		Queue line = new Queue();
		
		String bob = "Bob";
		String alice = "Alice";
		String bill = "Bill";
		String jane = "Jane";
		String hamad = "Hamad";
		String jim = "Jim";
		
		System.out.println("Bill, Alice, and Bob are in line. In that order");
		line.enqueue(bill);
		line.enqueue(alice);
		line.enqueue(bob);
		System.out.println(line.getQueue().getData()+ " gets served");
		line.dequeue();
		System.out.println(line.getQueue().getData() + " is now first in line");
		System.out.println("Jane and Hamad join the line");
		line.enqueue(jane);
		line.enqueue(hamad);
		System.out.println(line.getQueue().getData()+ " gets served");
		line.dequeue();
		System.out.println(line.getQueue().getData()+ " gets served");
		line.dequeue();
		System.out.println(line.getQueue().getData() + " is now first in line");
		line.enqueue(jim);
		System.out.println("Jim joins the line");
		System.out.println(line.getQueue().getData()+ " gets served");
		line.dequeue();
		System.out.println(line.getQueue().getData()+ " gets served");
		line.dequeue();
		System.out.println(line.getQueue().getData() + " is now first in line");
	}//end main	

}//end class
