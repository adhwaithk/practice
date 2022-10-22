import java.util.Scanner;
public class swap{
public static void main(String[] args){
System.out.println("enter two number");
		Scanner sc=new Scanner(System.in);
		int k;
		k=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		int g;
		g=sc1.nextInt();
		int i=1,mul=1;
		k=k+g;
		g=k-g;
		k=k-g;
		System.out.println("After Swapping");
		System.out.println(k);
		System.out.println("");
		System.out.println(g);
		

	}

}
