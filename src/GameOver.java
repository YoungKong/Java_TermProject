import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  


public class GameOver extends JDialog implements ActionListener{
	ImageIcon gameover=new ImageIcon("gameover.png");
	Color btn = new Color(234, 234, 234);
	JButton restart=new JButton("RESTART");
	JButton exit=new JButton("EXIT");
	
	public GameOver() {
	
		setTitle("GAME OVER");	
		setSize(600, 400);
		setLocation(500,250);
		setLayout(null);
		
		JLabel j1=new JLabel();
		j1.setIcon(gameover);
		j1.setBounds(150, 30, 300, 200);
	
		
		restart.setBackground(btn);
		exit.setBackground(btn);

		restart.setFont(new Font("SanSerif", Font.BOLD, 13));
		exit.setFont(new Font("SanSerif", Font.BOLD, 13));
		
		
		restart.setBounds(160,300,120,30);
		exit.setBounds(310,300,120,30);
        
		restart.addActionListener(this);
		exit.addActionListener(this);


		add(j1);
		add(restart);
		add(exit);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==restart) {
			this.dispose();
			StartMain sm=new StartMain();	
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
		
	}
	
}

