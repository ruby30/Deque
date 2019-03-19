import java.util.Iterator;
import java.util.*;

public class Deque<ITEM> implements Iterable<ITEM>
{
	private Node first, last;
	 private int dequeSize;
	 
	 private class Node
	 {
		 ITEM item;
		 Node next;
		 Node prev;
	 }
	 
	public Deque() {
		first=last=null;
		dequeSize=0;
	}
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public int size()
	{
		return dequeSize;
	}
	
	public void addFirst(ITEM item)
	{
		Node oldFirst=first;
		first=new Node();
		first.item=item;
		if(oldFirst==null)
		{
			last=first;
		}
		else
		{
			oldFirst.prev=first;
			first.next=oldFirst;
			first.prev=null;
		}
		dequeSize++;
	}
	
	public void addLast(ITEM item)
	{
		Node oldLast=last;
		last=new Node();
		last.item=item;
		last.next=null;
		if(isEmpty())
			first=last;
		else
		{
			oldLast.next=last;
			last.prev=oldLast;
		}
		dequeSize++;
	}
	
	public ITEM removeFirst()
	{	
		if(isEmpty())
			throw new NoSuchElementException();
		ITEM item=first.item;
		first=first.next;
		if(isEmpty())
			last=null;
		else
			first.prev=null;
		dequeSize--;
		return item;
		
	}
	
	public ITEM removeLast()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		ITEM item=last.item;
		last=last.prev;
		if(last==null)
			first=null;
		else
			last.next=null;
		dequeSize--;
		return item;
		
	}
	public Iterator<ITEM> iterator() 
	{ 
		return new ListIterator(); 
	}
	 private class ListIterator implements Iterator<ITEM>
	 {
		 private Node current = first;
		 public boolean hasNext() 
		 { 
			 return current != null; 
		 }
		 public void remove() { }
		 public ITEM next()
		 {
			 ITEM item = current.item;
			 current = current.next;
			 return item;
		 }
	}

}
