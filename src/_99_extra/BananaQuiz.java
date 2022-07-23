
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas 
		String i = JOptionPane.showInputDialog(null, "do you like bananas?");
		//2. if they say no, 
		if(i.equals("no")) {
			JOptionPane.showMessageDialog(null, "you are crazy");
		}
		if(i.equals("yes")) {
			String j = JOptionPane.showInputDialog(null, "what is your favorite hobby?");
		
		JOptionPane.showMessageDialog(null, j + " is better than bananas!");
		}
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}


