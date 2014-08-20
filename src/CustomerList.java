
public class CustomerList {

	/**
	 * @param args
	 */
	public CustomerListNode head;
	public CustomerListNode nil;
	
	CustomerList(){
		CustomerListNode head = new CustomerListNode(0);
		CustomerListNode nil = new CustomerListNode(0);
		head.next = nil;
		nil.next = head;
		this.head = head;
		this.nil = nil;
	}

}
