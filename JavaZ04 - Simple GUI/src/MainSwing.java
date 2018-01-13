import javax.swing.JFrame;

public class MainSwing extends JFrame{
	
	

	public static void main(String [] args) {
		
		JFrame myMainFrame = new MainSwing();
		myMainFrame.setTitle("I am the Title");
		myMainFrame.setSize(400, 500);
		myMainFrame.setLocation(100, 100);
		myMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myMainFrame.setVisible(true);
		
	}
}
