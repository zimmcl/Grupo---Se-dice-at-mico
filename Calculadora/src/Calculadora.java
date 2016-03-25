/*
 * ------------------------------------------------------------------------------
 * Calculadora.java - Version 2016.1.0.0
 *
 * Autores: Armando Gaspar, Ceballos Matias, Zimmel Ezeqiel
 *
 * Esta aplicación tiene la funcion de una calculadora simple, con suma,
 * resta, multiplicacion , division y porcentaje. Pudiendo editar la caja de  
 * texto, y devolviendo el resultado una vez precionado "Enter".
 *
 * 
 * Compilado: javac AppletCalculadora.java
 * ------------------------------------------------------------------------------
*/


import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Calculadora {

	private static  ArrayList<String> arreglo;
	private static  ArrayList<Double> arreglo2;
	private static  ArrayList<Double> arreglo3;
	private static  ArrayList<String> arreglo4;
	private static String strToken;
	
//--------------------------OPERACION SUMA Y RESTA---------------------------------------------------
public static void sumaresta()
{
	char aux=' ';
	double Resultado=0;
	double operador=0;
	arreglo = new ArrayList<String>();
	arreglo2 = new ArrayList<Double>();
	arreglo3 = new ArrayList<Double>();
	arreglo4 = new ArrayList<String>();
	
	//-INGRESA OPERACION POR TECLADO-
	strToken=JOptionPane.showInputDialog(null,"INGRESE LA OPERACION: ","Ingrese Operacion");
	//-VERIFICO OPERADOR "-" EN EL INICIO DE LA OPERACION
	if(strToken.charAt(0)=='-')
	{
		arreglo.add("0");
	}
	//-ALMACENO ELEMENTOS EN ARREGLO EXTRAIDOS DE LA CADENA "STRTOKEN"-
	for(int i=0;i<strToken.length();i++)
	{
		arreglo.add(Character.toString(strToken.charAt(i)));
	}
	arreglo.add("Fin");
	/*-VERIFICA EXISTENCIA DE OPERADOR "+" O "-". LUEGO AGRUPO OPERANDOS. Ejemplo: strToken->[1,2,+,3,1] -> arreglo->[12,+,31]
	   SE UTILZAN ARREGLOS AUXILIARES PARA TAL FIN-*/
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
	
	//-ELIMINO ULTIMO ELEMENTO DEFINIDO COMO "F"-
	arreglo4.remove(arreglo4.size()-1);
	arreglo3.add(Double.parseDouble(arreglo4.get(0)));
	//-RESUELVO OPERACION-
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
	JOptionPane.showMessageDialog(null, "OPERACION: "+strToken+" = "+Resultado);
}

//---------------------------------------MENU--------------------------------------------------------
public static void Menu()
{
	int opcion=0;
	do
	{
	opcion = JOptionPane.showOptionDialog(null,"SELECCIONE OPERACION","MENU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Suma y Resta","Salir"},"Salir");
	switch(opcion){
				case 0: sumaresta();
				break;
				case 1: JOptionPane.showMessageDialog(null,"Gracias por probar Calculadora V 2016.1.0.0");
				break;
				  }
	}while(opcion!=1);
}

public static void main( String args[] )
{ 
   Menu();
   System.exit(0);
} 

}


