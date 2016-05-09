package stackController;

/**
 * Version 0.1
 * @author htha9587
 * 5-3-16
 */

import java.util.*;
import java.awt.*;

import stackModel.Customer;
import stackModel.Dish;
import stackModel.StackModel;
import stackView.StackFrame;
import stackView.StackPanel;
import stackController.StackRunner;
import javax.xml.soap.Node;

public  class StackController
{

	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	private StackFrame baseFrame;
	private StackModel baseModel;
	private StackPanel basePanel;
	

	
	public StackController()
	{
		baseFrame = new StackFrame(this);
		baseModel = new StackModel(0);
	}
	
	public StackFrame getBaseFrame() {
		return baseFrame;
	}

	public void setBaseFrame(StackFrame baseFrame) {
		this.baseFrame = baseFrame;
	}

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
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(false, "", 3234.3));
		customerQueue.remove();
	}
	
	
}
