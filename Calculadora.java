public interface Calculadora {


    public void setString(String linea);
	// set a string recieved from main as the string to perform operations on
    
    public boolean calcularVector();
	//will realize all operations on integers in stack
	//tests for errors and shows errors inside

    public int getResultado();
	//return resultados que quedan en la pila
}
