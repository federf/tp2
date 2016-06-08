package tp2;
import static org.junit.Assert.*;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesServerUpdate {


	// pre-condition: we assume that every server satisfies repOK (server.repOK==true)
	@Theory
	public void testUpdate(@SimpleServerGen() Server s) {
		System.out.println("antes de update: "+s.toString());
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
		//System.out.println("-------------1 "+s.bans.toString());
		//System.out.println("antes: "+s.getLastUpdate());
		s.update();
		//System.out.println("-------------2 "+s.bans.toString());
		//System.out.println("despues: "+s.getLastUpdate());
		
		System.out.println("luego de update: "+s.toString());
		// new bans list size
		int newSize=s.bans.size;
		// if bans list has at least one element after update
		if(s.bans.header.next!=null){
			// this first element must have expires greater or equal to lastUpdate
			assertTrue(s.bans.header.next.element.expires.compareTo(s.getLastUpdate())>0);
		}
		// if at least one element was removed after update
		if(removesElements)
			// must be true that the old size of the bans list its bigger than the new size
			assertTrue(newSize<oldSize);
		// at the end of the test Server must have a valid representation (repOK must be true)
		assertTrue(s.repOK());
	}
}
