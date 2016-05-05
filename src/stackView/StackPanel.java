package stackView;

/**
 * Version 0.1
 * @author htha9587
 * 5-3-16
 */
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import stackController.StackController;
import javax.swing.JLabel;
import java.awt.Font;


public class StackPanel extends JPanel
{
	private StackController baseController;
	private JButton Exit;
	private JButton Push;
	private JButton Pop;
	private SpringLayout baseLayout;
	private JLabel StackLabel;
	private JPanel StackPanel;
	
	/**
	 * Constructor for JPanel.
	 * @param baseController
	 */
	public StackPanel(StackController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		Exit = new JButton("Exit");
		Push = new JButton("Push Stack");
		Pop = new JButton("Pop Stack");
		StackLabel = new JLabel("StackDishMachine");
		StackPanel = new JPanel();
		setBackground(Color.magenta);
		setUpPanel();
		setUpLayout();
		setUpListeners();
		
	}
	/**
	 * Sets the panel.
	 */
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(Exit);
		this.add(Push);
		this.add(Pop);
		JPanel StackPanel = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, StackPanel, 6, SpringLayout.SOUTH, Exit);
		baseLayout.putConstraint(SpringLayout.WEST, StackPanel, -347, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, StackPanel, -6, SpringLayout.NORTH, Push);
		baseLayout.putConstraint(SpringLayout.EAST, StackPanel, -74, SpringLayout.EAST, this);
		StackPanel.setBackground(new Color(128, 128, 128));
		add(StackPanel);
		JLabel StackLabel = new JLabel("StackDishMachine");
		StackLabel.setFont(new Font("Shree Devanagari 714", Font.BOLD, 20));
		add(StackLabel);
	}
	
	/**
	 * Sets the layout.
	 */
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, StackLabel, 13, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, StackLabel, 29, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, StackLabel, 33, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, StackLabel, 236, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, StackPanel, 25, SpringLayout.SOUTH, Exit);
		baseLayout.putConstraint(SpringLayout.WEST, StackPanel, -30, SpringLayout.WEST, Push);
		baseLayout.putConstraint(SpringLayout.SOUTH, StackPanel, -11, SpringLayout.NORTH, Push);
		baseLayout.putConstraint(SpringLayout.EAST, StackPanel, -122, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, Push, 0, SpringLayout.WEST, Pop);
		baseLayout.putConstraint(SpringLayout.SOUTH, Push, -6, SpringLayout.NORTH, Pop);
		baseLayout.putConstraint(SpringLayout.NORTH, Pop, 236, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, Pop, -166, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, Exit, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, Exit, -92, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, StackPanel, 6, SpringLayout.SOUTH, Exit);
		baseLayout.putConstraint(SpringLayout.WEST, StackPanel, -100, SpringLayout.WEST, Push);
		baseLayout.putConstraint(SpringLayout.SOUTH, StackPanel, -6, SpringLayout.NORTH, Push);
		baseLayout.putConstraint(SpringLayout.EAST, StackPanel, -74, SpringLayout.EAST, this);
	}
	
	/**
	 * Sets the listeners.
	 */
	private void setUpListeners()
	{
		Exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.exit(0);
			}
		});
		
		Push.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		Pop.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		
	}
}
