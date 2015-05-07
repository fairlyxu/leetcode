package leetcode.com;

public class ReverseLinkList_206 {
   public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
        	return head ;
        
        ListNode temp = head ;
        ListNode pre = null ;
        ListNode result = null ;
        while(temp !=null){ 
        	ListNode next  = temp.next;
        	if(next==null)
        		result = temp;
        	temp.next  = pre;
        	pre = temp;
        	temp = next  ; 
        }
         
        return result;
        	
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		 ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7); 

	    l1.next = l2;
	    l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;  

		ReverseLinkList_206 rl = new ReverseLinkList_206();
		ListNode t  = rl.reverseList(l1);
		 while(t!=null){
			System.out.println(t.val);
			t = t.next;
		} 
	}

}
