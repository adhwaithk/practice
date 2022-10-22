public class fib{
public static void main(String args[])
{
int n1=0,n2=1,n3,i,count=10;
System.out.print(n1);
System.out.println("");
System.out.print(n2);
System.out.println("");
for(i=2;i<count;++i)
{
n3=n1+n2;
System.out.print(""+n3);
System.out.println("");
n1=n2;
n2=n3;
}
}}