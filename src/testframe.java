import javax.swing.*;

public class testframe extends JFrame{
	JButton btn;
	public testframe(int level) {
		super("테스트");
		if(level==1) {
			btn=new JButton("1");
		}
		else if(level==2) {
			btn=new JButton("2");
		}
		else {
			btn=new JButton("3");
		}
		add(btn);
		setSize(400,300);
		setVisible(true);
	}
}
