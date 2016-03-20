
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
//import java.lang.Object;

public class Calculadora {
	private static  ArrayList<String> arreglo;
	private static Scanner sc;
	private static String strToken;
	private static int A;   
	private static char op;   
	//private static int Resultado;

public Calculadora()
{
	
}
   public static void suma()
   {
	   
	   arreglo = new ArrayList<String>();
	   sc = new Scanner(System.in);
	   System.out.println(" INGRESE LA OPERACION: ");
	   strToken = sc.next();
	   //System.out.println(strToken);
	   for(int i=0;i<strToken.length();i++)
	   {     
		   arreglo.add(Character.toString(strToken.charAt(i)));		   
	   }
	   for(int i=0;i<strToken.length();i++)
	   {     
		   if(arreglo.get(i)!="+")
		   {
			   A=Integer.parseInt(arreglo.get(i));
		   }
		   if(arreglo.get(i)!="-")
		   {
			   A=Integer.parseInt(arreglo.get(i));
		   }
		   else
		   {
			   op=arreglo.get(i).charAt(i);
		   }
		  
	   }
	   System.out.println("El tamaño del arreglo es: "+arreglo.size());
	
	   
	   /*arreglo = new ArrayList<String>();
	   sc = new Scanner(System.in);
	   System.out.println(" INGRESE LA OPERACION: ");
	   strToken = sc.next();
	   //System.out.println(strToken);
	   for(int i=0;i<strToken.length();i++)
	   {		   
		   arreglo.add(Character.toString(strToken.charAt(i)));		   
	   }
	   System.out.println("El tamaño del arreglo es: "+arreglo.size());*/
	        
   }
  
   
   public static void main( String args[] )
   { 
      suma();
   } 
}