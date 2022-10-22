import java.util.*;
public class ArrayException{
	public String getPriceDetails(){
	Scanner sc=new Scanner(System.in);
	try{
	System.out.println("enter the number of elements in the array");
	int size=sc.nextInt();
	int array[]=new int[size];
	System.out.println("enter the price details");
	for(int i=0;i<size;i++)
	{
	array[i]=sc.nextInt();
	}
	System.out.println("enter the index of the array element you want to access");
	int index=sc.nextInt();
	return "the array element is " +array[index];
	}
	catch(ArrayIndexOutOfBoundsException e){
	return "array index is out of range";
	}
	catch(InputMismatchException e){
	return "input was not in correct format";
	}
	}
	public static void main(String[] args){
	ArrayException obj=new ArrayException();
	System.out.println(obj.getPriceDetails());
}
}
