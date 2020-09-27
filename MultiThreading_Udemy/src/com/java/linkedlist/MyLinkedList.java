package com.java.linkedlist;

 class  Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class MyLinkedList {

	Node head=null;
	Node tail=null;
	
	public void add(int data) {
		Node node=new Node(data);
		if(head == null) {
			head=node;
			tail=node;
		}
		else {
			tail.next=node;
			tail=node;
		}
	}
	
	public void printLinkedList() {
		Node currentNode=head;
		
		if(currentNode == null) {
			System.out.println("No Data");
		}
		else {
			while(currentNode != null) {
				System.out.print(currentNode.data+" , ");
				currentNode=currentNode.next;
			}
		}
	}
	
	public void printMiddle() {
		
		Node current=head;
		int count=0;
		while(current != null) {
			count++;
			current=current.next;
		}
		int n=0;
		current=head;
		System.out.println();
		while(current != null) {
			if(n == count/2) {
				System.out.println("Middle Element is : "+current.data);
				n++;
			}
			else {
				current=current.next;
				n++;
			}
		}
	}
	
	public void printMiddleElementByTwoPointers() {
		Node current=head;
		Node currentTwo=head;
		
		while(currentTwo.next != null) {
			current=current.next;
			currentTwo=currentTwo.next.next;
		}
		System.out.println("Middle Element is : "+current.data);
		
	}
	
	public static void main(String[] args) {
		MyLinkedList my=new MyLinkedList();
		my.add(1);
		my.add(2);
		my.add(3);
		my.add(4);
		my.add(5);
		
		my.printLinkedList();
		my.printMiddle();
		my.printMiddleElementByTwoPointers();
	}
}
