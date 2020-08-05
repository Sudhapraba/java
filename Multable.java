import java.util.Scanner;

 class MulTable
 {
   public static void main(String args[])
   { 
    int n;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the table number: ");
    n=scan.nextInt();
    System.out.println("Multiplication table for "+n);
    System.out.println("----------------------");
    for(int i=1;i<=10;i++)
    {
      System.out.format("%2d*%d=%3d\n",i,n,i*n);
    }
   }
 }
