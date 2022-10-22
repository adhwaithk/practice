package last;
import java.util.*;
public class program10 {
	public String dividetwonumbers(int number1, int number2)
	{
		int value=0;
		String str="";
		try
		{
			value=number1/number2;
			str=("the answer is " +value);
		}
		catch(ArithmeticException e)
		{
			str="division by zero is not possible";
		}
		finally
		{
			return(str+". thanks for using the application.");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		program10 div = new program10();
		System.out.print(div.dividetwonumbers(num1, num2));

	}

}
