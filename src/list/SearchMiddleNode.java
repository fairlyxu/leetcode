package list;
//�����м�ڵ�
public class SearchMiddleNode {

	public static void main(String[] args) {
		ListNode head =  MyList.create_list(12);
		MyList.print_list(head);
		//����һ�β����м�ڵ�
		ListNode fast = head;
		ListNode slow = head;	    
		while (fast.next!=null&&fast.next.next!=null){
			fast = fast.next.next;			
			slow = slow.next; 
		}
	    System.out.print ("\n �м�ڵ�Ϊ"+slow.val);

	    //�������β����м�ڵ�
	    int nodeNum = 0;
	    ListNode temp = head;
	    while(temp!=null){
	    	nodeNum +=1;
	    	temp = temp.next;
	    }
	    temp = head;
	    for(int i=0;i<nodeNum/2;++i)
	    	temp=temp.next;
	    System.out.println("\n �м�ڵ�Ϊ"+temp.val);
	    
	}

}
