package Interface;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Console extends JPanel
{
	JTextArea logs = new JTextArea();
	JScrollPane scroll = new JScrollPane (logs, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	public Console()
	{
		logs.setEditable(false);
		logs.setColumns (65);
		logs.setRows(10);
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		
		constraint.gridx=0;
		constraint.gridy=0;
		constraint.gridwidth=1;
		this.add(new JLabel("Console"),constraint);
		
		constraint.gridx=0;
		constraint.gridy=1;
		constraint.gridwidth=3;
		this.add(scroll,constraint);
	}
}
