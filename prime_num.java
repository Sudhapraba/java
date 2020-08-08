import java.util.Scanner;

 class PrimeSum
 {
   public static void main(String args[])
   { 
    int s1,s2,i,j,temp;
     boolean isPrime=true;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the lower limit:");
     s1=s.nextInt();
     System.out.println("Enter the upper limit:");
     s2=s.nextInt();
     System.out.println("The prime numbers in between the entered limits are: ");
     for(i=s1;i<=s2;i++)
     {
       for(j=2;j<i;j++)
       {
         temp=i%j;
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
       {
         System.out.println(+i);
       }
     }
   }
 }
