/*
 * ------------------------------------------------------------------------------
 * Calculadora.java - Version 2016.2.0.0
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

import javax.swing.JOptionPane;

public class Calculadora {
	
//---------------------------------------MENU--------------------------------------------------------
public static void Menu()
{
	int opcion=0;
	do
	{
	opcion = JOptionPane.showOptionDialog(null,"SELECCIONE OPERACION","MENU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Suma y Resta","Salir"},"Salir");
	switch(opcion){
				case 0: Operaciones.SumaResta.sumarrestar();
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


