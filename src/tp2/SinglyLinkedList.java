package tp2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.io.Serializable;


/**
 * Class  SinglyLinkedList defines Singly linked List
 * @author 
 */
public class SinglyLinkedList implements Serializable{


	public  static final long serialVersionUID = 1;  

	Entry header;
	int size = 0;


	public  SinglyLinkedList(){
		header = new Entry();
		size = 0;	
	} 

	public IP get(int index){
		Entry current = header.next;
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
	
	public boolean contains(IP ip){
		Entry current = header.next;
		while(current!=null){
			if(current.element.equals(ip))
				return true;
			current = current.next;
		}
		return false;
	} 
	
	//add the new IP at the first position.
	public void add (IP ip){
		Entry n = new Entry();
		n.element = new IP(ip.getFirst(), ip.getSecond(), ip.getThird(), ip.getFourth());
		Entry nn = header.next;
		n.next = nn;
		header.next = n;
		size++;
	} 
	
	 /**
     * This method removes a given IP iff it belongs to the current list.
     */
    public boolean remove(IP value){
    	if(!contains(value))
    		return false;
    	
    	Entry current = header.next.next;	
    	Entry prev = header.next;
    	while(current!=null){
    			if(current.element.equals(value)){
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
		String res = "(";
		if (header != null) {
			Entry cur = header.next;
			while (cur != null && cur != header) {
				res += cur.toString();
				cur = cur.next;
			}
		}
		return res + ")";
	}

	
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
		LinkedList<Entry> visited=new LinkedList<Entry>();
		
		// add header to the visited nodes list
		visited.add(header);
		
		// advance to the next element
		Entry current=header.next;
		
		// loop over the list searching for loops
		// and counting the elements visited until current element becomes null
		// and cant is lower or equal to size
		int cant=0;
		while(current!=null){
			// if current.element is null return false
			if(current.element==null)
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
