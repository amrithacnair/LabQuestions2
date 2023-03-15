import java.util.*;
class AlphabetOrNot
{
  public static void main(String[] args)
  {
    char c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Character ;");
    c=sc.nextLine().charAt(0);
    if(c>='a' && c<='z' || c>='A' && c<='Z')
     {
       System.out.println("The Character "+c+"  is Alphabet");
     }
     else
      {
        System.out.println("The Character "+c+"  is  not Alphabet");
       }
    }
}