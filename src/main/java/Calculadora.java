package main.java;

/* ------------------------------------------------------------------------------
 * Calculadora.java*
 *
 * Autores: Armando Gaspar, 
 * 			Ceballos Matias, 
 * 			Zimmel Ezequiel
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
	opcion = JOptionPane.showOptionDialog(null,"SELECCIONE OPERACION","MENU",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Suma y Resta","Multiplicaci�n","Salir"},"Salir");
	switch(opcion){
				case 0: SumaResta.sumarrestar();
				break;
				case 1: Multiplicacion.multiplicar();
				break;
				case 2: JOptionPane.showMessageDialog(null,"Gracias por probar Calculadora");
				break;
				  }
	}while(opcion!=2);
}

public static void main( String args[] )
{ 
   Menu();
   System.exit(0);
} 

}

