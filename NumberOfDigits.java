import java.util.*;
class NumberOfDigits{
public static void main(String[] args)
{
 int m,s=0,n;
 System.out.println("Enter the Number:");
 Scanner sc=new Scanner(System.in);
 m=sc.nextInt();
 while(m>0)
 {
  n=m%10;
  s++;
  m=m/10;
 }
 System.out.println("The Number of Digits:"+s);
}

}