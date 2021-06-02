import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class Firstpage extends JFrame
{  
    JLabel l;  
    JRadioButton oneLevel, twoLevel, threeLevel; 
    JButton b1,b2;  
    ButtonGroup bg; 
	JPanel textPanel;
	HelpDialog dialog;
    
    Firstpage(String s)  
    {  
        super(s);  
        l=new JLabel("*난이도를 선택하세요*");  
        add(l);  
       
		bg=new ButtonGroup();  
        oneLevel=new JRadioButton("level 하");     
        add(oneLevel);
		bg.add(oneLevel);
		twoLevel=new JRadioButton("level 중");     
        add(twoLevel);
		bg.add(twoLevel);  
		threeLevel=new JRadioButton("level 상");
        add(threeLevel);
		bg.add(threeLevel); 
		
        b1=new JButton(new ImageIcon("play.PNG"));  
        b2=new JButton(new ImageIcon("help.PNG"));  
        add(b1); add(b2);  
       
		l.setBounds(100,40,450,20);  
        oneLevel.setBounds(100,90,450,40);  
        twoLevel.setBounds(100,130,450,40);  
        threeLevel.setBounds(100,170,450,40);   
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,105,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,400);  

		dialog=new HelpDialog(this,"도움말");

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dialog.setVisible(true);
			}
		});
		getContentPane().add(b2);
    }  
	
	public static void main(String s[])  
		{  
			new Firstpage("TEST");  
		}  
}  


