import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class TimeOver extends JDialog implements ActionListener{
	ImageIcon timeover=new ImageIcon("timeover.png");
	Color btn = new Color(234, 234, 234);
	JButton reset=new JButton("RESTART");
	JButton exit=new JButton("EXIT");
	int score;
	
	public TimeOver(int num) {
		score=num;
		JLabel score_l=new JLabel("Score: "+num);
		score_l.setFont(new Font("SanSerif", Font.BOLD, 18));
		score_l.setBounds(240,210,200,100);
		
		setTitle("TIME OVER");	
		setSize(600, 400);
		setLocation(500,250);
		setLayout(null);
		
		JLabel j1=new JLabel();
		j1.setIcon(timeover);
		j1.setBounds(150, 30, 300, 200);
	
		reset.setBackground(btn);
		exit.setBackground(btn);

		reset.setFont(new Font("SanSerif", Font.BOLD, 13));
		exit.setFont(new Font("SanSerif", Font.BOLD, 13));
		
		reset.setBounds(160,300,120,30);
		exit.setBounds(310,300,120,30);
        
		reset.addActionListener(this);
		exit.addActionListener(this);
		
		add(score_l);
		add(j1);
		add(reset);
		add(exit);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reset) {
			this.dispose();
			StartMain sm=new StartMain();	
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeOver g=new TimeOver(100);
	}
}