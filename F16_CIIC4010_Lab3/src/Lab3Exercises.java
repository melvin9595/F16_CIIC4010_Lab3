import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Melvin Malave");
	
		
		
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(900, 450);
		myFrame.setSize(200, 200);
		 Mypanelclass myPanel = new Mypanelclass();
         myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	
	
	}
}