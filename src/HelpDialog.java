import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  

public class HelpDialog extends JDialog{
		JLabel txt = new JLabel("게임설명");

		JButton select1,select2;
		JButton btn = new JButton(new ImageIcon("close.PNG"));
		
		
		HelpDialog(JFrame owner, String title){
			super(owner, title);
			setLayout(null);
			select1= new JButton (new ImageIcon("select1.PNG"));
			select2= new JButton(new ImageIcon("select2.PNG"));
			add(select1);
			add(select2);
			add(txt);
			add(btn);
			select1.setBounds(90,40,100,30);  
			select2.setBounds(191,40,103,30);  
			btn.setBounds(143,140,104,30);  
      
			select1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(HelpDialog.this,new ImageIcon("rule2.PNG"));
					
				}
			});
			select2.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(HelpDialog.this,new ImageIcon("rule1.PNG"));
					
				}
			});
			btn.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					
				}
			});
		setLocation(300,100);  
        setSize(400,330);  
		}
}