
package proyecto1;

import java.util.Scanner;

public class ordenamientonumeros 
{
   public static void main(String[] args) 
    {
    int n1,n2,n3;
    Scanner sn=new Scanner (System.in);
    System.out.println("Ingrese el primer numero: ");
    n1= sn.nextInt ();
    System.out.println("Ingrese el segundo numero: ");
    n2=sn.nextInt ();
    System.out.println("Ingrese el tercer numero: ");
    n3=sn.nextInt ();
    if ((n1>n2) && (n2>n3))
    {
        System.out.println("El numero mayor es: "+n1);
        System.out.println("El numero del medio es: "+n2);
        System.out.println("El numero menor es: "+n3);
    }
    else if ((n2>n1) && (n1>n3))
    {
        System.out.println("El numero mayor es: "+n2);
        System.out.println("El numero del medio es: "+n1);
        System.out.println("El numero menor es: "+n3);
    }
    else if ((n3>n2) && (n2>n1))
    {
        System.out.println("El numero mayor es: "+n3);
        System.out.println("El numero del medio es: "+n2);
        System.out.println("El numero menor es: "+n1);
    }    
    else if ((n1>n3) && (n3>n2))
    {
        System.out.println("El numero mayor es: "+n1);
        System.out.println("El numero del medio es: "+n3);
        System.out.println("El numero menor es: "+n2);
    }
    else if ((n3>n1) && (n1>n2))
    {
        System.out.println("El numero mayor es: "+n3);
        System.out.println("El numero del medio es: "+n1);
        System.out.println("El numero menor es: "+n2);
    }
    } 
}
