
public class ListFactory {
	public ListFactory(){
		//
	}
    public Lista getList(String s){
		
		//System.out.println("Which type of List?\n1.Single Linked List\n2.Double Linked List\n3.Circular List\nPick 1, 2 or 3"
        switch (s){
			
			case '1':	return new SinglyLinkedList();
						break;
			case '2':	return new DoublyLinkedList();
						break;
			case '3':	return new CircularList();
						break;
		}
	}
}