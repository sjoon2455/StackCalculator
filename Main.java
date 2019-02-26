package cs206b;

import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    /*
      
    You can do your own test in this file.
    When you press 'run' button, then this main function runs.

		This main function is just an example.
		Feel free to modify this function for your own test.

    */
		
		StackCalculator calc = new StackCalculator();
		String postfix;
		String infix = "3.0 + 4 / 6";
		
		try {
			postfix = calc.changeToPostfix(infix);
		
			System.out.println(postfix);
		  System.out.println(calc.evaluate(postfix));
		
		} catch (UnbalancedParenthesisException e) {
			System.out.println(e.getMessage());
		} catch (DividedByZeroException e) {
			System.out.println(e.getMessage());
			
		}
		
  
  }
}




else{
  Node<T> a = new Node(element, cursor.getflink(), cursor);
  cursor.getflink().setblink(a);
  cursor.setflink(a);
  precursor = cursor;
  cursor = cursor.getflink();
}
