package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

 
public class ActionEventDemo extends JFrame  {
	JButton btnExit;
	
	public ActionEventDemo() {
		super("ActionEvent Demo");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		btnExit = new JButton("Exit");
		btnExit.addActionListener( e -> this.dispose());
		Container c = getContentPane();
		c.add(btnExit, BorderLayout.PAGE_END);
	}

	public static void main(String[] args) {
	    ActionEventDemo f = new ActionEventDemo();
	    f.setSize(400,200);
	    f.setVisible(true);

	}

}
