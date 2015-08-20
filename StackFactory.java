
public class StackFactory {
	public StackFactory(){
		//
	}
    public Stack getStack(String s){
		
		switch (s){
			
			case "1":	return new StackVector();
						
			case "2":	return new StackArrayList();
						
			case "3":	return new StackArrayList();
						 
		}
	return null;
	}
}