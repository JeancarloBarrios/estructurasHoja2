/**
 * 
 */
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
				x = Character.getNumericValue((char) vec.pop());
				y = Character.getNumericValue((char) vec.pop());
				x = x + y;
				vec.push((char) x);
			}
			else if (input.charAt(i)==('-')){
				x = Character.getNumericValue((char) vec.pop());
				y = Character.getNumericValue((char) vec.pop());
				x = x - y;
				vec.push((char) x);
		    }
			else if (input.charAt(i)=='/'){
				x = Character.getNumericValue((char) vec.pop());
				y = Character.getNumericValue((char) vec.pop());
				x = x / y;
				vec.push((char) x);
		    }
			else if (input.charAt(i)=='*'){
				x = Character.getNumericValue((char) vec.pop());
				y = Character.getNumericValue((char) vec.pop());
				x = x * y;
				vec.push((char) x);
		    }
			else if (input.charAt(i)==' '){
			
			}
			else if (Character.isDigit(input.charAt(i))){
				vec.push(input.charAt(i));
			}
			else{
				error = true;
			}
		
		}
		return error;
	}

	@Override
	public int getResultado() {
		return Character.getNumericValue((char) vec.pop());
	}

}
