package linkedList;

import linkedList.TreversalListNode.Node;

public class AddTwoNumbersRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbersRev atn = new AddTwoNumbersRev();
		Node head = new Node(2);
		head.next = new Node(4);//head = head.next;
		head.next.next= new Node(3);//head = head.next;
		
		Node head2 = new Node(5);
		head2.next = new Node(6);//head = head.next;
		head2.next.next= new Node(4);//head = head.next;
		
		atn.printLinkedList(atn.addTwoNumbers(head, head2));

	}
    public Node addTwoNumbers(Node l1, Node l2) {

        String sl1 = "";
        String sl2 = "";

        while(l1 !=null){
            sl1 = l1.data+sl1; 
            l1 = l1.next;
        }
        System.out.println("s1:"+sl1);
        while(l2!=null){
            sl2 = l2.data+sl2; 
            l2 = l2.next;
        }
        System.out.println("s2:"+sl2);

        int sum = (sl1.isEmpty()?0:Integer.valueOf(sl1))+(sl2.isEmpty()?0:Integer.valueOf(sl2));
        String strSum = sum+"";
        System.out.println(strSum);
        //Node head = new Node(0);
        Node head = null;
        for(int i=0;i<strSum.length();i++){
        	if(i==0) {
        	head = new Node(strSum.charAt(i));
        	}else {
        		head.next = new Node(strSum.charAt(i));
        	}
        }
        return head;


    }
	public void printLinkedList(Node head) {
		String array = "[";
		Node temp = head;
		while(temp !=null) {
			array=array.concat(temp.data+",");
			temp = temp.next;
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}

}
