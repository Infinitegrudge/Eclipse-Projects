package morsecode;
import java.util.*;

import javax.swing.JOptionPane;
public class MorseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> mydict = new Hashtable<String,String>();
		mydict.put("a", ".-");
		mydict.put("b", "-…");
		mydict.put("c", "-.-.");
		mydict.put("d", "-..");
		mydict.put("e", ".");
		mydict.put("f", "..-.");
		mydict.put("g", "--.");
		mydict.put("h", "….");
		mydict.put("i", "..");
		mydict.put("j", ".---");
		mydict.put("k", "-.-");
		mydict.put("l", ".-..");
		mydict.put("m", "--");
		mydict.put("n", "-.");
		mydict.put("o", "---");
		mydict.put("p", ".--.");
		mydict.put("q", "--.-");
		mydict.put("r", ".-.");
		mydict.put("s", "…");
		mydict.put("t", "-");
		mydict.put("u", "..-");
		mydict.put("v", "…-");
		mydict.put("w", ".--");
		mydict.put("x", "-..-");
		mydict.put("y", "-.--");
		mydict.put("z", "--..");
		//1 = .----
		//2 = ..---
		//3 = …--
		//4 = ….-
		//5 = …..
		//6 = -….
		//7 = --…
		//8 = ---..
		//9 = ----.
		//0 = -----
		
		String input = JOptionPane.showInputDialog("Enter in your message in lower case");
		String[] toCut = input.split("(?!^)");
		String output = "";
		for (int i = 0; i <toCut.length;i++) {
			if (toCut[i] != " ") {
				output += mydict.get(toCut[i]);
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Your message is " + output);

	}

}
