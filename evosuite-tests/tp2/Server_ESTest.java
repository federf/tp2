/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 13 19:53:18 ART 2016
 */

package tp2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import korat.finitization.impl.Finitization;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;
import tp2.Entry;
import tp2.IP;
import tp2.IPBan;
import tp2.ITime;
import tp2.Node;
import tp2.RealTime;
import tp2.Server;
import tp2.SinglyLinkedList;
import tp2.StrictlySortedSinglyLinkedList;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Server_ESTest extends Server_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Server server0 = new Server();
      IP iP0 = new IP((Integer) 0, (Integer) server0.bans.size, (Integer) 0, (Integer) server0.bans.size);
      boolean boolean0 = server0.addException(iP0);
      assertTrue(boolean0);
      
      boolean boolean1 = server0.removeException(iP0);
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1);
  }

  @Test
  public void test01()  throws Throwable  {
      Server server0 = new Server();
      StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = server0.bans;
      strictlySortedSinglyLinkedList0.size = (-3915);
      server0.update();
      //  // Unstable assertion: assertEquals(1465858390297L, server0.getLastUpdate());
  }

  @Test
  public void test02()  throws Throwable  {
      Server server0 = new Server();
      server0.bans = null;
      // Undeclared exception!
      try { 
        server0.update();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.Server", e);
      }
  }

  @Test
  public void test03()  throws Throwable  {
      Server server0 = new Server();
      server0.bans = null;
      // Undeclared exception!
      try { 
        server0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.Server", e);
      }
  }

  @Test
  public void test04()  throws Throwable  {
      Server server0 = new Server();
      SinglyLinkedList singlyLinkedList0 = new SinglyLinkedList();
      server0.exceptions = singlyLinkedList0;
      server0.exceptions = null;
      // Undeclared exception!
      try { 
        server0.repOK();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.Server", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Server server0 = new Server();
      SinglyLinkedList singlyLinkedList0 = new SinglyLinkedList();
      server0.exceptions = singlyLinkedList0;
      Entry entry0 = new Entry();
      singlyLinkedList0.header = entry0;
      entry0.next = entry0;
      // Undeclared exception!
      try { 
        server0.removeException((IP) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.SinglyLinkedList", e);
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Server server0 = new Server();
      server0.bans = null;
      Integer integer0 = new Integer((-1));
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      // Undeclared exception!
      try { 
        server0.removeBan(iP0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.Server", e);
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Server server0 = new Server();
      server0.bans = null;
      // Undeclared exception!
      try { 
        server0.notSharedElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.Server", e);
      }
  }

  @Test
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Server.finServer(Integer.MAX_VALUE);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Server.finServer(1037);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 20, Size: 20
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Server server0 = new Server();
      server0.exceptions = null;
      // Undeclared exception!
      try { 
        server0.exceptionsNotRepeated();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.Server", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Server server0 = new Server();
      StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = server0.bans;
      IP iP0 = new IP((Integer) strictlySortedSinglyLinkedList0.size, (Integer) 0, (Integer) 0, (Integer) 0);
      Long long0 = Long.getLong("", (-567L));
      IPBan iPBan0 = new IPBan((IP) null, long0);
      server0.bans.add(iPBan0);
      // Undeclared exception!
      try { 
        server0.addException(iP0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.StrictlySortedSinglyLinkedList", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer((-4190));
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      iP0.setSecond((Integer) null);
      // Undeclared exception!
      try { 
        server0.addException(iP0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.IP", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.notSharedElements();
      assertTrue(boolean0);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test14()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(0);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addBan(iP0);
      boolean boolean1 = server0.notSharedElements();
      assertTrue(boolean1 == boolean0);
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1);
  }

  @Test
  public void test15()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.exceptionsNotRepeated();
      assertTrue(boolean0);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test16()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(0);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addBan(iP0);
      boolean boolean1 = server0.bansOkTime();
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test17()  throws Throwable  {
      Server server0 = new Server();
      StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = server0.bans;
      Node node0 = strictlySortedSinglyLinkedList0.header;
      node0.next = strictlySortedSinglyLinkedList0.header;
      // Undeclared exception!
      try { 
        server0.bansOkTime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("tp2.Server", e);
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.bansOkTime();
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.bansNotRepeatedExpirationOrIP();
      assertTrue(boolean0);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test20()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(0);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addBan(iP0);
      boolean boolean1 = server0.bansNotRepeatedExpirationOrIP();
      assertTrue(boolean1 == boolean0);
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1);
  }

  @Test
  public void test21()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(0);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addBan(iP0);
      boolean boolean1 = server0.bansSorted();
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test22()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.bansSorted();
      assertTrue(boolean0);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test23()  throws Throwable  {
      Server server0 = new Server();
      SinglyLinkedList singlyLinkedList0 = server0.exceptions;
      Integer integer0 = new Integer((-4190));
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      singlyLinkedList0.add(iP0);
      iP0.setSecond((Integer) null);
      boolean boolean0 = server0.addBan(iP0);
      boolean boolean1 = server0.notSharedElements();
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test24()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer((-1));
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addException(iP0);
      boolean boolean1 = server0.exceptionsNotRepeated();
      assertTrue(boolean1 == boolean0);
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1);
  }

  @Test
  public void test25()  throws Throwable  {
      Server server0 = new Server();
      SinglyLinkedList singlyLinkedList0 = new SinglyLinkedList();
      server0.exceptions = singlyLinkedList0;
      Entry entry0 = new Entry();
      singlyLinkedList0.header = entry0;
      entry0.next = entry0;
      boolean boolean0 = server0.exceptionsNotRepeated();
      assertEquals(0L, server0.getLastUpdate());
      assertFalse(boolean0);
  }

  @Test
  public void test26()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(0);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addBan(iP0);
      boolean boolean1 = server0.repOK();
      assertTrue(boolean1 == boolean0);
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1);
  }

  @Test
  public void test27()  throws Throwable  {
      Finitization finitization0 = (Finitization)Server.finServer(1);
      assertFalse(finitization0.areArraysHandledAsObjects());
  }

  @Test
  public void test28()  throws Throwable  {
      Server server0 = new Server();
      SinglyLinkedList singlyLinkedList0 = new SinglyLinkedList();
      server0.exceptions = singlyLinkedList0;
      Entry entry0 = new Entry();
      singlyLinkedList0.header = entry0;
      entry0.next = entry0;
      boolean boolean0 = server0.repOK();
      assertEquals(0L, server0.getLastUpdate());
      assertFalse(boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      Server server0 = new Server();
      StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new StrictlySortedSinglyLinkedList();
      server0.bans = strictlySortedSinglyLinkedList0;
      strictlySortedSinglyLinkedList0.size = 2;
      boolean boolean0 = server0.repOK();
      assertFalse(boolean0);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test30()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer((-4190));
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      server0.addBan(iP0);
      server0.update();
      //  // Unstable assertion: assertEquals(1465858388468L, server0.getLastUpdate());
  }

  @Test
  public void test31()  throws Throwable  {
      Server server0 = new Server();
      server0.update();
      long long0 = server0.getLastUpdate();
      //  // Unstable assertion: assertEquals(1465858388447L, long0);
  }

  @Test
  public void test32()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(160);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.removeBan(iP0);
      assertEquals(0L, server0.getLastUpdate());
      assertFalse(boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new StrictlySortedSinglyLinkedList();
      Server server0 = new Server();
      IP iP0 = new IP((Integer) 0, (Integer) 0, (Integer) 0, (Integer) strictlySortedSinglyLinkedList0.size);
      boolean boolean0 = server0.addBan(iP0);
      assertTrue(boolean0);
      
      boolean boolean1 = server0.removeBan(iP0);
      assertEquals(0L, server0.getLastUpdate());
      assertTrue(boolean1);
  }

  @Test
  public void test34()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(160);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addException(iP0);
      assertTrue(boolean0);
      
      boolean boolean1 = server0.addBan(iP0);
      assertFalse(boolean1);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test35()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer((-4190));
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addBan(iP0);
      boolean boolean1 = server0.addBan(iP0);
      assertFalse(boolean1 == boolean0);
      assertEquals(0L, server0.getLastUpdate());
      assertFalse(boolean1);
  }

  @Test
  public void test36()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.addBan((IP) null);
      assertEquals(0L, server0.getLastUpdate());
      assertFalse(boolean0);
  }

  @Test
  public void test37()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer(160);
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addException(iP0);
      boolean boolean1 = server0.addException(iP0);
      assertEquals(0L, server0.getLastUpdate());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test
  public void test38()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.addException((IP) null);
      assertFalse(boolean0);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test39()  throws Throwable  {
      Server server0 = new Server();
      Integer integer0 = new Integer((-4190));
      IP iP0 = new IP(integer0, integer0, integer0, integer0);
      boolean boolean0 = server0.addBan(iP0);
      assertTrue(boolean0);
      
      boolean boolean1 = server0.connect(iP0);
      assertFalse(boolean1);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test40()  throws Throwable  {
      Server server0 = new Server();
      boolean boolean0 = server0.connect((IP) null);
      assertTrue(boolean0);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test41()  throws Throwable  {
      Server server0 = new Server();
      server0.setTime((ITime) null);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test42()  throws Throwable  {
      Server server0 = new Server();
      RealTime realTime0 = (RealTime)server0.getTime();
      server0.setTime(realTime0);
      //  // Unstable assertion: assertEquals(1465858388070L, realTime0.getCurrentTime());
  }

  @Test
  public void test43()  throws Throwable  {
      Server server0 = new Server();
      server0.removeException((IP) null);
      assertEquals(0L, server0.getLastUpdate());
  }

  @Test
  public void test44()  throws Throwable  {
      Server server0 = new Server();
      String string0 = server0.toString();
      assertEquals("Server [lastUpdate=0, exceptions=(), bans={}]", string0);
  }

  @Test
  public void test45()  throws Throwable  {
      Server server0 = new Server();
      long long0 = server0.getLastUpdate();
      assertEquals(0L, long0);
  }
}
