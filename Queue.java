/**
 * A basic queue/line with enqueue and dequeue functionalities
 * 
 * @author hnilsson
 * @version 1.0
 * CS215
 */
public class Queue {

	GenericLinkedList<String> queue;
	
	/**
	 * Creates a queue object by instantiating a GenericLinkedList object.
	 */
	public Queue() {
		queue = new GenericLinkedList<>();
	}//end default constructor
	
	/**Enqueues a customer to the back of the line
	 * 
	 * @param customer to enqueue
	 */
	public void enqueue(String customer) {
		queue.addNode(new GenericNode<String>(customer));
	}//end enqueue
	
	/**
	 * Dequeues the first person in line and sets the second person in line as the head.
	 */
	public void dequeue() {
		GenericNode<String> head = queue.getList();
		GenericNode<String> tempHead;
		tempHead = head;
		head = null;
		queue.setLength(queue.getLength()-1);
		tempHead = tempHead.getNextNode();
		queue.setHead(tempHead);
	}//end dequeue 
	
	/**
	 * 
	 * @return The head of the list
	 */
	public GenericNode<String> getQueue() {
		return queue.getList();
	}//end getQueue
	
}//end class
