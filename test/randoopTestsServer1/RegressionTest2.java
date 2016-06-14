package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(10004001);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP8 = singlyLinkedList5.get(4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b15 = strictlySortedSinglyLinkedList9.containsIP(iP14);
    java.lang.Integer i16 = iP14.getFourth();
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)0L);
    boolean b19 = singlyLinkedList5.remove(iP14);
    iP14.setThird((java.lang.Integer)240000041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10101010111101");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1107296325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000010000000000000000001000101"+ "'", str1.equals("1000010000000000000000001000101"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    int i2 = java.lang.Integer.rotateRight(27, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 27);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    java.lang.String str1 = java.lang.Integer.toHexString(10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2711"+ "'", str1.equals("2711"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


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
    tp2.IPBan iPBan50 = strictlySortedSinglyLinkedList0.get(100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan50);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1750"+ "'", str1.equals("1750"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


    int i1 = java.lang.Integer.reverse(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


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
    java.lang.Integer i72 = iP5.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 10+ "'", i72.equals(10));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("100000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    int i2 = java.lang.Integer.min(16777297, 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16384);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    int i2 = java.lang.Integer.rotateRight(110592, 83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 110592);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("100000000000000000101000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    int i1 = java.lang.Integer.bitCount((-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


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
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b72 = iP56.equals((java.lang.Object)iP71);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP71, (java.lang.Long)134217728L);
    iP71.setFirst((java.lang.Integer)2098181);
    
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
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IPBan iPBan12 = strictlySortedSinglyLinkedList4.get((-1));
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    boolean b20 = strictlySortedSinglyLinkedList4.removeFromIP(iP17);
    boolean b21 = singlyLinkedList0.remove(iP17);
    int i22 = singlyLinkedList0.getSize();
    boolean b23 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    java.lang.Integer i1 = java.lang.Integer.decode("67109184");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 67109184+ "'", i1.equals(67109184));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server3 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    boolean b20 = server3.removeException(iP15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    boolean b38 = server3.removeBan(iP34);
    boolean b39 = strictlySortedSinglyLinkedList0.containsIP(iP34);
    iP34.setThird((java.lang.Integer)18);
    boolean b43 = iP34.equals((java.lang.Object)(short)(-1));
    java.lang.Integer i44 = iP34.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 18+ "'", i44.equals(18));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b8 = strictlySortedSinglyLinkedList2.containsIP(iP7);
    iP7.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan12 = new tp2.IPBan(iP7, (java.lang.Long)0L);
    java.lang.Integer i13 = iP7.getFirst();
    boolean b14 = server0.removeException(iP7);
    tp2.ITime iTime15 = null;
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.connect(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-2147483638)+ "'", i13.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("10000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


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
    boolean b41 = singlyLinkedList0.isEmpty();
    int i42 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    boolean b45 = singlyLinkedList43.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b52 = strictlySortedSinglyLinkedList46.containsIP(iP51);
    iP51.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan56 = new tp2.IPBan(iP51, (java.lang.Long)0L);
    iP51.setFourth((java.lang.Integer)(-2147483638));
    boolean b59 = singlyLinkedList43.remove(iP51);
    int i60 = singlyLinkedList43.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b67 = strictlySortedSinglyLinkedList61.containsIP(iP66);
    iP66.setFirst((java.lang.Integer)0);
    iP66.setSecond((java.lang.Integer)0);
    iP66.setThird((java.lang.Integer)(-2146959350));
    iP66.setSecond((java.lang.Integer)524288);
    boolean b76 = singlyLinkedList43.remove(iP66);
    singlyLinkedList0.add(iP66);
    
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
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


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
    tp2.IP iP27 = iPBan23.getIp();
    iPBan23.setExpires((java.lang.Long)1073746921L);
    
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
    org.junit.Assert.assertNotNull(iP27);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    int i1 = java.lang.Integer.signum(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("707140e2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


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
    iP25.setFirst((java.lang.Integer)23);
    iP25.setSecond((java.lang.Integer)110592);
    
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    int i1 = java.lang.Integer.bitCount(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    int i1 = java.lang.Integer.reverse(385876096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777448);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    int i2 = java.lang.Integer.divideUnsigned(29528288, 301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    int i1 = java.lang.Integer.reverse(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    long long1 = java.lang.Integer.toUnsignedLong(1705518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1705518L);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    int i1 = java.lang.Integer.reverse((-803208192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2098187);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    int i2 = java.lang.Integer.rotateLeft(65536, 20971536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    iP4.setThird((java.lang.Integer)(-2147483648));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    int i1 = java.lang.Integer.reverse(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1879048192));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10001", 81400010);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    int i2 = java.lang.Integer.rotateRight(0, 268451841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("37", 37);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    int i2 = java.lang.Integer.max(2098176, 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2098176);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1001000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1001000);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 19);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("1001000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1001000+ "'", i1.equals(1001000));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("18", 10004001);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    java.lang.Integer i1 = new java.lang.Integer("2711");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2711+ "'", i1.equals(2711));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


    int i2 = java.lang.Integer.max(24, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(21884);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    int i2 = java.lang.Integer.max(262144, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 262144);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
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
    boolean b37 = strictlySortedSinglyLinkedList0.containsIP(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = null;
    tp2.IPBan iPBan41 = new tp2.IPBan(iP39, (java.lang.Long)0L);
    boolean b42 = strictlySortedSinglyLinkedList38.contains(iPBan41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i48 = iP47.getFourth();
    boolean b49 = strictlySortedSinglyLinkedList38.removeFromIP(iP47);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    boolean b67 = iP61.equals((java.lang.Object)0);
    java.lang.Integer i68 = iP61.getThird();
    java.lang.Integer i69 = iP61.getFirst();
    boolean b70 = strictlySortedSinglyLinkedList38.containsIP(iP61);
    boolean b71 = strictlySortedSinglyLinkedList0.removeFromIP(iP61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList72 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b73 = strictlySortedSinglyLinkedList72.isEmpty();
    tp2.IP iP74 = null;
    tp2.IPBan iPBan76 = new tp2.IPBan(iP74, (java.lang.Long)0L);
    boolean b77 = strictlySortedSinglyLinkedList72.contains(iPBan76);
    boolean b78 = strictlySortedSinglyLinkedList0.add(iPBan76);
    boolean b79 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 167772288+ "'", i68.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-2147483638)+ "'", i69.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 124+ "'", i1.equals(124));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


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
    boolean b26 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


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
    tp2.IP iP38 = iPBan3.getIp();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)67112960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 67112960+ "'", i2.equals(67112960));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(44739413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(17, 1886470370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "17"+ "'", str2.equals("17"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10280002", (java.lang.Integer)2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2147483647+ "'", i2.equals(2147483647));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    int i1 = java.lang.Integer.reverse(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 301989888);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    int i2 = java.lang.Integer.rotateLeft(1342177280, 83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1342177280);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("100000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)(-1L));
    boolean b8 = strictlySortedSinglyLinkedList0.contains(iPBan7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)0L);
    boolean b13 = strictlySortedSinglyLinkedList9.contains(iPBan12);
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
    boolean b30 = strictlySortedSinglyLinkedList9.contains(iPBan17);
    iPBan17.setExpires((java.lang.Long)0L);
    boolean b33 = strictlySortedSinglyLinkedList0.add(iPBan17);
    iPBan17.setExpires((java.lang.Long)2168455184L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


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
    iP17.setSecond((java.lang.Integer)67109184);
    iP17.setThird((java.lang.Integer)1);
    
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

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


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
    boolean b37 = server0.notSharedElements();
    
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
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b8 = strictlySortedSinglyLinkedList2.containsIP(iP7);
    java.lang.Integer i9 = iP7.getFourth();
    boolean b10 = server1.addException(iP7);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b19 = strictlySortedSinglyLinkedList13.containsIP(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = iP24.equals((java.lang.Object)singlyLinkedList25);
    java.lang.Integer i27 = iP24.getThird();
    boolean b28 = strictlySortedSinglyLinkedList13.removeFromIP(iP24);
    boolean b30 = iP24.equals((java.lang.Object)0);
    java.lang.Integer i31 = iP24.getThird();
    java.lang.Integer i32 = iP24.getFirst();
    iP24.setFourth((java.lang.Integer)20971536);
    tp2.Server server35 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b42 = strictlySortedSinglyLinkedList36.containsIP(iP41);
    java.lang.Integer i43 = iP41.getFourth();
    boolean b44 = server35.addException(iP41);
    boolean b45 = iP24.equals((java.lang.Object)iP41);
    boolean b46 = server1.connect(iP24);
    boolean b47 = server1.notSharedElements();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    boolean b55 = server1.removeException(iP52);
    boolean b56 = server0.removeException(iP52);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
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
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-2147483638)+ "'", i32.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 10+ "'", i43.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("10101010111101");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    int i1 = java.lang.Integer.reverse(67109184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 41943072);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    int i2 = java.lang.Integer.compareUnsigned(1001000, 939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    int i1 = java.lang.Integer.highestOneBit(21884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    int i2 = java.lang.Integer.rotateRight(7, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14680064);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    java.lang.String str1 = java.lang.Integer.toHexString(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "13"+ "'", str1.equals("13"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
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
    boolean b32 = strictlySortedSinglyLinkedList0.containsIP(iP23);
    tp2.IPBan iPBan34 = strictlySortedSinglyLinkedList0.get(67108864);
    tp2.IPBan iPBan36 = strictlySortedSinglyLinkedList0.get(953344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
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
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan36);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    int i1 = java.lang.Integer.lowestOneBit(1073746921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


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
    iP15.setFirst((java.lang.Integer)72);
    iP15.setFourth((java.lang.Integer)4);
    
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

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    iP7.setSecond((java.lang.Integer)2);
    boolean b12 = singlyLinkedList0.contains(iP7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b19 = strictlySortedSinglyLinkedList13.containsIP(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = iP24.equals((java.lang.Object)singlyLinkedList25);
    java.lang.Integer i27 = iP24.getThird();
    boolean b28 = strictlySortedSinglyLinkedList13.removeFromIP(iP24);
    boolean b30 = iP24.equals((java.lang.Object)0);
    boolean b31 = singlyLinkedList0.remove(iP24);
    tp2.IP iP33 = singlyLinkedList0.get((-803208192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
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
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(3145728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3145728+ "'", i1.equals(3145728));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    int i1 = java.lang.Integer.reverse(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    int i1 = java.lang.Integer.bitCount(1705518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


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
    int i27 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


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
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList0.get(134217728);
    
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    int i2 = java.lang.Integer.max(23, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1000);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    java.lang.Integer i1 = java.lang.Integer.decode("120000020");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 120000020+ "'", i1.equals(120000020));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


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
    tp2.IPBan iPBan26 = new tp2.IPBan(iP19, (java.lang.Long)2620936732L);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP19, (java.lang.Long)301989888L);
    
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

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    boolean b10 = singlyLinkedList0.isEmpty();
    boolean b11 = singlyLinkedList0.isEmpty();
    tp2.IP iP13 = singlyLinkedList0.get(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    boolean b10 = singlyLinkedList0.isEmpty();
    int i11 = singlyLinkedList0.getSize();
    int i12 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3e8", (java.lang.Integer)(-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1674030564)+ "'", i2.equals((-1674030564)));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    tp2.IPBan iPBan63 = strictlySortedSinglyLinkedList55.get((-1));
    boolean b64 = strictlySortedSinglyLinkedList55.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b71 = strictlySortedSinglyLinkedList65.containsIP(iP70);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList77 = new tp2.SinglyLinkedList();
    boolean b78 = iP76.equals((java.lang.Object)singlyLinkedList77);
    java.lang.Integer i79 = iP76.getThird();
    boolean b80 = strictlySortedSinglyLinkedList65.removeFromIP(iP76);
    boolean b81 = strictlySortedSinglyLinkedList55.removeFromIP(iP76);
    boolean b82 = server0.removeException(iP76);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)134217728, (java.lang.Integer)7, (java.lang.Integer)3, (java.lang.Integer)262144);
    boolean b88 = server0.addException(iP87);
    boolean b89 = server0.notSharedElements();
    
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
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 167772288+ "'", i79.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    int i2 = java.lang.Integer.rotateLeft(884736, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14155776);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("ffffffff", 953355);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    int i2 = java.lang.Integer.max(67112960, 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67112960);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


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
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    boolean b48 = iP46.equals((java.lang.Object)singlyLinkedList47);
    java.lang.Integer i49 = iP46.getThird();
    boolean b50 = strictlySortedSinglyLinkedList35.removeFromIP(iP46);
    tp2.IP iP51 = null;
    tp2.IPBan iPBan53 = new tp2.IPBan(iP51, (java.lang.Long)(-1L));
    boolean b54 = strictlySortedSinglyLinkedList35.contains(iPBan53);
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList35.get(1);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i62 = iP61.getFourth();
    boolean b63 = strictlySortedSinglyLinkedList35.containsIP(iP61);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    int i65 = singlyLinkedList64.getSize();
    tp2.IP iP66 = null;
    singlyLinkedList64.add(iP66);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = singlyLinkedList64.contains(iP72);
    boolean b74 = strictlySortedSinglyLinkedList35.removeFromIP(iP72);
    boolean b75 = strictlySortedSinglyLinkedList0.removeFromIP(iP72);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP72, (java.lang.Long)6L);
    java.lang.Long long78 = null;
    iPBan77.setExpires(long78);
    tp2.IP iP80 = iPBan77.getIp();
    
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
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 167772288+ "'", i49.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 10+ "'", i62.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    boolean b23 = strictlySortedSinglyLinkedList0.contains(iPBan22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b25 = strictlySortedSinglyLinkedList24.isEmpty();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList24.removeFromIP(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    boolean b39 = strictlySortedSinglyLinkedList24.contains(iPBan38);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    iP45.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan50 = new tp2.IPBan(iP45, (java.lang.Long)0L);
    boolean b51 = strictlySortedSinglyLinkedList24.contains(iPBan50);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b53 = strictlySortedSinglyLinkedList52.isEmpty();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b59 = strictlySortedSinglyLinkedList52.removeFromIP(iP58);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    boolean b67 = strictlySortedSinglyLinkedList52.contains(iPBan66);
    boolean b68 = strictlySortedSinglyLinkedList24.add(iPBan66);
    tp2.SinglyLinkedList singlyLinkedList69 = new tp2.SinglyLinkedList();
    int i70 = singlyLinkedList69.getSize();
    tp2.IP iP71 = null;
    singlyLinkedList69.add(iP71);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList69.add(iP77);
    boolean b79 = strictlySortedSinglyLinkedList24.containsIP(iP77);
    boolean b80 = strictlySortedSinglyLinkedList0.removeFromIP(iP77);
    tp2.IPBan iPBan82 = strictlySortedSinglyLinkedList0.get(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan82);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000000000000000000000"+ "'", str1.equals("10000000000000000000000000"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    int i10 = singlyLinkedList0.getSize();
    boolean b11 = singlyLinkedList0.isEmpty();
    tp2.Server server12 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b19 = strictlySortedSinglyLinkedList13.containsIP(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = iP24.equals((java.lang.Object)singlyLinkedList25);
    java.lang.Integer i27 = iP24.getThird();
    boolean b28 = strictlySortedSinglyLinkedList13.removeFromIP(iP24);
    boolean b29 = server12.removeException(iP24);
    server12.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b48 = iP42.equals((java.lang.Object)0);
    java.lang.Integer i49 = iP42.getThird();
    java.lang.Integer i50 = iP42.getFirst();
    iP42.setFourth((java.lang.Integer)20971536);
    tp2.Server server53 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    java.lang.Integer i61 = iP59.getFourth();
    boolean b62 = server53.addException(iP59);
    boolean b63 = iP42.equals((java.lang.Object)iP59);
    boolean b64 = server12.connect(iP59);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP59, (java.lang.Long)1L);
    tp2.Server server67 = new tp2.Server();
    server67.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b75 = strictlySortedSinglyLinkedList69.containsIP(iP74);
    iP74.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan79 = new tp2.IPBan(iP74, (java.lang.Long)0L);
    java.lang.Integer i80 = iP74.getFirst();
    boolean b81 = server67.removeException(iP74);
    iP74.setSecond((java.lang.Integer)2098181);
    iPBan66.setIp(iP74);
    tp2.IPBan iPBan86 = new tp2.IPBan(iP74, (java.lang.Long)7L);
    boolean b87 = singlyLinkedList0.remove(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 167772288+ "'", i27.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 167772288+ "'", i49.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-2147483638)+ "'", i50.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 10+ "'", i61.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-2147483638)+ "'", i80.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("bbt");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("67108864", 4194304);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


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
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    boolean b47 = singlyLinkedList45.isEmpty();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    boolean b54 = iP52.equals((java.lang.Object)singlyLinkedList53);
    iP52.setSecond((java.lang.Integer)2);
    boolean b57 = singlyLinkedList45.contains(iP52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    boolean b71 = iP69.equals((java.lang.Object)singlyLinkedList70);
    java.lang.Integer i72 = iP69.getThird();
    boolean b73 = strictlySortedSinglyLinkedList58.removeFromIP(iP69);
    boolean b75 = iP69.equals((java.lang.Object)0);
    boolean b76 = singlyLinkedList45.remove(iP69);
    boolean b77 = server0.addException(iP69);
    boolean b78 = server0.bansOkTime();
    tp2.IP iP79 = null;
    tp2.IPBan iPBan81 = new tp2.IPBan(iP79, (java.lang.Long)0L);
    tp2.IP iP82 = iPBan81.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList83 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b84 = strictlySortedSinglyLinkedList83.isEmpty();
    boolean b85 = iP82.equals((java.lang.Object)b84);
    boolean b86 = server0.removeException(iP82);
    boolean b87 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
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
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    int i2 = java.lang.Integer.compare(100, 240000041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


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
    int i41 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i41 == 1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP8 = singlyLinkedList5.get(4);
    int i9 = singlyLinkedList5.getSize();
    boolean b10 = singlyLinkedList5.isEmpty();
    int i11 = singlyLinkedList5.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    int i9 = strictlySortedSinglyLinkedList0.getSize();
    boolean b10 = strictlySortedSinglyLinkedList0.isEmpty();
    int i11 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan13);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    int i1 = java.lang.Integer.highestOneBit(10942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8192);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10002000000", 268451841);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(16777297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


    int i1 = java.lang.Integer.reverseBytes(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 469762048);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1cccef");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP8 = singlyLinkedList5.get(4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b15 = strictlySortedSinglyLinkedList9.containsIP(iP14);
    java.lang.Integer i16 = iP14.getFourth();
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)0L);
    boolean b19 = singlyLinkedList5.remove(iP14);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i25 = iP24.getFourth();
    java.lang.Integer i26 = iP24.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    boolean b40 = iP38.equals((java.lang.Object)singlyLinkedList39);
    java.lang.Integer i41 = iP38.getThird();
    boolean b42 = strictlySortedSinglyLinkedList27.removeFromIP(iP38);
    tp2.IP iP43 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)(-1L));
    boolean b46 = strictlySortedSinglyLinkedList27.contains(iPBan45);
    tp2.IPBan iPBan48 = strictlySortedSinglyLinkedList27.get((-2147483648));
    boolean b49 = iP24.equals((java.lang.Object)strictlySortedSinglyLinkedList27);
    java.lang.Integer i50 = iP24.getFourth();
    boolean b51 = singlyLinkedList5.remove(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 10+ "'", i25.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 167772288+ "'", i41.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 10+ "'", i50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("2148007946");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    int i1 = java.lang.Integer.signum(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    int i2 = java.lang.Integer.sum(1705518, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1705518);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    iP6.setSecond((java.lang.Integer)3);
    java.lang.Integer i12 = iP6.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-2147483638)+ "'", i12.equals((-2147483638)));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    int i2 = java.lang.Integer.max((-1), 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    int i2 = java.lang.Integer.sum(32, (-2146959350));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2146959318));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11011", 1126502400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1126502400+ "'", i2.equals(1126502400));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


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
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    int i48 = singlyLinkedList47.getSize();
    boolean b49 = singlyLinkedList47.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    iP55.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan60 = new tp2.IPBan(iP55, (java.lang.Long)0L);
    iP55.setFourth((java.lang.Integer)(-2147483638));
    boolean b63 = singlyLinkedList47.remove(iP55);
    int i64 = singlyLinkedList47.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b71 = strictlySortedSinglyLinkedList65.containsIP(iP70);
    iP70.setFirst((java.lang.Integer)0);
    iP70.setSecond((java.lang.Integer)0);
    iP70.setThird((java.lang.Integer)(-2146959350));
    iP70.setSecond((java.lang.Integer)524288);
    boolean b80 = singlyLinkedList47.remove(iP70);
    boolean b81 = server0.connect(iP70);
    
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
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    tp2.Server server3 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    boolean b20 = server3.removeException(iP15);
    server3.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i31 = iP27.getFourth();
    java.lang.Integer i32 = iP27.getFirst();
    iP27.setFirst((java.lang.Integer)20971536);
    boolean b35 = server3.addException(iP27);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP27, (java.lang.Long)0L);
    java.lang.Integer i38 = iP27.getThird();
    boolean b39 = server0.removeBan(iP27);
    java.lang.Integer i40 = iP27.getFourth();
    java.lang.Integer i41 = iP27.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 10+ "'", i31.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-2147483638)+ "'", i32.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 10+ "'", i40.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 167772288+ "'", i41.equals(167772288));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


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
    tp2.IPBan iPBan54 = new tp2.IPBan(iP45, (java.lang.Long)120000020L);
    iPBan54.setExpires((java.lang.Long)1074266112L);
    
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
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    int i2 = java.lang.Integer.divideUnsigned(83886080, 67109184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    java.lang.String str1 = java.lang.Integer.toHexString(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "25"+ "'", str1.equals("25"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    boolean b11 = iP9.equals((java.lang.Object)singlyLinkedList10);
    java.lang.Integer i12 = iP9.getThird();
    java.lang.Integer i13 = iP9.getSecond();
    java.lang.Integer i14 = null;
    iP9.setFirst(i14);
    iPBan3.setIp(iP9);
    java.lang.Integer i17 = iP9.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 167772288+ "'", i12.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    int i2 = java.lang.Integer.compareUnsigned(21884, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    int i2 = java.lang.Integer.sum(1107296325, (-2146959350));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1039663025));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


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
    tp2.IPBan iPBan42 = strictlySortedSinglyLinkedList0.get((-805306368));
    
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
    org.junit.Assert.assertNull(iPBan42);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 1074266112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


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
    boolean b23 = strictlySortedSinglyLinkedList0.containsIP(iP22);
    
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
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    int i2 = java.lang.Integer.min(1952471040, 67112960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67112960);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    java.lang.Integer i1 = new java.lang.Integer("60000010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 60000010+ "'", i1.equals(60000010));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    java.lang.Integer i1 = new java.lang.Integer("7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 7+ "'", i1.equals(7));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 536870912+ "'", i1.equals(536870912));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(50, (-805306368));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "50"+ "'", str2.equals("50"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10101010111110");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


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
    iPBan18.setExpires((java.lang.Long)41943073L);
    java.lang.Long long24 = iPBan18.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 41943073L+ "'", long24.equals(41943073L));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)(-1L));
    boolean b8 = strictlySortedSinglyLinkedList0.contains(iPBan7);
    iPBan7.setExpires((java.lang.Long)67108864L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    int i1 = java.lang.Integer.highestOneBit(83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)(-1L));
    iPBan2.setExpires((java.lang.Long)10L);
    iPBan2.setExpires((java.lang.Long)2620936732L);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    int i1 = java.lang.Integer.reverse(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    int i2 = java.lang.Integer.remainderUnsigned(5, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "42"+ "'", str1.equals("42"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = singlyLinkedList0.contains(iP8);
    iP8.setFourth((java.lang.Integer)1);
    iP8.setFourth((java.lang.Integer)(-1674030564));
    java.lang.Integer i14 = iP8.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b16 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Server server17 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    boolean b31 = iP29.equals((java.lang.Object)singlyLinkedList30);
    java.lang.Integer i32 = iP29.getThird();
    boolean b33 = strictlySortedSinglyLinkedList18.removeFromIP(iP29);
    boolean b34 = server17.removeException(iP29);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    tp2.IPBan iPBan43 = strictlySortedSinglyLinkedList35.get((-1));
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    boolean b51 = strictlySortedSinglyLinkedList35.removeFromIP(iP48);
    boolean b52 = server17.removeBan(iP48);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP48, (java.lang.Long)83886146L);
    boolean b55 = strictlySortedSinglyLinkedList0.add(iPBan54);
    tp2.Server server56 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b63 = strictlySortedSinglyLinkedList57.containsIP(iP62);
    java.lang.Integer i64 = iP62.getFourth();
    boolean b65 = server56.addException(iP62);
    tp2.ITime iTime66 = null;
    server56.setTime(iTime66);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    boolean b75 = server56.removeException(iP73);
    java.lang.Integer i76 = iP73.getFourth();
    boolean b77 = strictlySortedSinglyLinkedList0.removeFromIP(iP73);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList78 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b84 = strictlySortedSinglyLinkedList78.containsIP(iP83);
    tp2.IPBan iPBan86 = strictlySortedSinglyLinkedList78.get((-1));
    tp2.IP iP91 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan93 = new tp2.IPBan(iP91, (java.lang.Long)100L);
    boolean b94 = strictlySortedSinglyLinkedList78.removeFromIP(iP91);
    boolean b96 = iP91.equals((java.lang.Object)0.0d);
    boolean b97 = strictlySortedSinglyLinkedList0.removeFromIP(iP91);
    tp2.IPBan iPBan99 = strictlySortedSinglyLinkedList0.get(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 167772288+ "'", i32.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 10+ "'", i64.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 10+ "'", i76.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan99);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


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
    iP38.setThird((java.lang.Integer)18);
    
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

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    long long1 = java.lang.Integer.toUnsignedLong(14155776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 14155776L);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1000", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    int i1 = java.lang.Integer.reverseBytes(2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 84156416);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


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
    boolean b85 = singlyLinkedList5.isEmpty();
    
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
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    int i1 = java.lang.Integer.bitCount((-892585062));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 17);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    int i2 = java.lang.Integer.compareUnsigned(4, (-2147483636));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


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
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    int i43 = singlyLinkedList42.getSize();
    boolean b44 = singlyLinkedList42.isEmpty();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    iP49.setSecond((java.lang.Integer)2);
    boolean b54 = singlyLinkedList42.contains(iP49);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    boolean b68 = iP66.equals((java.lang.Object)singlyLinkedList67);
    java.lang.Integer i69 = iP66.getThird();
    boolean b70 = strictlySortedSinglyLinkedList55.removeFromIP(iP66);
    boolean b72 = iP66.equals((java.lang.Object)0);
    boolean b73 = singlyLinkedList42.remove(iP66);
    java.lang.Integer i74 = iP66.getSecond();
    boolean b75 = server0.removeException(iP66);
    
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
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
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
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 100+ "'", i74.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i9 = null;
    iP5.setFirst(i9);
    iP5.setFourth((java.lang.Integer)14680064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


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
    int i74 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i74 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(385876096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    int i1 = java.lang.Integer.signum(14155776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("42", 256);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(110592);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    int i2 = java.lang.Integer.divideUnsigned(18875478, 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1572956);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


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
    iPBan18.setExpires((java.lang.Long)41943073L);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    int i25 = singlyLinkedList24.getSize();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    int i27 = singlyLinkedList26.getSize();
    tp2.IP iP29 = singlyLinkedList26.get(10);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList26.add(iP34);
    iP34.setThird((java.lang.Integer)120000020);
    singlyLinkedList24.add(iP34);
    iPBan18.setIp(iP34);
    
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
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("111001001110000111000010100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    tp2.IP iP7 = singlyLinkedList0.get((-2146959318));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    int i14 = singlyLinkedList0.getSize();
    tp2.IP iP15 = null;
    boolean b16 = singlyLinkedList0.contains(iP15);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i22 = iP21.getFirst();
    java.lang.Integer i23 = iP21.getFourth();
    singlyLinkedList0.add(iP21);
    
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 67109184+ "'", i22.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 20971536+ "'", i23.equals(20971536));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    boolean b58 = iP56.equals((java.lang.Object)singlyLinkedList57);
    java.lang.Integer i59 = iP56.getThird();
    boolean b60 = strictlySortedSinglyLinkedList45.removeFromIP(iP56);
    boolean b62 = iP56.equals((java.lang.Object)0);
    java.lang.Integer i63 = iP56.getThird();
    java.lang.Integer i64 = iP56.getFirst();
    boolean b65 = server0.addException(iP56);
    
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
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 167772288+ "'", i59.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 167772288+ "'", i63.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-2147483638)+ "'", i64.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


    java.lang.Integer i1 = new java.lang.Integer(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 9+ "'", i1.equals(9));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    int i1 = java.lang.Integer.signum(18875478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(953344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3506000"+ "'", str1.equals("3506000"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    boolean b16 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.Server server17 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    boolean b31 = iP29.equals((java.lang.Object)singlyLinkedList30);
    java.lang.Integer i32 = iP29.getThird();
    boolean b33 = strictlySortedSinglyLinkedList18.removeFromIP(iP29);
    boolean b34 = server17.removeException(iP29);
    server17.update();
    tp2.ITime iTime36 = null;
    server17.setTime(iTime36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    iP42.setSecond((java.lang.Integer)2);
    boolean b47 = server17.removeBan(iP42);
    java.lang.Object obj48 = null;
    boolean b49 = iP42.equals(obj48);
    java.lang.Integer i50 = iP42.getFourth();
    iP42.setFirst((java.lang.Integer)18);
    iP42.setFirst((java.lang.Integer)24);
    boolean b55 = strictlySortedSinglyLinkedList0.containsIP(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 167772288+ "'", i32.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 10+ "'", i50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4", 500000102);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("20000000000", 10280002);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1010000000000000000000000000000", 4);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("d8000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


    int i2 = java.lang.Integer.compareUnsigned(26214, 14680064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    int i2 = java.lang.Integer.compareUnsigned(12, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("1000000000000000001010000001");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


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
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP45 = null;
    singlyLinkedList43.add(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b52 = singlyLinkedList43.contains(iP51);
    boolean b53 = strictlySortedSinglyLinkedList0.containsIP(iP51);
    tp2.IPBan iPBan55 = strictlySortedSinglyLinkedList0.get(1610612736);
    
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
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan55);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    int i2 = java.lang.Integer.compare(131137, 8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


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
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    boolean b47 = singlyLinkedList45.isEmpty();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    boolean b54 = iP52.equals((java.lang.Object)singlyLinkedList53);
    iP52.setSecond((java.lang.Integer)2);
    boolean b57 = singlyLinkedList45.contains(iP52);
    boolean b58 = server0.addBan(iP52);
    tp2.ITime iTime59 = null;
    server0.setTime(iTime59);
    
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
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)953344, (java.lang.Integer)10001, (java.lang.Integer)27, (java.lang.Integer)17);
    java.lang.Integer i5 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 17+ "'", i5.equals(17));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    int i1 = java.lang.Integer.highestOneBit(67112960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


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
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)0L);
    boolean b23 = strictlySortedSinglyLinkedList19.contains(iPBan22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    iP29.setFirst((java.lang.Integer)0);
    java.lang.Integer i33 = iP29.getSecond();
    iPBan22.setIp(iP29);
    tp2.IP iP35 = iPBan22.getIp();
    java.lang.Long long36 = null;
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, long36);
    java.lang.Integer i38 = iP35.getFourth();
    boolean b39 = server0.removeBan(iP35);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    int i41 = singlyLinkedList40.getSize();
    tp2.IP iP43 = singlyLinkedList40.get(10);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList40.add(iP48);
    int i50 = singlyLinkedList40.getSize();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483648), (java.lang.Integer)60000010, (java.lang.Integer)64, (java.lang.Integer)1073741824);
    singlyLinkedList40.add(iP55);
    boolean b57 = iP35.equals((java.lang.Object)singlyLinkedList40);
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 10+ "'", i38.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


    int i2 = java.lang.Integer.compareUnsigned(50, (-805306368));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


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
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    int i24 = singlyLinkedList23.getSize();
    tp2.IP iP25 = null;
    singlyLinkedList23.add(iP25);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList23.add(iP31);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP35 = null;
    singlyLinkedList33.add(iP35);
    boolean b37 = iP31.equals((java.lang.Object)singlyLinkedList33);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP31, (java.lang.Long)8L);
    boolean b40 = server0.addException(iP31);
    
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
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


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
    tp2.Server server55 = new tp2.Server();
    server55.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b63 = strictlySortedSinglyLinkedList57.containsIP(iP62);
    iP62.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan67 = new tp2.IPBan(iP62, (java.lang.Long)0L);
    java.lang.Integer i68 = iP62.getFirst();
    boolean b69 = server55.removeException(iP62);
    iP62.setSecond((java.lang.Integer)2098181);
    iPBan54.setIp(iP62);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP62, (java.lang.Long)7L);
    iPBan74.setExpires((java.lang.Long)8L);
    
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
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-2147483638)+ "'", i68.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1750");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1750);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    java.lang.Integer i1 = java.lang.Integer.decode("67108864");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 67108864+ "'", i1.equals(67108864));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("240000041", 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 8388608+ "'", i2.equals(8388608));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


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
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


    int i2 = java.lang.Integer.sum(3145728, (-2146959350));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2143813622));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.Server server5 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    java.lang.Integer i13 = iP11.getFourth();
    boolean b14 = server5.addException(iP11);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    tp2.IP iP18 = singlyLinkedList15.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setFirst((java.lang.Integer)0);
    boolean b28 = singlyLinkedList15.remove(iP24);
    int i29 = singlyLinkedList15.getSize();
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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b75 = strictlySortedSinglyLinkedList69.containsIP(iP74);
    tp2.IPBan iPBan77 = strictlySortedSinglyLinkedList69.get((-1));
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan84 = new tp2.IPBan(iP82, (java.lang.Long)100L);
    boolean b85 = strictlySortedSinglyLinkedList69.removeFromIP(iP82);
    boolean b86 = server51.removeBan(iP82);
    boolean b87 = server30.addException(iP82);
    boolean b88 = singlyLinkedList15.remove(iP82);
    boolean b89 = server5.addException(iP82);
    boolean b90 = singlyLinkedList0.remove(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
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
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("120000020", 1100100);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    int i2 = java.lang.Integer.max(256, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 256);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


    int i2 = java.lang.Integer.min(2147483647, 10942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10942);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34"+ "'", str1.equals("34"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1572956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "110000000000001011100"+ "'", str1.equals("110000000000001011100"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


    int i2 = java.lang.Integer.rotateLeft((-805306368), 10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 436207616);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


    int i2 = java.lang.Integer.max(0, 1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1100100);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    int i1 = java.lang.Integer.lowestOneBit(1705518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b6 = strictlySortedSinglyLinkedList5.isEmpty();
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)0L);
    boolean b10 = strictlySortedSinglyLinkedList5.contains(iPBan9);
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)(-1L));
    iPBan13.setExpires((java.lang.Long)10L);
    boolean b16 = strictlySortedSinglyLinkedList5.contains(iPBan13);
    boolean b17 = strictlySortedSinglyLinkedList0.add(iPBan13);
    java.lang.Long long18 = iPBan13.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    long long1 = java.lang.Integer.toUnsignedLong(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 37L);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


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
    tp2.Server server45 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b52 = strictlySortedSinglyLinkedList46.containsIP(iP51);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    boolean b59 = iP57.equals((java.lang.Object)singlyLinkedList58);
    java.lang.Integer i60 = iP57.getThird();
    boolean b61 = strictlySortedSinglyLinkedList46.removeFromIP(iP57);
    boolean b62 = server45.removeException(iP57);
    server45.update();
    boolean b64 = server45.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    int i66 = singlyLinkedList65.getSize();
    tp2.IP iP68 = singlyLinkedList65.get(10);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList65.add(iP73);
    boolean b75 = server45.removeException(iP73);
    boolean b76 = server0.addException(iP73);
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
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 167772288+ "'", i60.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1074266112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 19);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


    int i1 = java.lang.Integer.highestOneBit(83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


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
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    java.lang.Integer i1 = new java.lang.Integer("500000102");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 500000102+ "'", i1.equals(500000102));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    long long1 = java.lang.Integer.toUnsignedLong(18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 18L);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(83886146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


    java.lang.Integer i1 = new java.lang.Integer((-892585062));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-892585062)+ "'", i1.equals((-892585062)));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


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
    server0.update();
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
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
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
    boolean b37 = strictlySortedSinglyLinkedList0.containsIP(iP34);
    tp2.Server server38 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b45 = strictlySortedSinglyLinkedList39.containsIP(iP44);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    boolean b52 = iP50.equals((java.lang.Object)singlyLinkedList51);
    java.lang.Integer i53 = iP50.getThird();
    boolean b54 = strictlySortedSinglyLinkedList39.removeFromIP(iP50);
    boolean b55 = server38.removeException(iP50);
    server38.update();
    tp2.ITime iTime57 = null;
    server38.setTime(iTime57);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    boolean b65 = iP63.equals((java.lang.Object)singlyLinkedList64);
    iP63.setSecond((java.lang.Integer)2);
    boolean b68 = server38.removeBan(iP63);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b70 = strictlySortedSinglyLinkedList69.isEmpty();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b76 = strictlySortedSinglyLinkedList69.removeFromIP(iP75);
    iP75.setThird((java.lang.Integer)41943073);
    boolean b79 = server38.removeException(iP75);
    java.lang.Integer i80 = iP75.getSecond();
    iP75.setThird((java.lang.Integer)28);
    java.lang.Integer i83 = iP75.getFourth();
    boolean b84 = strictlySortedSinglyLinkedList0.containsIP(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 167772288+ "'", i53.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 100+ "'", i80.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 10+ "'", i83.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-803208192), (java.lang.Integer)10001, (java.lang.Integer)1886470370, (java.lang.Integer)(-2147483645));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


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
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i47 = iP46.getFourth();
    boolean b48 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    iP46.setSecond((java.lang.Integer)(-1));
    
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
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 10+ "'", i47.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


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
    java.lang.Integer i34 = iP25.getFirst();
    java.lang.Integer i35 = iP25.getSecond();
    java.lang.Integer i36 = iP25.getFirst();
    iP25.setFourth((java.lang.Integer)16777448);
    
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
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-2147483638)+ "'", i34.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 2+ "'", i35.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-2147483638)+ "'", i36.equals((-2147483638)));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


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
    java.lang.Long long17 = iPBan3.getExpires();
    tp2.IP iP18 = iPBan3.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L+ "'", long17.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


    int i2 = java.lang.Integer.min((-2146959350), 1610612736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2146959350));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


    int i1 = java.lang.Integer.reverse(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2147483645), 1886470370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2147483651"+ "'", str2.equals("2147483651"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    int i1 = java.lang.Integer.bitCount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1001000+ "'", i1.equals(1001000));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


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
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList0.get(12);
    
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
    org.junit.Assert.assertNull(iPBan29);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    java.lang.Integer i9 = iP5.getSecond();
    iP5.setFourth((java.lang.Integer)83886146);
    iP5.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i14 = iP5.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


    int i2 = java.lang.Integer.max(110592, 29528288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 29528288);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(50, 14155776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "50"+ "'", str2.equals("50"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    java.lang.Integer i1 = java.lang.Integer.decode("4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4+ "'", i1.equals(4));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(8388608);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


    int i1 = java.lang.Integer.lowestOneBit(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    int i1 = java.lang.Integer.highestOneBit(1750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1024);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


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
    iP24.setSecond((java.lang.Integer)72);
    
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
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


    int i1 = java.lang.Integer.lowestOneBit(8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8388608);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


    int i1 = java.lang.Integer.reverseBytes(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 56);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    int i2 = java.lang.Integer.max(1886470370, 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1886470370);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    int i2 = java.lang.Integer.sum(0, 2098187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2098187);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


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
    iP88.setFourth((java.lang.Integer)16384);
    
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    int i2 = java.lang.Integer.compare(26214, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1000000000000000000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    java.lang.Integer i9 = iP5.getSecond();
    iP5.setFourth((java.lang.Integer)83886146);
    iP5.setFourth((java.lang.Integer)83886146);
    iP5.setThird((java.lang.Integer)(-805306368));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 56+ "'", i1.equals(56));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP2 = singlyLinkedList0.get(2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP2);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


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
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)0L);
    tp2.IP iP24 = iPBan23.getIp();
    boolean b25 = server0.addException(iP24);
    
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
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    int i2 = java.lang.Integer.compare(10, 2098192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)41943073, (java.lang.Integer)(-805306368), (java.lang.Integer)13, (java.lang.Integer)37);
    boolean b10 = singlyLinkedList0.remove(iP9);
    tp2.IP iP12 = singlyLinkedList0.get(1073745921);
    int i13 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("64", 81400010);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    java.lang.Object obj9 = null;
    boolean b10 = iP5.equals(obj9);
    java.lang.Integer i11 = iP5.getSecond();
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
    java.lang.Integer i42 = iP16.getFourth();
    boolean b43 = iP5.equals((java.lang.Object)iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 10+ "'", i42.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }


    int i2 = java.lang.Integer.max(1, 402653184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 402653184);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b16 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Server server17 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    boolean b31 = iP29.equals((java.lang.Object)singlyLinkedList30);
    java.lang.Integer i32 = iP29.getThird();
    boolean b33 = strictlySortedSinglyLinkedList18.removeFromIP(iP29);
    boolean b34 = server17.removeException(iP29);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    tp2.IPBan iPBan43 = strictlySortedSinglyLinkedList35.get((-1));
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    boolean b51 = strictlySortedSinglyLinkedList35.removeFromIP(iP48);
    boolean b52 = server17.removeBan(iP48);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP48, (java.lang.Long)83886146L);
    boolean b55 = strictlySortedSinglyLinkedList0.add(iPBan54);
    tp2.Server server56 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b63 = strictlySortedSinglyLinkedList57.containsIP(iP62);
    java.lang.Integer i64 = iP62.getFourth();
    boolean b65 = server56.addException(iP62);
    tp2.ITime iTime66 = null;
    server56.setTime(iTime66);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    boolean b75 = server56.removeException(iP73);
    java.lang.Integer i76 = iP73.getFourth();
    boolean b77 = strictlySortedSinglyLinkedList0.removeFromIP(iP73);
    int i78 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 167772288+ "'", i32.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 10+ "'", i64.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 10+ "'", i76.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("20000000", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)0L);
    tp2.Server server3 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    boolean b20 = server3.removeException(iP15);
    server3.update();
    tp2.ITime iTime22 = null;
    server3.setTime(iTime22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    iP28.setSecond((java.lang.Integer)2);
    boolean b33 = server3.removeBan(iP28);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b35 = strictlySortedSinglyLinkedList34.isEmpty();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList34.removeFromIP(iP40);
    iP40.setThird((java.lang.Integer)41943073);
    boolean b44 = server3.removeException(iP40);
    java.lang.Integer i45 = iP40.getSecond();
    iPBan2.setIp(iP40);
    iP40.setFirst((java.lang.Integer)27);
    java.lang.Integer i49 = iP40.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


    int i1 = java.lang.Integer.bitCount(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1979711360), i1, (java.lang.Integer)124, (java.lang.Integer)67112960);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


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
    iP15.setSecond((java.lang.Integer)41943107);
    
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

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


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
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)0L);
    boolean b23 = strictlySortedSinglyLinkedList19.contains(iPBan22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    iP29.setFirst((java.lang.Integer)0);
    java.lang.Integer i33 = iP29.getSecond();
    iPBan22.setIp(iP29);
    iPBan22.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.isEmpty();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList37.removeFromIP(iP43);
    iPBan22.setIp(iP43);
    tp2.IP iP46 = iPBan22.getIp();
    tp2.IP iP47 = iPBan22.getIp();
    tp2.IP iP48 = iPBan22.getIp();
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


    int i1 = java.lang.Integer.highestOneBit(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


    java.lang.String str1 = java.lang.Integer.toHexString(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "38000000"+ "'", str1.equals("38000000"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(60000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "60000010"+ "'", str1.equals("60000010"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


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
    tp2.IPBan iPBan55 = new tp2.IPBan(iP46, (java.lang.Long)4294967295L);
    iP46.setFourth((java.lang.Integer)13);
    
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

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


    java.lang.Integer i1 = new java.lang.Integer("124");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 124+ "'", i1.equals(124));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000000000000000000000000000"+ "'", str1.equals("100000000000000000000000000000"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.Server server12 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b19 = strictlySortedSinglyLinkedList13.containsIP(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = iP24.equals((java.lang.Object)singlyLinkedList25);
    java.lang.Integer i27 = iP24.getThird();
    boolean b28 = strictlySortedSinglyLinkedList13.removeFromIP(iP24);
    boolean b29 = server12.removeException(iP24);
    server12.update();
    tp2.ITime iTime31 = null;
    server12.setTime(iTime31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    boolean b39 = iP37.equals((java.lang.Object)singlyLinkedList38);
    iP37.setSecond((java.lang.Integer)2);
    boolean b42 = server12.removeBan(iP37);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b44 = strictlySortedSinglyLinkedList43.isEmpty();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList43.removeFromIP(iP49);
    iP49.setThird((java.lang.Integer)41943073);
    boolean b53 = server12.removeException(iP49);
    java.lang.Integer i54 = iP49.getSecond();
    iP49.setThird((java.lang.Integer)28);
    java.lang.Integer i57 = iP49.getFourth();
    boolean b58 = server0.addBan(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 167772288+ "'", i27.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


    int i1 = java.lang.Integer.signum(131072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1", (java.lang.Integer)14155776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 14155776+ "'", i2.equals(14155776));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


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
    tp2.ITime iTime21 = null;
    server2.setTime(iTime21);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = iP27.equals((java.lang.Object)singlyLinkedList28);
    iP27.setSecond((java.lang.Integer)2);
    boolean b32 = server2.removeBan(iP27);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b34 = strictlySortedSinglyLinkedList33.isEmpty();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList33.removeFromIP(iP39);
    iP39.setThird((java.lang.Integer)41943073);
    boolean b43 = server2.removeException(iP39);
    boolean b44 = singlyLinkedList0.remove(iP39);
    java.lang.Integer i45 = iP39.getSecond();
    
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
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
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
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


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
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b72 = iP56.equals((java.lang.Object)iP71);
    iP71.setThird((java.lang.Integer)953344);
    
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
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("bbt");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned((-1674030564), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


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
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i47 = iP46.getFourth();
    boolean b48 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    boolean b49 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 10+ "'", i47.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-2146959318), (java.lang.Integer)1107558405, (java.lang.Integer)13);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


    int i1 = java.lang.Integer.parseUnsignedInt("3173646336");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1121320960));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


    long long1 = java.lang.Integer.toUnsignedLong(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 34L);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    int i2 = java.lang.Integer.remainderUnsigned(1000, (-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1000);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(1001000);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


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
    server27.update();
    tp2.ITime iTime46 = null;
    server27.setTime(iTime46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    boolean b54 = iP52.equals((java.lang.Object)singlyLinkedList53);
    iP52.setSecond((java.lang.Integer)2);
    boolean b57 = server27.removeBan(iP52);
    java.lang.Object obj58 = null;
    boolean b59 = iP52.equals(obj58);
    java.lang.Integer i60 = iP52.getFourth();
    boolean b61 = strictlySortedSinglyLinkedList0.containsIP(iP52);
    java.lang.Integer i62 = iP52.getThird();
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 10+ "'", i60.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 167772288+ "'", i62.equals(167772288));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("100000000000001000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)(-1L));
    boolean b13 = strictlySortedSinglyLinkedList0.contains(iPBan12);
    tp2.Server server14 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b21 = strictlySortedSinglyLinkedList15.containsIP(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    boolean b28 = iP26.equals((java.lang.Object)singlyLinkedList27);
    java.lang.Integer i29 = iP26.getThird();
    boolean b30 = strictlySortedSinglyLinkedList15.removeFromIP(iP26);
    boolean b31 = server14.removeException(iP26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList32 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList32.containsIP(iP37);
    tp2.IPBan iPBan40 = strictlySortedSinglyLinkedList32.get((-1));
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    boolean b48 = strictlySortedSinglyLinkedList32.removeFromIP(iP45);
    boolean b49 = server14.removeBan(iP45);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP45, (java.lang.Long)83886146L);
    java.lang.Long long52 = iPBan51.getExpires();
    tp2.IP iP53 = iPBan51.getIp();
    boolean b54 = strictlySortedSinglyLinkedList0.add(iPBan51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 167772288+ "'", i29.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 83886146L+ "'", long52.equals(83886146L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "37"+ "'", str1.equals("37"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


    java.lang.String str1 = java.lang.Integer.toHexString(2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "200405"+ "'", str1.equals("200405"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    boolean b17 = iP11.equals((java.lang.Object)0);
    java.lang.Integer i18 = iP11.getThird();
    java.lang.Integer i19 = iP11.getFirst();
    java.lang.Integer i20 = iP11.getThird();
    iP11.setSecond((java.lang.Integer)436207616);
    
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-2147483638)+ "'", i19.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    boolean b81 = iP79.equals((java.lang.Object)singlyLinkedList80);
    java.lang.Integer i82 = iP79.getThird();
    boolean b83 = strictlySortedSinglyLinkedList68.removeFromIP(iP79);
    boolean b85 = iP79.equals((java.lang.Object)0);
    java.lang.Integer i86 = iP79.getThird();
    java.lang.Integer i87 = iP79.getFirst();
    java.lang.Integer i88 = iP79.getThird();
    iP79.setThird((java.lang.Integer)50);
    singlyLinkedList0.add(iP79);
    
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
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 167772288+ "'", i82.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 167772288+ "'", i86.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-2147483638)+ "'", i87.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 167772288+ "'", i88.equals(167772288));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


    int i2 = java.lang.Integer.divideUnsigned(1000, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 58);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


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
    tp2.IP iP44 = null;
    singlyLinkedList0.add(iP44);
    
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

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("60000010", 301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 301989888+ "'", i2.equals(301989888));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


    int i1 = java.lang.Integer.reverseBytes(41943073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 553680898);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


    int i2 = java.lang.Integer.rotateRight(256, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


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
    iP41.setFirst((java.lang.Integer)0);
    java.lang.Integer i45 = iP41.getSecond();
    iP41.setFourth((java.lang.Integer)83886146);
    boolean b48 = server0.removeBan(iP41);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


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
    tp2.IP iP28 = iPBan3.getIp();
    
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
    org.junit.Assert.assertNotNull(iP28);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


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

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


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
    tp2.ITime iTime45 = null;
    server0.setTime(iTime45);
    
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

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    boolean b17 = iP11.equals((java.lang.Object)0);
    iP11.setSecond((java.lang.Integer)3);
    java.lang.Integer i20 = iP11.getFourth();
    java.lang.Integer i21 = iP11.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 10+ "'", i20.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-2147483638)+ "'", i21.equals((-2147483638)));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b25 = strictlySortedSinglyLinkedList21.contains(iPBan24);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan24);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    java.lang.Integer i34 = iP31.getFirst();
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    iP31.setThird((java.lang.Integer)(-2143813622));
    
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
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 10+ "'", i34.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)0L);
    boolean b32 = strictlySortedSinglyLinkedList28.contains(iPBan31);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b39 = strictlySortedSinglyLinkedList33.containsIP(iP38);
    iP38.setFirst((java.lang.Integer)0);
    java.lang.Integer i42 = iP38.getSecond();
    iPBan31.setIp(iP38);
    tp2.IP iP44 = iPBan31.getIp();
    java.lang.Long long45 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, long45);
    java.lang.Long long47 = iPBan46.getExpires();
    boolean b48 = strictlySortedSinglyLinkedList0.add(iPBan46);
    
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
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L+ "'", long47.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 22);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


    int i1 = java.lang.Integer.reverse(16777448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 385876096);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


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
    tp2.IP iP46 = singlyLinkedList0.get(1);
    
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

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    int i9 = strictlySortedSinglyLinkedList0.getSize();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    int i2 = java.lang.Integer.compareUnsigned(1074266112, (-805306368));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


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
    iP25.setFirst((java.lang.Integer)23);
    java.lang.Integer i38 = iP25.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b25 = strictlySortedSinglyLinkedList21.contains(iPBan24);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan24);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    java.lang.Integer i34 = iP31.getFirst();
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    tp2.IPBan iPBan36 = null;
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    int i38 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 10+ "'", i34.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = iP18.equals((java.lang.Object)singlyLinkedList19);
    boolean b21 = singlyLinkedList0.remove(iP18);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)(-1L));
    tp2.Server server25 = new tp2.Server();
    server25.update();
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
    tp2.Server server49 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    java.lang.Integer i57 = iP55.getFourth();
    boolean b58 = server49.addException(iP55);
    boolean b59 = iP38.equals((java.lang.Object)iP55);
    boolean b60 = server25.removeException(iP55);
    iPBan24.setIp(iP55);
    boolean b62 = singlyLinkedList0.remove(iP55);
    
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
    org.junit.Assert.assertTrue(b21 == false);
    
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
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


    int i2 = java.lang.Integer.max(2, 2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2098176);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


    int i2 = java.lang.Integer.rotateRight((-2147483625), 262144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483625));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(268451841, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "19h3659"+ "'", str2.equals("19h3659"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


    int i1 = java.lang.Integer.lowestOneBit(131137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    int i2 = java.lang.Integer.rotateRight((-892585062), 1750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 820931371);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(671088640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("131072", (java.lang.Integer)22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 22+ "'", i2.equals(22));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.IP iP3 = singlyLinkedList0.get(0);
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
    tp2.Server server26 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    boolean b40 = iP38.equals((java.lang.Object)singlyLinkedList39);
    java.lang.Integer i41 = iP38.getThird();
    boolean b42 = strictlySortedSinglyLinkedList27.removeFromIP(iP38);
    boolean b43 = server26.removeException(iP38);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList44.containsIP(iP49);
    tp2.IPBan iPBan52 = strictlySortedSinglyLinkedList44.get((-1));
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    boolean b60 = strictlySortedSinglyLinkedList44.removeFromIP(iP57);
    boolean b61 = server26.removeBan(iP57);
    boolean b62 = server5.addException(iP57);
    boolean b63 = singlyLinkedList0.remove(iP57);
    tp2.Server server64 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b71 = strictlySortedSinglyLinkedList65.containsIP(iP70);
    java.lang.Integer i72 = iP70.getFourth();
    boolean b73 = server64.addException(iP70);
    boolean b74 = singlyLinkedList0.remove(iP70);
    int i75 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
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
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 167772288+ "'", i41.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 10+ "'", i72.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


    int i2 = java.lang.Integer.compareUnsigned(32, 47159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


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
    java.lang.Long long41 = iPBan36.getExpires();
    tp2.IP iP42 = iPBan36.getIp();
    iP42.setFourth((java.lang.Integer)500000102);
    
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
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L+ "'", long41.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    boolean b23 = strictlySortedSinglyLinkedList0.contains(iPBan22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b25 = strictlySortedSinglyLinkedList24.isEmpty();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList24.removeFromIP(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    boolean b39 = strictlySortedSinglyLinkedList24.contains(iPBan38);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    iP45.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan50 = new tp2.IPBan(iP45, (java.lang.Long)0L);
    boolean b51 = strictlySortedSinglyLinkedList24.contains(iPBan50);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b53 = strictlySortedSinglyLinkedList52.isEmpty();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b59 = strictlySortedSinglyLinkedList52.removeFromIP(iP58);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    boolean b67 = strictlySortedSinglyLinkedList52.contains(iPBan66);
    boolean b68 = strictlySortedSinglyLinkedList24.add(iPBan66);
    tp2.SinglyLinkedList singlyLinkedList69 = new tp2.SinglyLinkedList();
    int i70 = singlyLinkedList69.getSize();
    tp2.IP iP71 = null;
    singlyLinkedList69.add(iP71);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList69.add(iP77);
    boolean b79 = strictlySortedSinglyLinkedList24.containsIP(iP77);
    boolean b80 = strictlySortedSinglyLinkedList0.removeFromIP(iP77);
    boolean b81 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    int i2 = java.lang.Integer.divideUnsigned(50, 14680064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


    java.lang.String str1 = java.lang.Integer.toHexString(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "16"+ "'", str1.equals("16"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    int i1 = java.lang.Integer.reverseBytes(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 419430400);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


    int i1 = java.lang.Integer.signum(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    boolean b17 = iP11.equals((java.lang.Object)0);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    iPBan19.setExpires((java.lang.Long)(-1L));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    boolean b35 = iP33.equals((java.lang.Object)singlyLinkedList34);
    java.lang.Integer i36 = iP33.getThird();
    boolean b37 = strictlySortedSinglyLinkedList22.removeFromIP(iP33);
    boolean b39 = iP33.equals((java.lang.Object)0);
    java.lang.Integer i40 = iP33.getThird();
    java.lang.Integer i41 = iP33.getFirst();
    java.lang.Integer i42 = iP33.getThird();
    java.lang.Integer i43 = iP33.getFirst();
    iPBan19.setIp(iP33);
    tp2.IP iP45 = iPBan19.getIp();
    
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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 167772288+ "'", i36.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 167772288+ "'", i40.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-2147483638)+ "'", i41.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 167772288+ "'", i42.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-2147483638)+ "'", i43.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("20000000", 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 23+ "'", i2.equals(23));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


    int i2 = java.lang.Integer.max(0, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67108864);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


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
    iP35.setFirst((java.lang.Integer)0);
    java.lang.Object obj39 = null;
    boolean b40 = iP35.equals(obj39);
    iP35.setThird((java.lang.Integer)953344);
    boolean b43 = server0.removeException(iP35);
    tp2.Server server44 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    java.lang.Integer i52 = iP50.getFourth();
    boolean b53 = server44.addException(iP50);
    tp2.ITime iTime54 = null;
    server44.setTime(iTime54);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    boolean b63 = server44.removeException(iP61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b70 = strictlySortedSinglyLinkedList64.containsIP(iP69);
    iP69.setFirst((java.lang.Integer)0);
    java.lang.Integer i73 = iP69.getSecond();
    iP69.setFourth((java.lang.Integer)83886146);
    iP69.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i78 = iP69.getFirst();
    boolean b79 = server44.removeBan(iP69);
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList85 = new tp2.SinglyLinkedList();
    boolean b86 = iP84.equals((java.lang.Object)singlyLinkedList85);
    iP84.setSecond((java.lang.Integer)2);
    iP84.setThird((java.lang.Integer)2098181);
    boolean b91 = server44.removeException(iP84);
    boolean b92 = server0.connect(iP84);
    
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
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 10+ "'", i52.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 0+ "'", i78.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("3506000", 50);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


    int i2 = java.lang.Integer.divideUnsigned(17, 67109184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    int i1 = java.lang.Integer.lowestOneBit(47159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i9 = iP5.getFourth();
    java.lang.Integer i10 = iP5.getFirst();
    iP5.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i13 = iP5.getThird();
    java.lang.Integer i14 = iP5.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-2147483638)+ "'", i10.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 167772288+ "'", i13.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(14680064, (-2147483638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "14680064"+ "'", str2.equals("14680064"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP2 = null;
    tp2.IPBan iPBan4 = new tp2.IPBan(iP2, (java.lang.Long)0L);
    boolean b5 = strictlySortedSinglyLinkedList0.contains(iPBan4);
    tp2.IPBan iPBan7 = strictlySortedSinglyLinkedList0.get(6);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = singlyLinkedList8.isEmpty();
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
    server10.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    iP34.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i38 = iP34.getFourth();
    java.lang.Integer i39 = iP34.getFirst();
    iP34.setFirst((java.lang.Integer)20971536);
    boolean b42 = server10.addException(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)0L);
    boolean b47 = strictlySortedSinglyLinkedList43.contains(iPBan46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    iP53.setFirst((java.lang.Integer)0);
    java.lang.Integer i57 = iP53.getSecond();
    iPBan46.setIp(iP53);
    boolean b59 = server10.connect(iP53);
    singlyLinkedList8.add(iP53);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP53, (java.lang.Long)120000020L);
    boolean b63 = strictlySortedSinglyLinkedList0.add(iPBan62);
    tp2.IPBan iPBan65 = strictlySortedSinglyLinkedList0.get(120000020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
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
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 10+ "'", i38.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-2147483638)+ "'", i39.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan65);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1073741824", 385876096);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("14680064");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 14680064+ "'", i1.equals(14680064));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


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
    tp2.IP iP57 = null;
    boolean b58 = server0.removeBan(iP57);
    tp2.ITime iTime59 = null;
    server0.setTime(iTime59);
    tp2.ITime iTime61 = null;
    server0.setTime(iTime61);
    
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
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("19h3659");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


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
    java.lang.Integer i42 = iP31.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 1+ "'", i42.equals(1));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    boolean b10 = singlyLinkedList0.isEmpty();
    boolean b11 = singlyLinkedList0.isEmpty();
    tp2.IP iP12 = null;
    singlyLinkedList0.add(iP12);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP16 = null;
    singlyLinkedList14.add(iP16);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList14.add(iP22);
    java.lang.Integer i24 = iP22.getSecond();
    java.lang.Integer i25 = iP22.getThird();
    boolean b26 = singlyLinkedList0.remove(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 10+ "'", i24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 1+ "'", i25.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("2147483648");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


    int i1 = java.lang.Integer.lowestOneBit(60000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    int i1 = java.lang.Integer.parseUnsignedInt("25");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4144504"+ "'", str1.equals("4144504"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2148007946");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


    int i1 = java.lang.Integer.reverseBytes(110592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11534592);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(10004001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


    java.lang.Integer i2 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)120000020, (java.lang.Integer)469762048, i2, (java.lang.Integer)6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    int i1 = java.lang.Integer.parseInt("14680064");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 14680064);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)(-1L));
    boolean b13 = strictlySortedSinglyLinkedList0.contains(iPBan12);
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(31);
    tp2.Server server16 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    java.lang.Integer i24 = iP22.getFourth();
    boolean b25 = server16.addException(iP22);
    iP22.setSecond((java.lang.Integer)3);
    java.lang.Integer i28 = iP22.getFourth();
    boolean b29 = strictlySortedSinglyLinkedList0.containsIP(iP22);
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 10+ "'", i24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    boolean b5 = singlyLinkedList4.isEmpty();
    tp2.IP iP7 = singlyLinkedList4.get(0);
    int i8 = singlyLinkedList4.getSize();
    tp2.Server server9 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b16 = strictlySortedSinglyLinkedList10.containsIP(iP15);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    boolean b23 = iP21.equals((java.lang.Object)singlyLinkedList22);
    java.lang.Integer i24 = iP21.getThird();
    boolean b25 = strictlySortedSinglyLinkedList10.removeFromIP(iP21);
    boolean b26 = server9.removeException(iP21);
    server9.update();
    tp2.ITime iTime28 = null;
    server9.setTime(iTime28);
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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList48.get((-1));
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    boolean b64 = strictlySortedSinglyLinkedList48.removeFromIP(iP61);
    boolean b65 = server30.removeBan(iP61);
    boolean b66 = server9.addException(iP61);
    boolean b67 = singlyLinkedList4.remove(iP61);
    tp2.Server server68 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b75 = strictlySortedSinglyLinkedList69.containsIP(iP74);
    java.lang.Integer i76 = iP74.getFourth();
    boolean b77 = server68.addException(iP74);
    boolean b78 = singlyLinkedList4.remove(iP74);
    boolean b79 = singlyLinkedList0.contains(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 10+ "'", i76.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


    java.lang.Integer i1 = new java.lang.Integer("37");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 37+ "'", i1.equals(37));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


    int i2 = java.lang.Integer.compareUnsigned(25275, (-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2000000000"+ "'", str1.equals("2000000000"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


    int i1 = java.lang.Integer.highestOneBit(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


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
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)(-1L));
    boolean b32 = strictlySortedSinglyLinkedList22.contains(iPBan31);
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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    tp2.IPBan iPBan59 = strictlySortedSinglyLinkedList51.get((-1));
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    boolean b67 = strictlySortedSinglyLinkedList51.removeFromIP(iP64);
    boolean b68 = server33.removeBan(iP64);
    java.lang.Integer i69 = iP64.getFirst();
    iPBan31.setIp(iP64);
    java.lang.Integer i71 = iP64.getSecond();
    iP64.setFourth((java.lang.Integer)18875478);
    boolean b74 = strictlySortedSinglyLinkedList0.removeFromIP(iP64);
    
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
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 10+ "'", i69.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 10+ "'", i71.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(18875478, 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "18875478"+ "'", str2.equals("18875478"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(2098187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2098187+ "'", i1.equals(2098187));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


    int i1 = java.lang.Integer.highestOneBit(2711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2048);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


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
    java.lang.Integer i68 = iP66.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 3+ "'", i68.equals(3));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    int i2 = java.lang.Integer.sum(10942, 120000020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 120010962);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


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
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList0.get((-803208192));
    int i23 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    int i1 = java.lang.Integer.highestOneBit(110592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 65536);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


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
    server0.update();
    tp2.Server server50 = new tp2.Server();
    tp2.ITime iTime51 = null;
    server50.setTime(iTime51);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList53 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b59 = strictlySortedSinglyLinkedList53.containsIP(iP58);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    boolean b66 = iP64.equals((java.lang.Object)singlyLinkedList65);
    java.lang.Integer i67 = iP64.getThird();
    boolean b68 = strictlySortedSinglyLinkedList53.removeFromIP(iP64);
    boolean b70 = iP64.equals((java.lang.Object)0);
    boolean b71 = server50.addException(iP64);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP64, (java.lang.Long)120000020L);
    tp2.IP iP74 = iPBan73.getIp();
    boolean b75 = server0.addBan(iP74);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 167772288+ "'", i67.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


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
    tp2.IP iP77 = null;
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)0L);
    tp2.IP iP80 = iPBan79.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList81 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b82 = strictlySortedSinglyLinkedList81.isEmpty();
    boolean b83 = iP80.equals((java.lang.Object)b82);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP80, (java.lang.Long)100L);
    boolean b86 = server0.connect(iP80);
    boolean b87 = server0.notSharedElements();
    
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
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    int i9 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)0L);
    boolean b14 = strictlySortedSinglyLinkedList10.contains(iPBan13);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b21 = strictlySortedSinglyLinkedList15.containsIP(iP20);
    iP20.setFirst((java.lang.Integer)0);
    java.lang.Integer i24 = iP20.getSecond();
    iPBan13.setIp(iP20);
    iPBan13.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList28.removeFromIP(iP34);
    iPBan13.setIp(iP34);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan13);
    tp2.IP iP38 = null;
    boolean b39 = strictlySortedSinglyLinkedList0.containsIP(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2abd", 16777448);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1126502400, 10280002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1126502400"+ "'", str2.equals("1126502400"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
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
    boolean b37 = strictlySortedSinglyLinkedList0.containsIP(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = null;
    tp2.IPBan iPBan41 = new tp2.IPBan(iP39, (java.lang.Long)0L);
    boolean b42 = strictlySortedSinglyLinkedList38.contains(iPBan41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i48 = iP47.getFourth();
    boolean b49 = strictlySortedSinglyLinkedList38.removeFromIP(iP47);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    boolean b67 = iP61.equals((java.lang.Object)0);
    java.lang.Integer i68 = iP61.getThird();
    java.lang.Integer i69 = iP61.getFirst();
    boolean b70 = strictlySortedSinglyLinkedList38.containsIP(iP61);
    boolean b71 = strictlySortedSinglyLinkedList0.removeFromIP(iP61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList72 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b73 = strictlySortedSinglyLinkedList72.isEmpty();
    tp2.IP iP74 = null;
    tp2.IPBan iPBan76 = new tp2.IPBan(iP74, (java.lang.Long)0L);
    boolean b77 = strictlySortedSinglyLinkedList72.contains(iPBan76);
    boolean b78 = strictlySortedSinglyLinkedList0.add(iPBan76);
    java.lang.Long long79 = iPBan76.getExpires();
    tp2.IP iP80 = iPBan76.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 167772288+ "'", i68.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-2147483638)+ "'", i69.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L+ "'", long79.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


    int i1 = java.lang.Integer.reverseBytes(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 131072);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    int i2 = java.lang.Integer.compare(1073741824, 10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    int i2 = java.lang.Integer.rotateLeft(41943107, 58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201981953);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("7270e14");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-892574121), (java.lang.Integer)1107296325, (java.lang.Integer)(-2143813622), (java.lang.Integer)1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


    int i2 = java.lang.Integer.min(14155776, 20971536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14155776);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


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
    java.lang.Integer i42 = iP37.getSecond();
    iP37.setFourth((java.lang.Integer)1100100);
    
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
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


    int i1 = java.lang.Integer.highestOneBit(578813984);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    int i4 = singlyLinkedList0.getSize();
    boolean b5 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("d", (-2147483636));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


    int i2 = java.lang.Integer.sum(2098187, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2098187);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    int i2 = java.lang.Integer.min(44739413, (-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483625));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)28, i1, (java.lang.Integer)18, (java.lang.Integer)10280002);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


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
    boolean b57 = server0.addException(iP52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList58.get((-1));
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    boolean b74 = strictlySortedSinglyLinkedList58.removeFromIP(iP71);
    boolean b75 = server0.removeException(iP71);
    
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
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


    int i1 = java.lang.Integer.highestOneBit(131137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 131072);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


    int i2 = java.lang.Integer.rotateRight(117440512, (-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1879048192);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(14155776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "14155776"+ "'", str1.equals("14155776"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
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
    boolean b37 = strictlySortedSinglyLinkedList0.containsIP(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = null;
    tp2.IPBan iPBan41 = new tp2.IPBan(iP39, (java.lang.Long)0L);
    boolean b42 = strictlySortedSinglyLinkedList38.contains(iPBan41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i48 = iP47.getFourth();
    boolean b49 = strictlySortedSinglyLinkedList38.removeFromIP(iP47);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    boolean b67 = iP61.equals((java.lang.Object)0);
    java.lang.Integer i68 = iP61.getThird();
    java.lang.Integer i69 = iP61.getFirst();
    boolean b70 = strictlySortedSinglyLinkedList38.containsIP(iP61);
    boolean b71 = strictlySortedSinglyLinkedList0.removeFromIP(iP61);
    java.lang.Integer i72 = iP61.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 167772288+ "'", i68.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-2147483638)+ "'", i69.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-2147483638)+ "'", i72.equals((-2147483638)));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(34);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(67109184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "400000500"+ "'", str1.equals("400000500"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b25 = strictlySortedSinglyLinkedList21.contains(iPBan24);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan24);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    java.lang.Integer i34 = iP31.getFirst();
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP31);
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
    tp2.IPBan iPBan73 = new tp2.IPBan(iP67, (java.lang.Long)83886146L);
    boolean b74 = strictlySortedSinglyLinkedList0.removeFromIP(iP67);
    iP67.setFourth((java.lang.Integer)469762048);
    
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
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 10+ "'", i34.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
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
    org.junit.Assert.assertTrue(b74 == true);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("100000000000000000000000000000", 10001);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2147483651", 4);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


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
    boolean b33 = server0.notSharedElements();
    tp2.ITime iTime34 = null;
    server0.setTime(iTime34);
    
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
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10001", (java.lang.Integer)134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 134218369+ "'", i2.equals(134218369));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("22", 553680898);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


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
    boolean b28 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    int i1 = java.lang.Integer.highestOneBit(58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


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
    boolean b51 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    int i1 = java.lang.Integer.bitCount(2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i9 = iP8.getFourth();
    java.lang.Integer i10 = iP8.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    boolean b24 = iP22.equals((java.lang.Object)singlyLinkedList23);
    java.lang.Integer i25 = iP22.getThird();
    boolean b26 = strictlySortedSinglyLinkedList11.removeFromIP(iP22);
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)(-1L));
    boolean b30 = strictlySortedSinglyLinkedList11.contains(iPBan29);
    tp2.IPBan iPBan32 = strictlySortedSinglyLinkedList11.get((-2147483648));
    boolean b33 = iP8.equals((java.lang.Object)strictlySortedSinglyLinkedList11);
    iP8.setThird((java.lang.Integer)8388608);
    boolean b36 = singlyLinkedList0.contains(iP8);
    boolean b37 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 167772288+ "'", i10.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 167772288+ "'", i25.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


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
    tp2.IPBan iPBan65 = strictlySortedSinglyLinkedList0.get(1952471040);
    
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
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


    int i2 = java.lang.Integer.sum(41943073, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 41943076);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


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
    java.lang.Long long22 = iPBan18.getExpires();
    java.lang.Long long23 = iPBan18.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L+ "'", long22.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


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
    boolean b95 = server0.bansOkTime();
    
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
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


    java.lang.Integer i1 = new java.lang.Integer(41943072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 41943072+ "'", i1.equals(41943072));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


    int i2 = java.lang.Integer.rotateLeft(117440512, 11534592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 117440512);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    int i2 = java.lang.Integer.min(41943076, 436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 41943076);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b8 = strictlySortedSinglyLinkedList2.containsIP(iP7);
    iP7.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan12 = new tp2.IPBan(iP7, (java.lang.Long)0L);
    java.lang.Integer i13 = iP7.getFirst();
    boolean b14 = server0.removeException(iP7);
    tp2.Server server15 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    iP21.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i25 = iP21.getFourth();
    java.lang.Integer i26 = iP21.getFirst();
    boolean b27 = server15.connect(iP21);
    tp2.IP iP28 = null;
    tp2.IPBan iPBan30 = new tp2.IPBan(iP28, (java.lang.Long)(-1L));
    tp2.Server server31 = new tp2.Server();
    server31.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b39 = strictlySortedSinglyLinkedList33.containsIP(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = iP44.equals((java.lang.Object)singlyLinkedList45);
    java.lang.Integer i47 = iP44.getThird();
    boolean b48 = strictlySortedSinglyLinkedList33.removeFromIP(iP44);
    boolean b50 = iP44.equals((java.lang.Object)0);
    java.lang.Integer i51 = iP44.getThird();
    java.lang.Integer i52 = iP44.getFirst();
    iP44.setFourth((java.lang.Integer)20971536);
    tp2.Server server55 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    java.lang.Integer i63 = iP61.getFourth();
    boolean b64 = server55.addException(iP61);
    boolean b65 = iP44.equals((java.lang.Object)iP61);
    boolean b66 = server31.removeException(iP61);
    iPBan30.setIp(iP61);
    boolean b68 = server15.removeException(iP61);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP61, (java.lang.Long)4294967295L);
    java.lang.Integer i71 = iP61.getFourth();
    boolean b72 = server0.addException(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-2147483638)+ "'", i13.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 10+ "'", i25.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-2147483638)+ "'", i26.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 167772288+ "'", i47.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 167772288+ "'", i51.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-2147483638)+ "'", i52.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 10+ "'", i63.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 10+ "'", i71.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(201981953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201981953+ "'", i1.equals(201981953));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


    int i1 = java.lang.Integer.highestOneBit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


    long long1 = java.lang.Integer.toUnsignedLong(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3L);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


    int i1 = java.lang.Integer.lowestOneBit(134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


    int i2 = java.lang.Integer.compareUnsigned(1952471040, 385876096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


    int i2 = java.lang.Integer.compareUnsigned((-2126512112), 10004001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)67108864L);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


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
    iPBan18.setExpires((java.lang.Long)41943073L);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    int i25 = singlyLinkedList24.getSize();
    tp2.IP iP27 = singlyLinkedList24.get((-2147483625));
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP30 = null;
    singlyLinkedList28.add(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList28.add(iP36);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP40 = null;
    singlyLinkedList38.add(iP40);
    boolean b42 = iP36.equals((java.lang.Object)singlyLinkedList38);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP36, (java.lang.Long)8L);
    java.lang.Integer i45 = iP36.getThird();
    boolean b46 = singlyLinkedList24.remove(iP36);
    iPBan18.setIp(iP36);
    
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
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 1+ "'", i45.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


    int i2 = java.lang.Integer.remainderUnsigned(419430400, 47159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 45413);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2147483671"+ "'", str1.equals("2147483671"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


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
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b72 = iP56.equals((java.lang.Object)iP71);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP71, (java.lang.Long)134217728L);
    iP71.setThird((java.lang.Integer)2048);
    
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
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b16 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    java.lang.Integer i24 = iP22.getFourth();
    iP22.setFourth((java.lang.Integer)(-805306368));
    iP22.setSecond((java.lang.Integer)67108864);
    java.lang.Integer i29 = null;
    iP22.setThird(i29);
    boolean b31 = strictlySortedSinglyLinkedList0.containsIP(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 10+ "'", i24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    boolean b18 = iP16.equals((java.lang.Object)singlyLinkedList17);
    tp2.IP iP20 = singlyLinkedList17.get(4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    java.lang.Integer i28 = iP26.getFourth();
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)0L);
    boolean b31 = singlyLinkedList17.remove(iP26);
    boolean b32 = server0.removeBan(iP26);
    iP26.setFirst((java.lang.Integer)671088640);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP26, (java.lang.Long)1074266112L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan2 = strictlySortedSinglyLinkedList0.get(28);
    boolean b3 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan5 = strictlySortedSinglyLinkedList0.get((-2143813622));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan5);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


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
    server0.update();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    tp2.IP iP46 = singlyLinkedList43.get(4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b53 = strictlySortedSinglyLinkedList47.containsIP(iP52);
    java.lang.Integer i54 = iP52.getFourth();
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)0L);
    boolean b57 = singlyLinkedList43.remove(iP52);
    java.lang.Integer i58 = iP52.getThird();
    java.lang.Integer i59 = iP52.getSecond();
    boolean b60 = server0.addException(iP52);
    
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
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 10+ "'", i54.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 167772288+ "'", i58.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


    int i2 = java.lang.Integer.compareUnsigned(23, 83886146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1979711360));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2315255936L);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


    int i2 = java.lang.Integer.rotateLeft(21884, 953344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21884);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


    int i1 = java.lang.Integer.highestOneBit(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }


    java.lang.Integer i1 = new java.lang.Integer(41943076);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 41943076+ "'", i1.equals(41943076));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }


    int i1 = java.lang.Integer.lowestOneBit(83886146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList76 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b82 = strictlySortedSinglyLinkedList76.containsIP(iP81);
    tp2.IPBan iPBan84 = new tp2.IPBan(iP81, (java.lang.Long)3145728L);
    boolean b85 = server0.addException(iP81);
    
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
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1121320960)+ "'", i1.equals((-1121320960)));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }


    long long1 = java.lang.Integer.toUnsignedLong(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 9L);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }


    java.lang.String str1 = java.lang.Integer.toHexString(240000041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e4e1c29"+ "'", str1.equals("e4e1c29"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }


    int i2 = java.lang.Integer.min(25, 402653184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }


    int i2 = java.lang.Integer.remainderUnsigned(469762048, 336488199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 133273849);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }


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
    java.lang.Integer i19 = iP16.getFourth();
    iP16.setSecond((java.lang.Integer)41943072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }


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
    java.lang.Integer i67 = iP56.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 83886146+ "'", i67.equals(83886146));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan6 = strictlySortedSinglyLinkedList0.get(41943072);
    tp2.Server server7 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b14 = strictlySortedSinglyLinkedList8.containsIP(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    boolean b21 = iP19.equals((java.lang.Object)singlyLinkedList20);
    java.lang.Integer i22 = iP19.getThird();
    boolean b23 = strictlySortedSinglyLinkedList8.removeFromIP(iP19);
    boolean b24 = server7.removeException(iP19);
    server7.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b32 = strictlySortedSinglyLinkedList26.containsIP(iP31);
    iP31.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i35 = iP31.getFourth();
    java.lang.Integer i36 = iP31.getFirst();
    iP31.setFirst((java.lang.Integer)20971536);
    boolean b39 = server7.addException(iP31);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP31, (java.lang.Long)0L);
    boolean b42 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 167772288+ "'", i22.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 10+ "'", i35.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-2147483638)+ "'", i36.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }


    int i2 = java.lang.Integer.max(301989888, 301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 301989888);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }


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
    tp2.IP iP77 = null;
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)0L);
    tp2.IP iP80 = iPBan79.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList81 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b82 = strictlySortedSinglyLinkedList81.isEmpty();
    boolean b83 = iP80.equals((java.lang.Object)b82);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP80, (java.lang.Long)100L);
    boolean b86 = server0.connect(iP80);
    server0.update();
    tp2.ITime iTime88 = null;
    server0.setTime(iTime88);
    
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
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("20000000012", 8192);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("18875478", 1100100);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }


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
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)64, (java.lang.Integer)4, (java.lang.Integer)262144, (java.lang.Integer)167772288);
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
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }


    int i1 = java.lang.Integer.lowestOneBit(1073745921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }


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
    int i53 = singlyLinkedList0.getSize();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }


    int i2 = java.lang.Integer.divideUnsigned(268435456, 1001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000000000"+ "'", str1.equals("1000000000"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }


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
    iPBan81.setExpires((java.lang.Long)120000020L);
    
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

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("3506000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3506000+ "'", i1.equals(3506000));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }


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
    java.lang.Integer i50 = iP43.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 10+ "'", i50.equals(10));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("100000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    java.lang.Integer i16 = iP11.getThird();
    iP11.setFirst((java.lang.Integer)(-1979711360));
    iP11.setFirst((java.lang.Integer)(-2147483648));
    tp2.IPBan iPBan22 = new tp2.IPBan(iP11, (java.lang.Long)37L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 167772288+ "'", i16.equals(167772288));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }


    int i2 = java.lang.Integer.remainderUnsigned(83886080, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }


    int i1 = java.lang.Integer.highestOneBit(1107296325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("120000020", (-2147483648));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }


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
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }


    int i1 = java.lang.Integer.highestOneBit(271056898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268435456);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }


    int i2 = java.lang.Integer.rotateLeft(271056898, 240000041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1342178336);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    iP50.setFirst((java.lang.Integer)0);
    java.lang.Integer i54 = iP50.getSecond();
    boolean b55 = server0.addException(iP50);
    boolean b56 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "40000000"+ "'", str1.equals("40000000"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }


    int i1 = java.lang.Integer.reverseBytes(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 620756992);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }


    int i2 = java.lang.Integer.rotateRight(67109184, 1879048192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67109184);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }


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
    boolean b43 = server0.addException(iP35);
    boolean b44 = server0.bansOkTime();
    tp2.ITime iTime45 = null;
    server0.setTime(iTime45);
    boolean b47 = server0.notSharedElements();
    
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
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }


    int i2 = java.lang.Integer.rotateLeft(1000, (-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1000);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }


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
    server0.update();
    
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

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    iP47.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i51 = iP47.getFourth();
    java.lang.Integer i52 = iP47.getFirst();
    iP47.setFirst((java.lang.Integer)20971536);
    boolean b55 = server23.addException(iP47);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP57 = null;
    tp2.IPBan iPBan59 = new tp2.IPBan(iP57, (java.lang.Long)0L);
    boolean b60 = strictlySortedSinglyLinkedList56.contains(iPBan59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b67 = strictlySortedSinglyLinkedList61.containsIP(iP66);
    iP66.setFirst((java.lang.Integer)0);
    java.lang.Integer i70 = iP66.getSecond();
    iPBan59.setIp(iP66);
    boolean b72 = server23.connect(iP66);
    iP66.setThird((java.lang.Integer)124);
    java.lang.Integer i75 = null;
    iP66.setSecond(i75);
    boolean b77 = server0.addBan(iP66);
    
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
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 10+ "'", i51.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-2147483638)+ "'", i52.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 100+ "'", i70.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    iP7.setSecond((java.lang.Integer)2);
    boolean b12 = singlyLinkedList0.contains(iP7);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = singlyLinkedList13.isEmpty();
    boolean b15 = singlyLinkedList13.isEmpty();
    int i16 = singlyLinkedList13.getSize();
    tp2.IP iP18 = singlyLinkedList13.get(100);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)0L);
    boolean b23 = strictlySortedSinglyLinkedList19.contains(iPBan22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    iP29.setFirst((java.lang.Integer)0);
    java.lang.Integer i33 = iP29.getSecond();
    iPBan22.setIp(iP29);
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
    iPBan22.setIp(iP47);
    tp2.IP iP54 = iPBan22.getIp();
    boolean b55 = singlyLinkedList13.remove(iP54);
    singlyLinkedList0.add(iP54);
    boolean b57 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
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
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }


    int i1 = java.lang.Integer.parseUnsignedInt("131072");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 131072);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }


    int i1 = java.lang.Integer.bitCount(131072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b52 = strictlySortedSinglyLinkedList46.containsIP(iP51);
    iP51.setFirst((java.lang.Integer)0);
    boolean b55 = server0.addBan(iP51);
    
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
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    int i10 = singlyLinkedList0.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483648), (java.lang.Integer)60000010, (java.lang.Integer)64, (java.lang.Integer)1073741824);
    singlyLinkedList0.add(iP15);
    iP15.setSecond((java.lang.Integer)17);
    java.lang.Integer i19 = iP15.getFirst();
    boolean b21 = iP15.equals((java.lang.Object)385876096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-2147483648)+ "'", i19.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }


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
    boolean b41 = singlyLinkedList0.isEmpty();
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
    server42.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b67 = strictlySortedSinglyLinkedList61.containsIP(iP66);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList73 = new tp2.SinglyLinkedList();
    boolean b74 = iP72.equals((java.lang.Object)singlyLinkedList73);
    java.lang.Integer i75 = iP72.getThird();
    boolean b76 = strictlySortedSinglyLinkedList61.removeFromIP(iP72);
    boolean b78 = iP72.equals((java.lang.Object)0);
    java.lang.Integer i79 = iP72.getThird();
    java.lang.Integer i80 = iP72.getFirst();
    iP72.setFourth((java.lang.Integer)20971536);
    tp2.Server server83 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList84 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b90 = strictlySortedSinglyLinkedList84.containsIP(iP89);
    java.lang.Integer i91 = iP89.getFourth();
    boolean b92 = server83.addException(iP89);
    boolean b93 = iP72.equals((java.lang.Object)iP89);
    boolean b94 = server42.connect(iP89);
    java.lang.Integer i95 = iP89.getFourth();
    iP89.setFirst((java.lang.Integer)268435456);
    boolean b98 = singlyLinkedList0.contains(iP89);
    
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
    org.junit.Assert.assertTrue(b41 == false);
    
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
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 167772288+ "'", i75.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 167772288+ "'", i79.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-2147483638)+ "'", i80.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 10+ "'", i91.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + 10+ "'", i95.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2148007946", 29528288);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }


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
    java.lang.Integer i21 = iP15.getFirst();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-2147483638)+ "'", i21.equals((-2147483638)));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("100000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }


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
    java.lang.Integer i45 = iP39.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 10+ "'", i45.equals(10));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }


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
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    boolean b24 = singlyLinkedList23.isEmpty();
    tp2.IP iP26 = singlyLinkedList23.get(3691036);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    boolean b33 = iP31.equals((java.lang.Object)singlyLinkedList32);
    java.lang.Integer i34 = iP31.getThird();
    iP31.setFourth((java.lang.Integer)37);
    iP31.setSecond((java.lang.Integer)884736);
    boolean b39 = singlyLinkedList23.remove(iP31);
    iP31.setThird((java.lang.Integer)(-2147483638));
    boolean b42 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    tp2.IPBan iPBan44 = strictlySortedSinglyLinkedList0.get(4194304);
    
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
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 167772288+ "'", i34.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan44);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }


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
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i47 = iP46.getThird();
    boolean b48 = server0.addException(iP46);
    
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
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 67109184+ "'", i47.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("101000000000000000001000000", 1107558405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1107558405+ "'", i2.equals(1107558405));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    int i3 = singlyLinkedList2.getSize();
    tp2.IP iP5 = singlyLinkedList2.get(10);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList2.add(iP10);
    iP10.setThird((java.lang.Integer)120000020);
    boolean b14 = singlyLinkedList0.contains(iP10);
    int i15 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1000010000000000000000001000101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }


    int i2 = java.lang.Integer.parseInt("10942", 22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 238702);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1", 133273849);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    boolean b12 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }


    java.lang.String str1 = java.lang.Integer.toHexString(2098192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "200410"+ "'", str1.equals("200410"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }


    int i2 = java.lang.Integer.sum(385876096, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 385876096);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }


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
    tp2.SinglyLinkedList singlyLinkedList81 = new tp2.SinglyLinkedList();
    int i82 = singlyLinkedList81.getSize();
    tp2.IP iP83 = null;
    singlyLinkedList81.add(iP83);
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b90 = singlyLinkedList81.contains(iP89);
    iP89.setFourth((java.lang.Integer)1);
    boolean b93 = server0.connect(iP89);
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
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    boolean b17 = iP11.equals((java.lang.Object)0);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    iPBan19.setExpires((java.lang.Long)(-1L));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    boolean b35 = iP33.equals((java.lang.Object)singlyLinkedList34);
    java.lang.Integer i36 = iP33.getThird();
    boolean b37 = strictlySortedSinglyLinkedList22.removeFromIP(iP33);
    boolean b39 = iP33.equals((java.lang.Object)0);
    java.lang.Integer i40 = iP33.getThird();
    java.lang.Integer i41 = iP33.getFirst();
    java.lang.Integer i42 = iP33.getThird();
    java.lang.Integer i43 = iP33.getFirst();
    iPBan19.setIp(iP33);
    boolean b46 = iP33.equals((java.lang.Object)512);
    
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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 167772288+ "'", i36.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 167772288+ "'", i40.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-2147483638)+ "'", i41.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 167772288+ "'", i42.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-2147483638)+ "'", i43.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }


    int i2 = java.lang.Integer.compare(0, 41943072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }


    int i2 = java.lang.Integer.remainderUnsigned(60000010, 939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 60000010);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1000000000000000000000000000000", 120010962);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(24);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)10280002, (java.lang.Integer)25275, (java.lang.Integer)1073741824, (java.lang.Integer)(-2146959350));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }


    int i1 = java.lang.Integer.reverseBytes(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2048);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b16 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Server server17 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    boolean b31 = iP29.equals((java.lang.Object)singlyLinkedList30);
    java.lang.Integer i32 = iP29.getThird();
    boolean b33 = strictlySortedSinglyLinkedList18.removeFromIP(iP29);
    boolean b34 = server17.removeException(iP29);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    tp2.IPBan iPBan43 = strictlySortedSinglyLinkedList35.get((-1));
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    boolean b51 = strictlySortedSinglyLinkedList35.removeFromIP(iP48);
    boolean b52 = server17.removeBan(iP48);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP48, (java.lang.Long)83886146L);
    boolean b55 = strictlySortedSinglyLinkedList0.add(iPBan54);
    tp2.Server server56 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b63 = strictlySortedSinglyLinkedList57.containsIP(iP62);
    java.lang.Integer i64 = iP62.getFourth();
    boolean b65 = server56.addException(iP62);
    tp2.ITime iTime66 = null;
    server56.setTime(iTime66);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    boolean b75 = server56.removeException(iP73);
    java.lang.Integer i76 = iP73.getFourth();
    boolean b77 = strictlySortedSinglyLinkedList0.removeFromIP(iP73);
    tp2.IP iP78 = null;
    boolean b79 = strictlySortedSinglyLinkedList0.containsIP(iP78);
    tp2.IP iP80 = null;
    tp2.IPBan iPBan82 = new tp2.IPBan(iP80, (java.lang.Long)0L);
    java.lang.Long long83 = iPBan82.getExpires();
    boolean b84 = strictlySortedSinglyLinkedList0.contains(iPBan82);
    int i85 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 167772288+ "'", i32.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 10+ "'", i64.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 10+ "'", i76.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L+ "'", long83.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }


    int i1 = java.lang.Integer.reverseBytes(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }


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
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    boolean b28 = iP26.equals((java.lang.Object)singlyLinkedList27);
    tp2.IP iP30 = singlyLinkedList27.get(4);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP33 = null;
    singlyLinkedList31.add(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList31.add(iP39);
    boolean b41 = singlyLinkedList27.contains(iP39);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)0L);
    boolean b46 = strictlySortedSinglyLinkedList42.contains(iPBan45);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b53 = strictlySortedSinglyLinkedList47.containsIP(iP52);
    iP52.setFirst((java.lang.Integer)0);
    java.lang.Integer i56 = iP52.getSecond();
    iPBan45.setIp(iP52);
    tp2.Server server58 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList59 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b65 = strictlySortedSinglyLinkedList59.containsIP(iP64);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList71 = new tp2.SinglyLinkedList();
    boolean b72 = iP70.equals((java.lang.Object)singlyLinkedList71);
    java.lang.Integer i73 = iP70.getThird();
    boolean b74 = strictlySortedSinglyLinkedList59.removeFromIP(iP70);
    boolean b75 = server58.removeException(iP70);
    iPBan45.setIp(iP70);
    tp2.IP iP77 = iPBan45.getIp();
    java.lang.Integer i78 = iP77.getSecond();
    java.lang.Integer i79 = iP77.getThird();
    singlyLinkedList27.add(iP77);
    boolean b81 = strictlySortedSinglyLinkedList0.containsIP(iP77);
    
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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 167772288+ "'", i73.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 167772288+ "'", i79.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }


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
    boolean b24 = server0.notSharedElements();
    boolean b25 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }


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
    boolean b36 = server0.notSharedElements();
    
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
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i9 = iP5.getFourth();
    iP5.setFirst((java.lang.Integer)2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    iP7.setSecond((java.lang.Integer)2);
    boolean b12 = singlyLinkedList0.contains(iP7);
    int i13 = singlyLinkedList0.getSize();
    boolean b14 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    int i10 = singlyLinkedList0.getSize();
    tp2.IP iP12 = singlyLinkedList0.get(44739413);
    boolean b13 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)953344, (java.lang.Integer)10001, (java.lang.Integer)27, (java.lang.Integer)17);
    java.lang.Integer i5 = iP4.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 27+ "'", i5.equals(27));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }


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
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    boolean b68 = singlyLinkedList67.isEmpty();
    tp2.IP iP70 = singlyLinkedList67.get(0);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList71 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b77 = strictlySortedSinglyLinkedList71.containsIP(iP76);
    iP76.setFirst((java.lang.Integer)0);
    boolean b80 = singlyLinkedList67.remove(iP76);
    boolean b81 = strictlySortedSinglyLinkedList0.removeFromIP(iP76);
    iP76.setFirst((java.lang.Integer)21884);
    java.lang.Integer i84 = iP76.getFourth();
    
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
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 10+ "'", i84.equals(10));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    iP5.setFourth((java.lang.Integer)7);
    iP5.setThird((java.lang.Integer)6);
    boolean b14 = iP5.equals((java.lang.Object)"100000000000001000000000000");
    iP5.setSecond((java.lang.Integer)1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }


    int i2 = java.lang.Integer.divideUnsigned((-1), 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 107374182);

  }

}
