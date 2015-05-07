package leetcode.com;
/*Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5 

// 考虑    只有一个节点的情况
*/
public class Remove_Linked_List_Elements {
	public ListNode getPreNode(ListNode head, ListNode current){
		if(head ==null||current==null||head==current)
			return null;
		else{
			ListNode temp = head;
			while(temp!=null)
			{
				if(temp.next==current)
					break ;
				temp= temp.next;
			}
			return temp;
		}
		
	}
	 public ListNode removeElements(ListNode head, int val) {
				
		 
	    while(head!=null&&head.val==val   ){	    	
	    		head = head.next;	    		 
	    }
	    if(head==null)
			return null;
	   ListNode current = head ;
	   ListNode pre = null;
	   while(current!=null)
	   {
		   if(current.val==val){
			   pre = getPreNode(head,current);
			   pre.next = current.next;
			 
		   }
		   current = current.next;
	   }
	   return head;
	 }

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(6);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(5);
		ListNode l7 = new ListNode(6);

	    l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7; 
	   
		Remove_Linked_List_Elements t = new Remove_Linked_List_Elements();
		ListNode ln = t.removeElements(l1, 6);
		while(ln!=null){
			System.out.println(ln.val);
		    ln = ln.next;	
		}
			
		

	}

}
