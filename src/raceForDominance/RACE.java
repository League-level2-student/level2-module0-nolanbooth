package raceForDominance;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;

public class RACE implements ActionListener {
	boolean ableToBuild = true;
	String side;
	String answer;
	JButton button = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton check = new JButton();

	String[] typeOfVehicle = new String[] { "Armored Car", "Light Tank", "Heavy Tank", "Mechanized Infantry",
			"Infantry", "Anti-Tank", "Anti-Air", "Aritllery", "Destroyer", "Submarine", "Battleship" };
	String[] resourcesLabel = new String[] { "Money", "Oil", "Iron", "Goods", "Food" };
	int[] resourcesRed = new int[] { 5000, 1000, 1000, 1000, 1000 };
	int[] resourcesBlue = new int[] { 5000, 1000, 1000, 1000, 1000 };
	int[] armoredCar = new int[] { 1000, 500, 250, 300, 500 };
	int[] lightTank = new int[] { 1500, 750, 500, 500, 400 };
	int vehicleNum = 1;

	// Money, Oil, Iron, Goods, Food
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(button);
		panel.add(check);
		button.setText("Make Unit or Building");
		button.addActionListener(this);
		check.setText("CHECK RESOURCES");
		check.addActionListener(this);
		frame.setSize(900, 900);
		for (int i = 0; i < resourcesRed.length; i++) {
			System.out.print(resourcesLabel[i] + " " + resourcesRed[i] + ", ");
		}
		System.out.print("RED RESOURCES");
		System.out.println();

		for (int i = 0; i < resourcesRed.length; i++) {
			System.out.print(resourcesLabel[i] + " " + resourcesBlue[i] + ", ");
		}
		System.out.print("BLUE RESOURCES");

		for (int i = 0; i > resourcesRed.length; i++) {

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			make();
		}
		if (e.getSource() == check) {
			JOptionPane.showMessageDialog(null,
					"Money = " + resourcesBlue[0] + "|| Oil = " + resourcesBlue[1] + "|| Iron = " + resourcesBlue[2]
							+ "|| Goods = " + resourcesBlue[3] + "|| Food = " + resourcesBlue[4]);

		}

	}

	public void make() {
		side = JOptionPane.showInputDialog(null, "What side is this for?");
		if (side.equalsIgnoreCase("Blue")) {
			answer = JOptionPane.showInputDialog(null, "Hello Blue Commander. What do you want to build/produce?");
			if (answer.equalsIgnoreCase("Armored Car")) {
				for (int h = 0; h < resourcesBlue.length; h++) {
					if (resourcesBlue[h] >= armoredCar[h]) {
						ableToBuild = true;

					} else {
						ableToBuild = false;
						JOptionPane.showMessageDialog(null, "Not enough resources!");
						h = resourcesBlue.length;
					}

				}
				if (ableToBuild == true) {
					JOptionPane.showMessageDialog(null, "Resources Sufficient! Building Started!");
					vehicleNum = 0;
					System.out.println();
					for (int i = 0; i < resourcesBlue.length; i++) {
						resourcesBlue[i] -= armoredCar[i];

						System.out.print(resourcesLabel[i] + " " + resourcesBlue[i] + ", ");
					}
					System.out.print("BLUE RESOURCES");
					JOptionPane.showMessageDialog(null, typeOfVehicle[vehicleNum]
							+ " successfully created! You can see your resources left in the Console");

				}
			}
		}
	}
}
