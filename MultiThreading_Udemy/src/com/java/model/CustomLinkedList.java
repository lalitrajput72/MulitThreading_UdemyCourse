package com.java.model;

public class CustomLinkedList {

	Node head=null;
	Node tail=null;
	
	public void add(int data) {
		
		Node node=new Node(data);
		
		if(head==null) {
			head=node;
			tail=node;
		}
		else {
			tail.setNext(node);
			tail=tail.getNext();
		}
	}
	public void display() {
		
		Node current=head;
		if(current == null) {
			System.out.println("No data");
		}
		else {
			while(current !=null) {
				System.out.println(current.getData());
				current=current.getNext();
			}
		}
		
	}
	
	public static void main(String[] args) {
		CustomLinkedList list=new CustomLinkedList();
		list.add(5);
		list.add(10);
		list.add(7);
		list.add(9);
		list.add(20);
		list.add(8);
		
		list.display();
	}
}

class Node{
	
	private Node next;
	private int data;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
