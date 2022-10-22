import java.util.*;
public class temp{
	public static void main(String[] args)
	{
		float Fahrenheit,Celsius,c,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp in celsius");
		Celsius=sc.nextFloat();
		f=((Celsius*9)/5)+32;
		System.out.println("in fahrenheit" +f);
		System.out.println("enter temp in fahrenheit");
		Fahrenheit=sc.nextFloat();
		c=((Fahrenheit-32)*5)/9;
		System.out.println("in celcius" +c);
	}
}

		