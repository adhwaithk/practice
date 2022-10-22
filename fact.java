import java.util.Scanner;
public class fact{
public static void main(String[] args){
System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int k;
		k=sc.nextInt();
		int i=1,mul=1;
		while(k>0)
		{
			mul = mul*i;
			i++;
			k--;
		}
		System.out.println(mul);
		

	}

}
