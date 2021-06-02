import java.awt.*;
import javax.swing.*;

public class SecondPageMain extends JFrame{
	Container content;
	SecondPage imgP;
	
	public SecondPageMain(String title){
		//super(title);
		imgP = new SecondPage();
		content = getContentPane();
		content.add(imgP, BorderLayout.CENTER);
		setSize(1100,800);
		setVisible(true);
	}
    public static void main(String[] args) {
        SecondPageMain sp = new SecondPageMain("Burger");
    }
}