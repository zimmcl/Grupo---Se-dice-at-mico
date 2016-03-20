
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
//import java.math;
//import java.lang.Object;

public class Calculadora {
	private static  ArrayList<String> arreglo;
	private static Scanner sc;
	private static String strToken; 
	

public Calculadora()
{
	
}
   public static void suma()
   {
	   //double Resultado=0;
	   double operador1=0;
	   double[] aux = new double[100];
	   double[] aux2 = new double [100];
	   arreglo = new ArrayList<String>();
	   sc = new Scanner(System.in);
	   System.out.println(" INGRESE LA OPERACION: ");
	   strToken = sc.next();
	   //System.out.println(strToken);
	   for(int i=0;i<strToken.length();i++)
	   {	
		   if(strToken.charAt(i)!='+'&& strToken.charAt(i)!='-')
		   {
			   aux[i]=Integer.parseInt(Character.toString(strToken.charAt(i)));
		   } else {
		   for(int j=0;j<i;j++)
		   {
			   aux2[j]=aux[i-j-1];
			   aux2[j]=(aux2[j]*Math.pow(10,j+1))/10;
			   operador1=operador1+aux2[j];
		   }
		  /* if(strToken.charAt(i)=='+')
		   {
			   Resultado = operador1+Integer.parseInt(arreglo.get(i));
		   }*/
		  // System.out.println(operador1+Integer.parseInt(arreglo.get(i)));
		   }
		   //arreglo.add(Character.toString(strToken.charAt(i)));		   
	   }
	   //System.out.println("El tamaño del arreglo es: "+arreglo.size());
	   
	   System.out.println(operador1); 
   }
  
   
   public static void main( String args[] )
   { 
      suma();
   } 
}