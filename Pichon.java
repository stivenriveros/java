
package proyecto1;

import java.io.InputStream;
import java.util.Scanner;

public class Pichon {


   public static void main(String[] args) {
        Scanner pichon=new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
  
    int numero1 = pichon.nextInt();
    System.out.println("Ingrese el segundo numero");
    int numero2 = pichon.nextInt();
    while (numero2<=numero1)
    {
        System.out.println("Error! El segundo numero tiene que ser mayor que el primero");
        numero2=pichon.nextInt ();
    }
while (numero1<=numero2)
    {
             System.out.println(numero1);
             numero1++;
    
    
    
}
}
}

 
