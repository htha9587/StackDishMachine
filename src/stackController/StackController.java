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
	public Stack<Dish> dishes;
	private StackFrame baseFrame;
	private StackModel baseModel;
	private StackPanel basePanel;
	

	
	public StackController()
	{
		dishes = new Stack<Dish>();
		doStuffToDishes();
		baseFrame = new StackFrame(this);
		baseModel = new StackModel(1);
	}
	
	public StackFrame getBaseFrame() {
		return baseFrame;
	}

	public void setBaseFrame(StackFrame baseFrame) {
		this.baseFrame = baseFrame;
	}

	public void start()
	{
		
		useTheCustomerQueue();
	}
	
	private void doStuffToDishes()
	{
		
		dishes.add(new Dish(true, java.awt.Color.BLACK, 8));
		dishes.pop();
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
	}
	
	private void useTheCustomerQueue()
	{
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(false, "", 3234.3));
		customerQueue.remove();
	}
	
	public Dish [] [] getDishStackAsArray()
	{
		Dish [] [] convertStack = new Dish[dishes.size()] [1];
		Queue<Dish> dishQueue = new LinkedList<Dish>();
		
		int size = dishes.size();
		for(int index = 0; index < size; index++)
		{
			convertStack[index] [0] = dishes.pop();
			dishQueue.add(convertStack[index][0]);
		}
		for(int index =0; index < convertStack.length; index++)
		{
			dishes.push(dishQueue.remove());
		}
		return convertStack;
	}
}
