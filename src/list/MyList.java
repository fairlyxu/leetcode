package list;

import java.util.ArrayList;

 
       
class MyList{
       public static ListNode create_list(int nodeNum){    	    
    	   ArrayList<ListNode> al = new ArrayList<ListNode>();
    	   if(nodeNum<=0)
    		   return null;
    	   for(int i=0;i<nodeNum;++i){
    		   ListNode temp = new ListNode(i+1);
    		   al.add(temp);
    	   }
    	   for(int i=0;i<nodeNum-1;++i)
    		   al.get(i).next = al.get(i+1);
    	   
    	   return al.get(0);
       }
       
       public static void print_list(ListNode head){
    	   ListNode temp = head;
    	   while(temp!=null){
    		   System.out.print(temp.val+" ");
    		   temp =temp.next;
    	   }
       }
       public static void main(String arg[]){
    	   MyList ls = new MyList();
    	   ListNode head  = ls.create_list(4);
    	   ls.print_list(head);
       }
        
  }

