import java.util.Scanner;


public class postCalc implements Calculadora {
	Scanner scn = new Scanner(System.in);
	StackFactory stackF = new StackFactory();

	//Stack para guardar datos y resultado
	protected Stack vec;
	protected String input;
    
	public postCalc(){
	System.out.println("\n1. Stack Vector\n2. Stack ArrayList\n3. Stack List\n Please enter 1,2 or 3: ");
	String choice=scn.nextLine();
    
	
	vec = stackF.getStack(choice);
    //String con entrada para calcular
	input = "";
    }
    
    
    
    @Override
    public void setString(String linea) {
	input = linea;
	
    }

	@Override
	public boolean calcularVector() {
		//x,y para realizar operaciones
		int x,y;
		//error defaults to false
		boolean error = false;
		//run length of the string, putting digits into vector as int
		//calculate operations as necessary
		//skip white spaces
		//invalid inputs break loop and return error
		for (int i=0; i<input.length(); i++){
			//los dos requisitos para cualquier operacion aritmetica son:
			//que sea + , *  /
			//que existen al menos 2 objetos en el stack
			
			//por los operadores, pop to x, pop to y, realizar operacion
			//push resultados al stack
			if (input.charAt(i)=='+' && vec.size()>=2){
				x = (int) vec.pop();
				y = (int) vec.pop();
				x = x + y;
				vec.push(x);
			}
			else if (input.charAt(i)==('-') && vec.size()>=2){
				x = (int) vec.pop();
				y = (int) vec.pop();
				x = x - y;
				vec.push(x);
		    }
			else if (input.charAt(i)=='/' && vec.size()>=2){
				x = (int) vec.pop();
				y = (int) vec.pop();
				//ensegurar que no hay division por 0
				//si hay, mostrar error y break loop
				if (y==0) {
					error = true;
					System.out.println("Divission por cero");
					break;
				}
				
				x = x / y;
				vec.push(x);
		    }
			else if (input.charAt(i)=='*' && vec.size()>=2){
				x = (int) vec.pop();
				y = (int) vec.pop();
				x = x * y;
				vec.push(x);
		    }
			//por white space, no haga nada
			else if (input.charAt(i)==' '){
			
			}
			//por numeros, push al stack como integer
			else if (Character.isDigit(input.charAt(i))){
				vec.push(Character.getNumericValue(input.charAt(i)));
			}
			
			//llega a "else" si:
			//operador, pero menos que 2 objetos en el stack
			//es una letra o operador no valido
			else{

				System.out.println("Solamente puede ingresar 0-9, + , - , * , /");

				System.out.println("Error de entrada!");
				error = true;
				break;
			}
		
		}
		//si al terminar, no hay 1 exacto objeto en el Stack, habia una error
		//muestra error
		if (vec.size()!=1){
			error=true;
			System.out.println("ERROR: Revisar entrada.\nCantidad de operadores y numeros no coinciden");
		}
		return error;
	}
		

	@Override
	//just returns what's in the stack as result
	public int getResultado() {
		return (int) vec.pop();
	}

}
