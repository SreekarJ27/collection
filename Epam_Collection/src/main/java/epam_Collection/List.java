package epam_Collection;
import java.lang.instrument.Instrumentation;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

public class List{
	private static final org.apache.logging.log4j.Logger S =LogManager.getLogger(List.class);
	public static void main(String args[])
	{
		Scanner ama=new Scanner(System.in);
		Impli<Object> am=new Impli<Object>();
		while(true)
		{
			S.info("Select the options 1.print the list 2.add elements 3.delete paartular position 4.fetch data at position 5.break");
			int s=ama.nextInt();
			if(s==1)
			{
				
				S.info(am);
				
			}
			else if(s==2)
			{
				S.info("Enter the how many elements u want to add");
				int w=ama.nextInt();
				for(int i=0;i<w;i++)
				{
					am.adding(ama.next());
					
				}
				
				
			}
			else if(s==3)
			{
				S.info("Enter the position to delete at particualar index");
				int g=ama.nextInt();
				
				
				am.remove(g);
				
			}
			else if (s==4)
			{
				S.info("Enter the position to fetch the data or acess it");
				int g1=ama.nextInt();
				Object y1=am.getting(g1);
				S.info(y1);
				
				
			}
			else
			{
				break;
			}
			
			
		}
	}
}