package leetcode.com;

 

/*Given linked list: 1->2->3->4->5, and n = 2.
 After removing the second node from the end, the linked list becomes 1->2->3->5.*/
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */

public class Remove_Nth_Node_From_End_of_List_19 {
	public static ListNode findNthFromEnd(ListNode head, int n) {
		if (head == null || n <= 0)
			return null;
		ListNode first = head;
		ListNode current = head;
		for (int i = 0; i < n; i++)
			first = first.next;
		while (first != null) {
			first = first.next;
			current = current.next;

		}

		return current;
	}

	public static ListNode removeNthFromEnd1(ListNode head, int n) {
		if (head == null || n <= 0)
			return head;

		ListNode first = head;
		ListNode current = head;
		ListNode pre = head;
		for (int i = 0; i < n; i++)
			first = first.next;
		while (first != null) {
			first = first.next;
			current = current.next;
		}
		if (current == head)
			head = head.next;
		else {
			// 找到前驱结点
			while (pre != null) {
				if (pre.next == current)
					break;
				else
					pre = pre.next;
			}
			if (current.next == null)
				pre.next = null;
			else
				pre.next = current.next;
			
		}
		return head;
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n <= 0)
			return head;
		if (head.next == null) {
			return null;
		}
		ListNode first = head;
		ListNode current = head;
		for (int i = 0; i < n; i++)
			first = first.next;
		while (first != null) {
			first = first.next;
			current = current.next;
		}
		if (current.next == null) {
			System.out.println(current.next == null);
			current = null ;
			//delete(current);
			System.out.println(current == null);
		}

		else {
			current.val = current.next.val;
			current.next = current.next.next;
		}
		return head;
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

		ListNode t = removeNthFromEnd(l1, 1);
		while (t != null) {
			System.out.println(t.val);
			t = t.next;
			
		}

	}
}