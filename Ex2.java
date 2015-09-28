package ProjectEuler;

public class Ex2 {
	

	public static void main (String []geez)
	{
		
		long sum = 1,aux = 0,aux2 = 1, ans = 0;
		
		for(; sum < 4000000;)
			{ 
				sum = aux + aux2;
				if(sum%2==0)
				{
					ans += sum;
				}
				aux = aux2;
				aux2 = sum;
			}

		System.out.println(ans);
	}		
}
