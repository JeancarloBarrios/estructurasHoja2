package hoja2;
//Jeancarlo Barrios 14652
//Dereck Olson 13207
//Cristian Del Carmen 12961
//Cristian Chilel 12417
//Usser Interface

import java.util.Scanner;

public class usrInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new postCalc();

		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("Ingrese una equacion postfix.\ne.g. 4 3 + 2 *\n to quit press q");
			String linea = scan.nextLine();
			if (linea.equals("q")) break;
			calc.setString(linea);
			boolean error = false;
			try
			{
			error = calc.calcularVector();//Protected code
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			   System.out.println("Invalid input");//Catch block
			}
			
			if (error==false){
			System.out.println(calc.getResultado());
		
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}

}
