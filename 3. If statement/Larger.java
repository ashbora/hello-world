import java.util.Scanner;
class Larger
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter first number :");
     int a = sc.nextInt();
     System.out.print("Enter second number :");
     int b = sc.nextInt();
     if(a>b)
     {
        System.out.println("Larger number is "+a);
     }
     else
     {
        System.out.println("Larger number is "+b);
     }
  }
}