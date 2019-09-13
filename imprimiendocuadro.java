
package proyecto1;

import java.util.Scanner;

public class imprimiendocuadro 
{
     public static void main(String[] args) 
     {
	int cantidad[][]=new int[4][4];
        Scanner entrada=new Scanner(System.in);
	for (int i=0;i<4;i++)
	{
		for (int j=0;j<4;j++)
		{
                        System.out.println("Digite un numero ["+i+"]["+i+"] \n");
			cantidad[i][j]=entrada.nextInt();
		}
	}
        System.out.println("\t\t\t imprimiendo...");
        
	for (int i=0;i<4;i++)
	{
		for (int j=0;j<4;j++)
		{
                        System.out.println("["+i+"]["+j+"]\n");
                        System.out.println(cantidad [i][j]+ "\n");
		}
                System.out.println("usted va en: \n");
	}
        System.out.println("matriz transpuesta \n");
        
	for (int i=0;i<4;i++)
	{
                System.out.println("*************************");
		
		for (int j=0;j<4;j++)
		{
                        System.out.println(" * ");
                        System.out.println(cantidad[j][i]+"* ");
		}
		
	}
	System.out.println("*************************");
}
}
