package tp2;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import randoop.CheckRep;


/**
 * Class  StrictlySortedSinglyLinkedList defines Strictly Sorted, Singly linked List 
 * @author 
 */
public class StrictlySortedSinglyLinkedList implements Serializable{
	
    public  static final long serialVersionUID = 1; 

    public Node header;
    public int size = 0;
   
    public StrictlySortedSinglyLinkedList(){
    	header = new Node();
    	size = 0;
   }	

    /**
     * This method checks whether a given Integer value belongs to the current list.
     * @param value The element whose presence in this list is to be tested.
     * @return true iff value is in the current list.
     */
    public boolean contains(IPBan value){
    	Node current = header.next;	
    	while(current!=null && current.element.getExpires()== value.getExpires()){
    			if(current.element.getExpires()==value.getExpires())
    				return  true;
    			current = current.next;
       	} 
    	return false;
    	
    }
    
    /**
     * This method checks whether a given Integer value belongs to the current list.
     * @param value The element whose presence in this list is to be tested.
     * @return true iff value is in the current list.
     */
    public boolean containsIP(IP value){
    	Node current = header.next;	
    	while(current!=null){
    			if(current.element.getIp().equals(value))
    				return  true;
    			current = current.next;
       	} 
    	return false;
    	
    }
    
    /**
     * This method removes a given IP iff it belongs to the current list.
     */
    public boolean removeFromIP(IP value){
    	if (header.next == null) return false;
    	
    	Node current = header.next;	
    	Node prev = header;
    	while(current!=null){
    			if(current.element.getIp().equals(value)){
    				//remove ip
    				prev.next = current.next;
    				break;
    			}
    			current = current.next;
    			prev = prev.next;
       	} 
    	if(current!=null)
    		size--;
    	return true;
    	
    }

    public boolean add(IPBan value){
		Node current = header.next;	
		Node previous = header;
		if(value==null)
			return false;
	    while(current!=null && current.element.getExpires()< value.getExpires()){
			previous = current;		
			current = current.next;
	    }
		Node n = new Node();
		n.element =  value;
		//DUDA - CREO NO ESTA VOLVIENDO NULL EL CAMPO next DEL NUEVO NODO EN ESTE CASO
		if (current==null){
			previous.next = n;
			size++;
			return true;
		} 
		if(current.element.getExpires()==value.getExpires())
	    		return  false;
	
		if(current.element.getExpires()>value.getExpires()){
			previous.next = n;
			n.next = current;
			size++;
	  		return  true;
	    	}
		return true;
    		
    }

     public IPBan get(int index){
    	Node current = header.next;
    	int i = 0;
    	while(current!=null && i< index){
    		current = current .next;
    		i++;
    	}
    	if(current!=null){
    		return current.element;
       	}
    	return null;
    } 

    
    public int getSize(){
    	return size;
    }    
  	
    
    

    /**
 	 * Checks whether or not the current list has not elements.
     * @return true iff the current list is empty, false otherwise.
     */
    
    public boolean isEmpty(){
    	return header.next== null;
    }

    public String toString() {
        String res = "{";
        if (header != null) {
            Node cur = header.next;
            while (cur != null && cur != header) {
                res += cur.toString();
                cur = cur.next;
            }
        }
        return res + "}";
    }
 
    @CheckRep
    public boolean repOK(){
    	// this cant be null
    	if(this==null)
			return false;
    	// size must be zero o higher
    	if(size<0)
    		return false;
    	// header must be not null
		if(header==null)
			return false;
		// header's element must be null
		if(header.element!=null)
			return false;
		
		// "visited" nodes list
		LinkedList<Node> visited=new LinkedList<Node>();
		
		// add header to the visited nodes list
		visited.add(header);
		
		// advance to the next element
		Node current=header.next;
		
		// loop over the list searching for loops
		// and counting the elements visited until current element becomes null
		// and cant is lower or equal to size
		int cant=0;
		while(current!=null){
			// if current.element is null return false
			if(current.element==null)
				return false;
			// if current.element ip is null return false
			if(current.element.ip==null)
				return false;
			// if current.element expires is null return false
			if(current.element.expires==null)
				return false;
			// if current was already visited return false (there exists a loop)
			if(visited.contains(current))
				return false;
			// otherwise add current node to the visited nodes list
			visited.add(current);
			// increase cant counter
			cant++;
			// advance current to the next element of the list and try to loop again
			current=current.next;
		}
		// if the list has no loops return if the size of the list equals the amount of elements visited
		return cant==size;
    }
}//End Class
