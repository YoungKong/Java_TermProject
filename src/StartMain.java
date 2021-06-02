import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartMain extends JFrame {
	Container content;
	Start start;
	
	public StartMain() {
		start=new Start();
		content=getContentPane();
		content.add(start,BorderLayout.CENTER);
		setSize(600, 400);
		setTitle("청파버거");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(500,250);	
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartMain s=new StartMain();
	}
}
