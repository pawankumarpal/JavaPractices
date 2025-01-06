package linkedList;

public class CheckCyclicLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		
		
	}
	static class NodeList{
		int data;
		NodeList next;
		
		NodeList(int x){
			data = x;
			next =null;
		}
	}
	
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next != null && fast !=slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast == null || fast.next== null){
            return false;
        }
        return true;
        
    }

}
