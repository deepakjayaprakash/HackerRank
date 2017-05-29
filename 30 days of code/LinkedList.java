package DaysofCode30;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();

	}
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	 public static  Node insert(Node head,int data) {
		Node n=new Node(data);
		if(head==null){
			head=n;
			return head;
		}
		Node temp=head;
		for(;head.next!=null;head=head.next);
		
		head.next=n;
		return temp;
	      
	    }
	 
	

}
