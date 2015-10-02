package PEuler;
import java.util.*;
public class Ex3 
{
	static long num = 0, pri = 2, qu = 0;
	static boolean tf = true;
	
	public static void main (String [] geez)
	{
		System.out.println("Ingrese un numero  usted desee :");
		Scanner key = new Scanner(System.in);
		num = key.nextLong();
		
		for(; num >= 1;)
		{
			prime(pri);
			if(tf == true)
			{
			if(num % pri == 0)
			{
				num = num / pri;
				System.out.println(pri);
			}
			else
			{
				pri++;
			}
			}
			else
			{
				pri++;
			}
		}
	}
	public static void prime(long ev)
	{
		for(int cc = 1; cc <= ev; cc++)
		{
			if(ev % cc == 0)
			{
				qu++;
			}
		}
		if(qu==2)
		{
			tf = true;
			qu=0;
		}
		else
		{
			qu = 0;
			tf = false;
		}
	}
}
