package hoja2;

import java.util.Scanner;

public class usrInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new postCalc();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese una equacion postfix.\ne.g. 4 3 + 2 *\n");
		String linea = scan.nextLine();
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
