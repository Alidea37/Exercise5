package Exercise5;
//Fig. 15.6 ReadTextFile.java p. 647-648

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadMenu {

	
	private static Scanner myscanner;
	
	public static void openFile()
	{
		try
		{
			myscanner = new Scanner(Paths.get("Menu.txt"));
		}
		catch ( IOException ioException)
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}
	// read record from file
		public static void readRecords()
			{
			
			File myoutfile2 = new File("MenuReWrite.txt"); // creates a file
			FileOutputStream outFileStream2;
			
			
			try
			{
				
				while (myscanner.hasNext()) // while there is more to read
				{	
				outFileStream2 = new FileOutputStream(myoutfile2); // creates new outFile
				PrintWriter outStream = new PrintWriter(outFileStream2); // creates PrintWriter to write to file
					
					// display record contents
					System.out.printf(" %s", myscanner.next(), ".");
					outStream.printf("The order is %s%n", myscanner.next() );
					
					
					if (outStream != null)
						outStream.close();		
			}
		}
		catch (NoSuchElementException elementException)
		{
			System.err.println("File improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException)
		{
			System.err.println("Error reading from file. Terminating.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}


		// close file and terminate application
		public static void closeFile()
		{
			if (myscanner != null)
				myscanner.close();
			
		}} // end method readRecords

	

