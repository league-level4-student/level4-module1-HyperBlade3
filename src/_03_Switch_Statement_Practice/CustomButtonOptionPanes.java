package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch (choice) {
			case "Monday": 
				System.out.println("A");
				break;
			case "Tuesday":
				System.out.println("B");
				break;
			case "Wednesday":
				System.out.println("C");
				break;
			case "Thursday":
				System.out.println("D");
				break;
			case "Friday":
				System.out.println("E");
				break;
			case "Saturday":
				System.out.println("F");
				break;
			case "Sunday":
				System.out.println("G");
				break;
		
			default:
				System.out.println("Something went wrong");
				break;
		}
		
	}
}
