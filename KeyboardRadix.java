import java.util.*;
import java.lang.*;
public class KeyboardRadix
{
  public static void main(String args[])
  {
   
   Scanner sc=new Scanner(System.in);
   sc.useRadix(3);
         
   int a=sc.nextInt();

   System.out.println(a);
  }
}
