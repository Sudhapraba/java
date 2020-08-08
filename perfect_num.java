import java.util.*;

 class Perfectnum
 {
   public static void main(String args[])
   { 
    int s;
    System.out.println("Number: ");
    for(int i=100;i<1000;i++)
    {
      s=0;
      for(int j=1;j<=i/2;j++)
      {
        int r=i%j;
        if(r==0)
        s+=j;
      }
      if(s==i)
      System.out.println(+i);
    } 
   }
 }
