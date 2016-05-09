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

	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	
	
	public void start()
	{
		doStuffToDishes();
		useTheCustomerQueue();
	}
	
	private void doStuffToDishes()
	{
		dishes = new Stack<Dish>();
		dishes.add(new Dish(true, java.awt.Color.BLACK, 8));
		dishes.pop();
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
	}
	
	private void useTheCustomerQueue()
	{
		customerQueue = new LinkedList<Customer>(false, "", 3234.3));
		customerQueue.remove();
	}
	
	
}
