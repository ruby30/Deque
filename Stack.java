
public class Stack 
{
	 private Node top = null;
	 
	 private class Node
	 {
		 String item;
		 Node next;
	 }

	 public boolean isEmpty()
	 { 
		 return top == null; 
	 }
	 
	 public void push(String item)
	 {
		 Node oldTop = top;
		 top = new Node();
		 top.item = item;
		 top.next = oldTop;
	 }
	 
	 public String pop()
	 {
		 String item = top.item;
		 top = top.next;
		 return item;
	 }
	
}
