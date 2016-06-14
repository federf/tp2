package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }


    int i1 = java.lang.Integer.reverse(8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 262144);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 4);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1", 1107296261);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    int i4 = singlyLinkedList0.getSize();
    tp2.Server server5 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = iP17.equals((java.lang.Object)singlyLinkedList18);
    java.lang.Integer i20 = iP17.getThird();
    boolean b21 = strictlySortedSinglyLinkedList6.removeFromIP(iP17);
    boolean b22 = server5.removeException(iP17);
    server5.update();
    tp2.ITime iTime24 = null;
    server5.setTime(iTime24);
    tp2.ITime iTime26 = null;
    server5.setTime(iTime26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    iP33.setFirst((java.lang.Integer)0);
    iP33.setFourth((java.lang.Integer)7);
    boolean b40 = iP33.equals((java.lang.Object)"");
    boolean b41 = server5.addException(iP33);
    server5.update();
    tp2.Server server43 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList44.containsIP(iP49);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    boolean b57 = iP55.equals((java.lang.Object)singlyLinkedList56);
    java.lang.Integer i58 = iP55.getThird();
    boolean b59 = strictlySortedSinglyLinkedList44.removeFromIP(iP55);
    boolean b60 = server43.removeException(iP55);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b67 = strictlySortedSinglyLinkedList61.containsIP(iP66);
    tp2.IPBan iPBan69 = strictlySortedSinglyLinkedList61.get((-1));
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan76 = new tp2.IPBan(iP74, (java.lang.Long)100L);
    boolean b77 = strictlySortedSinglyLinkedList61.removeFromIP(iP74);
    boolean b78 = server43.addBan(iP74);
    iP74.setSecond((java.lang.Integer)41943073);
    iP74.setFirst((java.lang.Integer)27);
    iP74.setSecond((java.lang.Integer)11);
    boolean b85 = server5.addException(iP74);
    boolean b86 = singlyLinkedList0.contains(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 167772288+ "'", i58.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }


    int i2 = java.lang.Integer.compareUnsigned(1, (-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    iP35.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i43 = iP35.getThird();
    boolean b44 = server0.addException(iP35);
    boolean b45 = server0.notSharedElements();
    tp2.ITime iTime46 = null;
    server0.setTime(iTime46);
    tp2.Server server48 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList49 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b55 = strictlySortedSinglyLinkedList49.containsIP(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    boolean b62 = iP60.equals((java.lang.Object)singlyLinkedList61);
    java.lang.Integer i63 = iP60.getThird();
    boolean b64 = strictlySortedSinglyLinkedList49.removeFromIP(iP60);
    boolean b65 = server48.removeException(iP60);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b72 = strictlySortedSinglyLinkedList66.containsIP(iP71);
    tp2.IPBan iPBan74 = strictlySortedSinglyLinkedList66.get((-1));
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP79, (java.lang.Long)100L);
    boolean b82 = strictlySortedSinglyLinkedList66.removeFromIP(iP79);
    boolean b83 = server48.removeBan(iP79);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP79, (java.lang.Long)83886146L);
    boolean b86 = server0.addException(iP79);
    tp2.IP iP91 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList92 = new tp2.SinglyLinkedList();
    boolean b93 = iP91.equals((java.lang.Object)singlyLinkedList92);
    boolean b94 = server0.removeException(iP91);
    boolean b95 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 167772288+ "'", i63.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = singlyLinkedList0.contains(iP8);
    iP8.setFirst((java.lang.Integer)7);
    java.lang.Integer i12 = iP8.getSecond();
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    int i14 = singlyLinkedList13.getSize();
    tp2.IP iP16 = singlyLinkedList13.get(10);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList13.add(iP21);
    boolean b23 = iP8.equals((java.lang.Object)iP21);
    iP21.setFourth((java.lang.Integer)64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }


    int i1 = java.lang.Integer.parseUnsignedInt("2168455184");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2126512112));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483625), 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }


    int i2 = java.lang.Integer.compareUnsigned(1886470370, 41943076);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }


    int i1 = java.lang.Integer.reverse(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 402653184);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }


    int i1 = java.lang.Integer.signum(26214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    java.lang.Integer i14 = iP9.getThird();
    java.lang.Integer i15 = iP9.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b34 = iP28.equals((java.lang.Object)0);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    java.lang.Integer i52 = iP49.getThird();
    boolean b53 = strictlySortedSinglyLinkedList38.removeFromIP(iP49);
    int i54 = strictlySortedSinglyLinkedList38.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    java.lang.Integer i62 = iP60.getFourth();
    tp2.IPBan iPBan64 = new tp2.IPBan(iP60, (java.lang.Long)0L);
    boolean b65 = strictlySortedSinglyLinkedList38.add(iPBan64);
    boolean b66 = strictlySortedSinglyLinkedList0.contains(iPBan64);
    java.lang.Long long67 = iPBan64.getExpires();
    java.lang.Long long68 = iPBan64.getExpires();
    iPBan64.setExpires((java.lang.Long)7L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 167772288+ "'", i52.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 10+ "'", i62.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L+ "'", long67.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L+ "'", long68.equals(0L));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "56"+ "'", str1.equals("56"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }


    int i2 = java.lang.Integer.max(19, (-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }


    int i1 = java.lang.Integer.parseUnsignedInt("48");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 48);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    boolean b45 = strictlySortedSinglyLinkedList21.removeFromIP(iP42);
    boolean b46 = server0.addException(iP42);
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    int i49 = singlyLinkedList48.getSize();
    tp2.IP iP51 = singlyLinkedList48.get(10);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList48.add(iP56);
    int i58 = singlyLinkedList48.getSize();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483648), (java.lang.Integer)60000010, (java.lang.Integer)64, (java.lang.Integer)1073741824);
    singlyLinkedList48.add(iP63);
    iP63.setSecond((java.lang.Integer)17);
    java.lang.Integer i67 = iP63.getFirst();
    boolean b68 = server0.addBan(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-2147483648)+ "'", i67.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }


    long long1 = java.lang.Integer.toUnsignedLong(21884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 21884L);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }


    java.lang.Integer i1 = java.lang.Integer.decode("400000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 400000000+ "'", i1.equals(400000000));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }


    java.lang.String str1 = java.lang.Integer.toHexString(50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32"+ "'", str1.equals("32"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    java.lang.Integer i37 = iP30.getThird();
    java.lang.Integer i38 = iP30.getFirst();
    iP30.setFourth((java.lang.Integer)20971536);
    tp2.Server server41 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    java.lang.Integer i49 = iP47.getFourth();
    boolean b50 = server41.addException(iP47);
    boolean b51 = iP30.equals((java.lang.Object)iP47);
    boolean b52 = server0.connect(iP47);
    tp2.ITime iTime53 = null;
    server0.setTime(iTime53);
    boolean b55 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483638)+ "'", i38.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 10+ "'", i49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)0L);
    boolean b10 = strictlySortedSinglyLinkedList6.contains(iPBan9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i16 = iP15.getFourth();
    boolean b17 = strictlySortedSinglyLinkedList6.removeFromIP(iP15);
    java.lang.Integer i18 = iP15.getSecond();
    singlyLinkedList0.add(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }


    int i2 = java.lang.Integer.compare(18, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.removeBan(iP31);
    server0.update();
    tp2.Server server37 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    java.lang.Integer i52 = iP49.getThird();
    boolean b53 = strictlySortedSinglyLinkedList38.removeFromIP(iP49);
    boolean b54 = server37.removeException(iP49);
    server37.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    iP61.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i65 = iP61.getFourth();
    java.lang.Integer i66 = iP61.getFirst();
    iP61.setFirst((java.lang.Integer)20971536);
    boolean b69 = server37.addException(iP61);
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    int i71 = singlyLinkedList70.getSize();
    tp2.IP iP72 = null;
    singlyLinkedList70.add(iP72);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList70.add(iP78);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    int i81 = singlyLinkedList80.getSize();
    tp2.IP iP82 = null;
    singlyLinkedList80.add(iP82);
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList80.add(iP88);
    singlyLinkedList70.add(iP88);
    boolean b91 = server37.removeBan(iP88);
    boolean b92 = server0.addBan(iP88);
    java.lang.Integer i93 = iP88.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 167772288+ "'", i52.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 10+ "'", i65.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-2147483638)+ "'", i66.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + 10+ "'", i93.equals(10));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }


    int i1 = java.lang.Integer.parseInt("4144504");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4144504);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }


    java.lang.Integer i1 = new java.lang.Integer(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 64+ "'", i1.equals(64));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }


    int i1 = java.lang.Integer.lowestOneBit(16777448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b23 = strictlySortedSinglyLinkedList22.isEmpty();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList22.removeFromIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList22.contains(iPBan36);
    boolean b38 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.IP iP39 = iPBan36.getIp();
    java.lang.Long long40 = iPBan36.getExpires();
    tp2.Server server41 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    boolean b55 = iP53.equals((java.lang.Object)singlyLinkedList54);
    java.lang.Integer i56 = iP53.getThird();
    boolean b57 = strictlySortedSinglyLinkedList42.removeFromIP(iP53);
    boolean b58 = server41.removeException(iP53);
    server41.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList60 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b66 = strictlySortedSinglyLinkedList60.containsIP(iP65);
    iP65.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i69 = iP65.getFourth();
    java.lang.Integer i70 = iP65.getFirst();
    iP65.setFirst((java.lang.Integer)20971536);
    boolean b73 = server41.addException(iP65);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP65, (java.lang.Long)0L);
    iPBan36.setIp(iP65);
    java.lang.Long long77 = iPBan36.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L+ "'", long40.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 167772288+ "'", i56.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 10+ "'", i69.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-2147483638)+ "'", i70.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 100L+ "'", long77.equals(100L));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    boolean b3 = singlyLinkedList0.isEmpty();
    int i4 = singlyLinkedList0.getSize();
    boolean b5 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }


    int i1 = java.lang.Integer.lowestOneBit(29528288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }


    java.lang.Integer i1 = new java.lang.Integer(1001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1001000+ "'", i1.equals(1001000));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1010000000000000000010000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)0L);
    boolean b8 = strictlySortedSinglyLinkedList4.contains(iPBan7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)0L);
    boolean b13 = strictlySortedSinglyLinkedList9.contains(iPBan12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    iP19.setFirst((java.lang.Integer)0);
    java.lang.Integer i23 = iP19.getSecond();
    iPBan12.setIp(iP19);
    boolean b25 = strictlySortedSinglyLinkedList4.contains(iPBan12);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan12);
    tp2.IPBan iPBan28 = strictlySortedSinglyLinkedList0.get(256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan28);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    iPBan18.setExpires((java.lang.Long)10L);
    tp2.IP iP22 = iPBan18.getIp();
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    int i24 = singlyLinkedList23.getSize();
    boolean b25 = singlyLinkedList23.isEmpty();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    iP30.setSecond((java.lang.Integer)2);
    boolean b35 = singlyLinkedList23.contains(iP30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b42 = strictlySortedSinglyLinkedList36.containsIP(iP41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    boolean b49 = iP47.equals((java.lang.Object)singlyLinkedList48);
    java.lang.Integer i50 = iP47.getThird();
    boolean b51 = strictlySortedSinglyLinkedList36.removeFromIP(iP47);
    boolean b53 = iP47.equals((java.lang.Object)0);
    boolean b54 = singlyLinkedList23.remove(iP47);
    java.lang.Integer i55 = iP47.getSecond();
    iPBan18.setIp(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 167772288+ "'", i50.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.isEmpty();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList17.removeFromIP(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    boolean b32 = strictlySortedSinglyLinkedList17.contains(iPBan31);
    boolean b33 = strictlySortedSinglyLinkedList17.isEmpty();
    tp2.Server server34 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    boolean b48 = iP46.equals((java.lang.Object)singlyLinkedList47);
    java.lang.Integer i49 = iP46.getThird();
    boolean b50 = strictlySortedSinglyLinkedList35.removeFromIP(iP46);
    boolean b51 = server34.removeException(iP46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b58 = strictlySortedSinglyLinkedList52.containsIP(iP57);
    tp2.IPBan iPBan60 = strictlySortedSinglyLinkedList52.get((-1));
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP65, (java.lang.Long)100L);
    boolean b68 = strictlySortedSinglyLinkedList52.removeFromIP(iP65);
    boolean b69 = server34.removeBan(iP65);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP65, (java.lang.Long)83886146L);
    boolean b72 = strictlySortedSinglyLinkedList17.add(iPBan71);
    tp2.Server server73 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList74 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b80 = strictlySortedSinglyLinkedList74.containsIP(iP79);
    java.lang.Integer i81 = iP79.getFourth();
    boolean b82 = server73.addException(iP79);
    tp2.ITime iTime83 = null;
    server73.setTime(iTime83);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList85 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b91 = strictlySortedSinglyLinkedList85.containsIP(iP90);
    boolean b92 = server73.removeException(iP90);
    java.lang.Integer i93 = iP90.getFourth();
    boolean b94 = strictlySortedSinglyLinkedList17.removeFromIP(iP90);
    boolean b95 = strictlySortedSinglyLinkedList0.containsIP(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 167772288+ "'", i49.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 10+ "'", i81.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + 10+ "'", i93.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(83886146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "83886146"+ "'", str1.equals("83886146"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)0L);
    boolean b37 = strictlySortedSinglyLinkedList33.contains(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    iP43.setFirst((java.lang.Integer)0);
    java.lang.Integer i47 = iP43.getSecond();
    iPBan36.setIp(iP43);
    boolean b49 = server0.connect(iP43);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setFirst((java.lang.Integer)0);
    java.lang.Integer i60 = iP56.getSecond();
    iP56.setFourth((java.lang.Integer)83886146);
    iP56.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i65 = iP56.getFirst();
    boolean b66 = server0.addBan(iP56);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-2147483648), (java.lang.Integer)50, (java.lang.Integer)10001, (java.lang.Integer)16384);
    boolean b72 = server0.addException(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 0+ "'", i65.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(271056898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2126512112), (java.lang.Integer)12, (java.lang.Integer)256, (java.lang.Integer)(-2147483625));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }


    int i2 = java.lang.Integer.remainderUnsigned(15, (-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.IP iP11 = iPBan9.getIp();
    iP11.setFourth((java.lang.Integer)20971536);
    iP11.setFirst((java.lang.Integer)20971536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }


    int i2 = java.lang.Integer.min((-892574121), 47159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-892574121));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    tp2.Server server23 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = iP35.equals((java.lang.Object)singlyLinkedList36);
    java.lang.Integer i38 = iP35.getThird();
    boolean b39 = strictlySortedSinglyLinkedList24.removeFromIP(iP35);
    boolean b40 = server23.removeException(iP35);
    server23.update();
    tp2.ITime iTime42 = null;
    server23.setTime(iTime42);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    boolean b50 = iP48.equals((java.lang.Object)singlyLinkedList49);
    iP48.setSecond((java.lang.Integer)2);
    boolean b53 = server23.removeBan(iP48);
    java.lang.Object obj54 = null;
    boolean b55 = iP48.equals(obj54);
    boolean b56 = server0.removeException(iP48);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP48, (java.lang.Long)1074266112L);
    iP48.setThird((java.lang.Integer)1073746921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }


    int i2 = java.lang.Integer.rotateRight((-803208192), 1107296261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 109117472);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }


    int i2 = java.lang.Integer.divideUnsigned(16777448, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 541208);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }


    int i1 = java.lang.Integer.lowestOneBit(109117472);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }


    java.lang.String str1 = java.lang.Integer.toHexString(58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3a"+ "'", str1.equals("3a"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b20 = iP14.equals((java.lang.Object)0);
    boolean b21 = server0.addException(iP14);
    java.lang.Integer i22 = iP14.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    java.lang.Integer i37 = iP30.getThird();
    java.lang.Integer i38 = iP30.getFirst();
    iP30.setFourth((java.lang.Integer)20971536);
    tp2.Server server41 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    java.lang.Integer i49 = iP47.getFourth();
    boolean b50 = server41.addException(iP47);
    boolean b51 = iP30.equals((java.lang.Object)iP47);
    boolean b52 = server0.connect(iP47);
    boolean b53 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483638)+ "'", i38.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 10+ "'", i49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.notSharedElements();
    tp2.Server server24 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList25.containsIP(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    boolean b38 = iP36.equals((java.lang.Object)singlyLinkedList37);
    java.lang.Integer i39 = iP36.getThird();
    boolean b40 = strictlySortedSinglyLinkedList25.removeFromIP(iP36);
    boolean b41 = server24.removeException(iP36);
    server24.update();
    tp2.ITime iTime43 = null;
    server24.setTime(iTime43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    iP49.setSecond((java.lang.Integer)2);
    boolean b54 = server24.removeBan(iP49);
    java.lang.Object obj55 = null;
    boolean b56 = iP49.equals(obj55);
    java.lang.Integer i57 = iP49.getFourth();
    iP49.setThird((java.lang.Integer)124);
    iP49.setSecond((java.lang.Integer)83886146);
    boolean b62 = server0.addException(iP49);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList63 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b69 = strictlySortedSinglyLinkedList63.containsIP(iP68);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList75 = new tp2.SinglyLinkedList();
    boolean b76 = iP74.equals((java.lang.Object)singlyLinkedList75);
    java.lang.Integer i77 = iP74.getThird();
    boolean b78 = strictlySortedSinglyLinkedList63.removeFromIP(iP74);
    boolean b80 = iP74.equals((java.lang.Object)0);
    java.lang.Integer i81 = iP74.getThird();
    java.lang.Integer i82 = iP74.getFirst();
    java.lang.Integer i83 = iP74.getThird();
    iP74.setThird((java.lang.Integer)50);
    boolean b86 = server0.removeException(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 167772288+ "'", i39.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 167772288+ "'", i77.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 167772288+ "'", i81.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-2147483638)+ "'", i82.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 167772288+ "'", i83.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }


    int i1 = java.lang.Integer.reverse(29528288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 118047616);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)(-1L));
    boolean b13 = strictlySortedSinglyLinkedList0.contains(iPBan12);
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(31);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = null;
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)0L);
    boolean b20 = strictlySortedSinglyLinkedList16.contains(iPBan19);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    iP26.setFirst((java.lang.Integer)0);
    java.lang.Integer i30 = iP26.getSecond();
    iPBan19.setIp(iP26);
    boolean b32 = strictlySortedSinglyLinkedList0.add(iPBan19);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b39 = strictlySortedSinglyLinkedList33.containsIP(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = iP44.equals((java.lang.Object)singlyLinkedList45);
    java.lang.Integer i47 = iP44.getThird();
    boolean b48 = strictlySortedSinglyLinkedList33.removeFromIP(iP44);
    int i49 = strictlySortedSinglyLinkedList33.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    java.lang.Integer i57 = iP55.getFourth();
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)0L);
    boolean b60 = strictlySortedSinglyLinkedList33.add(iPBan59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b67 = strictlySortedSinglyLinkedList61.containsIP(iP66);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList73 = new tp2.SinglyLinkedList();
    boolean b74 = iP72.equals((java.lang.Object)singlyLinkedList73);
    java.lang.Integer i75 = iP72.getThird();
    boolean b76 = strictlySortedSinglyLinkedList61.removeFromIP(iP72);
    tp2.IP iP77 = null;
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)(-1L));
    boolean b80 = strictlySortedSinglyLinkedList61.contains(iPBan79);
    boolean b81 = strictlySortedSinglyLinkedList33.contains(iPBan79);
    boolean b82 = strictlySortedSinglyLinkedList0.add(iPBan79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 167772288+ "'", i47.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 167772288+ "'", i75.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }


    java.lang.String str1 = java.lang.Integer.toHexString(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8000000"+ "'", str1.equals("8000000"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(336488199, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "bnatp1"+ "'", str2.equals("bnatp1"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }


    int i2 = java.lang.Integer.rotateLeft(109117472, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 109117472);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }


    int i1 = java.lang.Integer.lowestOneBit(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setFirst((java.lang.Integer)0);
    java.lang.Integer i31 = iP27.getSecond();
    iP27.setFourth((java.lang.Integer)83886146);
    boolean b34 = strictlySortedSinglyLinkedList0.containsIP(iP27);
    tp2.Server server35 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b42 = strictlySortedSinglyLinkedList36.containsIP(iP41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    boolean b49 = iP47.equals((java.lang.Object)singlyLinkedList48);
    java.lang.Integer i50 = iP47.getThird();
    boolean b51 = strictlySortedSinglyLinkedList36.removeFromIP(iP47);
    boolean b52 = server35.removeException(iP47);
    server35.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    iP59.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i63 = iP59.getFourth();
    java.lang.Integer i64 = iP59.getFirst();
    iP59.setFirst((java.lang.Integer)20971536);
    boolean b67 = server35.addException(iP59);
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    int i69 = singlyLinkedList68.getSize();
    tp2.IP iP70 = null;
    singlyLinkedList68.add(iP70);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList68.add(iP76);
    tp2.SinglyLinkedList singlyLinkedList78 = new tp2.SinglyLinkedList();
    int i79 = singlyLinkedList78.getSize();
    tp2.IP iP80 = null;
    singlyLinkedList78.add(iP80);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList78.add(iP86);
    singlyLinkedList68.add(iP86);
    boolean b89 = server35.removeBan(iP86);
    boolean b90 = strictlySortedSinglyLinkedList0.removeFromIP(iP86);
    java.lang.Integer i91 = iP86.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 167772288+ "'", i50.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 10+ "'", i63.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-2147483638)+ "'", i64.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 10+ "'", i91.equals(10));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    tp2.ITime iTime42 = null;
    server0.setTime(iTime42);
    tp2.ITime iTime44 = null;
    server0.setTime(iTime44);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    boolean b52 = iP50.equals((java.lang.Object)singlyLinkedList51);
    iP50.setSecond((java.lang.Integer)2);
    java.lang.Integer i55 = iP50.getSecond();
    boolean b56 = server0.addBan(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 2+ "'", i55.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }


    int i2 = java.lang.Integer.max(0, 2098192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2098192);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i5 = iP4.getFourth();
    java.lang.Integer i6 = iP4.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = iP18.equals((java.lang.Object)singlyLinkedList19);
    java.lang.Integer i21 = iP18.getThird();
    boolean b22 = strictlySortedSinglyLinkedList7.removeFromIP(iP18);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList7.contains(iPBan25);
    tp2.IPBan iPBan28 = strictlySortedSinglyLinkedList7.get((-2147483648));
    boolean b29 = iP4.equals((java.lang.Object)strictlySortedSinglyLinkedList7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    java.lang.Integer i37 = iP35.getFourth();
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)0L);
    boolean b40 = strictlySortedSinglyLinkedList7.add(iPBan39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 167772288+ "'", i6.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 167772288+ "'", i21.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 10+ "'", i37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    tp2.IP iP16 = iPBan3.getIp();
    iP16.setFourth((java.lang.Integer)1074266112);
    iP16.setSecond((java.lang.Integer)120000020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    iPBan2.setExpires((java.lang.Long)10L);
    java.lang.Long long5 = iPBan2.getExpires();
    java.lang.Long long6 = iPBan2.getExpires();
    iPBan2.setExpires((java.lang.Long)14155776L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(100);
    int i4 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1750");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1750+ "'", i1.equals(1750));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }


    int i1 = java.lang.Integer.reverse((-1039663025));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-234876861));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    boolean b18 = strictlySortedSinglyLinkedList14.contains(iPBan17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setFirst((java.lang.Integer)0);
    java.lang.Integer i28 = iP24.getSecond();
    iPBan17.setIp(iP24);
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b47 = server30.removeException(iP42);
    iPBan17.setIp(iP42);
    singlyLinkedList0.add(iP42);
    int i50 = singlyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)0L);
    boolean b55 = strictlySortedSinglyLinkedList51.contains(iPBan54);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    iP61.setFirst((java.lang.Integer)0);
    java.lang.Integer i65 = iP61.getSecond();
    iPBan54.setIp(iP61);
    tp2.IP iP67 = iPBan54.getIp();
    boolean b68 = singlyLinkedList0.remove(iP67);
    iP67.setFirst((java.lang.Integer)110592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("14155776", 58);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 15+ "'", i1.equals(15));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b20 = iP14.equals((java.lang.Object)0);
    boolean b21 = server0.addException(iP14);
    tp2.ITime iTime22 = null;
    server0.setTime(iTime22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = iP35.equals((java.lang.Object)singlyLinkedList36);
    java.lang.Integer i38 = iP35.getThird();
    boolean b39 = strictlySortedSinglyLinkedList24.removeFromIP(iP35);
    boolean b41 = iP35.equals((java.lang.Object)0);
    java.lang.Integer i42 = iP35.getThird();
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP45 = null;
    singlyLinkedList43.add(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList43.add(iP51);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    int i54 = singlyLinkedList53.getSize();
    tp2.IP iP55 = null;
    singlyLinkedList53.add(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList53.add(iP61);
    singlyLinkedList43.add(iP61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b70 = strictlySortedSinglyLinkedList64.containsIP(iP69);
    iP69.setFirst((java.lang.Integer)0);
    java.lang.Integer i73 = iP69.getSecond();
    singlyLinkedList43.add(iP69);
    java.lang.Integer i75 = iP69.getSecond();
    boolean b76 = iP35.equals((java.lang.Object)i75);
    boolean b77 = server0.removeBan(iP35);
    iP35.setFirst((java.lang.Integer)41943107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 167772288+ "'", i42.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 100+ "'", i75.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }


    int i2 = java.lang.Integer.remainderUnsigned(1100100, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1107296261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1107296261+ "'", i1.equals(1107296261));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    int i1 = strictlySortedSinglyLinkedList0.getSize();
    boolean b2 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    int i4 = singlyLinkedList3.getSize();
    tp2.IP iP6 = singlyLinkedList3.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    iP12.setFirst((java.lang.Integer)0);
    boolean b16 = singlyLinkedList3.remove(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IPBan iPBan25 = strictlySortedSinglyLinkedList17.get((-1));
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b33 = strictlySortedSinglyLinkedList17.removeFromIP(iP30);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    boolean b41 = strictlySortedSinglyLinkedList17.removeFromIP(iP38);
    singlyLinkedList3.add(iP38);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)134217728, (java.lang.Integer)7, (java.lang.Integer)3, (java.lang.Integer)262144);
    boolean b48 = singlyLinkedList3.contains(iP47);
    boolean b49 = strictlySortedSinglyLinkedList0.removeFromIP(iP47);
    iP47.setThird((java.lang.Integer)2098187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.removeBan(iP31);
    server0.update();
    tp2.Server server37 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    java.lang.Integer i52 = iP49.getThird();
    boolean b53 = strictlySortedSinglyLinkedList38.removeFromIP(iP49);
    boolean b54 = server37.removeException(iP49);
    server37.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    iP61.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i65 = iP61.getFourth();
    java.lang.Integer i66 = iP61.getFirst();
    iP61.setFirst((java.lang.Integer)20971536);
    boolean b69 = server37.addException(iP61);
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    int i71 = singlyLinkedList70.getSize();
    tp2.IP iP72 = null;
    singlyLinkedList70.add(iP72);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList70.add(iP78);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    int i81 = singlyLinkedList80.getSize();
    tp2.IP iP82 = null;
    singlyLinkedList80.add(iP82);
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList80.add(iP88);
    singlyLinkedList70.add(iP88);
    boolean b91 = server37.removeBan(iP88);
    boolean b92 = server0.addBan(iP88);
    tp2.IPBan iPBan94 = new tp2.IPBan(iP88, (java.lang.Long)301989888L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 167772288+ "'", i52.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 10+ "'", i65.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-2147483638)+ "'", i66.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1100000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)240000041, (java.lang.Integer)134218369, (java.lang.Integer)500000102, (java.lang.Integer)1705518);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(336471815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "336471815"+ "'", str1.equals("336471815"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4194304"+ "'", str1.equals("4194304"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)11, (java.lang.Integer)(-2147483648), (java.lang.Integer)(-2147483638), (java.lang.Integer)134218369);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("200410", 3);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("2147483651");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)41943073, (java.lang.Integer)(-805306368), (java.lang.Integer)13, (java.lang.Integer)37);
    boolean b10 = singlyLinkedList0.remove(iP9);
    tp2.IP iP11 = null;
    singlyLinkedList0.add(iP11);
    tp2.IP iP14 = singlyLinkedList0.get((-2126512112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("64", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)0L);
    boolean b37 = strictlySortedSinglyLinkedList33.contains(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    iP43.setFirst((java.lang.Integer)0);
    java.lang.Integer i47 = iP43.getSecond();
    iPBan36.setIp(iP43);
    boolean b49 = server0.connect(iP43);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    boolean b64 = iP62.equals((java.lang.Object)singlyLinkedList63);
    java.lang.Integer i65 = iP62.getThird();
    boolean b66 = strictlySortedSinglyLinkedList51.removeFromIP(iP62);
    boolean b68 = iP62.equals((java.lang.Object)0);
    java.lang.Integer i69 = iP62.getThird();
    java.lang.Integer i70 = iP62.getFirst();
    iP62.setFourth((java.lang.Integer)20971536);
    java.lang.Integer i73 = iP62.getFirst();
    boolean b74 = server0.connect(iP62);
    server0.update();
    boolean b76 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 167772288+ "'", i65.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 167772288+ "'", i69.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-2147483638)+ "'", i70.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-2147483638)+ "'", i73.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b23 = strictlySortedSinglyLinkedList22.isEmpty();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList22.removeFromIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList22.contains(iPBan36);
    boolean b38 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.IP iP39 = iPBan36.getIp();
    java.lang.Integer i40 = iP39.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 10+ "'", i40.equals(10));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }


    int i2 = java.lang.Integer.compare(24, 118047616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }


    int i2 = java.lang.Integer.sum(541208, 3145728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3686936);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    int i1 = strictlySortedSinglyLinkedList0.getSize();
    boolean b2 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    int i4 = singlyLinkedList3.getSize();
    tp2.IP iP6 = singlyLinkedList3.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    iP12.setFirst((java.lang.Integer)0);
    boolean b16 = singlyLinkedList3.remove(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IPBan iPBan25 = strictlySortedSinglyLinkedList17.get((-1));
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b33 = strictlySortedSinglyLinkedList17.removeFromIP(iP30);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    boolean b41 = strictlySortedSinglyLinkedList17.removeFromIP(iP38);
    singlyLinkedList3.add(iP38);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)134217728, (java.lang.Integer)7, (java.lang.Integer)3, (java.lang.Integer)262144);
    boolean b48 = singlyLinkedList3.contains(iP47);
    boolean b49 = strictlySortedSinglyLinkedList0.removeFromIP(iP47);
    boolean b50 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(41943072, 1342178336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "41943072"+ "'", str2.equals("41943072"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }


    int i2 = java.lang.Integer.compareUnsigned(134218369, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1121320960), 167772288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 153745152);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }


    int i2 = java.lang.Integer.rotateLeft(469762048, 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483645));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    int i1 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    boolean b3 = singlyLinkedList2.isEmpty();
    tp2.IP iP5 = singlyLinkedList2.get(0);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    iP11.setFirst((java.lang.Integer)0);
    boolean b15 = singlyLinkedList2.remove(iP11);
    boolean b16 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP24 = null;
    tp2.IPBan iPBan26 = new tp2.IPBan(iP24, (java.lang.Long)(-1L));
    boolean b27 = strictlySortedSinglyLinkedList17.contains(iPBan26);
    tp2.IP iP28 = iPBan26.getIp();
    iP28.setFourth((java.lang.Integer)20971536);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = null;
    tp2.IPBan iPBan34 = new tp2.IPBan(iP32, (java.lang.Long)0L);
    boolean b35 = strictlySortedSinglyLinkedList31.contains(iPBan34);
    boolean b36 = iP28.equals((java.lang.Object)iPBan34);
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    iP35.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i43 = iP35.getThird();
    boolean b44 = server0.addException(iP35);
    boolean b45 = server0.notSharedElements();
    tp2.ITime iTime46 = null;
    server0.setTime(iTime46);
    boolean b48 = server0.notSharedElements();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList49 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b55 = strictlySortedSinglyLinkedList49.containsIP(iP54);
    java.lang.Integer i56 = iP54.getFourth();
    iP54.setFourth((java.lang.Integer)(-805306368));
    iP54.setSecond((java.lang.Integer)67108864);
    boolean b61 = server0.addBan(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 10+ "'", i56.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b8 = strictlySortedSinglyLinkedList2.containsIP(iP7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    boolean b15 = iP13.equals((java.lang.Object)singlyLinkedList14);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList2.removeFromIP(iP13);
    boolean b18 = server1.removeException(iP13);
    server1.update();
    tp2.ITime iTime20 = null;
    server1.setTime(iTime20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    boolean b28 = iP26.equals((java.lang.Object)singlyLinkedList27);
    iP26.setSecond((java.lang.Integer)2);
    boolean b31 = server1.removeBan(iP26);
    java.lang.Object obj32 = null;
    boolean b33 = iP26.equals(obj32);
    boolean b34 = server0.removeBan(iP26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    boolean b48 = iP46.equals((java.lang.Object)singlyLinkedList47);
    java.lang.Integer i49 = iP46.getThird();
    boolean b50 = strictlySortedSinglyLinkedList35.removeFromIP(iP46);
    boolean b52 = iP46.equals((java.lang.Object)0);
    java.lang.Integer i53 = iP46.getThird();
    java.lang.Integer i54 = iP46.getFirst();
    java.lang.Integer i55 = iP46.getThird();
    boolean b56 = server0.connect(iP46);
    iP46.setFirst((java.lang.Integer)4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 167772288+ "'", i16.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 167772288+ "'", i49.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 167772288+ "'", i53.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-2147483638)+ "'", i54.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 167772288+ "'", i55.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)41943073, (java.lang.Integer)(-805306368), (java.lang.Integer)13, (java.lang.Integer)37);
    boolean b10 = singlyLinkedList0.remove(iP9);
    boolean b11 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    iP25.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i34 = iP25.getFirst();
    boolean b35 = server0.removeBan(iP25);
    tp2.ITime iTime36 = null;
    server0.setTime(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 0+ "'", i34.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-892574121));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-892574121)+ "'", i1.equals((-892574121)));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP35 = null;
    singlyLinkedList33.add(iP35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList33.add(iP41);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP45 = null;
    singlyLinkedList43.add(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList43.add(iP51);
    singlyLinkedList33.add(iP51);
    boolean b54 = server0.removeBan(iP51);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    tp2.IPBan iPBan63 = strictlySortedSinglyLinkedList55.get((-1));
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP68, (java.lang.Long)100L);
    boolean b71 = strictlySortedSinglyLinkedList55.removeFromIP(iP68);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan78 = new tp2.IPBan(iP76, (java.lang.Long)100L);
    boolean b79 = strictlySortedSinglyLinkedList55.removeFromIP(iP76);
    boolean b80 = server0.addBan(iP76);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList81 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b87 = strictlySortedSinglyLinkedList81.containsIP(iP86);
    iP86.setFirst((java.lang.Integer)0);
    iP86.setFourth((java.lang.Integer)7);
    boolean b92 = server0.removeException(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    iPBan3.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList18.removeFromIP(iP24);
    iPBan3.setIp(iP24);
    tp2.IP iP27 = iPBan3.getIp();
    tp2.IP iP28 = iPBan3.getIp();
    iP28.setFourth((java.lang.Integer)268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }


    int i2 = java.lang.Integer.rotateLeft(1001000, (-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147421086));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1750", 120010962);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 120010962+ "'", i2.equals(120010962));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(8192, 1572956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8192"+ "'", str2.equals("8192"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }


    int i2 = java.lang.Integer.sum((-1674030564), (-2147483636));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 473453096);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    tp2.Server server16 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b33 = server16.removeException(iP28);
    iPBan3.setIp(iP28);
    tp2.IP iP35 = iPBan3.getIp();
    iPBan3.setExpires((java.lang.Long)167772288L);
    tp2.IP iP38 = null;
    iPBan3.setIp(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    boolean b45 = strictlySortedSinglyLinkedList21.removeFromIP(iP42);
    boolean b46 = server0.addException(iP42);
    server0.update();
    boolean b48 = server0.bansOkTime();
    tp2.ITime iTime49 = null;
    server0.setTime(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2126512112), 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("19h3659");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.IP iP11 = iPBan9.getIp();
    java.lang.Long long12 = iPBan9.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L+ "'", long12.equals(0L));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }


    java.lang.Integer i1 = new java.lang.Integer(84156416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 84156416+ "'", i1.equals(84156416));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)0L);
    java.lang.Long long19 = iPBan18.getExpires();
    boolean b20 = strictlySortedSinglyLinkedList0.add(iPBan18);
    int i21 = strictlySortedSinglyLinkedList0.getSize();
    boolean b22 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = null;
    tp2.IPBan iPBan26 = new tp2.IPBan(iP24, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList23.contains(iPBan26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    iP33.setFirst((java.lang.Integer)0);
    java.lang.Integer i37 = iP33.getSecond();
    iPBan26.setIp(iP33);
    iPBan26.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b42 = strictlySortedSinglyLinkedList41.isEmpty();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList41.removeFromIP(iP47);
    iPBan26.setIp(iP47);
    tp2.IP iP50 = iPBan26.getIp();
    iP50.setThird((java.lang.Integer)15);
    boolean b53 = strictlySortedSinglyLinkedList0.removeFromIP(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.IP iP3 = singlyLinkedList0.get(3691036);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    boolean b10 = iP8.equals((java.lang.Object)singlyLinkedList9);
    java.lang.Integer i11 = iP8.getThird();
    iP8.setFourth((java.lang.Integer)37);
    iP8.setSecond((java.lang.Integer)884736);
    boolean b16 = singlyLinkedList0.remove(iP8);
    int i17 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 167772288+ "'", i11.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }


    int i2 = java.lang.Integer.compareUnsigned(385876096, (-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("16", 2098192);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }


    int i1 = java.lang.Integer.bitCount((-2146959318));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }


    int i2 = java.lang.Integer.rotateLeft(10280002, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10280002);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList11.get((-1));
    boolean b20 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)(-1L));
    boolean b24 = strictlySortedSinglyLinkedList11.contains(iPBan23);
    boolean b25 = strictlySortedSinglyLinkedList0.add(iPBan23);
    tp2.IP iP26 = iPBan23.getIp();
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)6L);
    iPBan28.setExpires((java.lang.Long)3L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(44739413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 44739413+ "'", i1.equals(44739413));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    tp2.Server server42 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b49 = strictlySortedSinglyLinkedList43.containsIP(iP48);
    java.lang.Integer i50 = iP48.getFourth();
    boolean b51 = server42.addException(iP48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b58 = strictlySortedSinglyLinkedList52.containsIP(iP57);
    iP57.setFirst((java.lang.Integer)0);
    iP57.setFourth((java.lang.Integer)7);
    boolean b64 = iP57.equals((java.lang.Object)"");
    boolean b65 = server42.removeBan(iP57);
    boolean b66 = server0.addBan(iP57);
    boolean b67 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 10+ "'", i50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)40, (java.lang.Integer)14155776, (java.lang.Integer)72, (java.lang.Integer)167772288);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i11 = iP10.getFirst();
    singlyLinkedList0.add(iP10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList13.get(28);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    boolean b22 = iP20.equals((java.lang.Object)singlyLinkedList21);
    java.lang.Integer i23 = iP20.getThird();
    iP20.setFourth((java.lang.Integer)37);
    boolean b26 = strictlySortedSinglyLinkedList13.containsIP(iP20);
    singlyLinkedList0.add(iP20);
    iP20.setFourth((java.lang.Integer)(-1979711360));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 67109184+ "'", i11.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 167772288+ "'", i23.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    iP23.setFourth((java.lang.Integer)7);
    boolean b29 = server0.removeException(iP23);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    tp2.IP iP33 = singlyLinkedList30.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList34.containsIP(iP39);
    iP39.setFirst((java.lang.Integer)0);
    boolean b43 = singlyLinkedList30.remove(iP39);
    boolean b44 = server0.removeBan(iP39);
    java.lang.Integer i45 = iP39.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get((-2147483625));
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    int i5 = singlyLinkedList4.getSize();
    tp2.IP iP6 = null;
    singlyLinkedList4.add(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList4.add(iP12);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP16 = null;
    singlyLinkedList14.add(iP16);
    boolean b18 = iP12.equals((java.lang.Object)singlyLinkedList14);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP12, (java.lang.Long)8L);
    java.lang.Integer i21 = iP12.getThird();
    boolean b22 = singlyLinkedList0.remove(iP12);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = iP27.equals((java.lang.Object)singlyLinkedList28);
    tp2.IP iP31 = singlyLinkedList28.get(4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList32 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList32.containsIP(iP37);
    java.lang.Integer i39 = iP37.getFourth();
    tp2.IPBan iPBan41 = new tp2.IPBan(iP37, (java.lang.Long)0L);
    boolean b42 = singlyLinkedList28.remove(iP37);
    java.lang.Integer i43 = iP37.getThird();
    java.lang.Integer i44 = iP37.getSecond();
    singlyLinkedList0.add(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1+ "'", i21.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }


    int i1 = java.lang.Integer.signum(953344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("41943072", 1107558405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1107558405+ "'", i2.equals(1107558405));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP24, (java.lang.Long)0L);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP24, (java.lang.Long)83886146L);
    iPBan36.setExpires((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }


    int i2 = java.lang.Integer.remainderUnsigned(50, 117440512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 50);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }


    int i2 = java.lang.Integer.remainderUnsigned(25275, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25275);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("28h1a", 120010962);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 120010962+ "'", i2.equals(120010962));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    boolean b10 = singlyLinkedList0.isEmpty();
    boolean b11 = singlyLinkedList0.isEmpty();
    boolean b12 = singlyLinkedList0.isEmpty();
    tp2.IP iP13 = null;
    boolean b14 = singlyLinkedList0.contains(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }


    int i2 = java.lang.Integer.remainderUnsigned(133273849, 473453096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 133273849);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(262144);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }


    int i2 = java.lang.Integer.min(41943076, 1750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1750);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(26214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "26214"+ "'", str1.equals("26214"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList14.get((-1));
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    boolean b30 = strictlySortedSinglyLinkedList14.removeFromIP(iP27);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    boolean b38 = strictlySortedSinglyLinkedList14.removeFromIP(iP35);
    singlyLinkedList0.add(iP35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    boolean b53 = iP51.equals((java.lang.Object)singlyLinkedList52);
    java.lang.Integer i54 = iP51.getThird();
    boolean b55 = strictlySortedSinglyLinkedList40.removeFromIP(iP51);
    java.lang.Integer i56 = iP51.getThird();
    iP51.setFirst((java.lang.Integer)(-1979711360));
    iP51.setFirst((java.lang.Integer)(-2147483648));
    singlyLinkedList0.add(iP51);
    boolean b62 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 167772288+ "'", i54.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 167772288+ "'", i56.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10101010111101");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("110010", 65536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 65536+ "'", i2.equals(65536));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "111010"+ "'", str1.equals("111010"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("200405", 26214);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.Server server11 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b28 = server11.removeException(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    tp2.IPBan iPBan37 = strictlySortedSinglyLinkedList29.get((-1));
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    boolean b45 = strictlySortedSinglyLinkedList29.removeFromIP(iP42);
    boolean b46 = server11.removeBan(iP42);
    java.lang.Integer i47 = iP42.getFirst();
    iPBan9.setIp(iP42);
    java.lang.Integer i49 = iP42.getSecond();
    iP42.setFourth((java.lang.Integer)18875478);
    iP42.setSecond((java.lang.Integer)4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 10+ "'", i47.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 10+ "'", i49.equals(10));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b23 = strictlySortedSinglyLinkedList22.isEmpty();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList22.removeFromIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList22.contains(iPBan36);
    boolean b38 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.IPBan iPBan40 = strictlySortedSinglyLinkedList0.get(100);
    boolean b41 = strictlySortedSinglyLinkedList0.isEmpty();
    int i42 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }


    int i1 = java.lang.Integer.bitCount(134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 12+ "'", i1.equals(12));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }


    int i2 = java.lang.Integer.min(4194304, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }


    java.lang.Integer i1 = new java.lang.Integer(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 22+ "'", i1.equals(22));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    boolean b10 = singlyLinkedList0.isEmpty();
    boolean b11 = singlyLinkedList0.isEmpty();
    boolean b12 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b19 = strictlySortedSinglyLinkedList13.containsIP(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = iP24.equals((java.lang.Object)singlyLinkedList25);
    java.lang.Integer i27 = iP24.getThird();
    boolean b28 = strictlySortedSinglyLinkedList13.removeFromIP(iP24);
    boolean b30 = iP24.equals((java.lang.Object)0);
    java.lang.Integer i31 = iP24.getFirst();
    boolean b32 = singlyLinkedList0.remove(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 167772288+ "'", i27.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483638)+ "'", i31.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    int i5 = singlyLinkedList4.getSize();
    tp2.IP iP7 = singlyLinkedList4.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b14 = strictlySortedSinglyLinkedList8.containsIP(iP13);
    iP13.setFirst((java.lang.Integer)0);
    boolean b17 = singlyLinkedList4.remove(iP13);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    boolean b42 = strictlySortedSinglyLinkedList18.removeFromIP(iP39);
    singlyLinkedList4.add(iP39);
    singlyLinkedList0.add(iP39);
    tp2.IP iP46 = singlyLinkedList0.get(41943073);
    tp2.Server server47 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    boolean b61 = iP59.equals((java.lang.Object)singlyLinkedList60);
    java.lang.Integer i62 = iP59.getThird();
    boolean b63 = strictlySortedSinglyLinkedList48.removeFromIP(iP59);
    boolean b64 = server47.removeException(iP59);
    server47.update();
    boolean b66 = server47.bansOkTime();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = strictlySortedSinglyLinkedList67.containsIP(iP72);
    iP72.setFirst((java.lang.Integer)0);
    java.lang.Object obj76 = null;
    boolean b77 = iP72.equals(obj76);
    java.lang.Integer i78 = iP72.getSecond();
    boolean b79 = server47.connect(iP72);
    boolean b80 = singlyLinkedList0.contains(iP72);
    tp2.IPBan iPBan82 = new tp2.IPBan(iP72, (java.lang.Long)2168455184L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 167772288+ "'", i62.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.addBan(iP31);
    iP31.setSecond((java.lang.Integer)41943073);
    iP31.setFirst((java.lang.Integer)27);
    iP31.setSecond((java.lang.Integer)11);
    iP31.setThird((java.lang.Integer)25275);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(23);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    iP23.setFourth((java.lang.Integer)7);
    boolean b29 = server0.removeException(iP23);
    iP23.setFirst((java.lang.Integer)84156416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("56");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)500000102, (java.lang.Integer)1610612736, (java.lang.Integer)1107296261, (java.lang.Integer)(-2147483645));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }


    int i2 = java.lang.Integer.compare(553680898, 60000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    tp2.Server server23 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = iP35.equals((java.lang.Object)singlyLinkedList36);
    java.lang.Integer i38 = iP35.getThird();
    boolean b39 = strictlySortedSinglyLinkedList24.removeFromIP(iP35);
    boolean b40 = server23.removeException(iP35);
    server23.update();
    tp2.ITime iTime42 = null;
    server23.setTime(iTime42);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    boolean b50 = iP48.equals((java.lang.Object)singlyLinkedList49);
    iP48.setSecond((java.lang.Integer)2);
    boolean b53 = server23.removeBan(iP48);
    java.lang.Object obj54 = null;
    boolean b55 = iP48.equals(obj54);
    boolean b56 = server0.removeException(iP48);
    boolean b57 = server0.bansOkTime();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    boolean b71 = iP69.equals((java.lang.Object)singlyLinkedList70);
    java.lang.Integer i72 = iP69.getThird();
    boolean b73 = strictlySortedSinglyLinkedList58.removeFromIP(iP69);
    boolean b75 = iP69.equals((java.lang.Object)0);
    java.lang.Integer i76 = iP69.getFourth();
    tp2.IPBan iPBan78 = new tp2.IPBan(iP69, (java.lang.Long)0L);
    boolean b79 = server0.addException(iP69);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 167772288+ "'", i72.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 10+ "'", i76.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.Server server2 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b19 = server2.removeException(iP14);
    server2.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    iP26.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i30 = iP26.getFourth();
    java.lang.Integer i31 = iP26.getFirst();
    iP26.setFirst((java.lang.Integer)20971536);
    boolean b34 = server2.addException(iP26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = null;
    tp2.IPBan iPBan38 = new tp2.IPBan(iP36, (java.lang.Long)0L);
    boolean b39 = strictlySortedSinglyLinkedList35.contains(iPBan38);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    iP45.setFirst((java.lang.Integer)0);
    java.lang.Integer i49 = iP45.getSecond();
    iPBan38.setIp(iP45);
    boolean b51 = server2.connect(iP45);
    singlyLinkedList0.add(iP45);
    iP45.setThird((java.lang.Integer)1705518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 10+ "'", i30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483638)+ "'", i31.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }


    int i2 = java.lang.Integer.compare(9, 2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }


    int i1 = java.lang.Integer.reverse(41943073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2080374464));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("120000020", (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b21 = strictlySortedSinglyLinkedList0.isEmpty();
    int i22 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList0.get(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan24);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan24);
    tp2.Server server27 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    iP33.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i37 = iP33.getFourth();
    java.lang.Integer i38 = iP33.getFirst();
    boolean b39 = server27.connect(iP33);
    boolean b40 = strictlySortedSinglyLinkedList0.containsIP(iP33);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP33, (java.lang.Long)2147483647L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 10+ "'", i37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483638)+ "'", i38.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }


    int i2 = java.lang.Integer.compareUnsigned(67109184, 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.addBan(iP31);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    iP6.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i10 = iP6.getFourth();
    java.lang.Integer i11 = iP6.getFirst();
    boolean b12 = server0.connect(iP6);
    java.lang.Integer i13 = iP6.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-2147483638)+ "'", i11.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 167772288+ "'", i13.equals(167772288));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }


    int i1 = java.lang.Integer.highestOneBit((-2146959318));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.addBan(iP31);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b42 = strictlySortedSinglyLinkedList36.containsIP(iP41);
    iP41.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i45 = iP41.getFourth();
    java.lang.Integer i46 = iP41.getFourth();
    boolean b47 = iP31.equals((java.lang.Object)iP41);
    java.lang.Integer i48 = iP31.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 10+ "'", i45.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 10+ "'", i46.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }


    int i2 = java.lang.Integer.rotateLeft(23, 10942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741819));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan24);
    tp2.Server server27 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    boolean b41 = iP39.equals((java.lang.Object)singlyLinkedList40);
    java.lang.Integer i42 = iP39.getThird();
    boolean b43 = strictlySortedSinglyLinkedList28.removeFromIP(iP39);
    boolean b44 = server27.removeException(iP39);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    tp2.IPBan iPBan53 = strictlySortedSinglyLinkedList45.get((-1));
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    boolean b61 = strictlySortedSinglyLinkedList45.removeFromIP(iP58);
    boolean b62 = server27.removeBan(iP58);
    tp2.IPBan iPBan64 = new tp2.IPBan(iP58, (java.lang.Long)83886146L);
    tp2.IP iP65 = iPBan64.getIp();
    boolean b66 = strictlySortedSinglyLinkedList0.contains(iPBan64);
    iPBan64.setExpires((java.lang.Long)2620936732L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 167772288+ "'", i42.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }


    int i2 = java.lang.Integer.rotateLeft(2711, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 173504);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }


    int i2 = java.lang.Integer.rotateRight(110592, 107374182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1728);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }


    int i2 = java.lang.Integer.divideUnsigned(1610612736, 238702);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6747);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }


    int i1 = java.lang.Integer.bitCount((-805306368));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    boolean b3 = server0.bansOkTime();
    tp2.Server server4 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    boolean b18 = iP16.equals((java.lang.Object)singlyLinkedList17);
    java.lang.Integer i19 = iP16.getThird();
    boolean b20 = strictlySortedSinglyLinkedList5.removeFromIP(iP16);
    boolean b21 = server4.removeException(iP16);
    server4.update();
    tp2.ITime iTime23 = null;
    server4.setTime(iTime23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList25.containsIP(iP30);
    tp2.IPBan iPBan33 = strictlySortedSinglyLinkedList25.get((-1));
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    boolean b41 = strictlySortedSinglyLinkedList25.removeFromIP(iP38);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)100L);
    boolean b49 = strictlySortedSinglyLinkedList25.removeFromIP(iP46);
    boolean b50 = server4.addException(iP46);
    server4.update();
    tp2.Server server52 = new tp2.Server();
    tp2.ITime iTime53 = null;
    server52.setTime(iTime53);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    boolean b68 = iP66.equals((java.lang.Object)singlyLinkedList67);
    java.lang.Integer i69 = iP66.getThird();
    boolean b70 = strictlySortedSinglyLinkedList55.removeFromIP(iP66);
    boolean b72 = iP66.equals((java.lang.Object)0);
    boolean b73 = server52.addException(iP66);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP66, (java.lang.Long)120000020L);
    boolean b76 = server4.removeException(iP66);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList82 = new tp2.SinglyLinkedList();
    boolean b83 = iP81.equals((java.lang.Object)singlyLinkedList82);
    java.lang.Integer i84 = iP81.getThird();
    java.lang.Integer i85 = iP81.getSecond();
    boolean b86 = server4.removeException(iP81);
    boolean b87 = server0.addException(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 167772288+ "'", i19.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 167772288+ "'", i69.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 167772288+ "'", i84.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 100+ "'", i85.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    boolean b16 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    boolean b24 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    int i25 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan27 = strictlySortedSinglyLinkedList0.get(0);
    boolean b28 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    int i10 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    int i12 = singlyLinkedList11.getSize();
    tp2.IP iP13 = null;
    singlyLinkedList11.add(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = singlyLinkedList11.contains(iP19);
    iP19.setFirst((java.lang.Integer)7);
    java.lang.Integer i23 = iP19.getSecond();
    boolean b24 = singlyLinkedList0.contains(iP19);
    int i25 = singlyLinkedList0.getSize();
    tp2.IP iP27 = singlyLinkedList0.get(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP27);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }


    int i2 = java.lang.Integer.remainderUnsigned(2098176, 2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("64", 167772288);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("101000000000000000001000010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)0L);
    boolean b37 = strictlySortedSinglyLinkedList33.contains(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    iP43.setFirst((java.lang.Integer)0);
    java.lang.Integer i47 = iP43.getSecond();
    iPBan36.setIp(iP43);
    boolean b49 = server0.connect(iP43);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setFirst((java.lang.Integer)0);
    java.lang.Integer i60 = iP56.getSecond();
    iP56.setFourth((java.lang.Integer)83886146);
    iP56.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i65 = iP56.getFirst();
    boolean b66 = server0.addBan(iP56);
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    boolean b68 = singlyLinkedList67.isEmpty();
    tp2.IP iP70 = singlyLinkedList67.get(3691036);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList76 = new tp2.SinglyLinkedList();
    boolean b77 = iP75.equals((java.lang.Object)singlyLinkedList76);
    java.lang.Integer i78 = iP75.getThird();
    iP75.setFourth((java.lang.Integer)37);
    iP75.setSecond((java.lang.Integer)884736);
    boolean b83 = singlyLinkedList67.remove(iP75);
    iP75.setThird((java.lang.Integer)(-2147483638));
    boolean b86 = server0.addBan(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 0+ "'", i65.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 167772288+ "'", i78.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.IP iP30 = null;
    boolean b31 = server0.removeBan(iP30);
    boolean b32 = server0.notSharedElements();
    tp2.Server server33 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList34.containsIP(iP39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    boolean b47 = iP45.equals((java.lang.Object)singlyLinkedList46);
    java.lang.Integer i48 = iP45.getThird();
    boolean b49 = strictlySortedSinglyLinkedList34.removeFromIP(iP45);
    boolean b50 = server33.removeException(iP45);
    server33.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b58 = strictlySortedSinglyLinkedList52.containsIP(iP57);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    boolean b65 = iP63.equals((java.lang.Object)singlyLinkedList64);
    java.lang.Integer i66 = iP63.getThird();
    boolean b67 = strictlySortedSinglyLinkedList52.removeFromIP(iP63);
    boolean b69 = iP63.equals((java.lang.Object)0);
    java.lang.Integer i70 = iP63.getThird();
    java.lang.Integer i71 = iP63.getFirst();
    iP63.setFourth((java.lang.Integer)20971536);
    tp2.Server server74 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList75 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b81 = strictlySortedSinglyLinkedList75.containsIP(iP80);
    java.lang.Integer i82 = iP80.getFourth();
    boolean b83 = server74.addException(iP80);
    boolean b84 = iP63.equals((java.lang.Object)iP80);
    boolean b85 = server33.connect(iP80);
    boolean b86 = server0.addBan(iP80);
    boolean b87 = server0.notSharedElements();
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)41943073, (java.lang.Integer)(-805306368), (java.lang.Integer)13, (java.lang.Integer)37);
    boolean b93 = server0.addBan(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 167772288+ "'", i48.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 167772288+ "'", i66.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 167772288+ "'", i70.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-2147483638)+ "'", i71.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 10+ "'", i82.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    boolean b16 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    boolean b24 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    iP21.setThird((java.lang.Integer)1073741824);
    java.lang.Integer i27 = iP21.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 10+ "'", i27.equals(10));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(201981953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }


    java.lang.Integer i1 = new java.lang.Integer(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 0+ "'", i1.equals(0));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }


    int i2 = java.lang.Integer.max(500000102, 2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 500000102);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    iPBan2.setExpires((java.lang.Long)10L);
    java.lang.Long long5 = iPBan2.getExpires();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)0L);
    boolean b10 = strictlySortedSinglyLinkedList6.contains(iPBan9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i16 = iP15.getFourth();
    boolean b17 = strictlySortedSinglyLinkedList6.removeFromIP(iP15);
    boolean b18 = strictlySortedSinglyLinkedList6.isEmpty();
    tp2.IP iP19 = null;
    tp2.IPBan iPBan21 = new tp2.IPBan(iP19, (java.lang.Long)0L);
    tp2.IP iP22 = iPBan21.getIp();
    boolean b23 = strictlySortedSinglyLinkedList6.removeFromIP(iP22);
    iPBan2.setIp(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1107558405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000010000001000000000000000101"+ "'", str1.equals("1000010000001000000000000000101"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1705518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1a062e"+ "'", str1.equals("1a062e"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11", (java.lang.Integer)16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 16384+ "'", i2.equals(16384));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    java.lang.Object obj31 = null;
    boolean b32 = iP25.equals(obj31);
    java.lang.Integer i33 = iP25.getFourth();
    iP25.setFirst((java.lang.Integer)18);
    iP25.setFirst((java.lang.Integer)24);
    java.lang.Integer i38 = iP25.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 10+ "'", i33.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 2+ "'", i38.equals(2));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    iPBan3.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList18.removeFromIP(iP24);
    iPBan3.setIp(iP24);
    java.lang.Integer i27 = iP24.getFourth();
    tp2.IPBan iPBan29 = new tp2.IPBan(iP24, (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 10+ "'", i27.equals(10));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList16.contains(iPBan25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IPBan iPBan35 = strictlySortedSinglyLinkedList27.get((-1));
    boolean b36 = strictlySortedSinglyLinkedList27.isEmpty();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)(-1L));
    boolean b40 = strictlySortedSinglyLinkedList27.contains(iPBan39);
    boolean b41 = strictlySortedSinglyLinkedList16.add(iPBan39);
    boolean b42 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)3, (java.lang.Integer)1000, (java.lang.Integer)1074266112);
    boolean b48 = strictlySortedSinglyLinkedList0.containsIP(iP47);
    boolean b49 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    tp2.IP iP66 = null;
    tp2.IPBan iPBan68 = new tp2.IPBan(iP66, (java.lang.Long)(-1L));
    boolean b69 = strictlySortedSinglyLinkedList50.contains(iPBan68);
    java.lang.Long long70 = iPBan68.getExpires();
    java.lang.Long long71 = iPBan68.getExpires();
    boolean b72 = strictlySortedSinglyLinkedList0.add(iPBan68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L+ "'", long70.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L+ "'", long71.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }


    int i1 = java.lang.Integer.bitCount(541208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }


    int i1 = java.lang.Integer.lowestOneBit((-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP12 = null;
    singlyLinkedList10.add(iP12);
    boolean b14 = iP8.equals((java.lang.Object)singlyLinkedList10);
    tp2.IPBan iPBan16 = new tp2.IPBan(iP8, (java.lang.Long)4294967295L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i27 = iP26.getFourth();
    boolean b28 = strictlySortedSinglyLinkedList0.containsIP(iP26);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP31 = null;
    singlyLinkedList29.add(iP31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = singlyLinkedList29.contains(iP37);
    boolean b39 = strictlySortedSinglyLinkedList0.removeFromIP(iP37);
    iP37.setFirst((java.lang.Integer)953355);
    java.lang.Integer i42 = iP37.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 10+ "'", i27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 10+ "'", i42.equals(10));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }


    int i2 = java.lang.Integer.rotateLeft(6291456, 1001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612736);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i11 = iP10.getFirst();
    singlyLinkedList0.add(iP10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList13.get(28);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    boolean b22 = iP20.equals((java.lang.Object)singlyLinkedList21);
    java.lang.Integer i23 = iP20.getThird();
    iP20.setFourth((java.lang.Integer)37);
    boolean b26 = strictlySortedSinglyLinkedList13.containsIP(iP20);
    singlyLinkedList0.add(iP20);
    tp2.Server server28 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    boolean b42 = iP40.equals((java.lang.Object)singlyLinkedList41);
    java.lang.Integer i43 = iP40.getThird();
    boolean b44 = strictlySortedSinglyLinkedList29.removeFromIP(iP40);
    boolean b45 = server28.removeException(iP40);
    server28.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b53 = strictlySortedSinglyLinkedList47.containsIP(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    boolean b60 = iP58.equals((java.lang.Object)singlyLinkedList59);
    java.lang.Integer i61 = iP58.getThird();
    boolean b62 = strictlySortedSinglyLinkedList47.removeFromIP(iP58);
    boolean b64 = iP58.equals((java.lang.Object)0);
    java.lang.Integer i65 = iP58.getThird();
    java.lang.Integer i66 = iP58.getFirst();
    iP58.setFourth((java.lang.Integer)20971536);
    tp2.Server server69 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList70 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b76 = strictlySortedSinglyLinkedList70.containsIP(iP75);
    java.lang.Integer i77 = iP75.getFourth();
    boolean b78 = server69.addException(iP75);
    boolean b79 = iP58.equals((java.lang.Object)iP75);
    boolean b80 = server28.connect(iP75);
    java.lang.Integer i81 = iP75.getFourth();
    iP75.setFirst((java.lang.Integer)2098192);
    boolean b84 = singlyLinkedList0.contains(iP75);
    java.lang.Integer i85 = iP75.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 67109184+ "'", i11.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 167772288+ "'", i23.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 167772288+ "'", i61.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 167772288+ "'", i65.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-2147483638)+ "'", i66.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 10+ "'", i77.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 10+ "'", i81.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 167772288+ "'", i85.equals(167772288));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(400000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 400000000+ "'", i1.equals(400000000));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }


    int i2 = java.lang.Integer.min(11, 1107296325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }


    int i1 = java.lang.Integer.lowestOneBit(11534592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10942", 107374182);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }


    int i2 = java.lang.Integer.compare((-892585062), 10280002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }


    int i2 = java.lang.Integer.divideUnsigned(60000010, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3333333);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("100000000000001000000000000", 3145728);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    java.lang.Integer i37 = iP30.getThird();
    java.lang.Integer i38 = iP30.getFirst();
    iP30.setFourth((java.lang.Integer)20971536);
    tp2.Server server41 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    java.lang.Integer i49 = iP47.getFourth();
    boolean b50 = server41.addException(iP47);
    boolean b51 = iP30.equals((java.lang.Object)iP47);
    boolean b52 = server0.connect(iP47);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP47, (java.lang.Long)1L);
    java.lang.Long long55 = null;
    iPBan54.setExpires(long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483638)+ "'", i38.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 10+ "'", i49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(26214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "63146"+ "'", str1.equals("63146"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)37, (java.lang.Integer)109117472, (java.lang.Integer)10004001, (java.lang.Integer)(-234876861));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(500000102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11101110011010110010101100110"+ "'", str1.equals("11101110011010110010101100110"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i9 = null;
    iP5.setFirst(i9);
    tp2.Server server11 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b28 = server11.removeException(iP23);
    server11.update();
    tp2.ITime iTime30 = null;
    server11.setTime(iTime30);
    tp2.Server server32 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b39 = strictlySortedSinglyLinkedList33.containsIP(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = iP44.equals((java.lang.Object)singlyLinkedList45);
    java.lang.Integer i47 = iP44.getThird();
    boolean b48 = strictlySortedSinglyLinkedList33.removeFromIP(iP44);
    boolean b49 = server32.removeException(iP44);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IPBan iPBan58 = strictlySortedSinglyLinkedList50.get((-1));
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    boolean b66 = strictlySortedSinglyLinkedList50.removeFromIP(iP63);
    boolean b67 = server32.removeBan(iP63);
    boolean b68 = server11.addException(iP63);
    boolean b69 = iP5.equals((java.lang.Object)iP63);
    iP5.setFirst((java.lang.Integer)1107296325);
    java.lang.Integer i72 = iP5.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 167772288+ "'", i47.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 167772288+ "'", i72.equals(167772288));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP12 = null;
    singlyLinkedList10.add(iP12);
    boolean b14 = iP8.equals((java.lang.Object)singlyLinkedList10);
    iP8.setThird((java.lang.Integer)5);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP8, (java.lang.Long)100L);
    iP8.setThird((java.lang.Integer)256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2620936732", 72);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(268451841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "268451841"+ "'", str1.equals("268451841"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i27 = iP26.getFourth();
    boolean b28 = strictlySortedSinglyLinkedList0.containsIP(iP26);
    boolean b29 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b47 = server30.removeException(iP42);
    server30.update();
    tp2.ITime iTime49 = null;
    server30.setTime(iTime49);
    tp2.ITime iTime51 = null;
    server30.setTime(iTime51);
    boolean b53 = server30.notSharedElements();
    tp2.Server server54 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    boolean b68 = iP66.equals((java.lang.Object)singlyLinkedList67);
    java.lang.Integer i69 = iP66.getThird();
    boolean b70 = strictlySortedSinglyLinkedList55.removeFromIP(iP66);
    boolean b71 = server54.removeException(iP66);
    server54.update();
    tp2.ITime iTime73 = null;
    server54.setTime(iTime73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    boolean b81 = iP79.equals((java.lang.Object)singlyLinkedList80);
    iP79.setSecond((java.lang.Integer)2);
    boolean b84 = server54.removeBan(iP79);
    java.lang.Object obj85 = null;
    boolean b86 = iP79.equals(obj85);
    java.lang.Integer i87 = iP79.getFourth();
    iP79.setThird((java.lang.Integer)124);
    iP79.setSecond((java.lang.Integer)83886146);
    boolean b92 = server30.addException(iP79);
    tp2.IPBan iPBan94 = new tp2.IPBan(iP79, (java.lang.Long)0L);
    boolean b95 = strictlySortedSinglyLinkedList0.add(iPBan94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 10+ "'", i27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 167772288+ "'", i69.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 10+ "'", i87.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b34 = iP28.equals((java.lang.Object)0);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP40 = null;
    singlyLinkedList38.add(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = singlyLinkedList38.contains(iP46);
    iP46.setFirst((java.lang.Integer)(-2147483638));
    boolean b50 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan61 = new tp2.IPBan(iP56, (java.lang.Long)0L);
    boolean b62 = strictlySortedSinglyLinkedList0.add(iPBan61);
    iPBan61.setExpires((java.lang.Long)120000020L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)0L);
    boolean b37 = strictlySortedSinglyLinkedList33.contains(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    iP43.setFirst((java.lang.Integer)0);
    java.lang.Integer i47 = iP43.getSecond();
    iPBan36.setIp(iP43);
    boolean b49 = server0.connect(iP43);
    tp2.ITime iTime50 = null;
    server0.setTime(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    tp2.IP iP47 = null;
    tp2.IPBan iPBan49 = new tp2.IPBan(iP47, (java.lang.Long)(-1L));
    boolean b50 = strictlySortedSinglyLinkedList40.contains(iPBan49);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    tp2.IPBan iPBan59 = strictlySortedSinglyLinkedList51.get((-1));
    boolean b60 = strictlySortedSinglyLinkedList51.isEmpty();
    tp2.IP iP61 = null;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)(-1L));
    boolean b64 = strictlySortedSinglyLinkedList51.contains(iPBan63);
    boolean b65 = strictlySortedSinglyLinkedList40.add(iPBan63);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b67 = strictlySortedSinglyLinkedList66.isEmpty();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = strictlySortedSinglyLinkedList66.removeFromIP(iP72);
    boolean b74 = strictlySortedSinglyLinkedList40.removeFromIP(iP72);
    boolean b75 = server0.removeBan(iP72);
    iP72.setSecond((java.lang.Integer)16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("32", 2098192);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i27 = iP26.getFourth();
    boolean b28 = strictlySortedSinglyLinkedList0.containsIP(iP26);
    boolean b29 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b30 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 10+ "'", i27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test220"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    boolean b32 = server0.removeException(iP25);
    tp2.Server server33 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList34.containsIP(iP39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    boolean b47 = iP45.equals((java.lang.Object)singlyLinkedList46);
    java.lang.Integer i48 = iP45.getThird();
    boolean b49 = strictlySortedSinglyLinkedList34.removeFromIP(iP45);
    boolean b50 = server33.removeException(iP45);
    server33.update();
    tp2.ITime iTime52 = null;
    server33.setTime(iTime52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    tp2.IPBan iPBan62 = strictlySortedSinglyLinkedList54.get((-1));
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP67, (java.lang.Long)100L);
    boolean b70 = strictlySortedSinglyLinkedList54.removeFromIP(iP67);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP75, (java.lang.Long)100L);
    boolean b78 = strictlySortedSinglyLinkedList54.removeFromIP(iP75);
    boolean b79 = server33.addException(iP75);
    boolean b80 = server0.addException(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 167772288+ "'", i48.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test221"); }


    int i1 = java.lang.Integer.lowestOneBit(21884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test222"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server6 = new tp2.Server();
    tp2.ITime iTime7 = null;
    server6.setTime(iTime7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b15 = strictlySortedSinglyLinkedList9.containsIP(iP14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    boolean b22 = iP20.equals((java.lang.Object)singlyLinkedList21);
    java.lang.Integer i23 = iP20.getThird();
    boolean b24 = strictlySortedSinglyLinkedList9.removeFromIP(iP20);
    boolean b26 = iP20.equals((java.lang.Object)0);
    boolean b27 = server6.addException(iP20);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP20, (java.lang.Long)120000020L);
    boolean b30 = strictlySortedSinglyLinkedList0.add(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 167772288+ "'", i23.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test223"); }


    int i1 = java.lang.Integer.lowestOneBit(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test224"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(2098187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000000000010000001011"+ "'", str1.equals("1000000000010000001011"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test225"); }


    java.lang.Integer i1 = new java.lang.Integer("301989888");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 301989888+ "'", i1.equals(301989888));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test226"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP8 = singlyLinkedList5.get(4);
    int i9 = singlyLinkedList5.getSize();
    boolean b10 = singlyLinkedList5.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList11.get((-1));
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP24, (java.lang.Long)100L);
    boolean b27 = strictlySortedSinglyLinkedList11.removeFromIP(iP24);
    boolean b28 = singlyLinkedList5.contains(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test227"); }


    int i2 = java.lang.Integer.rotateRight(18, 2048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 18);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test228"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    boolean b40 = server0.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    int i42 = singlyLinkedList41.getSize();
    boolean b43 = singlyLinkedList41.isEmpty();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    boolean b50 = iP48.equals((java.lang.Object)singlyLinkedList49);
    iP48.setSecond((java.lang.Integer)2);
    boolean b53 = singlyLinkedList41.contains(iP48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    boolean b67 = iP65.equals((java.lang.Object)singlyLinkedList66);
    java.lang.Integer i68 = iP65.getThird();
    boolean b69 = strictlySortedSinglyLinkedList54.removeFromIP(iP65);
    boolean b71 = iP65.equals((java.lang.Object)0);
    boolean b72 = singlyLinkedList41.remove(iP65);
    java.lang.Integer i73 = iP65.getSecond();
    boolean b74 = server0.removeException(iP65);
    boolean b75 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 167772288+ "'", i68.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test229"); }


    int i1 = java.lang.Integer.signum(14680064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test230"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)0L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Integer i4 = iP3.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 0+ "'", i4.equals(0));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test231"); }


    int i1 = java.lang.Integer.highestOneBit(133273849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test232"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.IPBan iPBan5 = strictlySortedSinglyLinkedList0.get((-1979711360));
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test233"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("42", (java.lang.Integer)1879048192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1879048192+ "'", i2.equals(1879048192));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test234"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)18875478, (java.lang.Integer)1342178336, (java.lang.Integer)124, (java.lang.Integer)469762048);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test235"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = null;
    tp2.IPBan iPBan8 = new tp2.IPBan(iP6, (java.lang.Long)0L);
    boolean b9 = strictlySortedSinglyLinkedList5.contains(iPBan8);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b16 = strictlySortedSinglyLinkedList10.containsIP(iP15);
    iP15.setFirst((java.lang.Integer)0);
    java.lang.Integer i19 = iP15.getSecond();
    iPBan8.setIp(iP15);
    boolean b21 = strictlySortedSinglyLinkedList0.contains(iPBan8);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)64, (java.lang.Integer)4, (java.lang.Integer)262144, (java.lang.Integer)167772288);
    iP26.setFourth((java.lang.Integer)10942);
    boolean b29 = strictlySortedSinglyLinkedList0.removeFromIP(iP26);
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList0.get(17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList32 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList32.containsIP(iP37);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    boolean b45 = iP43.equals((java.lang.Object)singlyLinkedList44);
    java.lang.Integer i46 = iP43.getThird();
    boolean b47 = strictlySortedSinglyLinkedList32.removeFromIP(iP43);
    boolean b49 = iP43.equals((java.lang.Object)0);
    java.lang.Integer i50 = iP43.getThird();
    java.lang.Integer i51 = iP43.getFirst();
    iP43.setFourth((java.lang.Integer)20971536);
    boolean b54 = strictlySortedSinglyLinkedList0.containsIP(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 167772288+ "'", i46.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 167772288+ "'", i50.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-2147483638)+ "'", i51.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test236"); }


    int i2 = java.lang.Integer.rotateLeft(8, 10942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test237"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.notSharedElements();
    tp2.ITime iTime24 = null;
    server0.setTime(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test238"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b16 = strictlySortedSinglyLinkedList10.containsIP(iP15);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    boolean b23 = iP21.equals((java.lang.Object)singlyLinkedList22);
    java.lang.Integer i24 = iP21.getThird();
    boolean b25 = strictlySortedSinglyLinkedList10.removeFromIP(iP21);
    java.lang.Integer i26 = iP21.getThird();
    iP21.setFirst((java.lang.Integer)(-1979711360));
    boolean b29 = strictlySortedSinglyLinkedList0.containsIP(iP21);
    int i30 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 167772288+ "'", i24.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test239"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    boolean b16 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    boolean b24 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    int i25 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b32 = strictlySortedSinglyLinkedList26.containsIP(iP31);
    java.lang.Integer i33 = iP31.getFourth();
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)0L);
    boolean b36 = strictlySortedSinglyLinkedList0.add(iPBan35);
    iPBan35.setExpires((java.lang.Long)14155776L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 10+ "'", i33.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test240"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(524288, 41943107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "524288"+ "'", str2.equals("524288"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test241"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test242"); }


    int i1 = java.lang.Integer.reverseBytes(2711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1760952320));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test243"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    boolean b32 = server0.removeException(iP25);
    java.lang.Integer i33 = iP25.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 83886146+ "'", i33.equals(83886146));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test244"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    int i14 = singlyLinkedList0.getSize();
    tp2.Server server15 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = iP27.equals((java.lang.Object)singlyLinkedList28);
    java.lang.Integer i30 = iP27.getThird();
    boolean b31 = strictlySortedSinglyLinkedList16.removeFromIP(iP27);
    boolean b32 = server15.removeException(iP27);
    server15.update();
    tp2.ITime iTime34 = null;
    server15.setTime(iTime34);
    tp2.Server server36 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b43 = strictlySortedSinglyLinkedList37.containsIP(iP42);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    boolean b50 = iP48.equals((java.lang.Object)singlyLinkedList49);
    java.lang.Integer i51 = iP48.getThird();
    boolean b52 = strictlySortedSinglyLinkedList37.removeFromIP(iP48);
    boolean b53 = server36.removeException(iP48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    tp2.IPBan iPBan62 = strictlySortedSinglyLinkedList54.get((-1));
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP67, (java.lang.Long)100L);
    boolean b70 = strictlySortedSinglyLinkedList54.removeFromIP(iP67);
    boolean b71 = server36.removeBan(iP67);
    boolean b72 = server15.addException(iP67);
    boolean b73 = singlyLinkedList0.remove(iP67);
    tp2.IP iP75 = singlyLinkedList0.get(1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 167772288+ "'", i30.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 167772288+ "'", i51.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP75);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test245"); }


    java.lang.Integer i1 = new java.lang.Integer(133273849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 133273849+ "'", i1.equals(133273849));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test246"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.removeBan(iP31);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP31, (java.lang.Long)83886146L);
    tp2.IP iP38 = iPBan37.getIp();
    java.lang.Long long39 = iPBan37.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 83886146L+ "'", long39.equals(83886146L));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test247"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(153745152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1001001010011111011100000000"+ "'", str1.equals("1001001010011111011100000000"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test248"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b8 = strictlySortedSinglyLinkedList7.isEmpty();
    int i9 = strictlySortedSinglyLinkedList7.getSize();
    tp2.Server server10 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    boolean b24 = iP22.equals((java.lang.Object)singlyLinkedList23);
    java.lang.Integer i25 = iP22.getThird();
    boolean b26 = strictlySortedSinglyLinkedList11.removeFromIP(iP22);
    boolean b27 = server10.removeException(iP22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    tp2.IPBan iPBan36 = strictlySortedSinglyLinkedList28.get((-1));
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    boolean b44 = strictlySortedSinglyLinkedList28.removeFromIP(iP41);
    boolean b45 = server10.removeBan(iP41);
    boolean b46 = strictlySortedSinglyLinkedList7.containsIP(iP41);
    iP41.setThird((java.lang.Integer)18);
    singlyLinkedList5.add(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 167772288+ "'", i25.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test249"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    iP35.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i43 = iP35.getThird();
    boolean b44 = server0.addException(iP35);
    boolean b45 = server0.notSharedElements();
    tp2.IP iP46 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)(-1L));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList49 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b55 = strictlySortedSinglyLinkedList49.containsIP(iP54);
    iP54.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i58 = iP54.getFourth();
    java.lang.Integer i59 = iP54.getFirst();
    iP54.setFirst((java.lang.Integer)18875478);
    iPBan48.setIp(iP54);
    boolean b63 = server0.addException(iP54);
    iP54.setSecond((java.lang.Integer)512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 10+ "'", i58.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-2147483638)+ "'", i59.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test250"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP2 = null;
    tp2.IPBan iPBan4 = new tp2.IPBan(iP2, (java.lang.Long)0L);
    boolean b5 = strictlySortedSinglyLinkedList0.contains(iPBan4);
    int i6 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test251"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP13 = singlyLinkedList10.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    iP19.setFirst((java.lang.Integer)0);
    boolean b23 = singlyLinkedList10.remove(iP19);
    int i24 = singlyLinkedList10.getSize();
    tp2.Server server25 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b32 = strictlySortedSinglyLinkedList26.containsIP(iP31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    boolean b39 = iP37.equals((java.lang.Object)singlyLinkedList38);
    java.lang.Integer i40 = iP37.getThird();
    boolean b41 = strictlySortedSinglyLinkedList26.removeFromIP(iP37);
    boolean b42 = server25.removeException(iP37);
    server25.update();
    tp2.ITime iTime44 = null;
    server25.setTime(iTime44);
    tp2.Server server46 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b53 = strictlySortedSinglyLinkedList47.containsIP(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    boolean b60 = iP58.equals((java.lang.Object)singlyLinkedList59);
    java.lang.Integer i61 = iP58.getThird();
    boolean b62 = strictlySortedSinglyLinkedList47.removeFromIP(iP58);
    boolean b63 = server46.removeException(iP58);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b70 = strictlySortedSinglyLinkedList64.containsIP(iP69);
    tp2.IPBan iPBan72 = strictlySortedSinglyLinkedList64.get((-1));
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)100L);
    boolean b80 = strictlySortedSinglyLinkedList64.removeFromIP(iP77);
    boolean b81 = server46.removeBan(iP77);
    boolean b82 = server25.addException(iP77);
    boolean b83 = singlyLinkedList10.remove(iP77);
    boolean b84 = server0.addException(iP77);
    tp2.SinglyLinkedList singlyLinkedList85 = new tp2.SinglyLinkedList();
    int i86 = singlyLinkedList85.getSize();
    tp2.IP iP87 = null;
    singlyLinkedList85.add(iP87);
    tp2.IP iP93 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b94 = singlyLinkedList85.contains(iP93);
    iP93.setFourth((java.lang.Integer)1);
    boolean b97 = server0.removeBan(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 167772288+ "'", i40.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 167772288+ "'", i61.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test252"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP12 = null;
    singlyLinkedList10.add(iP12);
    boolean b14 = iP8.equals((java.lang.Object)singlyLinkedList10);
    iP8.setThird((java.lang.Integer)5);
    java.lang.Integer i17 = iP8.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 10+ "'", i17.equals(10));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test253"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b34 = iP28.equals((java.lang.Object)0);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP40 = null;
    singlyLinkedList38.add(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = singlyLinkedList38.contains(iP46);
    iP46.setFirst((java.lang.Integer)(-2147483638));
    boolean b50 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan61 = new tp2.IPBan(iP56, (java.lang.Long)0L);
    boolean b62 = strictlySortedSinglyLinkedList0.add(iPBan61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList63 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b69 = strictlySortedSinglyLinkedList63.containsIP(iP68);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList75 = new tp2.SinglyLinkedList();
    boolean b76 = iP74.equals((java.lang.Object)singlyLinkedList75);
    java.lang.Integer i77 = iP74.getThird();
    boolean b78 = strictlySortedSinglyLinkedList63.removeFromIP(iP74);
    int i79 = strictlySortedSinglyLinkedList63.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList80 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b86 = strictlySortedSinglyLinkedList80.containsIP(iP85);
    java.lang.Integer i87 = iP85.getFourth();
    tp2.IPBan iPBan89 = new tp2.IPBan(iP85, (java.lang.Long)0L);
    boolean b90 = strictlySortedSinglyLinkedList63.add(iPBan89);
    tp2.IP iP91 = iPBan89.getIp();
    boolean b92 = strictlySortedSinglyLinkedList0.contains(iPBan89);
    int i93 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 167772288+ "'", i77.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 10+ "'", i87.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 1);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test254"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b8 = strictlySortedSinglyLinkedList2.containsIP(iP7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    boolean b15 = iP13.equals((java.lang.Object)singlyLinkedList14);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList2.removeFromIP(iP13);
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)(-1L));
    boolean b21 = strictlySortedSinglyLinkedList2.contains(iPBan20);
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList2.get(1);
    tp2.IP iP24 = null;
    tp2.IPBan iPBan26 = new tp2.IPBan(iP24, (java.lang.Long)0L);
    tp2.IP iP27 = iPBan26.getIp();
    boolean b28 = strictlySortedSinglyLinkedList2.contains(iPBan26);
    tp2.Server server29 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    boolean b41 = server29.connect(iP35);
    boolean b42 = strictlySortedSinglyLinkedList2.containsIP(iP35);
    boolean b43 = singlyLinkedList0.contains(iP35);
    tp2.IP iP45 = singlyLinkedList0.get(336488199);
    tp2.IP iP47 = singlyLinkedList0.get(3145728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 167772288+ "'", i16.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test255"); }


    int i1 = java.lang.Integer.signum(8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test256"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    boolean b18 = strictlySortedSinglyLinkedList14.contains(iPBan17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setFirst((java.lang.Integer)0);
    java.lang.Integer i28 = iP24.getSecond();
    iPBan17.setIp(iP24);
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b47 = server30.removeException(iP42);
    iPBan17.setIp(iP42);
    singlyLinkedList0.add(iP42);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    tp2.IP iP66 = null;
    tp2.IPBan iPBan68 = new tp2.IPBan(iP66, (java.lang.Long)(-1L));
    boolean b69 = strictlySortedSinglyLinkedList50.contains(iPBan68);
    tp2.IPBan iPBan71 = strictlySortedSinglyLinkedList50.get((-2147483648));
    tp2.Server server72 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList73 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b79 = strictlySortedSinglyLinkedList73.containsIP(iP78);
    java.lang.Integer i80 = iP78.getFourth();
    boolean b81 = server72.addException(iP78);
    iP78.setSecond((java.lang.Integer)3);
    boolean b84 = strictlySortedSinglyLinkedList50.removeFromIP(iP78);
    singlyLinkedList0.add(iP78);
    iP78.setSecond((java.lang.Integer)(-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 10+ "'", i80.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test257"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.removeBan(iP31);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP31, (java.lang.Long)83886146L);
    java.lang.Integer i38 = iP31.getThird();
    iP31.setFourth((java.lang.Integer)2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 1+ "'", i38.equals(1));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test258"); }


    int i1 = java.lang.Integer.signum(301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test259"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    java.lang.Long long16 = iPBan3.getExpires();
    tp2.IP iP17 = iPBan3.getIp();
    java.lang.Integer i18 = null;
    iP17.setFourth(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test260"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)(-1L));
    boolean b24 = strictlySortedSinglyLinkedList14.contains(iPBan23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList25.containsIP(iP30);
    tp2.IPBan iPBan33 = strictlySortedSinglyLinkedList25.get((-1));
    boolean b34 = strictlySortedSinglyLinkedList25.isEmpty();
    tp2.IP iP35 = null;
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)(-1L));
    boolean b38 = strictlySortedSinglyLinkedList25.contains(iPBan37);
    boolean b39 = strictlySortedSinglyLinkedList14.add(iPBan37);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    int i41 = singlyLinkedList40.getSize();
    boolean b42 = singlyLinkedList40.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b49 = strictlySortedSinglyLinkedList43.containsIP(iP48);
    iP48.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan53 = new tp2.IPBan(iP48, (java.lang.Long)0L);
    iP48.setFourth((java.lang.Integer)(-2147483638));
    boolean b56 = singlyLinkedList40.remove(iP48);
    int i57 = singlyLinkedList40.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    iP63.setFirst((java.lang.Integer)0);
    iP63.setSecond((java.lang.Integer)0);
    iP63.setThird((java.lang.Integer)(-2146959350));
    iP63.setSecond((java.lang.Integer)524288);
    boolean b73 = singlyLinkedList40.remove(iP63);
    boolean b74 = strictlySortedSinglyLinkedList14.containsIP(iP63);
    tp2.SinglyLinkedList singlyLinkedList75 = new tp2.SinglyLinkedList();
    int i76 = singlyLinkedList75.getSize();
    tp2.IP iP77 = null;
    singlyLinkedList75.add(iP77);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b84 = singlyLinkedList75.contains(iP83);
    iP83.setFirst((java.lang.Integer)7);
    boolean b87 = iP63.equals((java.lang.Object)7);
    iP63.setFourth((java.lang.Integer)27);
    singlyLinkedList0.add(iP63);
    tp2.IP iP92 = singlyLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test261"); }


    int i2 = java.lang.Integer.min(6291456, 268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test262"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    iP6.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i10 = iP6.getFourth();
    java.lang.Integer i11 = iP6.getFirst();
    boolean b12 = server0.connect(iP6);
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)(-1L));
    tp2.Server server16 = new tp2.Server();
    server16.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    boolean b31 = iP29.equals((java.lang.Object)singlyLinkedList30);
    java.lang.Integer i32 = iP29.getThird();
    boolean b33 = strictlySortedSinglyLinkedList18.removeFromIP(iP29);
    boolean b35 = iP29.equals((java.lang.Object)0);
    java.lang.Integer i36 = iP29.getThird();
    java.lang.Integer i37 = iP29.getFirst();
    iP29.setFourth((java.lang.Integer)20971536);
    tp2.Server server40 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList41.containsIP(iP46);
    java.lang.Integer i48 = iP46.getFourth();
    boolean b49 = server40.addException(iP46);
    boolean b50 = iP29.equals((java.lang.Object)iP46);
    boolean b51 = server16.removeException(iP46);
    iPBan15.setIp(iP46);
    boolean b53 = server0.removeException(iP46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    boolean b67 = iP65.equals((java.lang.Object)singlyLinkedList66);
    java.lang.Integer i68 = iP65.getThird();
    boolean b69 = strictlySortedSinglyLinkedList54.removeFromIP(iP65);
    java.lang.Integer i70 = iP65.getThird();
    iP65.setFirst((java.lang.Integer)(-1979711360));
    boolean b73 = server0.addBan(iP65);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP65, (java.lang.Long)4294967295L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-2147483638)+ "'", i11.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 167772288+ "'", i32.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 167772288+ "'", i36.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-2147483638)+ "'", i37.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 167772288+ "'", i68.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 167772288+ "'", i70.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test263"); }


    int i2 = java.lang.Integer.divideUnsigned(512, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 128);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test264"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP12 = null;
    singlyLinkedList10.add(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList10.add(iP18);
    singlyLinkedList0.add(iP18);
    int i21 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test265"); }


    int i1 = java.lang.Integer.reverseBytes(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test266"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    int i20 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    boolean b22 = singlyLinkedList21.isEmpty();
    tp2.IP iP24 = singlyLinkedList21.get(0);
    int i25 = singlyLinkedList21.getSize();
    boolean b26 = singlyLinkedList21.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    boolean b40 = iP38.equals((java.lang.Object)singlyLinkedList39);
    java.lang.Integer i41 = iP38.getThird();
    boolean b42 = strictlySortedSinglyLinkedList27.removeFromIP(iP38);
    boolean b44 = iP38.equals((java.lang.Object)0);
    java.lang.Integer i45 = iP38.getThird();
    java.lang.Integer i46 = iP38.getFirst();
    iP38.setFourth((java.lang.Integer)20971536);
    iP38.setSecond((java.lang.Integer)10);
    singlyLinkedList21.add(iP38);
    boolean b52 = strictlySortedSinglyLinkedList0.removeFromIP(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 167772288+ "'", i41.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-2147483638)+ "'", i46.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test267"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    iP28.setFirst((java.lang.Integer)0);
    iP28.setFourth((java.lang.Integer)7);
    boolean b35 = iP28.equals((java.lang.Object)"");
    boolean b36 = server0.addException(iP28);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    int i38 = singlyLinkedList37.getSize();
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    int i40 = singlyLinkedList39.getSize();
    tp2.IP iP42 = singlyLinkedList39.get(10);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList39.add(iP47);
    iP47.setThird((java.lang.Integer)120000020);
    singlyLinkedList37.add(iP47);
    iP47.setThird((java.lang.Integer)83886080);
    boolean b54 = server0.addException(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test268"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    iP21.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList28.removeFromIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    boolean b43 = strictlySortedSinglyLinkedList28.contains(iPBan42);
    boolean b44 = strictlySortedSinglyLinkedList0.add(iPBan42);
    boolean b45 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan47 = strictlySortedSinglyLinkedList0.get(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan47);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test269"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)110592, (java.lang.Integer)2, (java.lang.Integer)2048, (java.lang.Integer)131137);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test270"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("40", (java.lang.Integer)107374182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 107374182+ "'", i2.equals(107374182));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test271"); }


    int i2 = java.lang.Integer.divideUnsigned(67112960, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test272"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b34 = iP28.equals((java.lang.Object)0);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP40 = null;
    singlyLinkedList38.add(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = singlyLinkedList38.contains(iP46);
    iP46.setFirst((java.lang.Integer)(-2147483638));
    boolean b50 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan61 = new tp2.IPBan(iP56, (java.lang.Long)0L);
    boolean b62 = strictlySortedSinglyLinkedList0.add(iPBan61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList63 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b69 = strictlySortedSinglyLinkedList63.containsIP(iP68);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList75 = new tp2.SinglyLinkedList();
    boolean b76 = iP74.equals((java.lang.Object)singlyLinkedList75);
    java.lang.Integer i77 = iP74.getThird();
    boolean b78 = strictlySortedSinglyLinkedList63.removeFromIP(iP74);
    int i79 = strictlySortedSinglyLinkedList63.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList80 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b86 = strictlySortedSinglyLinkedList80.containsIP(iP85);
    java.lang.Integer i87 = iP85.getFourth();
    tp2.IPBan iPBan89 = new tp2.IPBan(iP85, (java.lang.Long)0L);
    boolean b90 = strictlySortedSinglyLinkedList63.add(iPBan89);
    tp2.IP iP91 = iPBan89.getIp();
    boolean b92 = strictlySortedSinglyLinkedList0.contains(iPBan89);
    boolean b93 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 167772288+ "'", i77.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 10+ "'", i87.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test273"); }


    int i2 = java.lang.Integer.compareUnsigned(83886080, 26214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test274"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    boolean b3 = server0.bansOkTime();
    tp2.Server server4 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    boolean b18 = iP16.equals((java.lang.Object)singlyLinkedList17);
    java.lang.Integer i19 = iP16.getThird();
    boolean b20 = strictlySortedSinglyLinkedList5.removeFromIP(iP16);
    boolean b21 = server4.removeException(iP16);
    server4.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    iP28.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i32 = iP28.getFourth();
    java.lang.Integer i33 = iP28.getFirst();
    iP28.setFirst((java.lang.Integer)20971536);
    boolean b36 = server4.addException(iP28);
    boolean b37 = server0.addException(iP28);
    boolean b38 = server0.notSharedElements();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b45 = strictlySortedSinglyLinkedList39.containsIP(iP44);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    boolean b52 = iP50.equals((java.lang.Object)singlyLinkedList51);
    java.lang.Integer i53 = iP50.getThird();
    boolean b54 = strictlySortedSinglyLinkedList39.removeFromIP(iP50);
    boolean b56 = iP50.equals((java.lang.Object)0);
    java.lang.Integer i57 = iP50.getThird();
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    int i59 = singlyLinkedList58.getSize();
    tp2.IP iP60 = null;
    singlyLinkedList58.add(iP60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList58.add(iP66);
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    int i69 = singlyLinkedList68.getSize();
    tp2.IP iP70 = null;
    singlyLinkedList68.add(iP70);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList68.add(iP76);
    singlyLinkedList58.add(iP76);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList79 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b85 = strictlySortedSinglyLinkedList79.containsIP(iP84);
    iP84.setFirst((java.lang.Integer)0);
    java.lang.Integer i88 = iP84.getSecond();
    singlyLinkedList58.add(iP84);
    java.lang.Integer i90 = iP84.getSecond();
    boolean b91 = iP50.equals((java.lang.Object)i90);
    boolean b92 = server0.addException(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 167772288+ "'", i19.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 10+ "'", i32.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-2147483638)+ "'", i33.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 167772288+ "'", i53.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 167772288+ "'", i57.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 100+ "'", i88.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + 100+ "'", i90.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test275"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    iPBan2.setExpires((java.lang.Long)2147483647L);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test276"); }


    java.lang.Integer i1 = new java.lang.Integer("14155776");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 14155776+ "'", i1.equals(14155776));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test277"); }


    int i2 = java.lang.Integer.compareUnsigned(14155776, 1073745921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test278"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("18875478", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test279"); }


    int i1 = java.lang.Integer.bitCount(45413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test280"); }


    int i2 = java.lang.Integer.sum(536870912, 83886146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 620757058);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test281"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.ITime iTime18 = null;
    server0.setTime(iTime18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)41943073, (java.lang.Integer)(-805306368), (java.lang.Integer)13, (java.lang.Integer)37);
    boolean b25 = server0.removeBan(iP24);
    tp2.ITime iTime26 = null;
    server0.setTime(iTime26);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test282"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    iP21.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList28.removeFromIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    boolean b43 = strictlySortedSinglyLinkedList28.contains(iPBan42);
    boolean b44 = strictlySortedSinglyLinkedList0.add(iPBan42);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    boolean b58 = iP56.equals((java.lang.Object)singlyLinkedList57);
    java.lang.Integer i59 = iP56.getThird();
    boolean b60 = strictlySortedSinglyLinkedList45.removeFromIP(iP56);
    tp2.IP iP61 = null;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)(-1L));
    boolean b64 = strictlySortedSinglyLinkedList45.contains(iPBan63);
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList45.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b68 = strictlySortedSinglyLinkedList67.isEmpty();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList67.removeFromIP(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP79, (java.lang.Long)100L);
    boolean b82 = strictlySortedSinglyLinkedList67.contains(iPBan81);
    boolean b83 = strictlySortedSinglyLinkedList45.add(iPBan81);
    boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan81);
    int i85 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan87 = strictlySortedSinglyLinkedList0.get(21884);
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    boolean b93 = strictlySortedSinglyLinkedList0.removeFromIP(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 167772288+ "'", i59.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test283"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10101010111110", 1073741824);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test284"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4144504", (java.lang.Integer)3145728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 3145728+ "'", i2.equals(3145728));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test285"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10280002", 84156416);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test286"); }


    int i2 = java.lang.Integer.parseInt("42", 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 30);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test287"); }


    int i2 = java.lang.Integer.compareUnsigned(26214, 541208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test288"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan24);
    tp2.Server server27 = new tp2.Server();
    server27.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    boolean b42 = iP40.equals((java.lang.Object)singlyLinkedList41);
    java.lang.Integer i43 = iP40.getThird();
    boolean b44 = strictlySortedSinglyLinkedList29.removeFromIP(iP40);
    boolean b46 = iP40.equals((java.lang.Object)0);
    java.lang.Integer i47 = iP40.getThird();
    java.lang.Integer i48 = iP40.getFirst();
    iP40.setFourth((java.lang.Integer)20971536);
    tp2.Server server51 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b58 = strictlySortedSinglyLinkedList52.containsIP(iP57);
    java.lang.Integer i59 = iP57.getFourth();
    boolean b60 = server51.addException(iP57);
    boolean b61 = iP40.equals((java.lang.Object)iP57);
    boolean b62 = server27.removeException(iP57);
    boolean b63 = strictlySortedSinglyLinkedList0.removeFromIP(iP57);
    tp2.IPBan iPBan65 = strictlySortedSinglyLinkedList0.get(11);
    int i66 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan68 = strictlySortedSinglyLinkedList0.get(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 167772288+ "'", i47.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-2147483638)+ "'", i48.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 10+ "'", i59.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan68);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test289"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010000000000000000000000000000"+ "'", str1.equals("10010000000000000000000000000000"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test290"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    java.lang.Integer i12 = iP9.getSecond();
    iP9.setFirst((java.lang.Integer)(-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test291"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("4000", 3);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test292"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    iP5.setSecond((java.lang.Integer)0);
    java.lang.Integer i11 = iP5.getSecond();
    iP5.setSecond((java.lang.Integer)201981953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test293"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("110000000000001011100", 3);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test294"); }


    int i1 = java.lang.Integer.reverseBytes(2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 270336);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test295"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test296"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP5 = singlyLinkedList0.get(2711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test297"); }


    int i1 = java.lang.Integer.signum(578813984);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test298"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b29 = iP23.equals((java.lang.Object)0);
    java.lang.Integer i30 = iP23.getThird();
    java.lang.Integer i31 = iP23.getFirst();
    iP23.setFourth((java.lang.Integer)20971536);
    tp2.Server server34 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    java.lang.Integer i42 = iP40.getFourth();
    boolean b43 = server34.addException(iP40);
    boolean b44 = iP23.equals((java.lang.Object)iP40);
    boolean b45 = server0.connect(iP23);
    boolean b46 = server0.notSharedElements();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    boolean b54 = server0.removeException(iP51);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i60 = iP59.getFourth();
    java.lang.Integer i61 = iP59.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList62.containsIP(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    boolean b75 = iP73.equals((java.lang.Object)singlyLinkedList74);
    java.lang.Integer i76 = iP73.getThird();
    boolean b77 = strictlySortedSinglyLinkedList62.removeFromIP(iP73);
    tp2.IP iP78 = null;
    tp2.IPBan iPBan80 = new tp2.IPBan(iP78, (java.lang.Long)(-1L));
    boolean b81 = strictlySortedSinglyLinkedList62.contains(iPBan80);
    tp2.IPBan iPBan83 = strictlySortedSinglyLinkedList62.get((-2147483648));
    boolean b84 = iP59.equals((java.lang.Object)strictlySortedSinglyLinkedList62);
    java.lang.Integer i85 = iP59.getFourth();
    boolean b86 = server0.removeException(iP59);
    tp2.ITime iTime87 = null;
    server0.setTime(iTime87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 167772288+ "'", i30.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483638)+ "'", i31.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 10+ "'", i42.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 10+ "'", i60.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 167772288+ "'", i61.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 167772288+ "'", i76.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 10+ "'", i85.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test299"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.Server server3 = new tp2.Server();
    tp2.ITime iTime4 = null;
    server3.setTime(iTime4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = iP17.equals((java.lang.Object)singlyLinkedList18);
    java.lang.Integer i20 = iP17.getThird();
    boolean b21 = strictlySortedSinglyLinkedList6.removeFromIP(iP17);
    boolean b23 = iP17.equals((java.lang.Object)0);
    boolean b24 = server3.addException(iP17);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP17, (java.lang.Long)120000020L);
    boolean b27 = server0.addException(iP17);
    tp2.ITime iTime28 = null;
    server0.setTime(iTime28);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    tp2.IP iP32 = null;
    singlyLinkedList30.add(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList30.add(iP38);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    int i41 = singlyLinkedList40.getSize();
    tp2.IP iP42 = null;
    singlyLinkedList40.add(iP42);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList40.add(iP48);
    singlyLinkedList30.add(iP48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setFirst((java.lang.Integer)0);
    java.lang.Integer i60 = iP56.getSecond();
    singlyLinkedList30.add(iP56);
    java.lang.Integer i62 = iP56.getSecond();
    boolean b63 = server0.removeBan(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test300"); }


    java.lang.Integer i1 = java.lang.Integer.decode("111010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 111010+ "'", i1.equals(111010));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test301"); }


    int i2 = java.lang.Integer.min(40, 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test302"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b34 = iP28.equals((java.lang.Object)0);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP40 = null;
    singlyLinkedList38.add(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = singlyLinkedList38.contains(iP46);
    iP46.setFirst((java.lang.Integer)(-2147483638));
    boolean b50 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan61 = new tp2.IPBan(iP56, (java.lang.Long)0L);
    boolean b62 = strictlySortedSinglyLinkedList0.add(iPBan61);
    int i63 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan65 = strictlySortedSinglyLinkedList0.get(10942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan65);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test303"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)0L);
    tp2.IP iP11 = iPBan10.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test304"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    iP7.setSecond((java.lang.Integer)2);
    boolean b12 = singlyLinkedList0.contains(iP7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP14 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP14, (java.lang.Long)0L);
    boolean b17 = strictlySortedSinglyLinkedList13.contains(iPBan16);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Integer i27 = iP23.getSecond();
    iPBan16.setIp(iP23);
    iPBan16.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iPBan16.setIp(iP37);
    singlyLinkedList0.add(iP37);
    java.lang.Integer i41 = iP37.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    tp2.IP iP49 = null;
    tp2.IPBan iPBan51 = new tp2.IPBan(iP49, (java.lang.Long)(-1L));
    boolean b52 = strictlySortedSinglyLinkedList42.contains(iPBan51);
    tp2.Server server53 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    boolean b67 = iP65.equals((java.lang.Object)singlyLinkedList66);
    java.lang.Integer i68 = iP65.getThird();
    boolean b69 = strictlySortedSinglyLinkedList54.removeFromIP(iP65);
    boolean b70 = server53.removeException(iP65);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList71 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b77 = strictlySortedSinglyLinkedList71.containsIP(iP76);
    tp2.IPBan iPBan79 = strictlySortedSinglyLinkedList71.get((-1));
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan86 = new tp2.IPBan(iP84, (java.lang.Long)100L);
    boolean b87 = strictlySortedSinglyLinkedList71.removeFromIP(iP84);
    boolean b88 = server53.removeBan(iP84);
    java.lang.Integer i89 = iP84.getFirst();
    iPBan51.setIp(iP84);
    java.lang.Integer i91 = iP84.getSecond();
    iP84.setFourth((java.lang.Integer)18875478);
    java.lang.Integer i94 = iP84.getFirst();
    boolean b95 = iP37.equals((java.lang.Object)i94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 167772288+ "'", i41.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 167772288+ "'", i68.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + 10+ "'", i89.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 10+ "'", i91.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i94 + "' != '" + 10+ "'", i94.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test305"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    int i17 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test306"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList14.get((-1));
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    boolean b30 = strictlySortedSinglyLinkedList14.removeFromIP(iP27);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    boolean b38 = strictlySortedSinglyLinkedList14.removeFromIP(iP35);
    singlyLinkedList0.add(iP35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    boolean b53 = iP51.equals((java.lang.Object)singlyLinkedList52);
    java.lang.Integer i54 = iP51.getThird();
    boolean b55 = strictlySortedSinglyLinkedList40.removeFromIP(iP51);
    java.lang.Integer i56 = iP51.getThird();
    iP51.setFirst((java.lang.Integer)(-1979711360));
    iP51.setFirst((java.lang.Integer)(-2147483648));
    singlyLinkedList0.add(iP51);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)3, (java.lang.Integer)1000, (java.lang.Integer)1074266112);
    singlyLinkedList0.add(iP66);
    iP66.setFourth((java.lang.Integer)31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 167772288+ "'", i54.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 167772288+ "'", i56.equals(167772288));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test307"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)153745152, (java.lang.Integer)23, (java.lang.Integer)1073746921, (java.lang.Integer)884736);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test308"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = null;
    tp2.IPBan iPBan10 = new tp2.IPBan(iP8, (java.lang.Long)0L);
    boolean b11 = strictlySortedSinglyLinkedList7.contains(iPBan10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i17 = iP16.getFourth();
    boolean b18 = strictlySortedSinglyLinkedList7.removeFromIP(iP16);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)0L);
    boolean b23 = strictlySortedSinglyLinkedList19.contains(iPBan22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)0L);
    boolean b28 = strictlySortedSinglyLinkedList24.contains(iPBan27);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    iP34.setFirst((java.lang.Integer)0);
    java.lang.Integer i38 = iP34.getSecond();
    iPBan27.setIp(iP34);
    boolean b40 = strictlySortedSinglyLinkedList19.contains(iPBan27);
    boolean b41 = strictlySortedSinglyLinkedList7.contains(iPBan27);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    boolean b55 = iP53.equals((java.lang.Object)singlyLinkedList54);
    java.lang.Integer i56 = iP53.getThird();
    boolean b57 = strictlySortedSinglyLinkedList42.removeFromIP(iP53);
    tp2.IP iP58 = null;
    tp2.IPBan iPBan60 = new tp2.IPBan(iP58, (java.lang.Long)(-1L));
    boolean b61 = strictlySortedSinglyLinkedList42.contains(iPBan60);
    tp2.IPBan iPBan63 = strictlySortedSinglyLinkedList42.get(1);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i69 = iP68.getFourth();
    boolean b70 = strictlySortedSinglyLinkedList42.containsIP(iP68);
    tp2.SinglyLinkedList singlyLinkedList71 = new tp2.SinglyLinkedList();
    int i72 = singlyLinkedList71.getSize();
    tp2.IP iP73 = null;
    singlyLinkedList71.add(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b80 = singlyLinkedList71.contains(iP79);
    boolean b81 = strictlySortedSinglyLinkedList42.removeFromIP(iP79);
    boolean b82 = strictlySortedSinglyLinkedList7.removeFromIP(iP79);
    tp2.IPBan iPBan84 = new tp2.IPBan(iP79, (java.lang.Long)6L);
    tp2.SinglyLinkedList singlyLinkedList85 = new tp2.SinglyLinkedList();
    boolean b86 = singlyLinkedList85.isEmpty();
    boolean b87 = singlyLinkedList85.isEmpty();
    int i88 = singlyLinkedList85.getSize();
    tp2.IP iP90 = singlyLinkedList85.get(100);
    tp2.IP iP95 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i96 = iP95.getFirst();
    singlyLinkedList85.add(iP95);
    iPBan84.setIp(iP95);
    boolean b99 = strictlySortedSinglyLinkedList0.removeFromIP(iP95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 10+ "'", i17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100+ "'", i38.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 167772288+ "'", i56.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 10+ "'", i69.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + 67109184+ "'", i96.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test309"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)0L);
    boolean b16 = strictlySortedSinglyLinkedList12.contains(iPBan15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)0L);
    boolean b21 = strictlySortedSinglyLinkedList17.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setFirst((java.lang.Integer)0);
    java.lang.Integer i31 = iP27.getSecond();
    iPBan20.setIp(iP27);
    boolean b33 = strictlySortedSinglyLinkedList12.contains(iPBan20);
    boolean b34 = strictlySortedSinglyLinkedList0.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    iP40.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, (java.lang.Long)0L);
    boolean b46 = strictlySortedSinglyLinkedList0.add(iPBan45);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)0L);
    boolean b51 = strictlySortedSinglyLinkedList47.contains(iPBan50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i57 = iP56.getFourth();
    boolean b58 = strictlySortedSinglyLinkedList47.removeFromIP(iP56);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList59 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = null;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP60, (java.lang.Long)0L);
    boolean b63 = strictlySortedSinglyLinkedList59.contains(iPBan62);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP65 = null;
    tp2.IPBan iPBan67 = new tp2.IPBan(iP65, (java.lang.Long)0L);
    boolean b68 = strictlySortedSinglyLinkedList64.contains(iPBan67);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b75 = strictlySortedSinglyLinkedList69.containsIP(iP74);
    iP74.setFirst((java.lang.Integer)0);
    java.lang.Integer i78 = iP74.getSecond();
    iPBan67.setIp(iP74);
    boolean b80 = strictlySortedSinglyLinkedList59.contains(iPBan67);
    boolean b81 = strictlySortedSinglyLinkedList47.contains(iPBan67);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList82 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b88 = strictlySortedSinglyLinkedList82.containsIP(iP87);
    iP87.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan92 = new tp2.IPBan(iP87, (java.lang.Long)0L);
    boolean b93 = strictlySortedSinglyLinkedList47.add(iPBan92);
    boolean b94 = strictlySortedSinglyLinkedList0.add(iPBan92);
    tp2.IPBan iPBan96 = strictlySortedSinglyLinkedList0.get(1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan96);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test310"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "144"+ "'", str1.equals("144"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test311"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(400000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2765702000"+ "'", str1.equals("2765702000"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test312"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(15, 1728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "15"+ "'", str2.equals("15"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test313"); }


    java.lang.Integer i1 = new java.lang.Integer(3691036);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3691036+ "'", i1.equals(3691036));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test314"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("13420111031214");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test315"); }


    int i2 = java.lang.Integer.divideUnsigned(1, 8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test316"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan24);
    tp2.Server server27 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    iP33.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i37 = iP33.getFourth();
    java.lang.Integer i38 = iP33.getFirst();
    boolean b39 = server27.connect(iP33);
    boolean b40 = strictlySortedSinglyLinkedList0.containsIP(iP33);
    int i41 = strictlySortedSinglyLinkedList0.getSize();
    boolean b42 = strictlySortedSinglyLinkedList0.isEmpty();
    int i43 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP44 = null;
    boolean b45 = strictlySortedSinglyLinkedList0.containsIP(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 10+ "'", i37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483638)+ "'", i38.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test317"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("72");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 72+ "'", i1.equals(72));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test318"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    iP6.setThird((java.lang.Integer)41943073);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    java.lang.Integer i12 = iP6.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-2147483638)+ "'", i12.equals((-2147483638)));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test319"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2143813622));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2151153674L);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test320"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(117440512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "700000000"+ "'", str1.equals("700000000"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test321"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    server0.update();
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)0L);
    tp2.Server server23 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = iP35.equals((java.lang.Object)singlyLinkedList36);
    java.lang.Integer i38 = iP35.getThird();
    boolean b39 = strictlySortedSinglyLinkedList24.removeFromIP(iP35);
    boolean b40 = server23.removeException(iP35);
    server23.update();
    tp2.ITime iTime42 = null;
    server23.setTime(iTime42);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    boolean b50 = iP48.equals((java.lang.Object)singlyLinkedList49);
    iP48.setSecond((java.lang.Integer)2);
    boolean b53 = server23.removeBan(iP48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b55 = strictlySortedSinglyLinkedList54.isEmpty();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList54.removeFromIP(iP60);
    iP60.setThird((java.lang.Integer)41943073);
    boolean b64 = server23.removeException(iP60);
    java.lang.Integer i65 = iP60.getSecond();
    iPBan22.setIp(iP60);
    iP60.setFirst((java.lang.Integer)27);
    boolean b69 = server0.addException(iP60);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList70 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP71 = null;
    tp2.IPBan iPBan73 = new tp2.IPBan(iP71, (java.lang.Long)0L);
    boolean b74 = strictlySortedSinglyLinkedList70.contains(iPBan73);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList75 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b81 = strictlySortedSinglyLinkedList75.containsIP(iP80);
    iP80.setFirst((java.lang.Integer)0);
    java.lang.Integer i84 = iP80.getSecond();
    iPBan73.setIp(iP80);
    boolean b86 = server0.removeException(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 100+ "'", i84.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test322"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    iPBan3.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList18.removeFromIP(iP24);
    iPBan3.setIp(iP24);
    java.lang.Long long27 = iPBan3.getExpires();
    java.lang.Long long28 = iPBan3.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L+ "'", long27.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L+ "'", long28.equals(100L));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test323"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    boolean b19 = server0.bansOkTime();
    tp2.ITime iTime20 = null;
    server0.setTime(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test324"); }


    java.lang.Integer i1 = new java.lang.Integer("16");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 16+ "'", i1.equals(16));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test325"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.notSharedElements();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test326"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    iPBan2.setExpires((java.lang.Long)10L);
    java.lang.Long long5 = iPBan2.getExpires();
    tp2.Server server6 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = iP18.equals((java.lang.Object)singlyLinkedList19);
    java.lang.Integer i21 = iP18.getThird();
    boolean b22 = strictlySortedSinglyLinkedList7.removeFromIP(iP18);
    boolean b23 = server6.removeException(iP18);
    server6.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList25.containsIP(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    boolean b38 = iP36.equals((java.lang.Object)singlyLinkedList37);
    java.lang.Integer i39 = iP36.getThird();
    boolean b40 = strictlySortedSinglyLinkedList25.removeFromIP(iP36);
    boolean b42 = iP36.equals((java.lang.Object)0);
    java.lang.Integer i43 = iP36.getThird();
    java.lang.Integer i44 = iP36.getFirst();
    iP36.setFourth((java.lang.Integer)20971536);
    tp2.Server server47 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    java.lang.Integer i55 = iP53.getFourth();
    boolean b56 = server47.addException(iP53);
    boolean b57 = iP36.equals((java.lang.Object)iP53);
    boolean b58 = server6.connect(iP53);
    tp2.ITime iTime59 = null;
    server6.setTime(iTime59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b67 = strictlySortedSinglyLinkedList61.containsIP(iP66);
    tp2.IPBan iPBan69 = strictlySortedSinglyLinkedList61.get((-1));
    boolean b70 = strictlySortedSinglyLinkedList61.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList71 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b77 = strictlySortedSinglyLinkedList71.containsIP(iP76);
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList83 = new tp2.SinglyLinkedList();
    boolean b84 = iP82.equals((java.lang.Object)singlyLinkedList83);
    java.lang.Integer i85 = iP82.getThird();
    boolean b86 = strictlySortedSinglyLinkedList71.removeFromIP(iP82);
    boolean b87 = strictlySortedSinglyLinkedList61.removeFromIP(iP82);
    boolean b88 = server6.removeException(iP82);
    iPBan2.setIp(iP82);
    tp2.IP iP90 = iPBan2.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 167772288+ "'", i21.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 167772288+ "'", i39.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-2147483638)+ "'", i44.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 10+ "'", i55.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 167772288+ "'", i85.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP90);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test327"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList41.containsIP(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    boolean b54 = iP52.equals((java.lang.Object)singlyLinkedList53);
    java.lang.Integer i55 = iP52.getThird();
    boolean b56 = strictlySortedSinglyLinkedList41.removeFromIP(iP52);
    tp2.IP iP57 = null;
    tp2.IPBan iPBan59 = new tp2.IPBan(iP57, (java.lang.Long)(-1L));
    boolean b60 = strictlySortedSinglyLinkedList41.contains(iPBan59);
    tp2.IPBan iPBan62 = strictlySortedSinglyLinkedList41.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList63 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b69 = strictlySortedSinglyLinkedList63.containsIP(iP68);
    iP68.setFirst((java.lang.Integer)0);
    java.lang.Integer i72 = iP68.getSecond();
    iP68.setFourth((java.lang.Integer)83886146);
    boolean b75 = strictlySortedSinglyLinkedList41.containsIP(iP68);
    boolean b76 = server0.addException(iP68);
    java.lang.Integer i77 = iP68.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 167772288+ "'", i55.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 0+ "'", i77.equals(0));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test328"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    java.lang.Integer i10 = iP8.getSecond();
    java.lang.Integer i11 = iP8.getFourth();
    iP8.setFirst((java.lang.Integer)34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test329"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    iP5.setSecond((java.lang.Integer)0);
    iP5.setThird((java.lang.Integer)(-2146959350));
    iP5.setSecond((java.lang.Integer)524288);
    tp2.IPBan iPBan16 = new tp2.IPBan(iP5, (java.lang.Long)14155776L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test330"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP5, (java.lang.Long)3145728L);
    tp2.IP iP9 = iPBan8.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test331"); }


    int i2 = java.lang.Integer.divideUnsigned(24, (-2147421086));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test332"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    boolean b16 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    boolean b24 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    int i25 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)0L);
    boolean b30 = strictlySortedSinglyLinkedList26.contains(iPBan29);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    iP36.setFirst((java.lang.Integer)0);
    java.lang.Integer i40 = iP36.getSecond();
    iPBan29.setIp(iP36);
    tp2.Server server42 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b49 = strictlySortedSinglyLinkedList43.containsIP(iP48);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    boolean b56 = iP54.equals((java.lang.Object)singlyLinkedList55);
    java.lang.Integer i57 = iP54.getThird();
    boolean b58 = strictlySortedSinglyLinkedList43.removeFromIP(iP54);
    boolean b59 = server42.removeException(iP54);
    iPBan29.setIp(iP54);
    boolean b61 = strictlySortedSinglyLinkedList0.add(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 167772288+ "'", i57.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test333"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned(23, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test334"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    iPBan2.setExpires((java.lang.Long)10L);
    java.lang.Long long5 = iPBan2.getExpires();
    tp2.Server server6 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = iP18.equals((java.lang.Object)singlyLinkedList19);
    java.lang.Integer i21 = iP18.getThird();
    boolean b22 = strictlySortedSinglyLinkedList7.removeFromIP(iP18);
    boolean b23 = server6.removeException(iP18);
    server6.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList25.containsIP(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    boolean b38 = iP36.equals((java.lang.Object)singlyLinkedList37);
    java.lang.Integer i39 = iP36.getThird();
    boolean b40 = strictlySortedSinglyLinkedList25.removeFromIP(iP36);
    boolean b42 = iP36.equals((java.lang.Object)0);
    java.lang.Integer i43 = iP36.getThird();
    java.lang.Integer i44 = iP36.getFirst();
    iP36.setFourth((java.lang.Integer)20971536);
    tp2.Server server47 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    java.lang.Integer i55 = iP53.getFourth();
    boolean b56 = server47.addException(iP53);
    boolean b57 = iP36.equals((java.lang.Object)iP53);
    boolean b58 = server6.connect(iP53);
    tp2.ITime iTime59 = null;
    server6.setTime(iTime59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b67 = strictlySortedSinglyLinkedList61.containsIP(iP66);
    tp2.IPBan iPBan69 = strictlySortedSinglyLinkedList61.get((-1));
    boolean b70 = strictlySortedSinglyLinkedList61.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList71 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b77 = strictlySortedSinglyLinkedList71.containsIP(iP76);
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList83 = new tp2.SinglyLinkedList();
    boolean b84 = iP82.equals((java.lang.Object)singlyLinkedList83);
    java.lang.Integer i85 = iP82.getThird();
    boolean b86 = strictlySortedSinglyLinkedList71.removeFromIP(iP82);
    boolean b87 = strictlySortedSinglyLinkedList61.removeFromIP(iP82);
    boolean b88 = server6.removeException(iP82);
    iPBan2.setIp(iP82);
    java.lang.Long long90 = iPBan2.getExpires();
    iPBan2.setExpires((java.lang.Long)4294967295L);
    iPBan2.setExpires((java.lang.Long)3L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 167772288+ "'", i21.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 167772288+ "'", i39.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-2147483638)+ "'", i44.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 10+ "'", i55.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 167772288+ "'", i85.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long90 + "' != '" + 10L+ "'", long90.equals(10L));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test335"); }


    int i2 = java.lang.Integer.rotateLeft(2, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 262144);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test336"); }


    int i1 = java.lang.Integer.signum(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test337"); }


    int i1 = java.lang.Integer.signum((-234876861));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test338"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i11 = iP10.getFirst();
    singlyLinkedList0.add(iP10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)21884L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 67109184+ "'", i11.equals(67109184));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test339"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    boolean b17 = iP11.equals((java.lang.Object)0);
    java.lang.Integer i18 = iP11.getFourth();
    tp2.IPBan iPBan20 = new tp2.IPBan(iP11, (java.lang.Long)0L);
    tp2.IP iP21 = iPBan20.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test340"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1107296325, (java.lang.Integer)41943107, (java.lang.Integer)56, (java.lang.Integer)41943107);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test341"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    java.lang.Integer i42 = iP37.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-2147483638)+ "'", i42.equals((-2147483638)));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test342"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1cccef", 58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 58+ "'", i2.equals(58));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test343"); }


    java.lang.Integer i1 = new java.lang.Integer("64");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 64+ "'", i1.equals(64));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test344"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("19h3659", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test345"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("hi!", 131137);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test346"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)0L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)2168455184L);
    iPBan2.setExpires((java.lang.Long)1074266112L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP3);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test347"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    tp2.ITime iTime42 = null;
    server0.setTime(iTime42);
    tp2.ITime iTime44 = null;
    server0.setTime(iTime44);
    server0.update();
    tp2.Server server47 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    boolean b61 = iP59.equals((java.lang.Object)singlyLinkedList60);
    java.lang.Integer i62 = iP59.getThird();
    boolean b63 = strictlySortedSinglyLinkedList48.removeFromIP(iP59);
    boolean b64 = server47.removeException(iP59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b71 = strictlySortedSinglyLinkedList65.containsIP(iP70);
    tp2.IPBan iPBan73 = strictlySortedSinglyLinkedList65.get((-1));
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP78, (java.lang.Long)100L);
    boolean b81 = strictlySortedSinglyLinkedList65.removeFromIP(iP78);
    boolean b82 = server47.removeBan(iP78);
    boolean b83 = server0.addBan(iP78);
    tp2.ITime iTime84 = null;
    server0.setTime(iTime84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 167772288+ "'", i62.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test348"); }


    java.lang.Integer i1 = java.lang.Integer.decode("50");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 50+ "'", i1.equals(50));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test349"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("32", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test350"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2711, 2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2711"+ "'", str2.equals("2711"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test351"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    java.lang.Integer i24 = iP22.getFourth();
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.add(iPBan26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    boolean b41 = iP39.equals((java.lang.Object)singlyLinkedList40);
    java.lang.Integer i42 = iP39.getThird();
    boolean b43 = strictlySortedSinglyLinkedList28.removeFromIP(iP39);
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)(-1L));
    boolean b47 = strictlySortedSinglyLinkedList28.contains(iPBan46);
    boolean b48 = strictlySortedSinglyLinkedList0.contains(iPBan46);
    iPBan46.setExpires((java.lang.Long)64L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 10+ "'", i24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 167772288+ "'", i42.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test352"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b20 = iP14.equals((java.lang.Object)0);
    boolean b21 = server0.addException(iP14);
    server0.update();
    server0.update();
    server0.update();
    boolean b25 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test353"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP21 = null;
    boolean b22 = strictlySortedSinglyLinkedList0.containsIP(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test354"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)11, (java.lang.Integer)64, (java.lang.Integer)(-1979711360), (java.lang.Integer)40);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test355"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("19h3659");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test356"); }


    int i2 = java.lang.Integer.min(11534592, 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 27);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test357"); }


    int i2 = java.lang.Integer.divideUnsigned(1074266112, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 153466587);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test358"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP12 = null;
    singlyLinkedList10.add(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList10.add(iP18);
    singlyLinkedList0.add(iP18);
    tp2.Server server21 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    boolean b35 = iP33.equals((java.lang.Object)singlyLinkedList34);
    java.lang.Integer i36 = iP33.getThird();
    boolean b37 = strictlySortedSinglyLinkedList22.removeFromIP(iP33);
    boolean b38 = server21.removeException(iP33);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b45 = strictlySortedSinglyLinkedList39.containsIP(iP44);
    tp2.IPBan iPBan47 = strictlySortedSinglyLinkedList39.get((-1));
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    boolean b55 = strictlySortedSinglyLinkedList39.removeFromIP(iP52);
    boolean b56 = server21.removeBan(iP52);
    java.lang.Integer i57 = iP52.getFirst();
    java.lang.Integer i58 = iP52.getFourth();
    singlyLinkedList0.add(iP52);
    iP52.setSecond((java.lang.Integer)(-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 167772288+ "'", i36.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 10+ "'", i58.equals(10));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test359"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b20 = iP14.equals((java.lang.Object)0);
    boolean b21 = server0.addException(iP14);
    server0.update();
    tp2.ITime iTime23 = null;
    server0.setTime(iTime23);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = singlyLinkedList25.isEmpty();
    tp2.IP iP28 = singlyLinkedList25.get(0);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    iP34.setFirst((java.lang.Integer)0);
    boolean b38 = singlyLinkedList25.remove(iP34);
    boolean b39 = server0.addBan(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test360"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("e4e1c29");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test361"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = iP18.equals((java.lang.Object)singlyLinkedList19);
    java.lang.Integer i21 = iP18.getThird();
    boolean b22 = strictlySortedSinglyLinkedList7.removeFromIP(iP18);
    int i23 = strictlySortedSinglyLinkedList7.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    java.lang.Integer i31 = iP29.getFourth();
    tp2.IPBan iPBan33 = new tp2.IPBan(iP29, (java.lang.Long)0L);
    boolean b34 = strictlySortedSinglyLinkedList7.add(iPBan33);
    tp2.IP iP35 = iPBan33.getIp();
    boolean b36 = strictlySortedSinglyLinkedList0.add(iPBan33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 167772288+ "'", i21.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 10+ "'", i31.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test362"); }


    int i1 = java.lang.Integer.reverseBytes(500000102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1717947677);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test363"); }


    int i2 = java.lang.Integer.remainderUnsigned(2711, 111010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2711);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test364"); }


    long long1 = java.lang.Integer.toUnsignedLong(268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 268435456L);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test365"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    tp2.IP iP16 = iPBan3.getIp();
    java.lang.Long long17 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, long17);
    java.lang.Long long19 = iPBan18.getExpires();
    iPBan18.setExpires((java.lang.Long)167772288L);
    tp2.IP iP22 = iPBan18.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test366"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("bnatp1", (java.lang.Integer)9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 9+ "'", i2.equals(9));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test367"); }


    int i2 = java.lang.Integer.compareUnsigned(109117472, 2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test368"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("301989888", 953355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 953355+ "'", i2.equals(953355));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test369"); }


    int i2 = java.lang.Integer.max(1073745921, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073745921);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test370"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    java.lang.Long long16 = iPBan3.getExpires();
    tp2.IP iP17 = iPBan3.getIp();
    java.lang.Integer i18 = iP17.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test371"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("34", (java.lang.Integer)107374182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 107374182+ "'", i2.equals(107374182));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test372"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList11.get((-1));
    boolean b20 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)(-1L));
    boolean b24 = strictlySortedSinglyLinkedList11.contains(iPBan23);
    boolean b25 = strictlySortedSinglyLinkedList0.add(iPBan23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.isEmpty();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList26.removeFromIP(iP32);
    boolean b34 = strictlySortedSinglyLinkedList0.removeFromIP(iP32);
    iP32.setFirst((java.lang.Integer)1886470370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test373"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList14.get((-1));
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    boolean b30 = strictlySortedSinglyLinkedList14.removeFromIP(iP27);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    boolean b38 = strictlySortedSinglyLinkedList14.removeFromIP(iP35);
    singlyLinkedList0.add(iP35);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)134217728, (java.lang.Integer)7, (java.lang.Integer)3, (java.lang.Integer)262144);
    boolean b45 = singlyLinkedList0.contains(iP44);
    iP44.setFirst((java.lang.Integer)3691036);
    iP44.setThird((java.lang.Integer)10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test374"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    java.lang.Integer i12 = iP9.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test375"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b34 = iP28.equals((java.lang.Object)0);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    java.lang.Integer i52 = iP49.getThird();
    boolean b53 = strictlySortedSinglyLinkedList38.removeFromIP(iP49);
    int i54 = strictlySortedSinglyLinkedList38.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    java.lang.Integer i62 = iP60.getFourth();
    tp2.IPBan iPBan64 = new tp2.IPBan(iP60, (java.lang.Long)0L);
    boolean b65 = strictlySortedSinglyLinkedList38.add(iPBan64);
    boolean b66 = strictlySortedSinglyLinkedList0.contains(iPBan64);
    java.lang.Long long67 = iPBan64.getExpires();
    iPBan64.setExpires((java.lang.Long)2620936732L);
    iPBan64.setExpires((java.lang.Long)1952471040L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 167772288+ "'", i52.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 10+ "'", i62.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L+ "'", long67.equals(0L));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test376"); }


    int i1 = java.lang.Integer.lowestOneBit(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test377"); }


    int i1 = java.lang.Integer.lowestOneBit((-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268435456);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test378"); }


    int i1 = java.lang.Integer.lowestOneBit(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test379"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2147483645));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20000000003"+ "'", str1.equals("20000000003"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test380"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan24);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    int i28 = singlyLinkedList27.getSize();
    tp2.IP iP29 = null;
    singlyLinkedList27.add(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList27.add(iP35);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    int i38 = singlyLinkedList37.getSize();
    tp2.IP iP39 = null;
    singlyLinkedList37.add(iP39);
    boolean b41 = iP35.equals((java.lang.Object)singlyLinkedList37);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP35, (java.lang.Long)8L);
    tp2.IP iP44 = iPBan43.getIp();
    boolean b45 = strictlySortedSinglyLinkedList0.contains(iPBan43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test381"); }


    int i1 = java.lang.Integer.reverse(10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1118568448));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test382"); }


    int i1 = java.lang.Integer.highestOneBit(2098192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2097152);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test383"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList11.get((-1));
    boolean b20 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)(-1L));
    boolean b24 = strictlySortedSinglyLinkedList11.contains(iPBan23);
    boolean b25 = strictlySortedSinglyLinkedList0.add(iPBan23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.isEmpty();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList26.removeFromIP(iP32);
    boolean b34 = strictlySortedSinglyLinkedList0.removeFromIP(iP32);
    boolean b35 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = singlyLinkedList36.isEmpty();
    boolean b38 = singlyLinkedList36.isEmpty();
    int i39 = singlyLinkedList36.getSize();
    tp2.IP iP41 = singlyLinkedList36.get(100);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i47 = iP46.getFirst();
    singlyLinkedList36.add(iP46);
    boolean b49 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 67109184+ "'", i47.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test384"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)9, (java.lang.Integer)1952471040, (java.lang.Integer)(-892574121), (java.lang.Integer)2147483647);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test385"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)0L);
    boolean b8 = strictlySortedSinglyLinkedList4.contains(iPBan7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)0L);
    boolean b13 = strictlySortedSinglyLinkedList9.contains(iPBan12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    iP19.setFirst((java.lang.Integer)0);
    java.lang.Integer i23 = iP19.getSecond();
    iPBan12.setIp(iP19);
    boolean b25 = strictlySortedSinglyLinkedList4.contains(iPBan12);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan12);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)1073746921, (java.lang.Integer)(-892574121), (java.lang.Integer)16384, (java.lang.Integer)1073745921);
    boolean b32 = strictlySortedSinglyLinkedList0.removeFromIP(iP31);
    tp2.IPBan iPBan34 = strictlySortedSinglyLinkedList0.get(620756992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan34);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test386"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    iP7.setSecond((java.lang.Integer)2);
    boolean b12 = singlyLinkedList0.contains(iP7);
    int i13 = singlyLinkedList0.getSize();
    tp2.IP iP15 = singlyLinkedList0.get(10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test387"); }


    int i2 = java.lang.Integer.divideUnsigned(201981953, 120010962);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test388"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    singlyLinkedList0.add(iP15);
    iP15.setFirst((java.lang.Integer)28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test389"); }


    java.lang.String str1 = java.lang.Integer.toHexString(262144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "40000"+ "'", str1.equals("40000"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test390"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    tp2.IP iP12 = singlyLinkedList9.get(10);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList9.add(iP17);
    iP17.setThird((java.lang.Integer)120000020);
    iP17.setThird((java.lang.Integer)1000);
    boolean b23 = strictlySortedSinglyLinkedList0.removeFromIP(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)0L);
    boolean b28 = strictlySortedSinglyLinkedList24.contains(iPBan27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i34 = iP33.getFourth();
    boolean b35 = strictlySortedSinglyLinkedList24.removeFromIP(iP33);
    boolean b36 = strictlySortedSinglyLinkedList24.isEmpty();
    tp2.Server server37 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    java.lang.Integer i52 = iP49.getThird();
    boolean b53 = strictlySortedSinglyLinkedList38.removeFromIP(iP49);
    boolean b54 = server37.removeException(iP49);
    server37.update();
    tp2.ITime iTime56 = null;
    server37.setTime(iTime56);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    boolean b64 = iP62.equals((java.lang.Object)singlyLinkedList63);
    iP62.setSecond((java.lang.Integer)2);
    boolean b67 = server37.removeBan(iP62);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b69 = strictlySortedSinglyLinkedList68.isEmpty();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b75 = strictlySortedSinglyLinkedList68.removeFromIP(iP74);
    iP74.setThird((java.lang.Integer)41943073);
    boolean b78 = server37.removeException(iP74);
    java.lang.Integer i79 = iP74.getSecond();
    tp2.IPBan iPBan81 = new tp2.IPBan(iP74, (java.lang.Long)100L);
    boolean b82 = strictlySortedSinglyLinkedList24.containsIP(iP74);
    boolean b83 = strictlySortedSinglyLinkedList0.containsIP(iP74);
    tp2.IPBan iPBan85 = strictlySortedSinglyLinkedList0.get(270336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 10+ "'", i34.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 167772288+ "'", i52.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan85);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test391"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    tp2.IP iP16 = iPBan3.getIp();
    java.lang.Long long17 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, long17);
    tp2.IP iP19 = iPBan18.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test392"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test393"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    iP35.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i43 = iP35.getThird();
    boolean b44 = server0.addException(iP35);
    boolean b45 = server0.notSharedElements();
    boolean b46 = server0.notSharedElements();
    tp2.Server server47 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    boolean b61 = iP59.equals((java.lang.Object)singlyLinkedList60);
    java.lang.Integer i62 = iP59.getThird();
    boolean b63 = strictlySortedSinglyLinkedList48.removeFromIP(iP59);
    boolean b64 = server47.removeException(iP59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b71 = strictlySortedSinglyLinkedList65.containsIP(iP70);
    tp2.IPBan iPBan73 = strictlySortedSinglyLinkedList65.get((-1));
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP78, (java.lang.Long)100L);
    boolean b81 = strictlySortedSinglyLinkedList65.removeFromIP(iP78);
    boolean b82 = server47.addBan(iP78);
    iP78.setSecond((java.lang.Integer)41943073);
    iP78.setFirst((java.lang.Integer)27);
    iP78.setSecond((java.lang.Integer)11);
    boolean b89 = server0.connect(iP78);
    tp2.IP iP90 = null;
    boolean b91 = server0.removeBan(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 167772288+ "'", i62.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test394"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("110010", 19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 19+ "'", i2.equals(19));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test395"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(18875478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test396"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    iP4.setFirst((java.lang.Integer)41943073);
    iP4.setSecond((java.lang.Integer)120000020);
    iP4.setFourth((java.lang.Integer)1750);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test397"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("100000000000000", 524288);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test398"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList11.get((-1));
    boolean b20 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)(-1L));
    boolean b24 = strictlySortedSinglyLinkedList11.contains(iPBan23);
    boolean b25 = strictlySortedSinglyLinkedList0.add(iPBan23);
    tp2.IP iP26 = iPBan23.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    iP32.setFirst((java.lang.Integer)0);
    iP32.setSecond((java.lang.Integer)0);
    java.lang.Integer i38 = iP32.getFourth();
    java.lang.Integer i39 = iP32.getSecond();
    iPBan23.setIp(iP32);
    java.lang.Integer i41 = null;
    iP32.setFourth(i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 10+ "'", i38.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 0+ "'", i39.equals(0));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test399"); }


    java.lang.Integer i2 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)131072, (java.lang.Integer)1717947677, i2, (java.lang.Integer)(-234876861));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test400"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2147421086), (-892574121));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2147546210"+ "'", str2.equals("2147546210"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test401"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getFourth();
    java.lang.Integer i7 = iP4.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 67109184+ "'", i5.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 20971536+ "'", i6.equals(20971536));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 67109184+ "'", i7.equals(67109184));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test402"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    singlyLinkedList0.add(iP15);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP15, (java.lang.Long)1073746921L);
    iP15.setFirst((java.lang.Integer)(-1979711360));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test403"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.IP iP11 = iPBan9.getIp();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i17 = iP16.getFourth();
    java.lang.Integer i18 = iP16.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    tp2.IP iP35 = null;
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)(-1L));
    boolean b38 = strictlySortedSinglyLinkedList19.contains(iPBan37);
    tp2.IPBan iPBan40 = strictlySortedSinglyLinkedList19.get((-2147483648));
    boolean b41 = iP16.equals((java.lang.Object)strictlySortedSinglyLinkedList19);
    iPBan9.setIp(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 10+ "'", i17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test404"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    iP8.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i12 = iP8.getFourth();
    java.lang.Integer i13 = iP8.getFirst();
    iP8.setFirst((java.lang.Integer)18875478);
    iPBan2.setIp(iP8);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP24 = null;
    tp2.IPBan iPBan26 = new tp2.IPBan(iP24, (java.lang.Long)(-1L));
    boolean b27 = strictlySortedSinglyLinkedList17.contains(iPBan26);
    tp2.IP iP28 = iPBan26.getIp();
    iP28.setFourth((java.lang.Integer)20971536);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = null;
    tp2.IPBan iPBan34 = new tp2.IPBan(iP32, (java.lang.Long)0L);
    boolean b35 = strictlySortedSinglyLinkedList31.contains(iPBan34);
    boolean b36 = iP28.equals((java.lang.Object)iPBan34);
    iPBan2.setIp(iP28);
    tp2.IP iP38 = null;
    iPBan2.setIp(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-2147483638)+ "'", i13.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test405"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(47159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test406"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("e4e1c29", 805306369);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test407"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(81400010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100110110100001000011001010"+ "'", str1.equals("100110110100001000011001010"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test408"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("301989888", 67108864);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test409"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    iPBan3.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList18.removeFromIP(iP24);
    iPBan3.setIp(iP24);
    tp2.IP iP27 = iPBan3.getIp();
    tp2.IP iP28 = iPBan3.getIp();
    iPBan3.setExpires((java.lang.Long)0L);
    java.lang.Long long31 = iPBan3.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L+ "'", long31.equals(0L));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test410"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(884736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11011000000000000000"+ "'", str1.equals("11011000000000000000"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test411"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList14.get((-1));
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    boolean b30 = strictlySortedSinglyLinkedList14.removeFromIP(iP27);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    boolean b38 = strictlySortedSinglyLinkedList14.removeFromIP(iP35);
    singlyLinkedList0.add(iP35);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    boolean b45 = singlyLinkedList0.contains(iP44);
    java.lang.Integer i46 = iP44.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 67109184+ "'", i46.equals(67109184));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test412"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    iP25.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i34 = iP25.getFirst();
    boolean b35 = server0.removeBan(iP25);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)469762048, (java.lang.Integer)23, (java.lang.Integer)67112960);
    java.lang.Integer i41 = iP40.getFourth();
    boolean b42 = server0.addBan(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 0+ "'", i34.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 67112960+ "'", i41.equals(67112960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test413"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    boolean b18 = strictlySortedSinglyLinkedList14.contains(iPBan17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setFirst((java.lang.Integer)0);
    java.lang.Integer i28 = iP24.getSecond();
    iPBan17.setIp(iP24);
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b47 = server30.removeException(iP42);
    iPBan17.setIp(iP42);
    singlyLinkedList0.add(iP42);
    int i50 = singlyLinkedList0.getSize();
    int i51 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test414"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = null;
    tp2.IPBan iPBan8 = new tp2.IPBan(iP6, (java.lang.Long)0L);
    boolean b9 = strictlySortedSinglyLinkedList5.contains(iPBan8);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b16 = strictlySortedSinglyLinkedList10.containsIP(iP15);
    iP15.setFirst((java.lang.Integer)0);
    java.lang.Integer i19 = iP15.getSecond();
    iPBan8.setIp(iP15);
    boolean b21 = strictlySortedSinglyLinkedList0.contains(iPBan8);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)64, (java.lang.Integer)4, (java.lang.Integer)262144, (java.lang.Integer)167772288);
    iP26.setFourth((java.lang.Integer)10942);
    boolean b29 = strictlySortedSinglyLinkedList0.removeFromIP(iP26);
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList0.get(301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test415"); }


    int i1 = java.lang.Integer.lowestOneBit((-2147483638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test416"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    boolean b10 = server0.notSharedElements();
    boolean b11 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test417"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1728+ "'", i1.equals(1728));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test418"); }


    int i2 = java.lang.Integer.rotateLeft(402653184, (-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25165824);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test419"); }


    int i2 = java.lang.Integer.rotateLeft(3691036, 1107296325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 118113152);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test420"); }


    int i2 = java.lang.Integer.divideUnsigned(81400010, 473453096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test421"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan24);
    tp2.Server server27 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b34 = strictlySortedSinglyLinkedList28.containsIP(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    boolean b41 = iP39.equals((java.lang.Object)singlyLinkedList40);
    java.lang.Integer i42 = iP39.getThird();
    boolean b43 = strictlySortedSinglyLinkedList28.removeFromIP(iP39);
    boolean b44 = server27.removeException(iP39);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    tp2.IPBan iPBan53 = strictlySortedSinglyLinkedList45.get((-1));
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    boolean b61 = strictlySortedSinglyLinkedList45.removeFromIP(iP58);
    boolean b62 = server27.removeBan(iP58);
    tp2.IPBan iPBan64 = new tp2.IPBan(iP58, (java.lang.Long)83886146L);
    tp2.IP iP65 = iPBan64.getIp();
    boolean b66 = strictlySortedSinglyLinkedList0.contains(iPBan64);
    tp2.IP iP67 = iPBan64.getIp();
    java.lang.Integer i68 = iP67.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 167772288+ "'", i42.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 10+ "'", i68.equals(10));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test422"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(25165824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "25165824"+ "'", str1.equals("25165824"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test423"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan2 = strictlySortedSinglyLinkedList0.get(28);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    java.lang.Integer i10 = iP7.getThird();
    iP7.setFourth((java.lang.Integer)37);
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP7);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    boolean b22 = iP18.equals((java.lang.Object)2147483647);
    boolean b23 = strictlySortedSinglyLinkedList0.containsIP(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 167772288+ "'", i10.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test424"); }


    int i2 = java.lang.Integer.sum(0, 1073745921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073745921);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test425"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.Server server22 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    boolean b36 = iP34.equals((java.lang.Object)singlyLinkedList35);
    java.lang.Integer i37 = iP34.getThird();
    boolean b38 = strictlySortedSinglyLinkedList23.removeFromIP(iP34);
    boolean b39 = server22.removeException(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    tp2.IPBan iPBan48 = strictlySortedSinglyLinkedList40.get((-1));
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)100L);
    boolean b56 = strictlySortedSinglyLinkedList40.removeFromIP(iP53);
    boolean b57 = server22.addBan(iP53);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    iP63.setFirst((java.lang.Integer)0);
    java.lang.Integer i67 = iP63.getSecond();
    iP63.setFourth((java.lang.Integer)83886146);
    boolean b70 = server22.removeBan(iP63);
    boolean b71 = strictlySortedSinglyLinkedList0.containsIP(iP63);
    tp2.IPBan iPBan72 = null;
    boolean b73 = strictlySortedSinglyLinkedList0.contains(iPBan72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test426"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 131072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 131072+ "'", i2.equals(131072));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test427"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b16 = strictlySortedSinglyLinkedList10.containsIP(iP15);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    boolean b23 = iP21.equals((java.lang.Object)singlyLinkedList22);
    java.lang.Integer i24 = iP21.getThird();
    boolean b25 = strictlySortedSinglyLinkedList10.removeFromIP(iP21);
    boolean b26 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    java.lang.Integer i27 = iP21.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 167772288+ "'", i24.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 167772288+ "'", i27.equals(167772288));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test428"); }


    java.lang.Integer i1 = new java.lang.Integer((-1118568448));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1118568448)+ "'", i1.equals((-1118568448)));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test429"); }


    int i1 = java.lang.Integer.bitCount(336488199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test430"); }


    java.lang.Integer i1 = new java.lang.Integer("1001000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1001000+ "'", i1.equals(1001000));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test431"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    iP5.setFourth((java.lang.Integer)7);
    boolean b12 = iP5.equals((java.lang.Object)"");
    java.lang.Integer i13 = iP5.getFourth();
    iP5.setSecond((java.lang.Integer)44739413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 7+ "'", i13.equals(7));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test432"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(240000041, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "240000041"+ "'", str2.equals("240000041"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test433"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    boolean b19 = server0.bansOkTime();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = null;
    server20.setTime(iTime21);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    boolean b36 = iP34.equals((java.lang.Object)singlyLinkedList35);
    java.lang.Integer i37 = iP34.getThird();
    boolean b38 = strictlySortedSinglyLinkedList23.removeFromIP(iP34);
    boolean b40 = iP34.equals((java.lang.Object)0);
    boolean b41 = server20.addException(iP34);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP34, (java.lang.Long)120000020L);
    boolean b44 = server0.addBan(iP34);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = singlyLinkedList45.isEmpty();
    boolean b47 = singlyLinkedList45.isEmpty();
    int i48 = singlyLinkedList45.getSize();
    tp2.IP iP50 = singlyLinkedList45.get(100);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)0L);
    boolean b55 = strictlySortedSinglyLinkedList51.contains(iPBan54);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    iP61.setFirst((java.lang.Integer)0);
    java.lang.Integer i65 = iP61.getSecond();
    iPBan54.setIp(iP61);
    tp2.Server server67 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    boolean b81 = iP79.equals((java.lang.Object)singlyLinkedList80);
    java.lang.Integer i82 = iP79.getThird();
    boolean b83 = strictlySortedSinglyLinkedList68.removeFromIP(iP79);
    boolean b84 = server67.removeException(iP79);
    iPBan54.setIp(iP79);
    tp2.IP iP86 = iPBan54.getIp();
    boolean b87 = singlyLinkedList45.remove(iP86);
    boolean b88 = server0.connect(iP86);
    boolean b89 = server0.bansOkTime();
    boolean b90 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 167772288+ "'", i82.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test434"); }


    int i2 = java.lang.Integer.max(0, (-1039663025));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test435"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("124", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test436"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("e4e1c29", (java.lang.Integer)1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1024+ "'", i2.equals(1024));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test437"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)0L);
    boolean b16 = strictlySortedSinglyLinkedList12.contains(iPBan15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)0L);
    boolean b21 = strictlySortedSinglyLinkedList17.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setFirst((java.lang.Integer)0);
    java.lang.Integer i31 = iP27.getSecond();
    iPBan20.setIp(iP27);
    boolean b33 = strictlySortedSinglyLinkedList12.contains(iPBan20);
    boolean b34 = strictlySortedSinglyLinkedList0.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    iP40.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, (java.lang.Long)0L);
    boolean b46 = strictlySortedSinglyLinkedList0.add(iPBan45);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)0L);
    boolean b51 = strictlySortedSinglyLinkedList47.contains(iPBan50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i57 = iP56.getFourth();
    boolean b58 = strictlySortedSinglyLinkedList47.removeFromIP(iP56);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList59 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = null;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP60, (java.lang.Long)0L);
    boolean b63 = strictlySortedSinglyLinkedList59.contains(iPBan62);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP65 = null;
    tp2.IPBan iPBan67 = new tp2.IPBan(iP65, (java.lang.Long)0L);
    boolean b68 = strictlySortedSinglyLinkedList64.contains(iPBan67);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b75 = strictlySortedSinglyLinkedList69.containsIP(iP74);
    iP74.setFirst((java.lang.Integer)0);
    java.lang.Integer i78 = iP74.getSecond();
    iPBan67.setIp(iP74);
    boolean b80 = strictlySortedSinglyLinkedList59.contains(iPBan67);
    boolean b81 = strictlySortedSinglyLinkedList47.contains(iPBan67);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList82 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b88 = strictlySortedSinglyLinkedList82.containsIP(iP87);
    iP87.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan92 = new tp2.IPBan(iP87, (java.lang.Long)0L);
    boolean b93 = strictlySortedSinglyLinkedList47.add(iPBan92);
    boolean b94 = strictlySortedSinglyLinkedList0.add(iPBan92);
    java.lang.Long long95 = iPBan92.getExpires();
    java.lang.Long long96 = iPBan92.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L+ "'", long95.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L+ "'", long96.equals(0L));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test438"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP8 = singlyLinkedList5.get(4);
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    tp2.IP iP11 = null;
    singlyLinkedList9.add(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList9.add(iP17);
    boolean b19 = singlyLinkedList5.contains(iP17);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    boolean b21 = singlyLinkedList20.isEmpty();
    tp2.IP iP23 = singlyLinkedList20.get(0);
    int i24 = singlyLinkedList20.getSize();
    tp2.Server server25 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b32 = strictlySortedSinglyLinkedList26.containsIP(iP31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    boolean b39 = iP37.equals((java.lang.Object)singlyLinkedList38);
    java.lang.Integer i40 = iP37.getThird();
    boolean b41 = strictlySortedSinglyLinkedList26.removeFromIP(iP37);
    boolean b42 = server25.removeException(iP37);
    server25.update();
    tp2.ITime iTime44 = null;
    server25.setTime(iTime44);
    tp2.Server server46 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b53 = strictlySortedSinglyLinkedList47.containsIP(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    boolean b60 = iP58.equals((java.lang.Object)singlyLinkedList59);
    java.lang.Integer i61 = iP58.getThird();
    boolean b62 = strictlySortedSinglyLinkedList47.removeFromIP(iP58);
    boolean b63 = server46.removeException(iP58);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b70 = strictlySortedSinglyLinkedList64.containsIP(iP69);
    tp2.IPBan iPBan72 = strictlySortedSinglyLinkedList64.get((-1));
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)100L);
    boolean b80 = strictlySortedSinglyLinkedList64.removeFromIP(iP77);
    boolean b81 = server46.removeBan(iP77);
    boolean b82 = server25.addException(iP77);
    boolean b83 = singlyLinkedList20.remove(iP77);
    singlyLinkedList5.add(iP77);
    java.lang.Integer i85 = iP77.getSecond();
    java.lang.Integer i86 = iP77.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 167772288+ "'", i40.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 167772288+ "'", i61.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 10+ "'", i85.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 10+ "'", i86.equals(10));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test439"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    int i41 = strictlySortedSinglyLinkedList40.getSize();
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    boolean b43 = singlyLinkedList42.isEmpty();
    tp2.IP iP45 = singlyLinkedList42.get(0);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b52 = strictlySortedSinglyLinkedList46.containsIP(iP51);
    iP51.setFirst((java.lang.Integer)0);
    boolean b55 = singlyLinkedList42.remove(iP51);
    boolean b56 = strictlySortedSinglyLinkedList40.removeFromIP(iP51);
    boolean b57 = server0.removeBan(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test440"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    boolean b3 = server0.bansOkTime();
    boolean b4 = server0.notSharedElements();
    boolean b5 = server0.bansOkTime();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    boolean b12 = iP10.equals((java.lang.Object)singlyLinkedList11);
    tp2.IP iP14 = singlyLinkedList11.get(4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b21 = strictlySortedSinglyLinkedList15.containsIP(iP20);
    java.lang.Integer i22 = iP20.getFourth();
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)0L);
    boolean b25 = singlyLinkedList11.remove(iP20);
    java.lang.Integer i26 = iP20.getThird();
    boolean b27 = server0.addBan(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 10+ "'", i22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test441"); }


    int i2 = java.lang.Integer.remainderUnsigned(67109184, 1572956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1045032);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test442"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "22000000000"+ "'", str1.equals("22000000000"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test443"); }


    java.lang.Integer i0 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)(-1), (java.lang.Integer)1045032, (java.lang.Integer)(-2080374464));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test444"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("32", 65536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 65536+ "'", i2.equals(65536));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test445"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1107558405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "42040005"+ "'", str1.equals("42040005"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test446"); }


    int i1 = java.lang.Integer.highestOneBit(436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268435456);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test447"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    boolean b18 = strictlySortedSinglyLinkedList14.contains(iPBan17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setFirst((java.lang.Integer)0);
    java.lang.Integer i28 = iP24.getSecond();
    iPBan17.setIp(iP24);
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b47 = server30.removeException(iP42);
    iPBan17.setIp(iP42);
    singlyLinkedList0.add(iP42);
    tp2.IP iP51 = singlyLinkedList0.get(270336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test448"); }


    long long1 = java.lang.Integer.toUnsignedLong(1728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1728L);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test449"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList41.containsIP(iP46);
    iP46.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i50 = iP46.getFourth();
    java.lang.Integer i51 = iP46.getFirst();
    iP46.setFirst((java.lang.Integer)20971536);
    boolean b54 = server0.addException(iP46);
    iP46.setSecond((java.lang.Integer)41943076);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 10+ "'", i50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-2147483638)+ "'", i51.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test450"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    boolean b18 = strictlySortedSinglyLinkedList14.contains(iPBan17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setFirst((java.lang.Integer)0);
    java.lang.Integer i28 = iP24.getSecond();
    iPBan17.setIp(iP24);
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b47 = server30.removeException(iP42);
    iPBan17.setIp(iP42);
    singlyLinkedList0.add(iP42);
    boolean b50 = singlyLinkedList0.isEmpty();
    tp2.Server server51 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b58 = strictlySortedSinglyLinkedList52.containsIP(iP57);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    boolean b65 = iP63.equals((java.lang.Object)singlyLinkedList64);
    java.lang.Integer i66 = iP63.getThird();
    boolean b67 = strictlySortedSinglyLinkedList52.removeFromIP(iP63);
    boolean b68 = server51.removeException(iP63);
    server51.update();
    tp2.ITime iTime70 = null;
    server51.setTime(iTime70);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList77 = new tp2.SinglyLinkedList();
    boolean b78 = iP76.equals((java.lang.Object)singlyLinkedList77);
    iP76.setSecond((java.lang.Integer)2);
    boolean b81 = server51.removeBan(iP76);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList82 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b83 = strictlySortedSinglyLinkedList82.isEmpty();
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b89 = strictlySortedSinglyLinkedList82.removeFromIP(iP88);
    iP88.setThird((java.lang.Integer)41943073);
    boolean b92 = server51.removeException(iP88);
    java.lang.Integer i93 = iP88.getSecond();
    iP88.setThird((java.lang.Integer)28);
    iP88.setFirst((java.lang.Integer)118047616);
    boolean b98 = singlyLinkedList0.contains(iP88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 167772288+ "'", i66.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + 100+ "'", i93.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test451"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    iP37.setFourth((java.lang.Integer)(-892574121));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test452"); }


    int i2 = java.lang.Integer.compareUnsigned((-2147483645), 153745152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test453"); }


    int i1 = java.lang.Integer.bitCount(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test454"); }


    java.lang.Integer i1 = java.lang.Integer.decode("40000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 40000000+ "'", i1.equals(40000000));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test455"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP2 = null;
    tp2.IPBan iPBan4 = new tp2.IPBan(iP2, (java.lang.Long)0L);
    boolean b5 = strictlySortedSinglyLinkedList0.contains(iPBan4);
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b7 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test456"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    iP8.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i12 = iP8.getFourth();
    java.lang.Integer i13 = iP8.getFirst();
    iP8.setFirst((java.lang.Integer)18875478);
    iPBan2.setIp(iP8);
    java.lang.Long long17 = iPBan2.getExpires();
    iPBan2.setExpires((java.lang.Long)1705518L);
    java.lang.Long long20 = iPBan2.getExpires();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    boolean b34 = iP32.equals((java.lang.Object)singlyLinkedList33);
    java.lang.Integer i35 = iP32.getThird();
    boolean b36 = strictlySortedSinglyLinkedList21.removeFromIP(iP32);
    boolean b38 = iP32.equals((java.lang.Object)0);
    java.lang.Integer i39 = iP32.getThird();
    iP32.setSecond((java.lang.Integer)8);
    iPBan2.setIp(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-2147483638)+ "'", i13.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L+ "'", long17.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1705518L+ "'", long20.equals(1705518L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 167772288+ "'", i35.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 167772288+ "'", i39.equals(167772288));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test457"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.Server server20 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    boolean b34 = iP32.equals((java.lang.Object)singlyLinkedList33);
    java.lang.Integer i35 = iP32.getThird();
    boolean b36 = strictlySortedSinglyLinkedList21.removeFromIP(iP32);
    boolean b37 = server20.removeException(iP32);
    server20.update();
    tp2.ITime iTime39 = null;
    server20.setTime(iTime39);
    tp2.ITime iTime41 = null;
    server20.setTime(iTime41);
    tp2.Server server43 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList44.containsIP(iP49);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    boolean b57 = iP55.equals((java.lang.Object)singlyLinkedList56);
    java.lang.Integer i58 = iP55.getThird();
    boolean b59 = strictlySortedSinglyLinkedList44.removeFromIP(iP55);
    boolean b60 = server43.removeException(iP55);
    server43.update();
    tp2.ITime iTime62 = null;
    server43.setTime(iTime62);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList69 = new tp2.SinglyLinkedList();
    boolean b70 = iP68.equals((java.lang.Object)singlyLinkedList69);
    iP68.setSecond((java.lang.Integer)2);
    boolean b73 = server43.removeBan(iP68);
    java.lang.Object obj74 = null;
    boolean b75 = iP68.equals(obj74);
    boolean b76 = server20.removeException(iP68);
    java.lang.Integer i77 = null;
    iP68.setSecond(i77);
    boolean b79 = strictlySortedSinglyLinkedList0.removeFromIP(iP68);
    java.lang.Integer i80 = iP68.getSecond();
    java.lang.Integer i81 = iP68.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 167772288+ "'", i35.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 167772288+ "'", i58.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 167772288+ "'", i81.equals(167772288));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test458"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    java.lang.Integer i20 = iP17.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test459"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList16.contains(iPBan25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IPBan iPBan35 = strictlySortedSinglyLinkedList27.get((-1));
    boolean b36 = strictlySortedSinglyLinkedList27.isEmpty();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)(-1L));
    boolean b40 = strictlySortedSinglyLinkedList27.contains(iPBan39);
    boolean b41 = strictlySortedSinglyLinkedList16.add(iPBan39);
    boolean b42 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)3, (java.lang.Integer)1000, (java.lang.Integer)1074266112);
    boolean b48 = strictlySortedSinglyLinkedList0.containsIP(iP47);
    tp2.IP iP49 = null;
    boolean b50 = strictlySortedSinglyLinkedList0.removeFromIP(iP49);
    tp2.IPBan iPBan52 = strictlySortedSinglyLinkedList0.get(238702);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan52);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test460"); }


    int i2 = java.lang.Integer.compare(1728, 2098192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test461"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10010000000000000000000000000000", 8192);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test462"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b20 = iP14.equals((java.lang.Object)0);
    boolean b21 = server0.addException(iP14);
    tp2.ITime iTime22 = null;
    server0.setTime(iTime22);
    server0.update();
    tp2.ITime iTime25 = null;
    server0.setTime(iTime25);
    tp2.ITime iTime27 = null;
    server0.setTime(iTime27);
    tp2.Server server29 = new tp2.Server();
    server29.update();
    boolean b31 = server29.bansOkTime();
    tp2.Server server32 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b39 = strictlySortedSinglyLinkedList33.containsIP(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = iP44.equals((java.lang.Object)singlyLinkedList45);
    java.lang.Integer i47 = iP44.getThird();
    boolean b48 = strictlySortedSinglyLinkedList33.removeFromIP(iP44);
    boolean b49 = server32.removeException(iP44);
    server32.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i60 = iP56.getFourth();
    java.lang.Integer i61 = iP56.getFirst();
    iP56.setFirst((java.lang.Integer)20971536);
    boolean b64 = server32.addException(iP56);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP56, (java.lang.Long)0L);
    java.lang.Integer i67 = iP56.getThird();
    boolean b68 = server29.removeBan(iP56);
    java.lang.Integer i69 = iP56.getFourth();
    boolean b70 = server0.connect(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 167772288+ "'", i47.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 10+ "'", i60.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-2147483638)+ "'", i61.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 167772288+ "'", i67.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 10+ "'", i69.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test463"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    boolean b19 = server0.bansOkTime();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = null;
    server20.setTime(iTime21);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    boolean b36 = iP34.equals((java.lang.Object)singlyLinkedList35);
    java.lang.Integer i37 = iP34.getThird();
    boolean b38 = strictlySortedSinglyLinkedList23.removeFromIP(iP34);
    boolean b40 = iP34.equals((java.lang.Object)0);
    boolean b41 = server20.addException(iP34);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP34, (java.lang.Long)120000020L);
    boolean b44 = server0.addBan(iP34);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = singlyLinkedList45.isEmpty();
    boolean b47 = singlyLinkedList45.isEmpty();
    int i48 = singlyLinkedList45.getSize();
    tp2.IP iP50 = singlyLinkedList45.get(100);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)0L);
    boolean b55 = strictlySortedSinglyLinkedList51.contains(iPBan54);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    iP61.setFirst((java.lang.Integer)0);
    java.lang.Integer i65 = iP61.getSecond();
    iPBan54.setIp(iP61);
    tp2.Server server67 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    boolean b81 = iP79.equals((java.lang.Object)singlyLinkedList80);
    java.lang.Integer i82 = iP79.getThird();
    boolean b83 = strictlySortedSinglyLinkedList68.removeFromIP(iP79);
    boolean b84 = server67.removeException(iP79);
    iPBan54.setIp(iP79);
    tp2.IP iP86 = iPBan54.getIp();
    boolean b87 = singlyLinkedList45.remove(iP86);
    boolean b88 = server0.connect(iP86);
    boolean b89 = server0.bansOkTime();
    boolean b90 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 167772288+ "'", i82.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test464"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test465"); }


    int i1 = java.lang.Integer.signum(1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test466"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b29 = iP23.equals((java.lang.Object)0);
    java.lang.Integer i30 = iP23.getThird();
    java.lang.Integer i31 = iP23.getFirst();
    iP23.setFourth((java.lang.Integer)20971536);
    tp2.Server server34 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    java.lang.Integer i42 = iP40.getFourth();
    boolean b43 = server34.addException(iP40);
    boolean b44 = iP23.equals((java.lang.Object)iP40);
    boolean b45 = server0.connect(iP23);
    boolean b46 = server0.notSharedElements();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    boolean b54 = server0.removeException(iP51);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i60 = iP59.getFourth();
    java.lang.Integer i61 = iP59.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList62.containsIP(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    boolean b75 = iP73.equals((java.lang.Object)singlyLinkedList74);
    java.lang.Integer i76 = iP73.getThird();
    boolean b77 = strictlySortedSinglyLinkedList62.removeFromIP(iP73);
    tp2.IP iP78 = null;
    tp2.IPBan iPBan80 = new tp2.IPBan(iP78, (java.lang.Long)(-1L));
    boolean b81 = strictlySortedSinglyLinkedList62.contains(iPBan80);
    tp2.IPBan iPBan83 = strictlySortedSinglyLinkedList62.get((-2147483648));
    boolean b84 = iP59.equals((java.lang.Object)strictlySortedSinglyLinkedList62);
    java.lang.Integer i85 = iP59.getFourth();
    boolean b86 = server0.removeException(iP59);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 167772288+ "'", i30.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483638)+ "'", i31.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 10+ "'", i42.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 10+ "'", i60.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 167772288+ "'", i61.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 167772288+ "'", i76.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 10+ "'", i85.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test467"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    iP6.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i10 = iP6.getFourth();
    java.lang.Integer i11 = iP6.getFirst();
    boolean b12 = server0.connect(iP6);
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)(-1L));
    tp2.Server server16 = new tp2.Server();
    server16.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    boolean b31 = iP29.equals((java.lang.Object)singlyLinkedList30);
    java.lang.Integer i32 = iP29.getThird();
    boolean b33 = strictlySortedSinglyLinkedList18.removeFromIP(iP29);
    boolean b35 = iP29.equals((java.lang.Object)0);
    java.lang.Integer i36 = iP29.getThird();
    java.lang.Integer i37 = iP29.getFirst();
    iP29.setFourth((java.lang.Integer)20971536);
    tp2.Server server40 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList41.containsIP(iP46);
    java.lang.Integer i48 = iP46.getFourth();
    boolean b49 = server40.addException(iP46);
    boolean b50 = iP29.equals((java.lang.Object)iP46);
    boolean b51 = server16.removeException(iP46);
    iPBan15.setIp(iP46);
    boolean b53 = server0.removeException(iP46);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    int i55 = singlyLinkedList54.getSize();
    boolean b56 = singlyLinkedList54.isEmpty();
    int i57 = singlyLinkedList54.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList58.get((-1));
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    boolean b74 = strictlySortedSinglyLinkedList58.removeFromIP(iP71);
    boolean b75 = singlyLinkedList54.remove(iP71);
    boolean b76 = server0.removeException(iP71);
    tp2.ITime iTime77 = null;
    server0.setTime(iTime77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-2147483638)+ "'", i11.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 167772288+ "'", i32.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 167772288+ "'", i36.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-2147483638)+ "'", i37.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test468"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    int i3 = singlyLinkedList2.getSize();
    tp2.IP iP5 = singlyLinkedList2.get(10);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList2.add(iP10);
    iP10.setThird((java.lang.Integer)120000020);
    singlyLinkedList0.add(iP10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    tp2.IP iP18 = singlyLinkedList15.get(10);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList15.add(iP23);
    iP23.setThird((java.lang.Integer)120000020);
    iP23.setThird((java.lang.Integer)1000);
    iP23.setSecond((java.lang.Integer)(-1));
    boolean b31 = singlyLinkedList0.contains(iP23);
    iP23.setFourth((java.lang.Integer)0);
    iP23.setThird((java.lang.Integer)3145728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test469"); }


    int i1 = java.lang.Integer.lowestOneBit(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test470"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("3e8");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test471"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10101010111110", 402653184);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test472"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(111010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 111010+ "'", i1.equals(111010));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test473"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "16"+ "'", str1.equals("16"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test474"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)0L);
    boolean b16 = strictlySortedSinglyLinkedList12.contains(iPBan15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)0L);
    boolean b21 = strictlySortedSinglyLinkedList17.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setFirst((java.lang.Integer)0);
    java.lang.Integer i31 = iP27.getSecond();
    iPBan20.setIp(iP27);
    boolean b33 = strictlySortedSinglyLinkedList12.contains(iPBan20);
    boolean b34 = strictlySortedSinglyLinkedList0.contains(iPBan20);
    int i35 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan37 = strictlySortedSinglyLinkedList0.get(671088640);
    tp2.Server server38 = new tp2.Server();
    server38.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    iP45.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan50 = new tp2.IPBan(iP45, (java.lang.Long)0L);
    java.lang.Integer i51 = iP45.getFirst();
    boolean b52 = server38.removeException(iP45);
    boolean b53 = strictlySortedSinglyLinkedList0.containsIP(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-2147483638)+ "'", i51.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test475"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("524288");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 524288+ "'", i1.equals(524288));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test476"); }


    int i2 = java.lang.Integer.min((-2146959350), 167772288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2146959350));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test477"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList11.get((-1));
    boolean b20 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)(-1L));
    boolean b24 = strictlySortedSinglyLinkedList11.contains(iPBan23);
    boolean b25 = strictlySortedSinglyLinkedList0.add(iPBan23);
    tp2.IP iP26 = iPBan23.getIp();
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)6L);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)2098176, (java.lang.Integer)6, (java.lang.Integer)2, (java.lang.Integer)2147483647);
    iPBan28.setIp(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test478"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)41943073, (java.lang.Integer)(-805306368), (java.lang.Integer)13, (java.lang.Integer)37);
    boolean b10 = singlyLinkedList0.remove(iP9);
    tp2.IP iP12 = singlyLinkedList0.get(1073745921);
    tp2.Server server13 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    java.lang.Integer i28 = iP25.getThird();
    boolean b29 = strictlySortedSinglyLinkedList14.removeFromIP(iP25);
    boolean b30 = server13.removeException(iP25);
    server13.update();
    tp2.ITime iTime32 = null;
    server13.setTime(iTime32);
    tp2.ITime iTime34 = null;
    server13.setTime(iTime34);
    boolean b36 = server13.notSharedElements();
    tp2.Server server37 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    java.lang.Integer i52 = iP49.getThird();
    boolean b53 = strictlySortedSinglyLinkedList38.removeFromIP(iP49);
    boolean b54 = server37.removeException(iP49);
    server37.update();
    tp2.ITime iTime56 = null;
    server37.setTime(iTime56);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    boolean b64 = iP62.equals((java.lang.Object)singlyLinkedList63);
    iP62.setSecond((java.lang.Integer)2);
    boolean b67 = server37.removeBan(iP62);
    java.lang.Object obj68 = null;
    boolean b69 = iP62.equals(obj68);
    java.lang.Integer i70 = iP62.getFourth();
    iP62.setThird((java.lang.Integer)124);
    iP62.setSecond((java.lang.Integer)83886146);
    boolean b75 = server13.addException(iP62);
    boolean b76 = server13.notSharedElements();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList77 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b83 = strictlySortedSinglyLinkedList77.containsIP(iP82);
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList89 = new tp2.SinglyLinkedList();
    boolean b90 = iP88.equals((java.lang.Object)singlyLinkedList89);
    java.lang.Integer i91 = iP88.getThird();
    boolean b92 = strictlySortedSinglyLinkedList77.removeFromIP(iP88);
    boolean b94 = iP88.equals((java.lang.Object)0);
    iP88.setSecond((java.lang.Integer)3);
    java.lang.Integer i97 = iP88.getFourth();
    boolean b98 = server13.removeBan(iP88);
    boolean b99 = singlyLinkedList0.remove(iP88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 167772288+ "'", i28.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 167772288+ "'", i52.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 10+ "'", i70.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 167772288+ "'", i91.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i97 + "' != '" + 10+ "'", i97.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test479"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147421086), 10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1477);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test480"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test481"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)(-1L));
    boolean b13 = strictlySortedSinglyLinkedList0.contains(iPBan12);
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(31);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP18 = null;
    singlyLinkedList16.add(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList16.add(iP24);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    int i27 = singlyLinkedList26.getSize();
    tp2.IP iP28 = null;
    singlyLinkedList26.add(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList26.add(iP34);
    singlyLinkedList16.add(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b43 = strictlySortedSinglyLinkedList37.containsIP(iP42);
    iP42.setFirst((java.lang.Integer)0);
    java.lang.Integer i46 = iP42.getSecond();
    singlyLinkedList16.add(iP42);
    boolean b48 = strictlySortedSinglyLinkedList0.removeFromIP(iP42);
    tp2.Server server49 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    boolean b66 = server49.removeException(iP61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = strictlySortedSinglyLinkedList67.containsIP(iP72);
    tp2.IPBan iPBan75 = strictlySortedSinglyLinkedList67.get((-1));
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan82 = new tp2.IPBan(iP80, (java.lang.Long)100L);
    boolean b83 = strictlySortedSinglyLinkedList67.removeFromIP(iP80);
    boolean b84 = server49.removeBan(iP80);
    tp2.IPBan iPBan86 = new tp2.IPBan(iP80, (java.lang.Long)83886146L);
    tp2.IP iP87 = iPBan86.getIp();
    boolean b88 = strictlySortedSinglyLinkedList0.contains(iPBan86);
    tp2.IP iP89 = iPBan86.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP89);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test482"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4000", 1705518);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test483"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    boolean b19 = server0.bansOkTime();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Object obj29 = null;
    boolean b30 = iP25.equals(obj29);
    java.lang.Integer i31 = iP25.getSecond();
    boolean b32 = server0.connect(iP25);
    boolean b33 = server0.bansOkTime();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList34.containsIP(iP39);
    iP39.setFirst((java.lang.Integer)0);
    java.lang.Object obj43 = null;
    boolean b44 = iP39.equals(obj43);
    iP39.setThird((java.lang.Integer)953344);
    boolean b47 = server0.connect(iP39);
    tp2.IP iP48 = null;
    boolean b49 = server0.removeException(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test484"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.Server server3 = new tp2.Server();
    tp2.ITime iTime4 = null;
    server3.setTime(iTime4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = iP17.equals((java.lang.Object)singlyLinkedList18);
    java.lang.Integer i20 = iP17.getThird();
    boolean b21 = strictlySortedSinglyLinkedList6.removeFromIP(iP17);
    boolean b23 = iP17.equals((java.lang.Object)0);
    boolean b24 = server3.addException(iP17);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP17, (java.lang.Long)120000020L);
    boolean b27 = server0.addException(iP17);
    tp2.IP iP28 = null;
    boolean b29 = server0.connect(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test485"); }


    int i1 = java.lang.Integer.reverse(21884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1051328512);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test486"); }


    int i2 = java.lang.Integer.min(60000010, 10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10001);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test487"); }


    int i1 = java.lang.Integer.bitCount(1728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test488"); }


    java.lang.Integer i1 = new java.lang.Integer((-805306368));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-805306368)+ "'", i1.equals((-805306368)));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test489"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)100L);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test490"); }


    int i2 = java.lang.Integer.sum(0, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 18);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test491"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    iP35.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i43 = iP35.getThird();
    boolean b44 = server0.addException(iP35);
    tp2.IP iP45 = null;
    boolean b46 = server0.addException(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test492"); }


    int i2 = java.lang.Integer.compare(1126502400, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test493"); }


    int i2 = java.lang.Integer.sum(100, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 130);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test494"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    tp2.IP iP47 = null;
    tp2.IPBan iPBan49 = new tp2.IPBan(iP47, (java.lang.Long)(-1L));
    boolean b50 = strictlySortedSinglyLinkedList40.contains(iPBan49);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    tp2.IPBan iPBan59 = strictlySortedSinglyLinkedList51.get((-1));
    boolean b60 = strictlySortedSinglyLinkedList51.isEmpty();
    tp2.IP iP61 = null;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)(-1L));
    boolean b64 = strictlySortedSinglyLinkedList51.contains(iPBan63);
    boolean b65 = strictlySortedSinglyLinkedList40.add(iPBan63);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b67 = strictlySortedSinglyLinkedList66.isEmpty();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = strictlySortedSinglyLinkedList66.removeFromIP(iP72);
    boolean b74 = strictlySortedSinglyLinkedList40.removeFromIP(iP72);
    boolean b75 = server0.removeBan(iP72);
    java.lang.Integer i76 = iP72.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 10+ "'", i76.equals(10));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test495"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("26214", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test496"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(3333333);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test497"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b16 = strictlySortedSinglyLinkedList10.containsIP(iP15);
    iP15.setFirst((java.lang.Integer)0);
    iP15.setFourth((java.lang.Integer)7);
    boolean b22 = iP15.equals((java.lang.Object)"");
    boolean b23 = server0.removeBan(iP15);
    boolean b24 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test498"); }


    int i1 = java.lang.Integer.highestOneBit(41943072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test499"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    iP21.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList28.removeFromIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    boolean b43 = strictlySortedSinglyLinkedList28.contains(iPBan42);
    boolean b44 = strictlySortedSinglyLinkedList0.add(iPBan42);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    boolean b58 = iP56.equals((java.lang.Object)singlyLinkedList57);
    java.lang.Integer i59 = iP56.getThird();
    boolean b60 = strictlySortedSinglyLinkedList45.removeFromIP(iP56);
    tp2.IP iP61 = null;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)(-1L));
    boolean b64 = strictlySortedSinglyLinkedList45.contains(iPBan63);
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList45.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b68 = strictlySortedSinglyLinkedList67.isEmpty();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList67.removeFromIP(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP79, (java.lang.Long)100L);
    boolean b82 = strictlySortedSinglyLinkedList67.contains(iPBan81);
    boolean b83 = strictlySortedSinglyLinkedList45.add(iPBan81);
    boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan81);
    tp2.IPBan iPBan86 = strictlySortedSinglyLinkedList0.get((-2147483645));
    int i87 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 167772288+ "'", i59.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iPBan86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test500"); }


    int i1 = java.lang.Integer.signum(268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

}
