import java.util.Scanner;
class BiggestThreeNumbers
{
 public static void main(String[] args)
{
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter The First Number");
  a=sc.nextInt();
  System.out.println("Enter The Second Number");
  b=sc.nextInt();
  System.out.println("Enter The Third Number");
  c=sc.nextInt();
if((a>b)&(a>c))
 {
   System.out.println("The Number..."+a+"..is Big");
}
 else if((b>a)&(b>c))
   System.out.println("The Number ....."+b+"..is Big");
else
  System.out.println("The Number..."+c+"..is Big");
}
}