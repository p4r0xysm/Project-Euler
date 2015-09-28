package ProjectEuler;

public class Ex1 
{
	public static void main (String []geez){
	
		int cont = 1,sum = 0,aux;
		
		for(cont=1;cont < 1000;cont++)
		{
			
			if(cont%3==0 || cont%5==0)
			{
				aux = cont;
				System.out.println(aux);
				sum=cont+sum;
			}
			else
			{
				
			}
		}
		System.out.println(sum);
	}
}
