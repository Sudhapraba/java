import java.util.*;

 class Big
 {
   public static void main(String args[])
   {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the value of a: ");
    int a= scan.nextInt();
    System.out.println("Enter the value of b: ");
    int b= scan.nextInt();
    System.out.println("Enter the value of c: ");
    int c= scan.nextInt();
    if(a>b)
     {
     if(a>c)
     System.out.println("Biggest number:"+a);
     else
     System.out.println("Biggest number:"+c);
     }
    else
     {
     if(b>c)
     System.out.println("Biggest number:"+b);
     else
     System.out.println("Biggest number:"+c);
     }
    }
 }
