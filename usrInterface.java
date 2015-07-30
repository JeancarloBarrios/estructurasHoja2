package hoja2;
//Jeancarlo Barrios 14652
//Dereck Olson 13207
//Cristian Del Carmen 12961
//Cristian Chilel 12417
//Usser Interface

import java.util.Scanner;

public class usrInterface {

	public static void main(String[] args) {
		//instanciar postCalc y scanner
		Calculadora calc = new postCalc();

		Scanner scan = new Scanner(System.in);
		
		//loop hasta que usuario desea terminar
		while (true){
			//pedir ecuacion con instrucciones
			System.out.println("Ingrese una ecuacion postfix.\ne.g. 4 3 + 2 *\n to quit press q");
			//guardar en linea
			String linea = scan.nextLine();
			//si ingresa 'a'
			//break loop, termina programa
			if (linea.equals("q")) break;
			
			//set linea como string para calc
			calc.setString(linea);
			//poner boolean como falso
			boolean error = false;
			
			//intentar a correr algoritmo
			try
			{
			error = calc.calcularVector();//Protected code
			}
		
			catch(ArrayIndexOutOfBoundsException e)
			{
			   System.out.println("Invalid input");//Catch block
			}
				
			//si no hay errores, mostrar resultados
			if (error==false){
			System.out.println(calc.getResultado());
			}
			
			//si hay error, mostrar error
			else {
				System.out.println("Invalid input");
			}
		}
	}

}
