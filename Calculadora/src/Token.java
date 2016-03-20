//Clase Token

public class Token {
	private static String dato;					//Datos de la clase
	public Token()														
		{
			//dato = "";								
		};
	public Token(String a)
		{
			dato = a;
		};								//CONSTRUCTORES CLASE TOKEN
																	
//--------------------------------------METODOS------------------------------------------------		
	public boolean esOperador()
		{
			if(dato=="+"||dato=="-"||dato=="*"||dato=="/"||dato=="^"||dato=="S")
			return true;
			else return false;
		}

	/*Devuelve TRUE si el elemento (string) en el token es un numero*/
	public boolean esNumero()
		{
			if(!esOperador())
			{
				return true;
			}else return false;
		}

	/*Devuelve un caracter que indica que operacion se desea realizar (operador)*/

	public char obtenerOp()
		{
			char operador='0';
			if(dato=="+"){operador='+';}
			else if(dato=="-"){operador='-';}
			else if(dato=="*"){operador='*';}
			else if(dato=="/"){operador='/';}
			else if(dato=="^"){operador='^';}
			else if(dato=="S"){operador='S';}
			else System.out.println(" ERROR EN EL OPERADOR ");
			return operador;
		}

	/*Devuelve el numero (entero) que guarda el token*/
	public int obtenerNum()
		{
			int operando=0;
			if(esNumero())
			{
				operando = Integer.parseInt(dato);
			}
			return operando;
		}
	/*Devuelve el string que almacena el token*/
	public String getString(){
			return dato;
		}
		
		
};	

