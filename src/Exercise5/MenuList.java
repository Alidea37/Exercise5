package Exercise5;

/*

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
			
				// Create an object array of items	
					Object[] drinks = {"Water", "Tea", "Milk", "Soda Fountain", "Coffee", "Margarita", "Beer", "Red Wine", "White Wine", "Whiskey"};
					Object[] selections =  {"Porridge", "Steak", "Chicken", "Pork", "Fish", "Lamb", "Jumbo Shrimp", "Mexican Feed"};
					Object[] sides = {"extra porridge", "Steamed Vegetables", "Baked Potato Spuds", "Soup", "Salad", "Soup and Salad", "no sides"};
				
					
				// Creates a string for user's selection
					String beverage, order, extras = (String)JOptionPane.showInputDialog( // creates the drinks list
						
							null,
							"Please order from the menu:\n"
							+ "~* Menu *~",
							"Ye Olde Cafe", // title of Menu
							JOptionPane.PLAIN_MESSAGE, // creates the dialog box
							null,
							drinks, selections, sides,
							" and extra porridge");
		
					try
					{
					outFileStream = new FileOutputStream(myoutfile); // creates new outFile
					PrintWriter outStream = new PrintWriter(outFileStream); // creates PrintWriter to write to file
					
						// Create a message displaying the order	
						String message = String.format("You have selected %s.", beverage, order, extras);
						outStream.println("The user selected " +beverage+" " +order+" "+extras+ ".");		
						// display the message
						JOptionPane.showMessageDialog(null,  message); 
						
						outStream.close();
					}
						catch(FileNotFoundException e){
						e.printStackTrace();
					
						}
							}
								}
	
	
	
	
	
}  **/
