import java.util.*;
class FibonocciSeries
{
 public static void main(String[] args)
{
 int a=0,b=1,c=0,n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The limit");
 n=sc.nextInt();
 System.out.println("First "+n+"terns..");
System.out.println("Fibonacci Series");
System.out.println(a);
System.out.println(b);
for(int i=3;i<=n;i++)
{
 c=a+b;
 System.out.println(c);
 a=b;
 b=c;
}
}
}