package stackView;


/**
 * Version 0.1
 * @author htha9587
 * 5-3-16
 */

import javax.swing.*;

import java.*;
import java.awt.*;

import stackController.*;

public class StackFrame extends JFrame
{
	private StackController baseController;
	private StackPanel basePanel;
	
	
	/**
	 * Constructor for JFrame.
	 * @param drawController
	 */
	public StackFrame(StackController drawController)
	{
		this.baseController = drawController;
		basePanel = new StackPanel(drawController);
		setUpFrame();
	}

	

	
	/**
	 * Sets the frame.
	 */
	
	private void setUpFrame() 
	{
		this.setContentPane(basePanel);
		this.setResizable(true);
		this.setTitle("Stack Dish Machine");
		this.setSize(400, 400);
		this.setVisible(true);
		
	}
	
	public StackController getBaseController()
	{
		return baseController;
	}
	
	
}
