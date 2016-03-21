
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
	   double Resultado=0;
	   char auxi='0';
	   double operador1=0;
	   //double operador2=0;
	   double[] aux = new double[100];
	   double[] aux2 = new double [100];
	   arreglo = new ArrayList<String>();
	   sc = new Scanner(System.in);
	   System.out.println(" INGRESE LA OPERACION: ");
	   strToken = sc.next();
	   for(int i=0;i<=strToken.length()-1;i++)
	   {	
		     
		   if((strToken.charAt(i)!='+'&& strToken.charAt(i)!='-'))
		   {
			   aux[i]=Integer.parseInt(Character.toString(strToken.charAt(i)));
			   operador1=aux[i];
		   } 
		   else {
		   for(int j=0;j<i;j++)
		   {
			   aux2[j]=aux[i-j-1];
			   aux2[j]=(aux2[j]*Math.pow(10,j+1))/10;
			   operador1=operador1+aux2[j];
			   auxi=strToken.charAt(i);
		   }
		   if(i<strToken.length()-1)
		   {
			   arreglo.add(Double.toString(operador1));
			   arreglo.add(Character.toString(auxi));
			   operador1=0;	     
		   }
		   else
		   {arreglo.add(Double.toString(aux[i-1]));}
		   //VER!
		   		   }
		  
			   
		   //arreglo.add(Character.toString(strToken.charAt(i)));		   
	   }
	   //for(int i=0;i<2;i++)
	   
		   //System.out.println(arreglo.get(0));
	   
	   
	   for(int k=0; k<=arreglo.size();k++)
	   {
		   if(arreglo.get(k)=="+")
		   {
			   Resultado=Resultado+Double.parseDouble(arreglo.get(k-1))+Double.parseDouble(arreglo.get(k+1));
		   }
		   if(arreglo.get(k)=="-")
		   {
			   Resultado=Resultado-(Double.parseDouble(arreglo.get(k-1))-Double.parseDouble(arreglo.get(k+1)));
		   }
	   }
	   //System.out.println("El tamaño del arreglo es: "+arreglo.size());
	   
	   //System.out.println(operador1);
	   System.out.println(Resultado);
   }
  
   
   public static void main( String args[] )
   { 
      suma();
   } 
}