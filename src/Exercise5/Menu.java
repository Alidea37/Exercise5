package Exercise5;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.*;


//Customizing button text
// http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html#input

public class Menu {

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
							"Water");
		
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
	
					
		public static void entreeMenu()
		{		
			File myoutfile = new File("Menu.txt"); // creates a file
			FileOutputStream outFileStream;
			
		// Create a second object array of main dishes
			Object[] selections =  {"Porridge", "Steak", "Chicken", "Pork", "Fish", "Lamb", "Jumbo Shrimp", "Mexican Feed"};
		// creates String for user's first selection	
			String order = (String)JOptionPane.showInputDialog( // creates the selections list
					null, 
					"Please Select a main entre from the menu provided:\n"
					+ "~* Menu *~",
					"Ye Olde Cafe", // title of menu
					JOptionPane.PLAIN_MESSAGE, // creates the dialog box
					null, // if no selection is made
					selections,
					"Porridge");
		
			try
			{
			outFileStream = new FileOutputStream(myoutfile); // creates new outFile
			PrintWriter outStream = new PrintWriter(outFileStream); // creates PrintWriter to write to file
			
				// Create a message displaying the order	
				String message = String.format("You have selected %s.", order);
				outStream.println("The user selected " +order+ ".");		
				// display the message
				JOptionPane.showMessageDialog(null,  message); 

				outStream.close();
			}
			catch(FileNotFoundException e){
			e.printStackTrace();
		
			}
				}
					
		
			
		public static void sideMenu()
		{	
			File myoutfile = new File("Menu.txt"); // creates a file
			FileOutputStream outFileStream;
			
		// Create a third object array of side dishes	
			Object[] sides = {"extra porridge", "Steamed Vegetables", "Baked Potato Spuds", "Soup", "Salad", "Soup and Salad", "no sides"};
		// Creates a string for user's second selection
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
				String message = String.format("You have selected %s.", extras);
				outStream.println("The user selected " +extras+ ".");		
				// display the message
				JOptionPane.showMessageDialog(null,  message); 

				outStream.close();
			}
			catch(FileNotFoundException e){
			e.printStackTrace();
		
			}
				}
		
		



}
