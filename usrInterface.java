package hoja2;

public class usrInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new postCalc();
		String linea = "*4+";
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
