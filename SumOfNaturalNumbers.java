import java.util.*;
class SumOfNaturalNumbers
{
public static void main(String[] args)
{
 int n,s=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Limit:");
 n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
   s=s+i;
 }
 System.out.println("The sum is ....."+s);
}
}