
public class ListFactory {
	public ListFactory(){
		//
	}
    public Lista getList(String s){

        switch (s){
			
			case "1":	return new SinglyLinkedList();
			case "2":	return new DoublyLinkedList();
			case "3":	return new CircularList();
		}
	return null;
	}
}