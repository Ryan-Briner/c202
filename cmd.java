import java.util.*;

public class cmd
{
	public static void main(String[] args)
	{
		if(args[0].equals("1"))
		{
			System.out.println(args[1]);
		}// If 1
		 if(args[0].equals("2"))
		{
			System.out.println(args[2]);
		}// If 2
		if(args[0].equals("3"))
		{
			System.out.println(args[3]);
		}// If 3
		if(args[0].equals("4"))
		{
			System.out.println(args[4]);
		}// If 4
		
		if(args[0].equals("-a"))
		{
			for(int i = 1; i < args.length; i++)
			{
				System.out.println(args[i]);
			}// For
		}// If -a
		if(args[0].equals("-i"))
		{
			System.out.println(args[1]+1);
		}
                if(args[0].equals("-h"))
                {
                    System.out.println("-a Prints all arguments");
                    System.out.println("-i adds 1 to all arguments");
                }
		

	} // Main

} // Class
