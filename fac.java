import java.util.*;

public class fac
{

public static long fac(int n)
{
   // System.out.println("Factorial (" + n + ")");
    if(n==0) //Base case.
    return 1;//^^^
    else
    return n * fac(n-1); //Calling itself
} //End Factorial

public static void main(String[] args)
{
	int num = Integer.parseInt(args[0]);
	System.out.println("Factorial "+num+": " + fac(num));
	System.out.println("The last digit is: " + fac(num)%10);
}

} //End Class

