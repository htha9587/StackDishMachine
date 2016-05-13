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
import stackModel.Customer;
import stackModel.Dish;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class StackPanel extends JPanel
{
	private Stack<Object> dishes;
	private StackController baseController;
	private DefaultTableModel model;
	private JButton Exit;
	private JButton Push;
	private JButton Pop;
	private JButton setSize;
	private SpringLayout baseLayout;
	private JLabel StackLabel;
	private JPanel StackPanel;
	private JTable StackTable;
	private JScrollPane StackPane;
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
		dishes = new Stack<Object>();
		baseLayout.putConstraint(SpringLayout.WEST, Push, 157, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, Push, -56, SpringLayout.SOUTH, this);
		Pop = new JButton("Pop Stack");
		StackLabel = new JLabel("StackDishMachine");
		setSize = new JButton("Set size");
		baseLayout.putConstraint(SpringLayout.WEST, setSize, 168, SpringLayout.WEST, this);
		//StackPanel = new JPanel();
		//
		
		setBackground(Color.magenta);
		setUpTable();
		setUpPanel();
		setUpLayout();
		setUpListeners();
		
	}
	
	private void setUpTable() 
	{
		DefaultTableModel dishModel = new DefaultTableModel(baseController.getDishStackAsArray(), new String[]{"Dishes"});
		StackTable = new JTable(dishModel);
		StackPane = new JScrollPane(StackTable);
		baseLayout.putConstraint(SpringLayout.NORTH, StackPane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, StackPane, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, StackPane, 180, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, StackPane, -50, SpringLayout.EAST, this);
	}

	
	
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
		
		StackTable.setToolTipText("");
		StackTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		StackTable.setColumnSelectionAllowed(true);
		StackTable.setCellSelectionEnabled(true);
		StackTable.setForeground(Color.LIGHT_GRAY);
		StackTable.setBackground(new Color(0, 128, 0));
		
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
		add(StackPane);
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
		baseLayout.putConstraint(SpringLayout.NORTH, Exit, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, Exit, -92, SpringLayout.EAST, this);
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
	
	private void refresh() 
	// TODO Auto-generated method stub
{

Object[] q = dishes.toArray();


for(int i =0;i<dishes.size();i++){
 StackTable.setValueAt(new Dish(false, java.awt.Color.MAGENTA, 54), i, 0);

}

for(int i =0;i<=dishes.size()-1;i++){
    StackTable.setValueAt(q[i].toString(), i, 0);

}
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
				dishes.push(StackTable);
				PushField.setText("Pushed!");
				refresh();
				repaint();
			}

			
		}
	);
		
		Pop.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				{
					dishes.pop();
					PopFIeld.setText("Popped!");
					refresh();
					repaint();
				}
				
				}

			//
			}
		);
		
		

		setSize.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent click)
		{
			int p =0;
		try
		{
				p = Integer.parseInt(SizeField.getText());
				if(p!=0 && p<100)
				{
					 int size = p;
					dishes = new Stack();
					 model = new DefaultTableModel();
					model.addColumn("Stack       Size:"+p);
					for(int i = 0; i<=p; i++)
				{
						model.addRow(new Object[]{dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54))});
					}
					StackTable.setModel(model);
				}
		}
			catch(NumberFormatException numberFormatException)
			{
				SizeField.setText("Please enter a valid dish Size.");
			}
			SizeField.setText("");
			refresh();
		}

		
	}
);
			
		
		
	}
}
