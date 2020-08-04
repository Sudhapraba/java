import java.util.*;
import java.util.Scanner;

 class DigitSum
 {
   public static void main(String args[])
   { 
     int num,a=0,sum=0;
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter a number: ");
     num=scan.nextInt();
     int i=num;
     while(i!=0)
     {
       a=i%10;
       i=i/10;
       sum=sum+a;
     }
     System.out.println("Sum of the digits of "+num+" is: "+sum);
   }
 }
