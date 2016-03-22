//CALCULADORA LIMITADA MODELO 2

import java.util.ArrayList;
import java.util.Scanner;


public class CalculadoraM2 {

	private static  ArrayList<String> arreglo;
	private static  ArrayList<Double> arreglo2;
	private static  ArrayList<Double> arreglo3;
	private static  ArrayList<String> arreglo4;
	private static Scanner sc;
	private static String strToken;
	


public static void suma()
{
	char aux=' ';
	double Resultado=0;
	double operador=0;
	arreglo = new ArrayList<String>();
	arreglo2 = new ArrayList<Double>();
	arreglo3 = new ArrayList<Double>();
	arreglo4 = new ArrayList<String>();
	sc = new Scanner(System.in);
	
	System.out.println("INGRESE LA OPERACION: ");
	strToken=sc.next();
	//Almaceno elementos en arreglo extraidos de la cadena strToken
	for(int i=0;i<strToken.length();i++)
	{
		arreglo.add(Character.toString(strToken.charAt(i)));
	}
	arreglo.add("Fin");
	//
	for(int i=0;i<arreglo.size();i++)
	{
		if(arreglo.get(i).equals("+") || arreglo.get(i).equals("-") || arreglo.get(i).equals("Fin"))
		   {
			for(int j=0;j<arreglo2.size();j++)
			{
			   arreglo3.add(j,Double.parseDouble(arreglo.get(i-j-1)));
			   arreglo3.add(j,(arreglo3.get(j)*Math.pow(10,j+1))/10);
			   operador=operador+arreglo3.get(j);
			   aux=arreglo.get(i).charAt(0);
			}
			
			if(i<=arreglo.size())
			   {
				   arreglo4.add(Double.toString(operador));
				   arreglo4.add(Character.toString(aux));
				   operador=0;
				   arreglo2.clear();
			   }
		   } 
		   else {
			   arreglo2.add((Double.parseDouble(arreglo.get(i))));
		   }
		   arreglo3.clear();
	}
	
	arreglo4.remove(arreglo4.size()-1);
	arreglo3.add(Double.parseDouble(arreglo4.get(0)));
	for(int k=0; k<arreglo4.size()-1;k++)
	   {
		   if(arreglo4.get(k+1).equals("+"))
		   {
			   Resultado=(arreglo3.get(0))+Double.parseDouble(arreglo4.get(k+2));
			   arreglo3.add(0,Resultado);
		   }
		   if(arreglo4.get(k+1).equals("-"))
		   {
			   Resultado=(arreglo3.get(0)-Double.parseDouble(arreglo4.get(k+2)));
			   arreglo3.add(0,Resultado);
		   }
	   }
	  
	   System.out.println(Resultado);
}
	


public static void main( String args[] )
{ 
   suma();
   System.exit(0);
} 

}