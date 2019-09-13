
package proyecto1;

import java.util.Scanner;

public class impares {
     public static void main(String[] args) 
{
        int a,b=0,c=1;
        Scanner n=new Scanner (System.in);
        System.out.println("Ingrese un numero");
        a=n.nextInt ();
  
if (a>21)
{
    while (b<20)
    {
        System.out.println(b);
        b=b+2;

    }
}
else
{
    while (c<10)
    {
        System.out.println(c);
        c=c+2;
    }
}  
}
}
