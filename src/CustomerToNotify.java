
public class CustomerToNotify {

	/**
	 * @param args
	 */
	//CustomerList has CustomerListNode head, CustomerListNode nil
	//CustomerListNOde has int id, CustomerListNode next
	//O(number of customers)
	public CustomerListNode customerToNotify(CustomerList list, int k){
		CustomerListNode beginner = new CustomerListNode(0);
		CustomerListNode cur = new CustomerListNode(0);
		cur = list.head;
		for(int i = 0; i < k; i++){
			cur = cur.next;
		}
		beginner = list.head;
		while(cur != list.nil){
			cur = cur.next;
			beginner = beginner.next;
		}
		return beginner;
	}
}
