import java.util.*;
class LeapYear
{
 public static void main(String[] args)
 {
 int y;
 System.out.println("Enter the Year:");
 Scanner sc=new Scanner(System.in);
 y=sc.nextInt();
 if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
 {
   System.out.println( y +" ....Is Leap Year....");
 }
else
 {
   System.out.println(y+".....Is not Leap Year...");
 }
}
}