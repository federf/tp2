package tp2;
import static org.junit.Assert.*;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesServerUpdate {


	@Theory
	public void testUpdate(@SimpleServerGen() Server s) {
		System.out.println("-------------1 "+s.bans.toString());
		System.out.println("antes: "+s.getLastUpdate());
		s.update();
		System.out.println("-------------2 "+s.bans.toString());
		System.out.println("despues: "+s.getLastUpdate());
		if(s.bans.header.next!=null){
			System.out.println(s.bans.header.next.element.expires);
			assertTrue(s.bans.header.next.element.expires>=s.getLastUpdate());
		}
		System.out.println("afuera");
		assertTrue(s.repOK());
	}
}
