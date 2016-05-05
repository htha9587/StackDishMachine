package stackController;

/**
 * Version 0.1
 * @author htha9587
 * 5-3-16
 */

import java.util.*;
import java.awt.*;
import stackController.ListIterator;
import stackModel.StackModel;
import stackView.StackFrame;
import stackView.StackPanel;
import stackController.StackRunner;
import javax.xml.soap.Node;

public  class StackController
{

	private int N;
	private Node first;
	private StackPanel basePanel;
	private StackFrame baseFrame;
	private StackModel baseModel;
	public class Node
	{
		Item item;
		Node next;
	}
	
	public StackFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	public void setBaseFrame(StackFrame baseFrame) {
		this.baseFrame = baseFrame;
	}
	
	
	/**
	 * Initializes empty stack.
	 */
	
	public StackController()
	{
		first = null;
		N = 0;
		baseModel = new StackModel();
		baseFrame = new StackFrame(this);
		
	}
	
//	/**
//	 * Returns true if Stack is dirty, false if not.
//	 */
//	
//	public boolean isDirty()
//	{
//		return first == null;
//	}
//	
//	/**
//	 * Returns radius of dish.
//	 * @return
//	 */
//	
//	public int radius()
//	{
//		return N;
//	}
//	
//	/**
//	 * Adds item to stack.
//	 */
//	
//	public void push(Item item)
//	{
//		Node firstDish = first;
//		first = new Node();
//		first.item = item;
//		first.next = firstDish;
//		N++;
//	}
//	
//	/**
//	 * Removes item from stack.
//	 * @return
//	 */
//	public Item pop()
//	{
//		if(isEmpty()) throw new NoSuchElementException("Stack Underflow!");
//		Item item = first.item;
//		first = first.next;
//		N--;
//		return item;
//	}
//	/**
//	 * Checks stack for erros.
//	 * @return
//	 */
//	public Item peek()
//	{
//		if(isEmpty()) throw new NoSuchElementException("Stack Underflow");
//		return first.item;
//	}

	
	
	
	public void start()
	{
		
	}
	
	
}
