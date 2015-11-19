package Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class MenuList {

	public static void drinkMenu(){ 
		{
			File myoutfile = new File("Menu.txt"); // creates a file
			FileOutputStream outFileStream;
			
				// Create an object array of bevarages	
					Object[] drinks = {"Water", "Tea", "Milk", "Soda Fountain", "Coffee", "Margarita", "Beer", "Red Wine", "White Wine", "Whiskey"};
				// Creates a string for user's second selection
					String beverage = (String)JOptionPane.showInputDialog( // creates the drinks list
							null,
							"Please select a beverage from the menu:\n"
							+ "~* Menu *~",
							"Ye Olde Cafe", // title of Menu
							JOptionPane.PLAIN_MESSAGE, // creates the dialog box
							null,
							drinks,
							" and extra porridge");
		
					try
					{
					outFileStream = new FileOutputStream(myoutfile); // creates new outFile
					PrintWriter outStream = new PrintWriter(outFileStream); // creates PrintWriter to write to file
					
						// Create a message displaying the order	
						String message = String.format("You have selected %s.", beverage);
						outStream.println("The user selected " +beverage+ ".");		
						// display the message
						JOptionPane.showMessageDialog(null,  message); 
						
						outStream.close();
					}
						catch(FileNotFoundException e){
						e.printStackTrace();
					
						}
							}
								}
	
	
	
	
	
}
