
package hoja2;


public class postCalc implements Calculadora {
    protected Stack vec = new StackVector();
    protected String input;
    public postCalc(){
	input = "";
    }
    
    
    
    @Override
    public void setString(String linea) {
	input = linea;
	
    }

	@Override
	public boolean calcularVector() {
		// TODO Auto-generated method stub
		int x,y;
		boolean error = false;
		for (int i=0; i<input.length(); i++){
			if (input.charAt(i)=='+'){
				x = vec.pop();
				y = vec.pop();
				x = x + y;
				vec.push(x);
			}
			else if (input.charAt(i)==('-')){
				x = vec.pop();
				y = vec.pop();
				x = x - y;
				vec.push(x);
		    }
			else if (input.charAt(i)=='/'){
				x = vec.pop();
				y = vec.pop();
				x = x / y;
				vec.push(x);
		    }
			else if (input.charAt(i)=='*'){
				x = vec.pop();
				y = vec.pop();
				x = x * y;
				vec.push(x);
		    }
			else if (input.charAt(i)==' '){
			
			}
			else if (Character.isDigit(input.charAt(i))){
				vec.push(Character.getNumericValue(input.charAt(i)));
			}
			else{
				System.out.println("Error de entrada!")
				error = true;
			}
		
		}
		if (vec.size()!=1){
			error=true;
			System.out.println("ERROR: Revisar entrada.\nCantidad de operadores y numeros no coinciden");
		return error;
	}

	@Override
	public int getResultado() {
		return vec.pop();
	}

}
