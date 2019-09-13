
package proyecto1;

import java.util.Scanner;


public class ingreselaopcion 
{
    public static void main(String[] args) 
    {
        int opcion;
        System.out.println("Ingrese la opcion entre 1 y 5: \n");
        Scanner entrada=new Scanner (System.in);
        opcion=entrada.nextInt();
        switch(opcion)
        {
            case 1: System.out.println("Estoy en 1! \n");
            
            break;
            case 4: System.out.println("Estoy en 4! \n");
            
            break;
            case 3: System.out.println("Estoy en 3! \n");
            
            break;
            case 2: System.out.println("Estoy en 2 o 5! \n");
            case 5: System.out.println("Estoy en 2 o 5! \n");
                
            break;
            default: System.out.println("No estoy en nada! \n");
            break;
        }
    }
}
