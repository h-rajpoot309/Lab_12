package rajpoot;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Rajpoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Scanner regInput=new Scanner(System.in);
			System.out.println("Enter your Username");
			String regName=regInput.nextLine();
			System.out.println("Enter your Pin");
			int regPin=regInput.nextInt();
			
			FileWriter fileWriter=new FileWriter("rajpoot1.txt");
			fileWriter.write(regName+"\n"+regPin);
			fileWriter.close();
			System.out.println("Regitrsation Completed");
			
					
			File myFile=new File("rajpoot1.txt");
			Scanner input=new Scanner(myFile);
			int i=1;int pin=0;String name=null;
			while(input.hasNextLine())
			{
				
				if(i==1)
				{
					name=input.nextLine();
					//System.out.println("Username="+name);
					i++;
				}
				else
				{
					pin=input.nextInt();
					//System.out.println("Pin="+pin);
				}
			}
			Scanner userInput=new Scanner(System.in);
			System.out.println("LOG IN");
			System.out.println("Enter your Username");
			String userName=userInput.nextLine();
			System.out.println("Enter your Pin");
			int userPin=userInput.nextInt();

			if (userName==name || userPin==pin)
			{
				System.out.println("Welcome to Bank Alfalah");
				System.out.println("You are now allowed to access your account");
			}
			else
				System.out.println("Incorrect Username or Pin!!");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}