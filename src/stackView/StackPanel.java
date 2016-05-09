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
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import stackController.StackController;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class StackPanel extends JPanel
{
	private StackController baseController;
	private JButton Exit;
	private JButton Push;
	private JButton Pop;
	private JButton setSize;
	private SpringLayout baseLayout;
	private JLabel StackLabel;
	private JPanel StackPanel;
	private JTable StackTable;
	private JTextField SizeField;
	private JTextField PushField;
	private JTextField PopField;
	private JTextField PopFIeld;
	
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
		baseLayout.putConstraint(SpringLayout.WEST, Push, 157, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, Push, -56, SpringLayout.SOUTH, this);
		Pop = new JButton("Pop Stack");
		StackLabel = new JLabel("StackDishMachine");
		setSize = new JButton("Set size");
		baseLayout.putConstraint(SpringLayout.WEST, setSize, 168, SpringLayout.WEST, this);
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
		this.add(setSize);
		//this.add(StackTable);
		JLabel StackLabel = new JLabel("StackDishMachine");
		StackLabel.setFont(new Font("Shree Devanagari 714", Font.BOLD, 20));
		add(StackLabel);
		StackTable = new JTable();
		StackTable.setToolTipText("");
		StackTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		StackTable.setColumnSelectionAllowed(true);
		StackTable.setCellSelectionEnabled(true);
		StackTable.setForeground(Color.LIGHT_GRAY);
		StackTable.setBackground(new Color(0, 128, 0));
		add(StackTable);
		SizeField = new JTextField();
		PopField = new JTextField();
		PopField.setColumns(10);
		add(SizeField);
		SizeField.setColumns(10);
		PushField = new JTextField();
		add(PushField);
		PushField.setColumns(10);
		PopFIeld = new JTextField();
		add(PopFIeld);
		PopFIeld.setColumns(10);
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
		baseLayout.putConstraint(SpringLayout.NORTH, Exit, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, Exit, -92, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, StackPanel, 6, SpringLayout.SOUTH, Exit);
		baseLayout.putConstraint(SpringLayout.WEST, StackPanel, -100, SpringLayout.WEST, Push);
		baseLayout.putConstraint(SpringLayout.SOUTH, StackPanel, -6, SpringLayout.NORTH, Push);
		baseLayout.putConstraint(SpringLayout.EAST, StackPanel, -74, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, Pop, 6, SpringLayout.SOUTH, Push);
		baseLayout.putConstraint(SpringLayout.WEST, Pop, 0, SpringLayout.WEST, Push);
		baseLayout.putConstraint(SpringLayout.SOUTH, setSize, -6, SpringLayout.NORTH, Push);
		baseLayout.putConstraint(SpringLayout.SOUTH, PopFIeld, 0, SpringLayout.SOUTH, Pop);
		baseLayout.putConstraint(SpringLayout.EAST, PopFIeld, 0, SpringLayout.EAST, SizeField);
		baseLayout.putConstraint(SpringLayout.NORTH, PushField, -1, SpringLayout.NORTH, Push);
		baseLayout.putConstraint(SpringLayout.WEST, PushField, 6, SpringLayout.EAST, Push);
		baseLayout.putConstraint(SpringLayout.NORTH, SizeField, 0, SpringLayout.NORTH, setSize);
		baseLayout.putConstraint(SpringLayout.WEST, SizeField, 3, SpringLayout.EAST, setSize);
		baseLayout.putConstraint(SpringLayout.NORTH, StackTable, 170, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, StackTable, 284, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, StackTable, -236, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, StackTable, -304, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, StackLabel, 10, SpringLayout.WEST, this);
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
				Stack a;
				PushField.setText("");
				refresh();
				
			}

			private void refresh() 
			{
				
			}
		});
		
		Pop.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				{
					
				}
				
				}
				
			}
		);
		
		
		
		
		
		setSize.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent click)
		{
			

		}
	});
		
		
	}
}
