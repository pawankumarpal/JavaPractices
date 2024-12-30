package linkedList;

public class MergeSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedList msl = new MergeSortedList();
		ListNode list1 = new ListNode(-1);
		ListNode curr = list1;
		curr.next = new ListNode(1);
		curr = curr.next;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(4);
		curr = curr.next;

		ListNode list2 = new ListNode(-1);
		ListNode currn = list1;
		currn.next = new ListNode(1);
		currn = curr.next;
		currn.next = new ListNode(3);
		currn = curr.next;
		currn.next = new ListNode(4);
		currn = curr.next;
		System.out.println(msl.mergeTwoLists(list1,list2));
	}

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) {
			return list1;
		} else if (list2 == null) {
			return list1;
		} else if (list1 == null) {
			return list2;
		} else {
			ListNode dummy = new ListNode(-1);
			ListNode curr = dummy;
			return update(list1, list2, dummy, curr);

		}

	}

	public ListNode update(ListNode list1, ListNode list2, ListNode dummy, ListNode curr) {
		// ArrayList<Integer> arr = new ArrayList<Integer>();
		if (list1 == null && list2 == null) {
			return dummy.next;
		} else if (list2 == null) {
			curr = new ListNode(list1.val);
			list1 = list1.next;
			return update(list1, list2, dummy, curr);
		} else if (list1 == null) {
			curr = new ListNode(list2.val);
			list2 = list2.next;
			return update(list1, list2, dummy, curr);
		}
		if (list1.val == list2.val) {
			curr = new ListNode(list1.val);
			list1 = list1.next;
			curr = new ListNode(list2.val);
			list2 = list2.next;
			return update(list1, list2, dummy, curr);
		}
		if (list1.val < list2.val) {
			curr = new ListNode(list1.val);
			list1 = list1.next;
			return update(list1, list2, dummy, curr);
		} else if (list1.val > list2.val) {
			curr = new ListNode(list2.val);
			list2 = list2.next;
			return update(list1, list2, dummy, curr);
		}
		return dummy.next;
		// while(list1 !=null){
		// arr.add(list1.val);
		// list1 = list1.next;
		// }
		// while(list2 !=null){
		// arr.add(list2.val);
		// list2 = list2.next;
		// }
		// Collections.sort(arr);

		// ListNode dummy = new ListNode(-1);
		// ListNode curr = dummy;

		// for (int i = 0; i < arr.size(); i++) {
		// curr.next = new ListNode(arr.get(i));
		// curr = curr.next;
		// }
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
