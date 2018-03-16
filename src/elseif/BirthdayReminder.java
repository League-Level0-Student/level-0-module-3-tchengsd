
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "March 29th";
		String dadsBirthday = "November 10th";
		String myBirthday = "July 5th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String hi = JOptionPane.showInputDialog("Whose birthday do you want to see?");
		// 3. Print out what the user typed
		System.out.println(hi);
		// 4. if user asked for "mom"
		if (hi.equals("mom")) {
			// print mom's birthday
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		else if (hi.equals("dad")) {
			// print dad's birthday
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
		else if (hi.equals("Tyler")) {
			// print myBirthday
			System.out.println(myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("¿El cumpleaños de quién?");
		}
	}
}