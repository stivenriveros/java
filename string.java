
package proyecto1;

import java.util.Scanner;

public class string 
{
    public static void main(String[] args) 
    {
    String palabra1= "El fin de semana \n";
    String palabra2="Como helado";
    System.out.println(palabra1+palabra2);
    Scanner sc=new Scanner (System.in);
    String nombre,apellido;
    System.out.println("Aplicativo para ingresarn tu nombre y apellido \n");
    System.out.println("Ingresa tu nombre");
    nombre=sc.nextLine ();
    System.out.println("\n Ingresa tu apellido \n");
    apellido=sc.nextLine ();
    System.out.println("Tu nombre es: " +nombre+ " Y tu apellido es: "+apellido);
    }

    }

