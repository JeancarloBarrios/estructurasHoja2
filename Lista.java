public interface Lista<E> 
{
   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements
    
   public void addFirst(E value);
   // post: value is added to beginning of list
   
   public E removeFirst();
   //pre: !empty
   //post: return value from beginning of list
   
   public E getFirst();
   //post: return value of first item
   //		else, return NULL
}
