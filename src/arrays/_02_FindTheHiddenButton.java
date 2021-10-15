/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	int nmber;
	
	Random random = new Random();
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	int[] stuff = new int[] {};
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String number = JOptionPane.showInputDialog(null, "Hey, uh could you please enter a number that isn't negative?");
		if(number.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Unbelievable");
		System.exit(0);
		}else if(number.equalsIgnoreCase("yes")||number.equalsIgnoreCase("sure")||number.equalsIgnoreCase("ok")||number.equalsIgnoreCase("okay")) {
			String newNumber = JOptionPane.showInputDialog(null, "Then enter it in the text box below.");
			nmber = Integer.parseInt(newNumber);
		System.out.println(nmber);
		}else {
			nmber = Integer.parseInt(number);
			System.out.println(nmber);
		
		}
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		
		int randomNum = random.nextInt(nmber-1);
		hiddenButton = randomNum;
		buttons = new JButton[nmber-1];
		//5. Make a for loop to iterate through the JButton array
			for(int i = 0; i < buttons.length; i++) {
				buttons[i] = new JButton();
				buttons[i].addActionListener(this);
				panel.add(buttons[i]);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			buttons[randomNum].setText("ME!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			buttons[randomNum].setText("");
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		 
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null,  "Ok. So to place this game, a button will quikly flash the letter ME!, and your job is to click that button. If you don't, then you die. ");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		hiddenButton = randomNum;
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
