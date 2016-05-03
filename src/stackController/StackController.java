package stackController;

/**
 * Version 0.1
 * @author htha9587
 * 5-3-16
 */

import java.util.*;
import java.awt.*;

import stackController.ListIterator;

import javax.xml.soap.Node;

public abstract class StackController<Item> implements Iterable<Item>
{

	private int N;
	private Node first;
	
	public class Node
	{
		Item item;
		Node next;
	}
	
	/**
	 * Initializes empty stack.
	 */
	
	public StackController()
	{
		first = null;
		N = 0;
	}
	
	/**
	 * Returns true if Stack is dirty, false if not.
	 */
	
	public boolean isDirty()
	{
		return first == null;
	}
	
	/**
	 * Returns radius of dish.
	 * @return
	 */
	
	public int radius()
	{
		return N;
	}
	
	/**
	 * Adds item to stack.
	 */
	
	public void push(Item item)
	{
		Node firstDish = first;
		first = new Node();
		first.item = item;
		first.next = firstDish;
		N++;
	}
	
	/**
	 * Removes item from stack.
	 * @return
	 */
	public Item pop()
	{
		if(isEmpty()) throw new NoSuchElementException("Stack Underflow!");
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	/**
	 * Checks stack for erros.
	 * @return
	 */
	public Item peek()
	{
		if(isEmpty()) throw new NoSuchElementException("Stack Underflow");
		return first.item;
	}
	/**
	 * Displays to string.
	 */
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		for(Item item : this)
			s.append(item + "");
		return s.toString();
	}
	
	/**
	 * Returns iterator that iterates in LIFO order.
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
	public Iterator<Item> iterator()
	{
		return (Iterator<Item>) new ListIterator();
	}
	
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
