import java.util.*;
import java.util.Scanner;

 class PrimeCheck
 {
   
   public static void main(String args[])
   {
    int temp;
    boolean isPrime=true;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=scan.nextInt();
    if(num>1)
    {
      for(int i=2;i<num;i++)
      {
      temp=num%i;
        if(temp==0)
        {
          isPrime=false;
                  break;
        }
        else
        {
          isPrime=true;
        }
      }
      if(isPrime)
       System.out.println(num+" is a prime number");
      else 
       System.out.println(num+" is not a prime number");
    }
    else
    System.out.println(num+" is not a prime number");
   }
 }
