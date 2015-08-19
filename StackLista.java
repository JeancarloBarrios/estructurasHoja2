import java.util.Scanner;


public class StackLista<E>
    implements Stack<E>
{
	protected Lista<E> data;
	Scanner in= new Scanner(System.in);
	ListFactory listF= new ListFactory();
	
	public StackLista()
	// post: constructs a new, empty stack
	{

		
		System.out.println("Which type of Stack?\n1.ArrayList\n2.Vector\n3.List\nPick 1, 2 or 3");
		String str= in.nextLine();				
		data = listF.getList(str);
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.addFirst(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.removeFirst();
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.getFirst();
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
    
}
