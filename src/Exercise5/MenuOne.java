package Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class MenuOne {

	
	public static void menuSelection(){ 
		{
			File myoutfile = new File("Menu.txt"); // creates a file
			FileOutputStream outFileStream;
			
				// Create an object array of beverages	
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
							"Water");
						
				
					Object[] selections =  {"Porridge", "Steak", "Chicken", "Pork", "Fish", "Lamb", "Jumbo Shrimp", "Mexican Feed"};
			
					String order = (String)JOptionPane.showInputDialog( // creates the selections list
							null, 
							"Please Select a main entre from the menu provided:\n"
							+ "~* Menu *~",
							"Ye Olde Cafe", // title of menu
							JOptionPane.PLAIN_MESSAGE, // creates the dialog box
							null, // if no selection is made
							selections,
							"Porridge");
		
	
					Object[] sides = {"extra porridge", "Steamed Vegetables", "Baked Potato Spuds", "Soup", "Salad", "Soup and Salad", "no sides"};
		
					String extras = (String)JOptionPane.showInputDialog( // creates the sides list
							null,
							"Please select a side:\n"
							+ "~* Menu *~",
							"Ye Olde Cafe", // title of Menu
							JOptionPane.PLAIN_MESSAGE, // creates the dialog box
							null,
							sides,
							" and extra porridge");
		
			try
			{
			outFileStream = new FileOutputStream(myoutfile); // creates new outFile
			PrintWriter outStream = new PrintWriter(outFileStream); // creates PrintWriter to write to file
			
				// Create a message displaying the order	
				String message = String.format("You have selected %s.", beverage +", " + order +", and "+ extras);
				outStream.println("The user selected " +beverage+", "+order+", and "+extras+ ".");		
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
