
package proyecto1;

import java.util.Scanner;

public class ordenamientoburbuja 
{
  public static void main(String[] args) 
    {
    int cantidad,i, j, fila, columna,auxiliar = 0;
    int vector[]=new int[50];
    Scanner entrada=new Scanner(System.in);
    System.out.println("Escriba la cantidad de elementos a ingresar \n");
    cantidad= entrada.nextInt();
    //llenamos el vector
    for (i=0;1<cantidad;i++)
    {
        System.out.println("\n Ingrese el numero en el indice del vector: "+ i+"\t");
        vector[i]= entrada.nextInt();
    }
    //se realiza la ordenacion de numeros
    for (fila=1;fila<=cantidad-1;fila++)
    {
        for (columna=1;columna<=cantidad-1;columna++)
        {
            if (vector[columna] > vector[columna+1])
            {
                auxiliar=vector[columna];
                vector[columna]=vector[columna+1];
                vector[columna+1]=auxiliar;
            }
        }
        //se imprimen los numeros 
        System.out.println("\n Ascendente: ");
    for (i =1;i<=cantidad;i++)
    {
        System.out.println(" "+vector[i]);
    }
    System.out.println("\n descendente: ");
    for (i=cantidad;i>=1;i--)
    {
        System.out.println(" "+vector[i]);
    }
    System.out.println("\n");
    } 
   } 
}
