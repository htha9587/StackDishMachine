package stackView;

/**
 * Version 0.1
 * @author htha9587
 * 5-3-16
 */
import java.awt.Color;
import java.awt.Panel;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import stackController.StackController;


public class StackPanel extends JPanel
{
	private StackController baseController;
	private StackPanel StackPanel;
	private JButton Exit;
	private JButton Push;
	private JButton Pop;
	private SpringLayout baseLayout;
	
	public StackPanel(StackController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		StackPanel = new StackPanel(baseController);
		
		setBackground(Color.magenta);
		setUpPanel();
		
	}
}
