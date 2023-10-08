package cs212_project;

public class Node<T> {
	T data;
	Node<T> next;
	Node<T> priveus;
	
	
	
	public Node() {
	data =null;
	next=null;
	priveus=null;
	}
	

	public Node(T value) {
	data =value;
	next=null;
	priveus=null;
	}
		
	
	

}
