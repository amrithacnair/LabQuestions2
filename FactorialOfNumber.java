import java.util.*;
class FactorialOfNumber
{
public static void main(String[] args)
{
 int n,s=1;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Number:");
 n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
  s=s*i;
 }
System.out.println("The Factorial Of Number is..."+s);
}
}
