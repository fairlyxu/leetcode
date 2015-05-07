package list;

public class ReverseLink {
	//逆序输出链表
	public static void printReverse(ListNode head){
		if(head.next != null){
			printReverse( head.next); 
		} 
		System.out.println(head.val); 
		
	}
	
	//链表反转
	public static ListNode  reverseList(ListNode head){
		ListNode current = head;
		ListNode pre = null;
		
		ListNode result = null;
		while(current!=null){			 
			ListNode next = current.next;
			if(next==null)
				result = current;
				
			current.next = pre;
			pre = current ;
			current = next ;
			
		}
		 return result ;
		
		 
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		//printReverse(l3);
		
		 ListNode temp =  reverseList( l1);;
		 while(temp!=null)
		 {
			 System.out.println(temp.val);
			 temp = temp.next;
		 }
		/*//字符串操作
		String str= "ab c def g     h   ijk      lmn  ";
		String arr[] = str.trim().split(" +");
		//String arr[] = str.split("s+");
		System.out.println(arr.length);
		for(String t : arr){
		   System.out.println(t);
		}
		 
		int count = 0;
		for(int i=0;i<str.length()-1;i++){  
			if((' '!=str.charAt(i) &&((' '==str.charAt(i+1))))){
				 count++;
			}
		}
		System.out.println("单词数量为 "+count);*/
	}

}
