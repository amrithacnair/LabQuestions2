import java.util.*;
class MultiplicationTableProgram
{
public static void main(String[] args)
{
 int n,s;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Number:");
 n=sc.nextInt();
 System.out.println("The Multiplication Table");
 for(int i=1;i<=12;i++)
 {
  s=n*i;
  System.out.println(i+"   *   "+n+"   =   "+s);
 }
}
}
