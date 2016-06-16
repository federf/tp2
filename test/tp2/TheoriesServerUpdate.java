package tp2;
import static org.junit.Assert.*;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesServerUpdate {


	// pre-condition: we assume that every server satisfies repOK (server.repOK==true)
	@Theory
	public void testUpdateSizeOK(@SimpleServerGen() Server s) {
		// this field its true when at least one element might be removed from bans with update
		boolean removesElements=false;
		// bans old size
		int oldSize=s.bans.size; 
		// if bans has at least one element and
		// the first element might be removed from the list after update
		if(s.bans.header.next!=null){
			if(s.bans.header.next.element.expires.compareTo(s.getTime().getCurrentTime())<=0)					
				removesElements=true;
		}
		s.update();
		// new bans list size
		int newSize=s.bans.size;
		// if at least one element was removed after update
		if(removesElements){
			// must be true that the old size of the bans list its bigger than the new size
			assertTrue(newSize<oldSize);
		}else{
			assertTrue(newSize==oldSize);
		}
	}
	
	@Theory
	public void testUpdateRepOK(@SimpleServerGen() Server s) {
		s.update();
		// at the end of the test Server must have a valid representation (repOK must be true)
		assertTrue(s.repOK());
	}

}
