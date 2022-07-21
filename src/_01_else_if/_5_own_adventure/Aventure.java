package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Aventure {
public static void main(String[] args) {
	String q1 = JOptionPane.showInputDialog(null, "You see a bowl of ramen with some yummy pufferfish in it. Should you eat it?");
	if(q1.equals("yes")) {
		JOptionPane.showMessageDialog(null, "You eat the pufferfish ramen and ouch! You got pricked by the pufferfish! what a lazy chef... GAME OVER - poison from pufferfish");
	}
	else if(q1.equals("no")) {
		JOptionPane.showMessageDialog(null, "You decide to skip lunch.");
		String q2 = JOptionPane.showInputDialog(null, "You see a bowl of rice with a yummy egg on top. But there's a catch: the egg and rice sit on top of a box that says 'Totally free unsuspicious food.' Should you eat it?");
	if(q2.equals("yes")) {
		JOptionPane.showMessageDialog(null, "That egg was delicious!");
		String q3 = JOptionPane.showInputDialog(null, "Now, you come across a steaming bowl of soup! Whoever is making all of this food fo this, you almost caught them! But the question still remains: should you eat the bibimbap or not? ");
	if(q3.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Ouch! That soup was piping hot! GAME OVER - burning");
	if(q3.equals("no")) {
		JOptionPane.showInputDialog(null, "You skipped out on lunch. GAME OVER - starvation");
	}
	}
	}
	}
	if(q2.equals("no")) {
		JOptionPane.showMessageDialog(null, "Skipping out on TWO lunches? You need to feed yourself better! GAME OVER - starvation");
	}
}
	


	}


