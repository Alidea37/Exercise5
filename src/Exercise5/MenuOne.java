package Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
// code for drop down selection bar
//http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

public class MenuOne {

	private static int countgame = 0;
	
	public static void menuSelection(){ 
		{
			File myoutfile = new File("Menu.txt"); // creates a file
			FileOutputStream outFileStream;
	
			do
			{
					
				Object[] selections =  {"Water", "Wine", "Coffee", "Tea", "Soda_Fountain", "Steak", "Chicken", "Pork", "Fish", "Lamb", "Jumbo_Shrimp", "Mexican_Feed", "Steamed_Vegetables", "Baked_Potato_Spuds", "Soup", "Salad"};
			
					String order = (String)JOptionPane.showInputDialog( // creates the selections list
							null, 
							"Please Select an item from the menu provided:\n"
							+ "~* Menu *~",
							"Ye Olde Cafe", // title of menu
							JOptionPane.PLAIN_MESSAGE, // creates the dialog box
							null, // if no selection is made
							selections,
							"Porridge");
					{if (countgame < 3){
						countgame = countgame + 1;
	
			try
			{
			outFileStream = new FileOutputStream(myoutfile); // creates new outFile
			PrintWriter outStream = new PrintWriter(outFileStream); // creates PrintWriter to write to file
			
				
				// Create a message displaying the order	
				String message = String.format("You have selected %s.", order);
				outStream.println("The user selected " +order+".");		
				// display the message
				JOptionPane.showMessageDialog(null,  message); 

				outStream.close();
			}
			catch(FileNotFoundException e){
			e.printStackTrace();
		
			}
				}
					}
						} while(countgame < 3);
							}
								}}