package stackModel;

import java.util.Stack;
import java.awt.*;
import stackController.*;
import stackView.*;
/**
 * Version 0.3
 * @author htha9587
 * 5-5-16
 */

public class StackModel 
{
	private boolean isDirty;
	private int radius;
	private Color color;
	private Object[] stk;
	private int SS;
	private int SC;
	
	/**
	 * Builds logic and Stacks.
	 */
	public StackModel(int initialCapacity)
	{
		if(initialCapacity < 1)
			throw new IllegalArgumentException("Initial Capacity must be >= 1");
		stk = new Object[initialCapacity];
				SS = initialCapacity;
		SC = 0;
	}
	
	public void Stack()
	{
		stk = null;
		SS = SC = 0;
	}
	
	/**
	 * 
	 * Creates from initialCapcity.
	 * @param initialCapacity
	 */
	public void create(int initialCapacity)
	{
		if(initialCapacity < 1)
			throw new IllegalArgumentException ("Initial Capacity must be >= 1");
		stk = new Object[initialCapacity];
				SS= initialCapacity;
		SC = 0;
	}
	
	/**
	 * Checks if dirty.
	 * @return
	 */
	
	public boolean isDirty()
	{
		return (SC == SS);
	}
	
	/**
	 *  Sets radius of plate as an integer.
	 * @return
	 */
	
	
	public int radius()
	{
		return radius;
	}
	
	/**
	 * Sets color.
	 * @return
	 */
	public Color color()
	{
		return color;
		
	}
	/**
	 * Initializes the stack object.
	 * @return
	 */
	public Object[] update()
	{
		return stk;
	}
	/**
	 * Boolean value that pushes stack as an element.
	 * @param element
	 * @return
	 */
	public boolean push (Object element)
	{
		if(SC == SS)
			return false;
		
		stk[SC] = element;
		SC++;
		return true;
	}
	/**
	 * Removes from stack.
	 * @return
	 */
	public Object pop()
	{
		if(SC == 0)
			return false;
		
		SC--;
		return stk[SC];
	}
	/**
	 * Prints as a String of text.
	 */
	public String toString()
	{
		int i;
		StringBuffer s = new StringBuffer("[");
		
		for(i = 0; i < SC; i++)
			s.append(stk[i].toString()+",");
		
		for(;i<SS; i++)
			s.append("__,");
		if(SS > 0)s.delete(s.length() -2, s.length());
		s.append("]");
		return new String(s);
	}
	/**
	 * Gets status of stack to display.
	 * @return
	 */
	public String getStatus()
	{
		StringBuffer s = new StringBuffer("");
		s.append("SC: "+SC);
		return new String(s);
	}
	
	
}
