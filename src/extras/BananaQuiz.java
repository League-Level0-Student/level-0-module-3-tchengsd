//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String asdlj =	JOptionPane.showInputDialog("¿Te gusta plátanos?");
		//2. if they say no, 
		if(asdlj.equals("no")) {
			//tell them they are crazy 
		JOptionPane.showMessageDialog(null, "¡Tú eres loco!");	
		}
			//and end quiz
		//3. if they say yes
		else if(asdlj.equals("yes")) {
		//	ask them what is their favorite hobby
		String some =	JOptionPane.showInputDialog("¿Cuál es tu aficion favorito?");
		//	show a pop up that says "<your hobby> is much better with bananas!"
JOptionPane.showMessageDialog(null, "¡"+some+" es más bueno con los plátanos!");
		}
		//4. OPTIONAL: if they say something other than “yes” or “no”
		else {
		//	show a pop up that says “You are bananas!”
			JOptionPane.showMessageDialog(null, "¡Tú eres plátanos!");
		}
	}

}
