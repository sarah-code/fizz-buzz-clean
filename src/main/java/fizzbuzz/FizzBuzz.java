package fizzbuzz;

public class FizzBuzz {
	
	public static void main (String args[])
	{
		for(int i= 1 ; i <=100; i++)
		{
			
			System.out.println(is0WhenModulo3And5(i));
						
		}
	}
	
	public static String is0WhenModulo3And5(int i)
	{
		return (modulo3(i) && modulo5(i)) ? "fizz buzz" : is0WhenModulo5(i);
		
	}
	
	public static String is0WhenModulo5(int i)
	{
		return  modulo5(i)? "buzz" : is0WhenModulo3(i);
		
	}
	
	public static String is0WhenModulo3(int i)
	{
		return  modulo3(i) ? "fizz" : ""+i+"" ;
		
	}
	
	public static boolean modulo3 (int i)
	{
		return i % 3 ==0;
	}
	public static boolean modulo5 (int i)
	{
		return i % 5 ==0;
	}
}
