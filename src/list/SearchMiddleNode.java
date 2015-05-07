package list;
//查找中间节点
public class SearchMiddleNode {

	public static void main(String[] args) {
		ListNode head =  MyList.create_list(12);
		MyList.print_list(head);
		//遍历一次查找中间节点
		ListNode fast = head;
		ListNode slow = head;	    
		while (fast.next!=null&&fast.next.next!=null){
			fast = fast.next.next;			
			slow = slow.next; 
		}
	    System.out.print ("\n 中间节点为"+slow.val);

	    //遍历两次查找中间节点
	    int nodeNum = 0;
	    ListNode temp = head;
	    while(temp!=null){
	    	nodeNum +=1;
	    	temp = temp.next;
	    }
	    temp = head;
	    for(int i=0;i<nodeNum/2;++i)
	    	temp=temp.next;
	    System.out.println("\n 中间节点为"+temp.val);
	    
	}

}
