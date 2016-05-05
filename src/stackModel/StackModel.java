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
	
	public void create(int initialCapacity)
	{
		if(initialCapacity < 1)
			throw new IllegalArgumentException ("Initial Capacity must be >= 1");
		stk = new Object[initialCapacity];
				SS= initialCapacity;
		SC = 0;
	}
	
	public boolean isDirty()
	{
		return (SC == SS);
	}
	
	
	
	
	public int radius()
	{
		return radius;
	}
	
	
	public Color color()
	{
		return color;
		
	}
	
}
